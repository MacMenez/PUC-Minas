# Ambiente de Desenvolvimento Integrado 💻

Um IDE (Ambiente de Desenvolvimento Integrado) é um programa de computador que permite escrever códigos em uma linguagem específica. Na maioria das vezes, cada linguagem é associada a um IDE próprio para compilar e executar os comandos escritos. 

Os IDEs modernos permitem utilizar _extensões_ para integrar mais de uma linguagem a um mesmo programa, facilitando a integração entre códigos e linguagens e evitando a necessidade de ter vários IDEs, o que economiza espaço, por exemplo. 😄

Programadores mais antigos, mais especificamente anteriores aos anos 2000, não tinham IDEs com interfaces gráficas e unificadas como hoje. Alguns programavam seus códigos diretamente no terminal, enquanto outros usavam programas próprios para escrever e compilar seus códigos, criando uma pseudo interface para o terminal de linha de comando.

Atualmente, os IDEs podem possuir interface gráfica, extensões e unificação de linguagens durante o desenvolvimento. Um exemplo disso é o [Visual Studio Code](#visual-code). Alguns IDEs, mesmo atualizados, ainda mantêm a filosofia e a ideia original de esquecer a interface gráfica e focar em escrever código e compilar, como é o caso do [Vim](#vim). Recentemente, com o boom dos SAAS (Software as a Service), surgiram plataformas online que permitem escrever, integrar e compilar códigos sem a necessidade de instalar um compilador ou uma interface para programar. Essas plataformas são semelhantes a "emuladores", como é o caso do [Replit](#replit).

## Vim 🧙‍♂️

[Documentação da IDE direto do site dos desenvolvedores](https://vim.rtorr.com/)

[Versão com seções distintas e mais organizada (na minha opinião)](https://devhints.io/vim)

O desenvolvimento do material de estudos do Vim foi baseado nas documentações acima e no vídeo introdutório ao Vim, [disponível aqui](https://www.youtube.com/watch?v=R62NTq4ae9o).

O Vim tem como característica analisar e escrever códigos de forma produtiva, sem a necessidade de utilizar o mouse, o que permite desenvolver projetos muito mais rapidamente. Tecnicamente, o editor de texto Vim pode ser utilizado em qualquer lugar, para diversas aplicações, como:

- Desenvolvimento Web com servidores Linux
- Desenvolvimento Mobile, Android e iOS
- Entre várias outras tecnologias.

O Vim transcende seu uso tradicional e pode ser usado em diversos cenários.

O Vim não utiliza interface gráfica (GUI). Ele é utilizado pelo próprio terminal e funciona sem a necessidade de intermediários como JVM, Electron ou outros. Por questões de produtividade, é possível até incorporar o Vim na IDE que você preferir, como o VS Code, para ter uma análise e codificação mais consistente. Para evitar o uso do mouse, os Keymaps são muito importantes para o aprendizado, uso e praticidade no Vim, permitindo potencializar IDEs favoritas como o Vim ou qualquer outra.

**PowerUp:**

- Usar o Vim pelo próprio terminal (ele já vem incorporado no Linux e no MacOS).
    - Se você usa Windows, terá que baixar o GVim como interface gráfica.
- Utilizar Vim + Tmux (tendo múltiplas telas de terminais).

A curva de aprendizado do Vim é extensa e demora um pouco para ser dominado. Tudo varia de acordo com sua dedicação. Para uso imediatista e em curto prazo, não utilize o Vim. Sem dedicação de aprendizado a longo prazo, ele não se tornará uma boa solução.

O Vim é um editor de texto extremamente customizável, mas essa abordagem não será abordada nesta seção. Pesquise por conta própria se quiser customizá-lo.

### Comandos Vim

Para executar qualquer comando do Vim, você precisa primeiro pressionar a tecla **Esc** para sair do modo de edição de texto e depois digitar o comando.

O Vim possui 5 modos de execução:

- **Normal Mode / Modo Normal:** neste modo de visualização, as teclas representam comandos. É o momento de analisar e navegar no código.
    - `h`: move o cursor para a esquerda.
    - `j`: move o cursor para baixo.
    - `k`: move o cursor para cima.
    - `l`: move o cursor para a direita.
    - `Shift + i`: move o cursor para o início da linha.
    - `Shift + a`: move o cursor para o final da linha.
    - `o`: cria uma nova linha abaixo para inserir informações.
    - `Shift + o`: cria uma nova linha acima do cursor para inserir informações.
    - `s`: apaga o primeiro símbolo antes do cursor e permite inserir qualquer informação no lugar do símbolo apagado.
    - `Shift + s`: apaga a linha inteira para inserir uma nova informação.
    - `b` (begin): coloca o cursor no início de uma determinada palavra.
    - `w` (word): avança o cursor para a direita, mantendo o cursor no início da palavra.
    - `Shift + b`: vai para o início da palavra, desconsiderando caracteres especiais.
    - `Shift + w`: vai para a frente, desconsiderando caracteres especiais.
    - `e`: vai para o final da palavra.
    - `Shift + e`: vai para o final, desconsiderando caracteres especiais.
    - `gg` (general): vai para o início do arquivo.
    - `Shift + g`: vai para o final do arquivo.
    - `$` (cifrão/dolar): vai para o final da linha.
    - `0` (número zero): vai para o começo da linha.
    - `dd` (delete): apaga uma linha inteira.
    - `x`: apaga caractere por caractere.
    - `{` ou `}` ou `[` ou `]`: busca espaços em branco.
    - `(` ou `)`: navega dentro do bloco de código, entra dentro do bloco de código.
    - `cc` (Change): "apaga uma linha" para que "mude" o conteúdo dela. Permite usar outros comandos integrados, ex: `cj` "mudar" a linha do cursor e a linha abaixo dele. `caw` (change all word), une 3 comandos e altera a palavra inteira onde está o cursor.
    - `u` (undo): volta para a última alteração.
    - `Ctrl + r` (redo): refaz a ação.
    - `r` (replace): troca o caractere onde está o cursor por outro caractere que for digitado.
    - `y` (yank/copiar): para copiar uma linha use `yy` e `p` (paste/colar) para colar a linha copiada.
    - `/`: usa para localizar alguma palavra, ex: `/ texto-desejado`. Aperte `Enter` e use `n` (next) para navegar entre as opções de escolha que estão para baixo e `Shift + n` para as opções que estão acima.
    - `.`: repete a operação anterior.

    É possível também utilizar comandos para representar ações repetitivas, evitando assim digitar várias vezes o mesmo comando. Por exemplo, ao invés de usar o comando `dd` várias vezes para apagar uma determinada quantidade de linhas, basta usar o número de vezes que você quer que o comando seja repetido, ex: `4dd` faz de forma "automática" o comando de deletar linha 4 vezes, apagando assim 4 linhas abaixo de onde o cursor está, incluindo a linha do próprio cursor.
    - `2cc`: mudar as 2 primeiras linhas (referenciando o cursor).
    - `2yy`: copiar as 2 linhas (cursor e a abaixo dele) e em outra linha use o `p` para colar as linhas copiadas.
    
    Apagar uma tag, em HTML por exemplo. Deixe o cursor na tag que deseja, use `dat` (delete all tag), apaga a tag e todo o conteúdo dentro dela. Para apagar apenas o conteúdo da tag, mas manter a tag use-se `dit` (delete inside tag). Para apagar parâmetros use-se `di)` ou `di(` (delete inside + símbolo) por exemplo, para apagar todos os parâmetros dentro dos "()" em um trecho do código. Se usar o "all", apaga também as referências do símbolo, ex: `da(` (delete all + símbolo) apaga os parâmetros e os parênteses.
    - `ci)` (change inside + símbolo): "mudar" todo o conteúdo dentro do símbolo especificado.
    Apagar todo o conteúdo de um determinado método ou função, basta colocar o cursor dentro de qualquer parte do método ou função e usar `di + fechamento de bloco` (geralmente a }). Já emendando, pode-se usar o `Shift + o` para inserir algo na linha de cima.

- **Ex(ecution) Mode / Modo de Execução:** os comandos são ativados com o uso dos `:` e as instruções, que são palavras ou abreviações semânticas em inglês.
    - `:q`: encerra o Vim, sai do programa.
    - `:q!`: sai sem salvar o arquivo.
    - `:help`: contém um tutorial para auxiliar em principais dúvidas.
    
    `:sp`: split, divide a tela em parte superior e parte inferior.
    `vs:` para dividir a tela em esquerda e direita.

- **Insert Mode:** inserir/ativar o editor para que seja possível digitar os códigos do programa.
    - `i` ou `I`: para inserir o código, sai-se então do modo de navegação e entra-se no modo de edição de texto. Para sair, aperte `Esc`.
    - `a`: Apendar/Append. Ao navegar até onde deseja inserir uma informação, aperte `a` para inserir esta nova informação. A informação será inserida na frente do cursor, se apertar `i` será inserida atrás do cursor.

- **Visual Mode:** ativar o modo visual, `v` ou `V` para visualizar ou selecionar determinado trecho do código através da navegação.

- **Block Mode:** `Ctrl + v` usado para trabalhar em blocos, permitindo a seleção, navegação e edição por blocos. Basicamente, ele fará alterações por blocos ou "quadrados".

**Lista de Comandos:**

- `:q`: encerra o Vim, sai do programa.
- `:q!`: sai sem salvar o arquivo.

**Ajuda:** `:help` contém um tutorial para auxiliar em principais dúvidas.
    
- `:sp`: split, divide a tela em parte superior e parte inferior.
- `vs:` para dividir a tela em esquerda e direita.
- `:w`: salva as informações.
- `:e`: abre um arquivo. É necessário passar todo o caminho (path) do arquivo digitado, caso contrário, ele pode não abrir.

O Vim pode ser integrado também com outras IDEs, assim, você pode utilizar a IDE de sua preferência e utilizar estes comandos e execuções do Vim dentro dela. Para integrá-lo, basta utilizar plugins na aba de configurações da IDE e buscar por um que permita isso. Por exemplo, no caso do Visual Studio Code, na aba de extensões (ou `Ctrl + Shift + X`), busque por `vim` e identifique a opção **vscodevim**, instale-a e use-a em seus códigos.

O conteúdo desta seção a respeito do Vim foi desenvolvido através da referência abaixo e implementado com informações cruciais para o uso do Vim na disciplina de Algoritmos e Estruturas de Dados I, Algoritmos e Estruturas de Dados II e/ou Algoritmos e Estruturas de Dados III.

### Referências

[VIM TUTORIAL: COMO COMEÇAR - KEYMAPS. MODES. IDES E MAIS](https://www.youtube.com/watch?v=R62NTq4ae9o)

## Visual Code 🎨

O Visual Studio Code, ou VS Code, é um IDE desenvolvido pela Microsoft e um dos principais utilizados nos dias atuais. Possuindo suporte para diversos sistemas operacionais como Linux, MacOS, Windows e até em smartphones, o VS Code se tornou bastante atrativo por uma característica que ele mantém muito bem: o uso de extensões de linguagens de programação. As extensões do VS Code permitem que se tenha compiladores, uso integrado do terminal de comandos, em alguns casos integrações com interfaces visuais mais robustas, integração com o Git e o próprio GitHub que foi comprado pela Microsoft em 2015. Sendo uma ferramenta muito diversa e extremamente fácil de ser utilizada, ele foi aos poucos caindo nas graças de muitos programadores, que além dos recursos de autocompletar, ainda utilizam suas extensões e integram diversos ambientes ao VS Code.

Devido a esta enorme variação de extensões, que são totalmente ajustáveis ao uso após instaladas no IDE, não há muito o que se falar de comandos específicos para cada uma, já que são milhares. Então, o ideal é verificar as recomendações e "_keymaps_" que a própria Microsoft fornece em seu site oficial.

Vale lembrar que, estas recomendações são atalhos do IDE puro. Caso alguma extensão seja instalada e tenha atalhos iguais, os mesmos devem ser reconfigurados por você através das configurações (`Arquivo > Menu > Preferências > Configurações`).

[Download do site oficial da Microsoft](https://code.visualstudio.com/)

Para instalar o IDE, acesse o site oficial do IDE da Microsoft e baixe a versão mais atual desenvolvida para seu sistema operacional.

[Principais atalhos recomendados pela Microsoft - site da Microsoft](https://code.visualstudio.com/shortcuts/keyboard-shortcuts-linux.pdf)

## Replit 🌎

A plataforma online Replit faz parte de uma nova visão do mundo computacional, apresentando soluções online para serviços a serem desenvolvidos, os _SAAS - Software as a Service_, que se tornou um movimento crescente nos últimos anos, apresentando um mundo onde não se é necessário instalar um IDE, uma máquina virtual, um programa ou aplicativo diretamente na máquina. Em um SAAS, um acesso via internet é feito e, através dos servidores ativos da plataforma acessada, uma máquina virtual, um IDE, um programa podem ser acessados diretamente e executados em tempo real sem a necessidade de uma instalação local. Assim, o Replit é uma solução ideal para iniciantes em programação, fornecendo um ambiente de testes próprio para se programar, compilar e divulgar códigos.

[Acesso à Plataforma](https://replit.com/)

Acessando a plataforma é necessário criar uma conta, autenticar a um serviço de e-mail ou a um repositório de código. Feito isso, a plataforma de forma intuitiva orienta como utilizar, além de, na própria área de comunidade, fornecer acesso a dúvidas de outros usuários e auxiliar ainda mais no uso da mesma. Com o acesso à plataforma, basta escolher uma linguagem de programação e começar a escrever os códigos, utilizando botões para realizar todo o trabalho duro por "debaixos dos panos" e tendo pouco contato com a parte mais "bruta" da programação. **Caso tenha um e-mail ou acesso de estudante, utilize estes dados para acessar a plataforma e desfrute de benefícios**.

## Próximos Passos ⏭️

[Seção Anterior: GitHub](github.md)

[Próxima Seção: Introdução às linguagens C, C++ e Java](linguagens-aeds-ii.md)
