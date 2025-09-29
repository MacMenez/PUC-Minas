File
New
Project Wizard
Informar nome do projeto
Next
Na página 3 deve ser configurado o dispositivo alvo para a compilação:
•Family : Cyclone II
•Package : FBGA
•Pin count : 672
•Speed grade : 6
•Device : EP2C35F672C6 (é o primeiro da lista)
Finish
File
New
    Diagram/Schematic File
        Cap2ex1.bdf
        Inserir portas lógicas
        Ctlr+S
        Análise e síntese (Ctrl+K)
            Outra forma de iniciar o processo de análise e síntese é: 
                Processing
                Ativar a opção Start
                Start Analysis & Synthesis
    Vector Waveform File
        Cap2ex1.vwf
        Add file to current project
        Para fazer zoom in zoom out na escala de tempo:
            usar o Ctrl mouse scroll
            atalhos Ctrl+Space e Ctrl+Shift+Space
        Para inserir os sinais que vão fazer parte da simulação:
            Com o botão direito do mouse , clicar na área vazia a esquerda
        Insert
        Insert Node ou Bus
        Node Finder
        Filter
            Pins: all
            List
            Clicar no botão >> para selecionar todos os sinais
            OK
        OK
        Usaremos uma grade de 10 ns
        configurar os estímulos de entrada para a simulação:
            Com o mouse, marcar a área da linha da entrada A, entre 20,0 e 40,0 ns;
            clicar no botão (com simlo 1 pra cima) da barra de ferramentas lateral
            clicar no botão (clock ) da barra de ferramentas
            preencher a janela aberta conforme orientado 
            (endtime = 40; time period -> period 20; duty cycle = 50) tudo em ns
            OK
        Ctlr+S
        Realizar a simulação funcional (Ctrl+Shift+E) ou
            Assignments
            Settings
            Simulator Settings
            Simulation mode: Functional
        Simulator Settings
            Simulation output file
            Overwrite simulation input file with simulation results
            OK
            Ctlr+S no arquivo .vwf
    VHDL File
        Salvar com mesmo nome do projeto
        Ctlr+S
        Análise e síntese (Ctrl+K)
            Outra forma de iniciar o processo de análise e síntese é: 
                Processing
                Ativar a opção Start
                Start Analysis & Synthesis
        Não devem ocorrer erros ou warnings
        Realizar a simulação funcional (Ctrl+Shift+E) ou
            Assignments
            Settings
            Simulator Settings
            Simulation mode: Functional
        Aterrar pinos não usados
        Compilar o projeto, e verificar se ocorreram erros. São esperadas duas mensagens de warnings
        Programar o dispositivo FPGA no módulo DE2, usando a interface USB e fazer o teste do projeto.
Netlist para o circuito ser simulado:
    Processing
    Generate Functional Simulation Netlist
    OK
Iniciarmos a simulação(Ctrl+I)
    Menu
    Processing
    Start Simulation
Uma outra maneira de configurar e iniciar a simulaçao é:
    Menu
    Processing
    Simulator Tool
    Simulation mode: Functional
    Generate Functional Simulation Netlist
    Overwrite simulation input file with simulation results
    Clicar no botão para iniciar a simulação Start
    se o arquivo de simulação não estiver aberto, clicar no botão OPEN
Aterrar pinos não usados
    Menu
    Assignments
    Device
    Device and Pins Options
    Unused Pins
    Reserve all unused pins: As input tri stated
    OK
    OK
Especificado em quais pinos do circuito integrado devem ser ligados os sinais de entrada
    Menu
    Assignments
    Pins
    Node Name
    Coluna "Location", e digitar ou escolher o pino
    Após finalizar a configuração de todos os pinos, fechar a janela (não há necessidade de confirmação)
Para testar o projeto no módulo DE2, é necessário compilar o projeto (Ctrl+L)
    Menu 
    Processing
    Ativar a opção Start_Compilation
Programar o dispositivo:
    Menu
    Tools
    Programmer
    Hardware Setup
    USB Blaster
    Close
    Start
Agora você já pode verificar o funcionamento do seu projeto no hardware alvo em tempo real!
