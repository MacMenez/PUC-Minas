# Ambiente de Desenvolvimento Integrado

Um IDE - Ambiente de Desenvolvimento Integrado é um programa de computador que permite escrever códigos em uma linguagem especifica. Na maioria das vezes, cada linguagem é associada a um IDE próprio para comilar e executar os comandos escritos. Os IDE modernos já permitem utilizar as chamadas _extensões_ para integrar mais de uma linguagem a um mesmo programa, permitindo integrações entre códigos e linguagens, evitando assim um excesso desnecessário de IDE, o que economiza em espaço, por exemplo.

Programadores mais antigos, mais especificamente anteriores aos anos 2000, não tinha IDE com interfaces gráficas e unificadas como hoje, alguns programavam seus códigos no próprio terminal, outros programavam em programas próprios para escrever e talvez até compilar seus códigos, integrando uma pseudo interface ao terminal de linha de comando.

Atualmente as IDE podem possuir interface gráfica, extensões e unificações de linguagem durante o desenvolvimento, um exemplo delas é o [Visual Studio Code](#visual-code). Alguns, mesmo atualizados, ainda mantém a filosofia e ideia original de esquecer a interface visual gráfica como a do VS Code (Visual Studio Code) e focam em escrever código e compilar, APENAS, como o é o caso do [Vim](#vim). Surgiu recentemente, como o boom dos SAAS - _Softwares Como Serviço_, plataformas online que permitem escrever, integrar e compilar códigos sem a necessidade de instalar um compilador ou uma interface para programar, são semelhantes a "emuladores", como é o caso do [Replit](#replit).

## Vim

[Documentação da IDE direto do site dos desenvolvedores](https://vim.rtorr.com/)

[Versão com seções distintas e mais organizada (na minha opinião)](https://devhints.io/vim)

O desenvolvimento do material de estudos do Vim foi pego das documentações acima, fornecedia, e pelo vídeo, também forncecido, que serve como uma introdução ao Vim, [apresentado aqui](https://www.youtube.com/watch?v=R62NTq4ae9o).

Tendo como caracteristicas analisar e escrever códigos de forma produdita, sem ter que utiilizar o mouse, desenvolvendo assim projetos de forma muito mais rápida. Tecnicamente, o editor de texto Vim pode ser utilizado em qualquer lugar, para diversas aplicações, sejam elas:

- Desenvolvimento Web com servidores Linux
- Desenvolvedor Mobile, Android e iOS
- Entre várias outras tecnologias

que podem ser desenvolvidas com o Vim, que trascende seu uso.
Vim não utiliza interface gráfica, não tem GUI. Ele é utilizado pelo próprio terminal, assim sendo, ele funciona sem a ecessidade de intermediários como JVM, electron ou outros. Por questões de produtividade é possivel até incorporar o Vim na IDE que prefira, como por exemplo VS Code, tendo assim uma análse e condificação mais consistente. A fim de evitar o uso do mouse, os Keymap, são muito importantes para o aprendizado, uso e praticidade no uso do Vim, permitido assim potencializar IDEs favoritas e utilizaveis, seja o Vim, seja qualquer outra.

PowerUp

- Usar o Vim pelo próprio terminal(vá vem incorporado no Linux e no MacOS)
    - Se usa Windows terá que baixar o GVim como interface gráfica
- Utilizar Vim + Tmux (tendo multiplas tela de terminais)

A curva de aprendizado do Vim pode varia miito, ela é extensa e por isso demora um pouco para se aprender, tudo varia conforme a sua dedicação. Para uso imediatista e em curto prazo, não utilize o VIm, sem dedicação de aprendizado a longo prazo, ele não se tornará uma boa solução.

Vim é um editor de texto extremamente customizável, porém esta abordagem não diz respeito a esta seção. Pesquise por conta própria caso queira customizá-lo.

Comandos Vim

Todo comando do Vim, para ser executado deverá primeiramente, apertar a tecla esc, para sair do modo edição de texto e digitar os comandos.

O Vim possui 5 modos de execução
- Normal Mode / Modo Normal: neste modo de visualização, as teclas representam comandos. momento de análise e navegação do código
    `h` para esquerda
    `j` para baixo
    `k` para cima
    `l` para direita
    `shift + i` vai para o inicio da linha, totalemtne para frente
    `shift + a` vai para o final
    `o` cria uma nova linha abaixo para inserir as informações
    `shift + o` cria uma nova linha abaixo do cursor para inserir informações
    `s` apaga o 1° símbolo antes do cursos e permite inserir qualquer informação no lugar do símbolo apagado.
    `shift + s` apaga a linha inteira para inserir uma nova informação
    `b`(begin) coloca o cursosr no inicio de uma determinada palvra, por exemplo, se o cursor esta no meuio da palavra, ao apertar `b` o cursos vai para o inicio desta palavra. ao apertar `b` sucetivamente, o cursor ddesloca para o inicio das palavras, indo assim para à esquerda, lembrando que ele reconhece palavras atraves do espaçamento do texto.
    `w`(word) é usdo paera avançar, ou seja, faz o inverso do `b`, indo assim para à direita do cursos. o `w` faz ir para à direita mas mantém o cursor no inicio da palavra
    `shift b` vai para o inicio da palavra desconsiderando caracteres especiais.
    `shift w` vai para frente desconsiderando caracteres especiais
    `e` vai para o final da palvra
    `shift e` vai para o final desconsiderando caracteres especiais
    `gg`(general) vai para o inicio do arquivo
    `shift g` vai para o final do arquivo
    `$`(cifrão/dolar) vai para o final da linha
    `0`(número zero) vai para o começo da linha
    `dd`(delete) apaga uma linha interira
    `x` apaga caractere por caractere
    `{` ou `}` ou `[` ou `]` busca espaços em branco
    `(` ou `)` navega dentro do bloco do código, entra dentro do bloco de código
    `cc` Mudar/Change. "apaga uma linha" para que "mude" o conteúdo dela. permite usar outros comandos integrados, ex: `cj` "mudar" a linha do cursor e a linha abaixo dele. `caw` (change all word), une 3 comandos e altera a palvra inteira onde estáo cursor
    `u`(undo) volta para ultima alteração
    `ctrl r`(redu) refaz a ação.
    `r`(replace) troca o caractere onde esta o cursor por outro caractere q for digitado.
    `y`(yank/copiar) para copiar uma linha use `yy` e `p`(paste/colar) para colar a linha copiada.
    `/` usa para localizar alguma lapavra, x: `/ texto-desejado` aperte `enter` e use `n`(next) para navegar entre as opções de escolha que estão para baixo e `shift n`para as opções quwe estão acima.
    `.` repete a operação anterior

    é possivel também utilizar comandos para representar açoes repetitivas, evitando assim digitar varias vezes o mesmo comando.
    ex: ao inves de udar o comando `dd` varias vezes para apagar uma determinada quantidade de linhaas, basta usar o númeor de vezes que quer q este comando seja repetido, ex `4dd` faz de forma "automática" o comando de deletar linha 4 vezes, apagando assim 4 linhas abaixo de onde o cursor esta, incluindo a linha do próprio cursor.
    `2cc` mudar as 2 primiras lihas(referenciando o cursor).
    `2yy` copiar as 2 linhas (cursor e a abaixo dele) e em outra linha use o `p` para colar as linhas copiadas.
    
    apagrar uma tag, em HTML por exemplo. deixa o cursor na tag que deseja, usa `dat`(delete all tag), apaga a tag e todo o conteúdo dentro dela. para apagar apenas o conteúdo da tag, mas, manter a tag usa-se `dit`(delete inside tag). 
    para apagar parametros usa-se `di)` ou `di(` (delete inside + simbolo) por exemplo, para apagar todos os parametros dentro dos "()" em um trecho do código. se usar o "all", apaga também as referencias do símbolo, ex: `da(` (delete all + simbolo) apaga os parametros e os parenteses.
    `ci)` (change inside + simbolo) "mudar" todo o conteudo dento do símbolo especificadoconteúdio dentro dos parentese.
    apagar todo o conteudo de um determinado método ou função, basta colocar o cursor dentro de qualquer parte do método ou função e usar `di + fechamento de bloco` (geralemtne a }). já emendando, pode-se usar o `shift + o` para inserir algo na linha de cima.

- Ex(ecution) Mode / Modo de Execição: Os comandos são ativados com o uso dos `:` e as instruções, que são palavras, ou abreviações semânticas, em inglẽs.
    - quit/sair: 
        - `:q` encerra o Vim, sai do programa
        - `:q!` sair sem salvar o arquivo
    - ajuda:
    `:help` contém um tutorial para auxiliar em principais dúvidas
    
    `:sp` split, divide a tela em parte superior e parte inferior.
    `vs:` para dividir a tela em esquerda e direita

- Insert Mode
    inserir/ativar o editor para que seja possível digitar os códigos do programa
    `i` ou `I` - para inserir o código, sai-se então do modo de navegação e entra-se no modo de edição de texto. Para sair aperte `esc`.
    `a` Apendar/Append. ao navegar até onde deseja inserir uma informação, aperte `a` para inserir esta nova informação. a informação sera inserida na frente do cursor, se apertar `i` será inserida atrás do cursosr
- Visual Mode
    ativar o modo visual, `v` ou `V` para visualizar ou selecionar determinado trecho do código através da navegação
- Block Mode
    `crtl + v` usado para trabalhar em blocos, permitindo a seleção, navegação e edição por blocos. Basicamente ele fará alterações por blocos ou "quadrados".

Lista de Comandos
`:q` encerra o Vim, sai do programa
`:q!` sair sem salvar o arquivo

ajuda: `:help` contém um tutorial para auxiliar em principais dúvidas
    
`:sp` split, divide a tela em parte superior e parte inferior.

`vs:` para dividir a tela em esquerda e direita

`:w` salavaar informações
`:e` abrir um arquivo. é necessário passar todo o caminho(path) do arquivo digitado, caso contrário, ele pode não abrir.

O Vim pode ser integrado também com outras IDE, assim, pode-se utilizar a IDE de sua preferencia e utilizar estes comandos e execuções do Vim dentro da sua IDE, isto é gosto, faça se quiser. Para integrá-lo, basta utilizar plugins na aba de configurações da IDE e buscar por um que permita isso. Por exemplo, no caso do Visual Studio COde, na aba de extensões, ou `ctrl shift x`), busque por `vim` e identifique a opção **vscodevim**, instale-a e use-a em seus códigos.

O conteúdo desta seção a respeito do Vim, foi desenvolvido através da referencia abaixo e implementado com informações cruciais para o uso do Vim na disciplina de Algoritmos e Estruturas de Dados I, Algoritmos e Estruturas de Dados II e/ou Algoritmos e Estruturas de Dados III

### Referências

[VIM TUTORIAL: COMO COMEÇAR - KEYMAPS. MODES. IDES E MAIS](https://www.youtube.com/watch?v=R62NTq4ae9o)

## Visual Code

O Visual Studio Code, ou VS COde é um IDE desenvolvido pel Microsoft e um dos principais utilizados nos dias atuais. Possuindo suporte, ou seja, funcionando em diversos sistemas operacionais como Linux, MacOS, Windows a até em smartphones, o VS Code se tornou bastante atrativo por uma característica que ele mantém muito bem. o uso de extensões de linguagens de programação. As extensões do VS Code permitem que se tenha compiladores, uso integrado do terminal de comandos, em alguns casos integrações com interfaces visuais mais robustas, integração com o Git e o próprio GitHub que foi comprado pela Microsoft em 2015. Sendo uma ferramenta muito diversa e extremamente fácil de se ser utilizada, ele foi aos poucos caindo nas graças de muitos programadores, que além dos recursos de autocompletar, ainda utilizam suas extensões e integram diversos ambientes ao VS Code. 

Devido a esta enorme variação de extenções, que são totalmente ajustáveis ao uso após instaladas no IDE, não há muito o que se falar de comandos específicos para cada uma, jáque são miolhares. Então, o idela é verificar as recomendações e "_keymaps_" que a própria microsoft forncene do seu site oficial.

Vale lembrar que, esta recomendações são atalhos do IDE puro, caso alguma extensão seja instalada e tenha atalhos iguais, os mesmos devem ser reconfigarados por você atraveś das configurações, `arquivo > menu > Preferências > Configurações`.
[Download do site oficial da Microsoft](https://code.visualstudio.com/)

Para instalar o IDE, acesse o site ofcial do IDE da Microsfot e baixe a versão mais atual desenvolvida para seu sistema operacional.

[Principais atalhos recomendados pela Microsoft - site da Microsoft](https://code.visualstudio.com/shortcuts/keyboard-shortcuts-linux.pdf)

## Replit

A plataforma online Replit faz parte de uma nova visão do mundo computacional.

[Acesso à Plataforma](https://replit.com/)

## Próximos Passos ⏭️

[Seção Anterior: GitHub](github.md)

[Próxima Seção: Introdução às linguagens C, C++ e Java](linguagens-aeds-ii.md)