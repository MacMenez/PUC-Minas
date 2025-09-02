#!/usr/bin/env bash
set -euo pipefail

# MODO SECO: 1 = apenas simula (ecoando comandos)
DRY_RUN=0

# Prefixo da pasta que contém os subdiretórios a migrar
IMPORT_DIR="importado-do-antigo"

# Remote (normalmente "origin")
REMOTE="origin"

# Map: chave = branch alvo completa (categoria/nome),
# valor = lista de caminhos (relativos à raiz do repo) separados por '|'
# Ajustei para seu caso conforme a lista que você me forneceu.
declare -A MAP

# Pesquisas
MAP["pesquisa/orbi"]="${IMPORT_DIR}/#ORBI"
MAP["pesquisa/protese-robotica"]="${IMPORT_DIR}/Protese Robotica"

# Monitoria (cada uma vira uma branch monitoria/...)
MAP["monitoria/arquiteturaI"]="${IMPORT_DIR}/arquiteturaI"
MAP["monitoria/arquiteturaII"]="${IMPORT_DIR}/arquiteturaII"
MAP["monitoria/arquiteturaIII"]="${IMPORT_DIR}/arquiteturaIII"

# Eventos (inclui subpastas de Eventos-PUC)
MAP["eventos/workshop-embarcados-franzininho-lab01"]="${IMPORT_DIR}/Workshop Embarcados - Fanzininho LAB01"
MAP["eventos/hackatruck"]="${IMPORT_DIR}/Eventos-PUC/Hackatruck"
MAP["eventos/workshop-mouser"]="${IMPORT_DIR}/Eventos-PUC/Workshop Mouser"

# Disciplinas (mapeamentos)
MAP["disciplina/algoritmosI"]="${IMPORT_DIR}/ALGORITMOS-E-ESTRUTURAS-DE-DADOS-I"
# Algoritmos II: várias pastas -> unir numa só branch
MAP["disciplina/algoritmosII"]="${IMPORT_DIR}/ALGORITMOS-E-ESTRUTURAS-DE-DADOS-II|${IMPORT_DIR}/ALGORITMOS-E-ESTRUTURAS-DE-DADOS-II (PT1)|${IMPORT_DIR}/ALGORITMOS-E-ESTRUTURAS-DE-DADOS-II (PT2)|${IMPORT_DIR}/ALGORITMOS-E-ESTRUTURAS-DE-DADOS-II (PT3)"
MAP["disciplina/arquiteturaII"]="${IMPORT_DIR}/ARQUITETURA-DE-COMPUTADORES-II"
MAP["disciplina/banco-dados"]="${IMPORT_DIR}/BANCO-DE-DADOS"
MAP["disciplina/diw"]="${IMPORT_DIR}/DESENVOLVIMENTO-DE-INTERFACES-WEB"
MAP["disciplina/game-design"]="${IMPORT_DIR}/GAME-DESING"
MAP["disciplina/introducao-computacao"]="${IMPORT_DIR}/INTRODUCAO-A-COMPUTACAO"
MAP["disciplina/iotI"]="${IMPORT_DIR}/Internet das Coisas I"
MAP["disciplina/liec"]="${IMPORT_DIR}/LIEC"
MAP["disciplina/matematica-financeira"]="${IMPORT_DIR}/MATEMÁTICA-FINANCEIRA"

# Normaliza nome de branch (remover caracteres perigosos) - função simples
normalize_branch() {
  local s="$1"
  # transliteraçõezinhas simples
  s="${s// /-}"
  s="${s//é/e}"
  s="${s//É/e}"
  s="${s//ã/a}"
  s="${s//á/a}"
  s="${s//à/a}"
  s="${s//â/a}"
  s="${s//ç/c}"
  s="${s//ú/u}"
  s="${s//í/i}"
  s="${s//(\()/}"
  s="${s//)/}"
  # remove outros chars não alfanum e '-','/'
  s=$(echo "$s" | sed 's/[^a-zA-Z0-9_\/-]/-/g')
  # transformar em lowercase
  echo "${s,,}"
}

# Verifica se diretório existe
dir_exists() {
  local d="$1"
  [ -d "$d" ]
}

# Verifica status limpo
if [[ $(git status --porcelain) != "" ]]; then
  echo "⚠️ Seu working tree tem alterações não commitadas. Faça commit ou stash antes de rodar este script."
  exit 1
