#!/bin/bash

# Diretório raiz do repositório
REPO_DIR="$(pwd)"

# Lista de pastas que devem ser ignoradas
IGNORAR=( ".git" ".gitignore" "README.md" "pasta" "importado-do-antigo" )

# Função para verificar se item está na lista de ignorados
ignorar_item() {
    local item=$1
    for i in "${IGNORAR[@]}"; do
        if [[ "$i" == "$item" ]]; then
            return 0
        fi
    done
    return 1
}

# Volta para main
git checkout main

# Atualiza repositório
git pull origin main

# Gera lista de pastas (disciplinas)
disciplinas=()
for dir in */; do
    nome=$(basename "$dir")
    if ! ignorar_item "$nome"; then
        disciplinas+=("$nome")
    fi
done

# Para cada disciplina, cria/atualiza branch
for disc in "${disciplinas[@]}"; do
    branch="disciplina/${disc}"

    echo "📚 Processando disciplina: $disc (branch: $branch)"

    # Verifica se a branch já existe
    if git show-ref --quiet refs/heads/$branch; then
        git checkout $branch
    else
        git checkout -b $branch
    fi

    # Remove tudo, exceto a pasta da disciplina e arquivos importantes
    for item in *; do
        if [[ "$item" != "$disc" && "$item" != ".gitignore" && "$item" != "README.md" ]]; then
            rm -rf "$item"
        fi
    done

    # Commit das alterações
    git add .
    git commit -m "Atualizando branch da disciplina: $disc" || echo "⚠️ Nada para commitar em $branch"

    # Push
    git push origin $branch
done

# Volta para main
git checkout main

# Atualiza index.html com links para as branches
INDEX="index.html"
echo "<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>Portfólio PUC-Minas</title>
</head>
<body>
  <h1>Disciplinas</h1>
  <ul>" > $INDEX

for disc in "${disciplinas[@]}"; do
    echo "    <li><a href='https://github.com/MacMenez/PUC-Minas/tree/disciplina/$disc'>$disc</a></li>" >> $INDEX
done

echo "  </ul>
</body>
</html>" >> $INDEX

git add $INDEX
git commit -m "Atualizando index.html com links das disciplinas"
git push origin main
