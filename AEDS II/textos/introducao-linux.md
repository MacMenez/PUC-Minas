## Introdução ao Linux 💻

Baseado nos vídeos do Professor João Caram.

Uma das principais características do sistema operacional Linux é o uso do CLI (Command Line Interface), ou Terminal, para a utilização de comandos Shell. Neste guia, usaremos o Linux Ubuntu LTS (verifique a versão atual). Caso você não tenha o sistema instalado, ele pode ser simulado virtualmente através do site **Replit**. Para isso, cadastre-se na plataforma e acesse o [simulador Bash](https://replit.com/languages/bash) para testar os comandos Linux. 

Shell ou Bash são interpretadores de comandos utilizados em terminais para executar tarefas sem a necessidade de uma interface gráfica com mouse.

## CLI - Interface de Linha de Comandos

Acessando o [simulador Bash](https://replit.com/languages/bash), você verá uma tela dividida em duas partes: o terminal propriamente dito e um local para inserir código em linguagens de programação.

No sistema Linux, você pode acessar o terminal através da pesquisa da palavra "_terminal_" na barra de pesquisa ou usando o atalho `Ctrl + Alt + T`.

As modificações e ajustes do sistema Linux são feitos através do menu de preferências. Como isso é algo muito pessoal, não será abordado neste guia. 

O Terminal é semelhante em todos os sistemas. Ao acessá-lo, você verá um cursor piscando. É nesse local que você digita os comandos. Antes do cursor, você verá a **prompt**, que contém o nome do usuário, o diretório atual (que pode ser o diretório principal (~), downloads (/downloads), etc.) e outros indicadores.

Em simuladores Bash como o Replit, é possível configurar o diretório do ambiente simulado para que ele se pareça com o diretório de um sistema Linux. Isso facilita o uso do terminal e a associação do ambiente simulado com o terminal real. Para isso, use a configuração do terminal do ambiente simulado `PS1='\u\w$ '`. Essa configuração fará com que o simulador do Replit exiba um terminal semelhante ao do Linux. O comando significa:
- `\u`: mostra o nome do usuário.
- `\w`: mostra o diretório atual.
- `$`: final de linha de comando tradicional do Linux.

## Diretórios 📁

Diretórios são como pastas, ou seja, locais no seu sistema onde você pode armazenar arquivos. Existem muitos diretórios, cada um com sua função específica. Os diretórios podem ser originais do sistema Linux ou criados por você.

## Comandos Via Terminal ⌨️

Muitos comandos via terminal são abreviações de instruções, geralmente relacionados à semântica que o comando apresenta ou às iniciais da expressão da função que será utilizada.

Nos terminais, principalmente os do Linux, há uma "regra" genérica para a utilização dos comandos:

1. **Nome do comando:** o comando que você deseja executar.
2. **Opções:** modificadores que alteram o comportamento do comando, geralmente indicados com um hífen (`-`) seguido do nome da opção. 
3. **Argumentos:** informações adicionais necessárias para o comando.

⚠️ **Atenção:** verifique sempre o espaçamento no terminal para evitar erros.

**Comandos Úteis:**

- **`pwd` (print working directory):** Exibe o caminho do diretório atual.
- **`ls` (list):** Lista os arquivos e diretórios do diretório atual. 
- **`ls -l` (list long):** Exibe uma lista detalhada dos arquivos e diretórios, incluindo informações como permissões, tamanho e data de modificação.
- **`ls /<nome-diretorio>` ou `ls -l /<nome-diretorio>`:** Lista os arquivos e diretórios dentro de um diretório específico. 
- **`cd <nome-diretorio>` (change directory):** Muda para um diretório específico.
    - `cd`: volta para o diretório principal (~).
    - `cd -`: volta para o último diretório acessado.
    - `cd ..`: sobe um nível na hierarquia de diretórios.
- **`clear`:** Limpa a tela do terminal. Você também pode usar o atalho `Ctrl + L`.

## Próximos Passos ⏭️

[Próxima Seção: GitHub](github.md)