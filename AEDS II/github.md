# GitHub 💻

GitHub é uma plataforma online que facilita o trabalho em equipe e o armazenamento de códigos-fonte e projetos de tecnologia.  
🤯 Ela oferece diversas funcionalidades, como:

* **Controle de versão:** Permite acompanhar todas as alterações feitas no código, como um histórico completo de tudo que foi modificado. 🕰️
* **Compartilhamento de código:**  Compartilhe seus projetos com outros desenvolvedores e colabore em projetos em conjunto. 🤝
* **Armazenamento na nuvem:** Mantenha seus códigos seguros e acessíveis a qualquer hora e lugar. ☁️

## Git 🌳

Git é um sistema de controle de versão **local**, ou seja, você o instala na sua máquina e ele gerencia as versões do seu código localmente. 🚀

Para instalar o Git, acesse o [site oficial](https://git-scm.com/) e baixe o instalador para seu sistema operacional. 📥

Você também pode instalá-lo via terminal, usando o comando:

```bash
sudo apt-get install git
```

Após a instalação, verifique se o Git está funcionando corretamente com o comando:

```bash
git --version
```

## GitHub 🌐

GitHub é uma plataforma de hospedagem de repositórios Git **na nuvem**. ☁️ Para usar o GitHub, você precisa criar uma conta gratuita no [site oficial](https://github.com/). 👤

## Entendendo os Conceitos 💡

Em computação, o termo correto para "pasta" é **diretório**.  📁  O Git e o GitHub usam o termo **repositório** para se referir ao local onde os arquivos são armazenados. 📦

* **Repositório local:** A pasta na sua máquina onde você armazena seu código, projeto ou arquivos. 💻
* **Repositório remoto:** A pasta no servidor GitHub onde você armazena seu código, projeto ou arquivos. ☁️

## Repositórios 🗃️

No GitHub, você cria um repositório para armazenar seus códigos-fonte, projetos, arquivos e qualquer outra informação relevante. 📑

Para criar um repositório:

1. Clique no botão **New** na sua página do GitHub. ➕
2. Dê um nome ao seu repositório e adicione uma descrição. 📝
3. Clique em **Create repository**. 🎉

Para clonar um repositório do GitHub para sua máquina local:

1. Vá até o repositório que você deseja clonar e clique no botão **Code**. 🔗
2. Copie o link do repositório. 📋
3. Abra o terminal e navegue até o local onde deseja salvar o repositório. 🧭
4. Execute o comando `git clone <link-do-repositório>`. 📥

## Trabalhando com Git 👷‍♀️

Após clonar um repositório, você pode começar a trabalhar com o Git para gerenciar as versões do seu código. 

* **`git add <nome-do-arquivo>`:** Adiciona um novo arquivo ao repositório local. ➕
* **`git commit -m "<descrição-da-alteração>"`:** Salva as alterações no repositório local com uma mensagem descritiva. 📝
* **`git push`:** Envia as alterações do repositório local para o repositório remoto no GitHub. ⬆️

## Branches 🌳

Branches são como "ramos" de código que permitem trabalhar em diferentes funcionalidades de forma independente. 

* **`git checkout -b <nome-do-branch>`:** Cria um novo branch. 🌳
* **`git merge <nome-do-branch>`:** Funde um branch com o branch principal (master). 🤝

## Pull Requests 🤝

Pull requests são usadas para enviar seus códigos para revisão antes de serem incorporados ao branch principal. 

1. **Crie um novo branch** para sua nova funcionalidade. 🌳
2. **Faça suas alterações** no código. 🛠️
3. **Faça um commit** das alterações. 📝
4. **Crie um pull request** para o branch principal. 🤝
5. **Aguarde a revisão** do código por outro membro da equipe. 👀
6. **Responda aos comentários** e corrija os erros. 🔁
7. **Fundir o branch** com o branch principal. 🤝

## Outros Comandos Úteis 🧰

* **`git pull`:** Baixa as alterações do repositório remoto para o repositório local. ⬇️
* **`git status`:** Mostra o status do repositório local. 👁️
* **`git log`:** Mostra o histórico de commits. 🕰️

## Dicas Extras 💡

* **Escreva mensagens de commit claras e concisas**. 📝
* **Faça commits pequenos e frequentes**. 🤏
* **Use branches para isolar o desenvolvimento de novas funcionalidades**. 🌳
* **Faça testes antes de enviar um pull request**. 🧪
* **Participe de revisões de código de outros desenvolvedores**. 👀

🚀 Espero que este guia é útil para você entender os conceitos básicos do Git e GitHub. Ele foi baseado no PDF disponibilizado no repositório de nivelamento da disciplina de **Algoritmos e Estruturas de Dados II da PUC Minas**.

## Próximos Passos ⏭️

[Seção Anterior: Introdução ao Linux](introducao-linux.md)

[Próxima Seção: Ambientes de Desenvolvimento Integrado](ide-aeds-ii.md)