fi

# Execução
for target in "${!MAP[@]}"; do
  raw="${MAP[$target]}"
  IFS='|' read -r -a prefixes <<< "$raw"

  tmp_branches=()
  echo "------------------------------------------------------------"
  echo "➡️  Processando target branch: $target"
  for pref in "${prefixes[@]}"; do
    # corrige espaços finais/ini e possíveis barras
    pref_trimmed="$(echo "$pref" | sed 's#^/*##; s#/*$##')"

    if ! dir_exists "$pref_trimmed"; then
      echo "   ⚠️  Caminho não existe: '$pref_trimmed'  — pulando."
      continue
    fi

    # cria nome temporário
    tmpname="tmp-$(date +%s)-$RANDOM"
    echo "   ✳️  Criando subtree split para: $pref_trimmed -> branch $tmpname"
    if [[ "$DRY_RUN" -eq 1 ]]; then
      echo "      (DRY_RUN) git subtree split --prefix=\"$pref_trimmed\" -b \"$tmpname\""
    else
      git subtree split --prefix="$pref_trimmed" -b "$tmpname"
    fi
    tmp_branches+=("$tmpname")
  done

  if [ "${#tmp_branches[@]}" -eq 0 ]; then
    echo "   ⚠️  Nenhum prefixo válido para $target. Próximo."
    continue
  fi

  # Se só um tmp: renomeia e envia
  if [ "${#tmp_branches[@]}" -eq 1 ]; then
    tb="${tmp_branches[0]}"
    echo "   🔁 Renomeando $tb -> $target"
    if [[ "$DRY_RUN" -eq 1 ]]; then
      echo "      (DRY_RUN) git branch -m \"$tb\" \"$target\""
    else
      git branch -m "$tb" "$target" || git branch "$target" "$tb"
    fi

    echo "   ⤴️  Enviando $target -> $REMOTE"
    if [[ "$DRY_RUN" -eq 1 ]]; then
      echo "      (DRY_RUN) git push -u $REMOTE \"$target\""
    else
      git push -u $REMOTE "$target"
    fi

  else
    # Múltiplos temporários -> vamos usar o primeiro como base e mesclar os demais
    base="${tmp_branches[0]}"
    echo "   🔁 Criando target '$target' a partir de $base"
    if [[ "$DRY_RUN" -eq 1 ]]; then
      echo "      (DRY_RUN) git branch -m \"$base\" \"$target\""
    else
      git branch -m "$base" "$target" || git branch "$target" "$base"
    fi

    # Mesclar as outras temporárias
    for ((i=1;i<${#tmp_branches[@]};i++)); do
      other="${tmp_branches[$i]}"
      echo "   ➕ Merge do histórico $other em $target"
      if [[ "$DRY_RUN" -eq 1 ]]; then
        echo "      (DRY_RUN) git checkout \"$target\" && git merge --allow-unrelated-histories -m \"Merge $other into $target\" \"$other\""
      else
        git checkout "$target"
        # Tenta merge; se houver conflito, o script aborta para que você resolva manualmente.
        if ! git merge --allow-unrelated-histories -m "Merge $other into $target" "$other"; then
          echo ""
          echo "🚨 Conflito detectado ao mesclar $other em $target."
          echo "Resolva manualmente os conflitos nesta branch ($target), faça commit e depois rode novamente para prosseguir."
          exit 1
        fi
      fi
    done

    echo "   ⤴️  Enviando merge final para $REMOTE:$target"
    if [[ "$DRY_RUN" -eq 1 ]]; then
      echo "      (DRY_RUN) git push -u $REMOTE \"$target\""
    else
      git push -u $REMOTE "$target"
    fi

    # apagar branches temporárias locais que sobraram
    for tb in "${tmp_branches[@]}"; do
      if [[ "$tb" != "$target" ]]; then
        if [[ "$DRY_RUN" -eq 1 ]]; then
          echo "      (DRY_RUN) git branch -D $tb"
        else
          git branch -D "$tb" || true
        fi
      fi
    done
  fi

done

# Opcional: voltar para main
if [[ "$DRY_RUN" -eq 1 ]]; then
  echo "(DRY_RUN) git checkout main"
else
  git checkout main
fi

echo "✅ Migração concluída (ou simulada se DRY_RUN=1). Verifique as branches remotas e locais."
