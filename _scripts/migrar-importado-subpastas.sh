#!/usr/bin/env bash
set -euo pipefail

# DRY_RUN=1 ./scripts/migrar-importado-subpastas.sh
# Se DRY_RUN for 1, apenas mostra os comandos sem executar

DRY_RUN="${DRY_RUN:-0}"

run() {
  if [ "$DRY_RUN" -eq 1 ]; then
    echo "DRY-RUN: $*"
  else
    eval "$@"
  fi
}

if ! git diff --quiet || ! git diff --cached --quiet; then
  echo "⚠️ Seu working tree tem alterações não commitadas. Faça commit ou stash antes de rodar este script."
  exit 1
fi

for dir in importado-do-antigo/*/ ; do
  disciplina=$(basename "$dir")
  target_branch="disciplina/$disciplina"

  echo "------------------------------------------------------------"
  echo "➡️  Processando target branch: $target_branch"

  # cria um branch temporário com o split
  tmp_branch="tmp-$(date +%s)-$$"
  echo "   ✳️  Criando subtree split para: $dir -> branch $tmp_branch"
  run "git subtree split --prefix=$dir -b $tmp_branch"

  # se a branch já existe, força reset; senão, renomeia
  if git show-ref --verify --quiet refs/heads/$target_branch; then
    echo "   🔁 Branch $target_branch já existe, sobrescrevendo..."
    run "git branch -f $target_branch $tmp_branch"
    run "git branch -D $tmp_branch"
  else
    echo "   🔁 Renomeando $tmp_branch -> $target_branch"
    run "git branch -m $tmp_branch $target_branch"
  fi

done