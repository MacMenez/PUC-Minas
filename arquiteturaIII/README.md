# 🖥️ Arquitetura de Computadores III 💻

### 🎓 Curso de Engenharia de Computação

#### 📍 Pontifícia Universidade Católica de Minas Gerais - Unidade Coração Eucarístico (COREU)

<!-- <p align="center"><img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/></p> -->
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-blue)
![GitHub repo size](https://img.shields.io/github/repo-size/MacMenez/iniciacao-cientifica)
![GitHub contributors](https://img.shields.io/github/contributors/MacMenez/iniciacao-cientifica)
![GitHub last commit](https://img.shields.io/github/last-commit/MacMenez/iniciacao-cientifica)
![License](https://img.shields.io/badge/License-MIT-green)

Este repositório documenta o desenvolvimento do portifólio da disciplina de **Arquitetura de Computadores III**.

### Premissas

Me apresente o máximo de informações possíveis junto de referncias bibliográficas, artigos e fontes acadêmicas confiáveis.

Me apresente a diferença entre as arquiteturas CISC, RISC, ARM, e demais arquiteturas. Junto disto me fale onde usar cada uma e como/qual pensamento utiizar para conseguir escolher uma em específico. Apresente também estratégias para se criar uma nova arquitetura (propósito geral ou específico (jogos, IA, processamento,etc)) com um planejamento, tomadas de decisão. Fale também sobre como FMS (máquinas de estados) são utilizadas em arquiteturas (escolha, contrução ou implementações e melhorias). Apresente também métodos de se criar cada arquitetura em circuitos (Logisim e semelhantes (gratuitos ou não)) e como usar linguagens para testar e utilizar estas arquiteturas. Pretendo fazer trabalhos (TCC), artigos (acadêmigos (CAPES, FAPEMIG, CNPq)) e projetos independentes no assunto, então preciso do máximo de informações possíveis e metodologias de estudos para ter nível máximo de conhecimento em hardware e ter know-how para atuar na área. Proponha também porjetos em níveis evolutivos para estudos de modo que possa fazem utilizando microcontroladores, CIs, simuladores, etc., me dando o máximo possível de passo a passo.

### Resposta da IA (Google IA Studio)

Uau, que ambição fantástica! Este é um campo fascinante e desafiador. Vou tentar cobrir o máximo possível, organizando as informações para facilitar seu estudo e pesquisa.

**Aviso Importante:** Este é um campo vasto. O que apresento aqui é um ponto de partida robusto. A profundidade virá com estudo dedicado de cada tópico e, principalmente, com a prática.

Vamos dividir sua solicitação em partes:

**Parte 1: Arquiteturas de Conjunto de Instruções (ISA - Instruction Set Architecture)**

O ISA é a interface entre o hardware e o software. Define o conjunto de instruções que um processador pode executar, os tipos de dados, registradores, modos de endereçamento, arquitetura de memória, tratamento de interrupções e exceções.

1.  **CISC (Complex Instruction Set Computer)**
    *   **Conceito:** Processadores com um conjunto grande e complexo de instruções. Uma única instrução CISC pode executar várias operações de baixo nível (como carregar da memória, uma operação aritmética e armazenar na memória).
    *   **Objetivo Histórico:** Facilitar a programação em Assembly e reduzir o "semantic gap" entre linguagens de alto nível e linguagem de máquina, além de economizar memória (RAM era cara).
    *   **Características:**
        *   Muitas instruções, algumas muito especializadas.
        *   Instruções de tamanho variável.
        *   Múltiplos modos de endereçamento.
        *   Operações podem acessar diretamente a memória.
        *   Microprogramação é comum para implementar instruções complexas (uma instrução CISC é decodificada em uma sequência de micro-operações RISC-like internamente em processadores modernos).
    *   **Vantagens:**
        *   Pode simplificar a escrita de compiladores (inicialmente).
        *   Menor número de instruções por programa (em teoria).
    *   **Desvantagens:**
        *   Hardware mais complexo para decodificar e executar instruções.
        *   Diferentes instruções levam tempos diferentes para executar, dificultando o pipelining eficiente.
        *   Apenas uma pequena fração das instruções complexas é frequentemente usada.
    *   **Exemplos:** Intel x86 (Pentium, Core i-series), AMD x86-64, Motorola 68k, VAX.
    *   **Onde Usar:** Desktops, laptops, servidores. Embora os processadores x86 modernos internamente traduzam instruções CISC para micro-operações RISC, o ISA exposto ao software ainda é CISC.

2.  **RISC (Reduced Instruction Set Computer)**
    *   **Conceito:** Processadores com um conjunto pequeno, simples e altamente otimizado de instruções. Cada instrução executa uma operação muito simples e geralmente em um único ciclo de clock (idealmente).
    *   **Objetivo:** Simplificar o hardware, permitindo clocks mais rápidos, pipelining mais eficiente e mais espaço no chip para outros recursos (cache, registradores).
    *   **Características:**
        *   Pequeno número de instruções de formato fixo.
        *   Instruções geralmente executadas em um ciclo de clock.
        *   Operações load/store são as únicas que acessam a memória; operações aritméticas e lógicas usam apenas registradores.
        *   Grande número de registradores de propósito geral.
        *   Pipelining profundo e eficiente.
        *   Compilador tem um papel mais importante na otimização do código.
    *   **Vantagens:**
        *   Hardware mais simples e rápido.
        *   Design mais fácil de verificar e otimizar.
        *   Melhor eficiência energética (geralmente).
        *   Pipelining mais eficaz.
    *   **Desvantagens:**
        *   Maior número de instruções para realizar a mesma tarefa (comparado a uma instrução CISC complexa).
        *   Dependência maior do compilador para otimizar o código.
    *   **Exemplos:** MIPS, SPARC, PowerPC, RISC-V, **ARM**.
    *   **Onde Usar:** Dispositivos móveis (smartphones, tablets), embarcados, supercomputadores (alguns), e cada vez mais em servidores e desktops (ex: Apple M-series).

3.  **ARM (Advanced RISC Machines)**
    *   **Conceito:** ARM é uma família de arquiteturas RISC licenciada pela Arm Holdings. Não fabricam chips, mas licenciam o design do núcleo para outras empresas (Qualcomm, Apple, Samsung, NXP, etc.).
    *   **Características Principais (varia entre versões da arquitetura ARMvX):**
        *   Filosofia RISC.
        *   Instruções de 32 bits (ARM) e 16 bits (Thumb) para densidade de código, e 64 bits (AArch64).
        *   Foco em baixo consumo de energia.
        *   Grande número de registradores.
        *   Load/Store architecture.
        *   Suporte a execução condicional em muitas instruções (reduzindo branches).
        *   Extensões como NEON (SIMD para multimídia) e TrustZone (segurança).
    *   **Vantagens:**
        *   Excelente eficiência energética.
        *   Altamente configurável e escalável (desde microcontroladores Cortex-M até servidores Cortex-A).
        *   Amplo ecossistema de ferramentas e software.
        *   Modelo de licenciamento flexível.
    *   **Desvantagens:**
        *   Custo de licenciamento (para projetar seus próprios cores ARM).
        *   Performance por clock pode ser menor que x86 em algumas cargas de trabalho de alta performance (embora isso esteja mudando rapidamente).
    *   **Onde Usar:** Dominante em dispositivos móveis, sistemas embarcados, IoT. Crescendo em laptops (Apple M-series), servidores (AWS Graviton) e HPC.

4.  **Outras Arquiteturas Notáveis:**
    *   **VLIW (Very Long Instruction Word):**
        *   Empacota múltiplas operações independentes em uma única instrução "muito longa".
        *   A paralelização é definida estaticamente pelo compilador.
        *   Exemplos: Intel Itanium (que também é EPIC), alguns DSPs.
        *   Uso: Processamento de sinal digital, multimídia, computação científica.
    *   **EPIC (Explicitly Parallel Instruction Computing):**
        *   Evolução do VLIW, com recursos para auxiliar o compilador na paralelização.
        *   Exemplo: Intel Itanium (IA-64).
    *   **DSP (Digital Signal Processor):**
        *   Otimizados para processamento de sinais em tempo real (áudio, vídeo, telecom).
        *   Instruções MAC (Multiply-Accumulate) rápidas, modos de endereçamento especializados (circular buffers).
        *   Exemplos: Texas Instruments TMS320 series, Analog Devices SHARC.
    *   **GPU (Graphics Processing Unit):**
        *   Originalmente para gráficos, agora para computação paralela massiva (GPGPU).
        *   Arquitetura SIMT (Single Instruction, Multiple Threads). Muitos núcleos simples.
        *   Exemplos: NVIDIA GeForce/Quadro/Tesla, AMD Radeon/Instinct.
        *   Uso: Jogos, IA (deep learning), simulações científicas.
    *   **MISC (Minimal Instruction Set Computer):**
        *   Leva o conceito RISC ao extremo, com um número mínimo de instruções.
        *   Pode ser implementado de forma muito eficiente em termos de área e energia.
        *   Uso: Aplicações embarcadas muito específicas, pesquisa.
    *   **RISC-V:**
        *   ISA RISC aberto e gratuito. Não é um processador, mas uma especificação.
        *   Modular, permitindo extensões personalizadas.
        *   Ganhando tração em pesquisa, sistemas embarcados e até HPC.
        *   Permite criar processadores sem pagar royalties de licenciamento.

**Comparativo Rápido CISC vs. RISC**

| Característica        | CISC                                     | RISC                                       |
| :-------------------- | :--------------------------------------- | :----------------------------------------- |
| Conjunto de Instruções | Grande, complexo                         | Pequeno, simples                           |
| Tamanho da Instrução  | Variável                                 | Fixo                                       |
| Ciclos por Instrução  | Múltiplos (variável)                     | Um (idealmente) ou poucos                  |
| Acesso à Memória      | Muitas instruções acessam                | Apenas Load/Store acessam                  |
| Registradores         | Menos, alguns especializados             | Muitos, de propósito geral                 |
| Pipelining            | Mais difícil de implementar eficientemente | Mais fácil de implementar eficientemente   |
| Complexidade Hardware | Maior                                    | Menor                                      |
| Papel do Compilador   | Menos crítico (inicialmente)             | Mais crítico para otimização               |
| Consumo de Energia    | Geralmente maior                         | Geralmente menor                           |

**Onde usar cada uma e como escolher:**

*   **CISC (x86):**
    *   **Uso:** Desktops, laptops, servidores onde compatibilidade com software legado x86 é crucial e alta performance single-thread é prioritária.
    *   **Escolha:** Se o ecossistema x86 é um requisito ou se a aplicação se beneficia das otimizações específicas e da alta frequência dos processadores x86 de ponta.
*   **RISC (genérico, MIPS, SPARC):**
    *   **Uso:** Sistemas embarcados, roteadores, P&D em arquiteturas.
    *   **Escolha:** Quando a simplicidade do design, baixo custo (se não ARM) e controle sobre a implementação são importantes.
*   **ARM:**
    *   **Uso:** Quase onipresente em mobile e embarcados. Crescendo em PCs, servidores, IoT, automotivo.
    *   **Escolha:** Eficiência energética é crítica, ecossistema vasto é desejável, soluções escaláveis desde microcontroladores até CPUs de alta performance.
*   **RISC-V:**
    *   **Uso:** Embarcados customizados, aceleradores, pesquisa, onde se deseja evitar royalties e ter controle total sobre o ISA (com extensões).
    *   **Escolha:** Flexibilidade máxima, design aberto, sem custos de licenciamento do ISA, necessidade de customização profunda.
*   **VLIW/EPIC:**
    *   **Uso:** Domínios que podem ser altamente paralelizados estaticamente pelo compilador (processamento de imagem, científico).
    *   **Escolha:** Aplicações com paralelismo de nível de instrução (ILP) abundante e previsível.
*   **DSP:**
    *   **Uso:** Áudio, vídeo, telecomunicações, controle de motores.
    *   **Escolha:** Aplicações com uso intensivo de algoritmos de processamento de sinal (filtros, FFTs).
*   **GPU:**
    *   **Uso:** Gráficos, IA, machine learning, simulações.
    *   **Escolha:** Aplicações com paralelismo de dados massivo.

**Pensamento para Escolher uma Arquitetura:**

1.  **Requisitos da Aplicação:**
    *   Performance (single-thread, multi-thread, throughput)?
    *   Consumo de energia?
    *   Custo (do chip, de desenvolvimento)?
    *   Tempo de mercado?
    *   Tamanho físico?
    *   Confiabilidade e segurança?
    *   Software legado ou ecossistema existente?
2.  **Métricas Chave:**
    *   **IPC (Instructions Per Cycle):** Quantas instruções, em média, são executadas por ciclo de clock.
    *   **Clock Speed (Frequência):** Velocidade do clock.
    *   **Power Efficiency:** Performance por Watt.
    *   **Area Efficiency:** Performance por mm² de silício.
3.  **Trade-offs:** Não existe arquitetura perfeita para tudo.
    *   CISC pode ter código menor, mas hardware complexo.
    *   RISC pode ter hardware simples, mas código maior e depende mais do compilador.
    *   ARM tem ótimo consumo, mas pode ter custos de licença.
    *   RISC-V é aberto, mas o ecossistema de software maduro ainda está em desenvolvimento comparado ao ARM/x86.
4.  **Nível de Abstração:**
    *   Você vai usar um chip pronto (ex: Raspberry Pi com ARM, PC com x86)?
    *   Você vai projetar um System-on-Chip (SoC) usando IPs licenciados (ex: um núcleo ARM)?
    *   Você vai projetar seu próprio núcleo de processador do zero (ex: um núcleo RISC-V)?

**Parte 2: Estratégias para Criar uma Nova Arquitetura**

Criar uma nova arquitetura é um empreendimento gigantesco, geralmente reservado para grandes empresas ou consórcios de pesquisa com recursos significativos. Mas, para fins acadêmicos ou projetos específicos, é possível.

**Propósito Geral vs. Específico (ASIP - Application-Specific Instruction-set Processor):**

*   **Propósito Geral (GPP):** Tenta ser bom em uma ampla gama de tarefas (ex: x86, ARM Cortex-A). Mais complexo de projetar e otimizar.
*   **Propósito Específico (ASIP):** Otimizado para um domínio particular (ex: DSPs para áudio, GPUs para gráficos, NPU/TPU para IA).
    *   **Jogos:** Poderia envolver um GPP forte, uma GPU potente e talvez aceleradores para física ou IA.
    *   **IA:** Foco em operações matriciais, tipos de dados de baixa precisão, fluxos de dados paralelos (como Google TPU).
    *   **Processamento (Científico):** Foco em ponto flutuante de alta precisão, grande capacidade de memória e largura de banda.

**Planejamento e Tomada de Decisão (Fases Típicas):**

1.  **Análise de Requisitos e Definição do Domínio:**
    *   Quais aplicações o processador irá rodar?
    *   Quais são os gargalos de performance nessas aplicações? (Profiling é essencial).
    *   Quais são as restrições (energia, custo, área)?
    *   **Decisões:** Propósito geral ou específico? Quais algoritmos chave precisam ser acelerados?

2.  **Design do ISA (Instruction Set Architecture):**
    *   Escolha entre RISC, CISC, VLIW, etc., ou uma abordagem híbrida.
    *   Defina o conjunto de instruções, formatos de instrução, tipos de dados, registradores, modos de endereçamento.
    *   Se for ASIP, adicione instruções customizadas para acelerar as operações críticas do domínio.
    *   **Decisões:** Tamanho da palavra (32-bit, 64-bit)? Número de registradores? Como tratar exceções? Suporte a SIMD?

3.  **Design da Microarquitetura:**
    *   Implementação do ISA.
    *   Datapath (caminho de dados): Unidades funcionais (ULA, FPU), barramentos, registradores, muxes.
    *   Unidade de Controle: Lógica que comanda o datapath (FSM, microcódigo).
    *   Pipeline: Estágios, tratamento de hazards (data, control, structural).
    *   Hierarquia de Memória: Caches (L1, L2, L3), TLBs, interface com memória principal.
    *   Predição de Desvio (Branch Prediction).
    *   Execução Fora de Ordem (Out-of-Order Execution) - para alta performance.
    *   **Decisões:** Profundidade do pipeline? Tamanho e associatividade das caches? Algoritmo de predição de desvio?

4.  **Modelagem e Simulação:**
    *   Crie modelos em diferentes níveis de abstração (funcional, ciclo-acurado).
    *   Use linguagens como C++, SystemC, ou HDLs (Verilog, VHDL).
    *   Simule com benchmarks e aplicações alvo para validar o design e medir performance.

5.  **Verificação Funcional:**
    *   Processo crítico para garantir que o design funciona corretamente.
    *   Criação de testbenches, asserções, cobertura de código.
    *   Ferramentas formais de verificação.

6.  **Implementação Física (se for para hardware real):**
    *   Síntese lógica (tradução do HDL para um netlist de portas lógicas).
    *   Place and Route (posicionamento e roteamento das células lógicas no chip).
    *   Timing Analysis, Power Analysis.
    *   Geração do layout final para fabricação (GDSII).

7.  **Desenvolvimento do Ecossistema de Software:**
    *   Compilador (ex: LLVM, GCC) que suporte o novo ISA.
    *   Assembler, Linker, Debugger.
    *   Sistema Operacional (se aplicável).
    *   Bibliotecas otimizadas.

**Tomadas de Decisão Chave:**

*   **ISA Primeiramente vs. Microarquitetura Primeiramente:** Alguns defendem definir o ISA e depois a microarquitetura. Outros (especialmente para ASIPs) podem co-projetar ambos, iterando entre eles.
*   **Complexidade vs. Simplicidade:** Adicionar recursos aumenta a performance, mas também a complexidade, área, consumo e tempo de verificação.
*   **Reusar vs. Criar do Zero:** Usar IPs existentes (ex: um barramento AXI) pode acelerar o desenvolvimento.
*   **Flexibilidade vs. Otimização:** Um design muito otimizado para uma tarefa pode ser ruim em outras.

**Parte 3: Máquinas de Estados Finitos (FSMs) em Arquiteturas**

FSMs são fundamentais no design de hardware digital, especialmente na **Unidade de Controle** de um processador.

*   **O que são:** Um modelo matemático de computação que descreve o comportamento de um sistema com um número finito de estados. O sistema pode estar em apenas um estado por vez, e transita entre estados em resposta a entradas e/ou condições internas.
*   **Como são Utilizadas em Arquiteturas:**
    *   **Unidade de Controle:** A FSM na unidade de controle é responsável por gerar os sinais de controle que orquestram as operações do datapath.
    *   **Ciclo de Instrução:** A FSM implementa os passos do ciclo de instrução (Fetch, Decode, Execute, Memory, Write-back).
        *   **Fetch:** Sinais para ler a instrução da memória.
        *   **Decode:** Sinais para interpretar a instrução e selecionar operações.
        *   **Execute:** Sinais para a ULA, acesso a registradores.
        *   **Memory:** Sinais para ler/escrever na memória de dados.
        *   **Write-back:** Sinais para escrever o resultado de volta em um registrador.
    *   **Outros Usos:** Controle de caches, árbitros de barramento, interfaces de comunicação (UART, SPI).

*   **Escolha, Construção e Implementação:**
    *   **Escolha (Tipo de FSM):**
        *   **Moore Machine:** Saídas dependem apenas do estado atual.
        *   **Mealy Machine:** Saídas dependem do estado atual E das entradas atuais. Mealy pode ter menos estados, mas pode ser mais difícil de analisar o timing.
        *   Para unidades de controle de processadores, a abordagem Moore (ou uma variação onde as saídas são registradas) é frequentemente preferida pela clareza e timing mais previsível.
    *   **Construção (Design):**
        1.  **Diagrama de Estados:** Representação gráfica dos estados, transições e condições de transição/saídas.
        2.  **Tabela de Estados:** Tabulação dos estados atuais, entradas, próximos estados e saídas.
        3.  **Codificação de Estados (State Assignment):** Atribuir valores binários únicos a cada estado (binário, Gray, one-hot). One-hot pode simplificar a lógica de saída/próximo estado, mas usa mais flip-flops.
        4.  **Derivação das Equações Lógicas:** Para os próximos estados e para as saídas, usando mapas de Karnaugh, álgebra Booleana ou ferramentas de síntese.
    *   **Implementação:**
        *   **Hardware:** Flip-flops para armazenar o estado atual e lógica combinacional para calcular o próximo estado e as saídas.
        *   **HDL (Verilog/VHDL):** Descrever a FSM usando construções `case` (Verilog `always @(posedge clk)`, `case (current_state)`) ou `process` (VHDL).
        *   **Microcódigo (para unidades de controle complexas CISC):** A FSM principal pode ser simples, e cada estado (ou instrução) aponta para uma rotina de microcódigo em uma ROM/RAM de controle, onde cada microinstrução controla diretamente os sinais do datapath.

*   **Melhorias:**
    *   **Otimização de Estados:** Reduzir o número de estados.
    *   **Escolha da Codificação de Estados:** Afeta a complexidade da lógica e, às vezes, a velocidade.
    *   **Pipelining da Lógica de Controle:** Se a lógica de próximo estado/saída for complexa e limitar o clock.
    *   **Decomposição:** Dividir uma FSM grande em FSMs menores e coordenadas.

**Parte 4: Métodos de Criar Arquiteturas em Circuitos e Linguagens**

1.  **Simuladores de Circuitos Lógicos (Nível de Porta/Transistor):**
    *   **Logisim / Logisim-Evolution (Gratuito, Open Source):**
        *   **Como usar:** Ferramenta gráfica para desenhar e simular circuitos digitais. Ótima para aprender os fundamentos.
        *   Você constrói componentes (portas, flip-flops, muxes, ULA, registradores) e os interconecta para formar um datapath e uma unidade de controle.
        *   Pode-se criar subcircuitos para modularidade.
        *   **Criação de Arquitetura:** Ideal para processadores simples (ex: um MIPS de 8 ou 16 bits). Permite visualizar o fluxo de dados e sinais de controle.
    *   **Digital / Digital Logic Designer (Gratuito, Open Source):** Similar ao Logisim, com alguns recursos adicionais, incluindo suporte a VHDL/Verilog para alguns componentes.
    *   **CircuitVerse (Gratuito, Online):** Plataforma online para design e simulação.
    *   **LTSpice (Gratuito, da Analog Devices):** Mais focado em simulação de circuitos analógicos e mistos, mas pode simular lógica em nível de transistor se necessário (mais complexo para arquiteturas completas).

2.  **Linguagens de Descrição de Hardware (HDL - Hardware Description Languages):**
    *   Padrão da indústria para descrever hardware digital para simulação e síntese (geração de circuitos reais para FPGAs ou ASICs).
    *   **Verilog / SystemVerilog:**
        *   Sintaxe similar a C. Popular na América do Norte e Ásia.
        *   SystemVerilog é uma extensão com recursos de verificação mais poderosos.
        *   **Criação de Arquitetura:** Descreve módulos (ULA, registradores, unidade de controle FSM) e suas interconexões. Pode ser descrito em nível comportamental, RTL (Register Transfer Level) ou estrutural.
    *   **VHDL:**
        *   Sintaxe mais verbosa, inspirada em Ada. Popular na Europa. Forte tipagem.
        *   **Criação de Arquitetura:** Similar ao Verilog em termos de capacidade de descrição RTL.
    *   **Ferramentas para HDL:**
        *   **Simuladores:** ModelSim/Questa (Mentor Graphics/Siemens - pago, versões para estudantes), Xcelium (Cadence - pago), GHDL (gratuito, para VHDL), Icarus Verilog (gratuito, para Verilog), Verilator (gratuito, compila Verilog para C++/SystemC para simulação rápida).
        *   **Síntese:** Xilinx Vivado (para FPGAs Xilinx - versão gratuita WebPACK), Intel Quartus Prime (para FPGAs Intel - versão gratuita Lite). Synopsys Design Compiler, Cadence Genus (pagos, para ASICs).

3.  **Linguagens para Testar e Utilizar Arquiteturas:**
    *   **Assembly Language (Linguagem de Montagem):**
        *   Representação textual das instruções de máquina do ISA. Específica para cada arquitetura.
        *   **Como usar:** Escrever pequenos programas para testar instruções específicas, funcionalidades do datapath, unidade de controle.
        *   **Teste:** Carregar o código Assembly (convertido para binário/hex) na memória do seu processador simulado (em Logisim, ou na memória de um modelo HDL) e observar a execução.
        *   **Exemplo:** Para um processador MIPS-like, você escreveria instruções como `add $t0, $s1, $s2` ou `lw $t0, 0($s1)`.
    *   **C/C++:**
        *   Linguagens de alto nível. Para rodar em sua arquitetura customizada, você precisaria de um **compilador** que gere código de máquina para o seu ISA.
        *   **Desenvolver um compilador é um projeto complexo por si só.** Ferramentas como LLVM ou GCC podem ser adaptadas (retargeted) para um novo ISA, mas isso é avançado.
        *   **Teste (sem compilador completo):**
            *   Escrever programas C/C++ e compilá-los para uma arquitetura conhecida (ex: MIPS, RISC-V) usando um compilador existente.
            *   Analisar o Assembly gerado para entender como as construções C são traduzidas.
            *   Manualmente traduzir pequenos trechos de C para o Assembly da sua arquitetura para testar funcionalidades mais complexas.
    *   **SystemVerilog (para Verificação):**
        *   Usado para criar testbenches complexos, gerar estímulos aleatórios controlados (constrained-random verification), definir asserções e checar cobertura funcional. Essencial para verificar designs de HDL.
    *   **Python (com cocotb):**
        *   Cocotb é um framework de verificação baseado em Python que permite escrever testbenches em Python para interagir com simuladores HDL. Mais fácil de usar para muitos engenheiros de software.

**Parte 5: Metodologias de Estudo e Desenvolvimento de Know-How**

Este é um caminho de aprendizado contínuo.

1.  **Fundamentos Teóricos (Livros Essenciais):**
    *   **"Computer Organization and Design: The Hardware/Software Interface" por David A. Patterson e John L. Hennessy.** (O livro "bíblia" da área, com versões para RISC-V, ARM, MIPS). Comece por aqui.
    *   **"Computer Architecture: A Quantitative Approach" por John L. Hennessy e David A. Patterson.** (Mais avançado, focado em design de alta performance).
    *   **"Digital Design and Computer Architecture" por David Harris e Sarah Harris.** (Excelente, com exemplos práticos em Verilog e VHDL, e cobre desde lógica digital até design de processador).
    *   Livros específicos sobre Verilog/VHDL, como "Verilog HDL" de Samir Palnitkar ou "VHDL Primer" de J. Bhasker.
    *   Manuais de arquitetura específicos (ex: ARM Architecture Reference Manual, Intel 64 and IA-32 Architectures Software Developer's Manuals, RISC-V ISA Specification).

2.  **Cursos Online e Universidades:**
    *   **Coursera, edX, Udacity:** Procure cursos sobre "Computer Architecture", "Digital Logic Design", "VLSI Design". Muitos são de universidades renomadas.
        *   Ex: "Computation Structures" do MIT OpenCourseWare.
        *   Nand2Tetris (www.nand2tetris.org): Um curso fantástico que guia você na construção de um computador do zero, desde portas NAND até um sistema operacional.
    *   Materiais de disciplinas de graduação/pós de universidades federais e estaduais (muitos disponibilizam slides e listas de exercícios).

3.  **Prática com Ferramentas:**
    *   **Logisim:** Comece aqui para visualizar.
    *   **HDLs (Verilog/VHDL) e Simuladores:** Essencial. Instale Icarus Verilog e GTKWave (visualizador de formas de onda) ou GHDL. Se tiver acesso, use ModelSim.
    *   **Ferramentas de Síntese (Vivado/Quartus):** Se for mexer com FPGAs.

4.  **Projetos Práticos (Veja a próxima seção para uma progressão).**

5.  **Leitura de Artigos Científicos e Publicações:**
    *   **Conferências Chave:** ISCA (International Symposium on Computer Architecture), MICRO (Symposium on Microarchitecture), ASPLOS (Architectural Support for Programming Languages and Operating Systems), HPCA (High-Performance Computer Architecture).
    *   **Periódicos (Journals):** IEEE Transactions on Computers, ACM Transactions on Architecture and Code Optimization (TACO), IEEE Micro.
    *   Acompanhe sites como **ACM Digital Library** e **IEEE Xplore** (muitas universidades têm acesso).
    *   **CAPES/FAPEMIG/CNPq:** Busque editais e projetos financiados na área para entender as linhas de pesquisa atuais no Brasil.

6.  **Comunidade e Colaboração:**
    *   Participe de fóruns online (ex: Stack Overflow com tags de Verilog/VHDL/computer-architecture, subreddits como r/ECE, r/FPGA, r/computerarchitecture).
    *   Considere grupos de estudo ou projetos com colegas.
    *   Se possível, procure estágios ou projetos de Iniciação Científica.

7.  **Documentação e Padrões:**
    *   Aprenda a ler e interpretar especificações de ISAs, protocolos de barramento (AXI, Wishbone), etc.

**Parte 6: Projetos Evolutivos para Estudo (Passo a Passo)**

Aqui está uma sugestão de progressão, começando simples e aumentando a complexidade. Use Logisim para os iniciais, depois migre para HDL.

**Nível 0: Fundamentos de Lógica Digital (Pré-requisito)**
*   **O que fazer:** Aprender sobre portas lógicas (AND, OR, NOT, XOR, NAND, NOR), Álgebra Booleana, Mapas de Karnaugh, circuitos combinacionais (multiplexadores, decodificadores, somadores) e sequenciais (latches, flip-flops, registradores, contadores).
*   **Ferramentas:** Livros de circuitos digitais, Logisim.
*   **Passos:**
    1.  Implementar todas as portas lógicas básicas em Logisim.
    2.  Construir um somador de 1 bit (half-adder, full-adder).
    3.  Construir um somador de N bits (ripple-carry adder).
    4.  Construir multiplexadores (2-para-1, 4-para-1).
    5.  Construir um decodificador (2-para-4, 3-para-8).
    6.  Construir um flip-flop D e um registrador de N bits.
*   **Aprendizado:** Como os blocos de construção fundamentais do hardware funcionam.

**Nível 1: Unidade Lógica e Aritmética (ULA / ALU) Simples**
*   **O que fazer:** Projetar uma ULA que execute operações básicas (AND, OR, ADD, SUB).
*   **Ferramentas:** Logisim.
*   **Passos:**
    1.  Relembre o somador/subtrator (subtração como soma do complemento de dois).
    2.  Adicione circuitos para operações lógicas (AND, OR) bit a bit.
    3.  Use um multiplexador para selecionar a saída da operação desejada com base em sinais de controle (ex: `ALUOp`).
    4.  Adicione flags (Zero, CarryOut, Overflow, Negative - opcional no início).
*   **Aprendizado:** Como combinar lógica para executar diferentes operações, introdução aos sinais de controle.

**Nível 2: Datapath Simples (Single-Cycle)**
*   **O que fazer:** Construir um datapath para um subconjunto muito simples de instruções (ex: R-type (add, sub), lw, sw, beq - inspirado no MIPS).
*   **Ferramentas:** Logisim.
*   **Passos:**
    1.  Instancie sua ULA.
    2.  Adicione um Banco de Registradores (Register File) - pode ser modelado com RAM no Logisim ou construído com flip-flops e mux/demux.
    3.  Adicione uma Memória de Instrução e uma Memória de Dados (use os componentes de RAM do Logisim).
    4.  Adicione um Program Counter (PC) e lógica para atualizá-lo (PC+4, branch).
    5.  Conecte tudo com multiplexadores para guiar os dados corretamente para cada tipo de instrução. Por exemplo, a segunda entrada da ULA pode vir de um registrador ou de um valor imediato estendido.
    6.  Defina os sinais de controle necessários (RegWrite, ALUSrc, MemRead, MemWrite, MemToReg, Branch, ALUOp, etc.). Por enquanto, você vai "setar" esses sinais manualmente para testar o datapath.
*   **Aprendizado:** Fluxo de dados para diferentes tipos de instruções, papel dos sinais de controle.

**Nível 3: Unidade de Controle (FSM) para o Datapath Single-Cycle**
*   **O que fazer:** Projetar a FSM que gera os sinais de controle para o datapath do Nível 2.
*   **Ferramentas:** Logisim (pode usar o componente "FSM" ou construir com portas e FFs).
*   **Passos:**
    1.  Identifique o `opcode` da instrução como entrada principal da FSM.
    2.  Para cada `opcode` (ou tipo de instrução), defina os valores corretos para todos os sinais de controle do datapath.
    3.  Crie a tabela de verdade ou diagrama de estados da FSM.
    4.  Implemente a lógica combinacional da FSM para gerar as saídas (sinais de controle) com base no `opcode`.
    5.  Conecte a saída da FSM aos sinais de controle do datapath.
    6.  Carregue um pequeno programa (sequência de instruções em binário/hex) na Memória de Instrução e observe o processador executar.
*   **Aprendizado:** Como a unidade de controle decodifica instruções e comanda o datapath.

**Nível 4: Introdução a HDL - Reimplementando Componentes**
*   **O que fazer:** Começar a implementar os componentes dos níveis anteriores em Verilog ou VHDL.
*   **Ferramentas:** Simulador HDL (Icarus Verilog + GTKWave ou GHDL), editor de texto.
*   **Passos:**
    1.  Escreva o código HDL para um somador. Crie um testbench para simular e verificar.
    2.  Escreva o código HDL para a ULA. Crie um testbench.
    3.  Escreva o código HDL para o Banco de Registradores. Crie um testbench.
    4.  Escreva o código HDL para a FSM da unidade de controle. Crie um testbench.
*   **Aprendizado:** Sintaxe HDL, escrita de testbenches, simulação RTL.

**Nível 5: Processador RISC Simples em HDL (Single-Cycle)**
*   **O que fazer:** Integrar os módulos HDL do Nível 4 para criar o processador single-cycle completo.
*   **Ferramentas:** Simulador HDL.
*   **Passos:**
    1.  Crie um módulo de topo que instancia o datapath e a unidade de controle.
    2.  Conecte-os corretamente.
    3.  Crie um testbench que inicializa a memória de instrução com um pequeno programa (ex: somar dois números e armazenar o resultado) e simule.
    4.  Verifique os registradores e a memória de dados para confirmar a execução correta.
*   **Aprendizado:** Design hierárquico em HDL, simulação de um sistema completo.

**Nível 6: Processador RISC Pipelined em HDL**
*   **O que fazer:** Modificar o processador single-cycle para uma arquitetura pipelined (ex: 5 estágios MIPS: IF, ID, EX, MEM, WB).
*   **Ferramentas:** Simulador HDL.
*   **Passos:**
    1.  Divida o datapath e controle em estágios de pipeline.
    2.  Adicione registradores de pipeline entre os estágios.
    3.  Implemente lógica de detecção de hazards (data hazards, control hazards).
    4.  Implemente forwarding (bypass) para data hazards.
    5.  Implemente stalling e/ou branch prediction (pode começar com predict-not-taken e flush).
    6.  Atualize o testbench e compare a performance (throughput) com o single-cycle.
*   **Aprendizado:** Conceitos de pipelining, hazards, técnicas de mitigação, aumento de throughput.

**Nível 7: Implementação em FPGA (Opcional, mas muito valioso)**
*   **O que fazer:** Sintetizar seu processador HDL (single-cycle ou pipelined) e carregá-lo em uma placa FPGA.
*   **Ferramentas:** Placa FPGA de desenvolvimento (ex: Digilent Basys 3, Terasic DE10-Lite), software de síntese (Vivado ou Quartus).
*   **Passos:**
    1.  Adicione restrições de pinos (constraints file) para mapear as E/S do processador (clock, reset, talvez LEDs/switches para I/O simples) aos pinos da FPGA.
    2.  Execute o fluxo de síntese, place & route.
    3.  Programe a FPGA.
    4.  Teste no hardware real (pode exigir um monitor serial simples via UART para depuração, que seria outro módulo a projetar).
*   **Aprendizado:** Fluxo de design para FPGAs, desafios de timing no mundo real, interação com periféricos.

**Nível 8: Exploração e Melhorias**
*   **O que fazer:** Adicionar recursos mais avançados ou explorar arquiteturas diferentes.
*   **Ideias:**
    *   Implementar mais instruções (multiplicação, divisão).
    *   Adicionar um sistema de interrupção simples.
    *   Projetar uma cache de instruções e/ou dados.
    *   Explorar execução fora de ordem (muito avançado).
    *   Projetar um coprocessador (ex: para ponto flutuante).
    *   Começar a projetar um ASIP: identificar uma aplicação (ex: um filtro FIR simples, processamento de imagem básico) e adicionar instruções customizadas para acelerá-la.
    *   Escrever um assembler simples para sua arquitetura (em Python, C++).
    *   Estudar e tentar implementar um núcleo RISC-V simples (ex: RV32I).
*   **Aprendizado:** Tópicos avançados em arquitetura, design para aplicações específicas.

**Para seus trabalhos (TCC, Artigos):**

*   Um TCC poderia ser o design e implementação de um processador RISC pipelined com alguma característica específica (ex: uma nova abordagem para branch prediction, uma extensão ISA para uma tarefa específica, análise de consumo de energia).
*   Artigos acadêmicos podem surgir de inovações no design, novas metodologias de verificação, ou análises comparativas de performance/energia de diferentes abordagens microarquiteturais para problemas específicos (IA, segurança, etc.).
*   Para CAPES/FAPEMIG/CNPq, seus projetos precisam ter um componente de pesquisa e inovação. Não basta apenas reimplementar o que já existe, mas propor algo novo ou uma análise aprofundada.

**Referências Bibliográficas e Fontes (Reiterando e Adicionando):**

*   **Livros Fundamentais:**
    *   Patterson, D. A., & Hennessy, J. L. (2017). *Computer Organization and Design RISC-V Edition: The Hardware Software Interface*. Morgan Kaufmann. (Ou as edições ARM, MIPS).
    *   Hennessy, J. L., & Patterson, D. A. (2019). *Computer Architecture: A Quantitative Approach* (6th ed.). Morgan Kaufmann.
    *   Harris, D. M., & Harris, S. L. (2021). *Digital Design and Computer Architecture, ARM Edition* (ou a edição RISC-V ou a 2ª edição original com MIPS/Verilog/VHDL). Elsevier.
*   **HDLs:**
    *   Palnitkar, S. (2003). *Verilog HDL: A Guide to Digital Design and Synthesis*. Prentice Hall.
    *   Bhasker, J. (1998). *A VHDL Primer*. Prentice Hall.
*   **Especificações de Arquiteturas:**
    *   ARM Architecture Reference Manuals (disponíveis no site da ARM Developer).
    *   Intel® 64 and IA-32 Architectures Software Developer’s Manuals (site da Intel).
    *   The RISC-V Instruction Set Manual (site da RISC-V International).
*   **Artigos e Conferências (Acesso via Portal de Periódicos CAPES, IEEE Xplore, ACM Digital Library):**
    *   ISCA (International Symposium on Computer Architecture)
    *   MICRO (IEEE/ACM International Symposium on Microarchitecture)
    *   ASPLOS (ACM International Conference on Architectural Support for Programming Languages and Operating Systems)
    *   HPCA (IEEE International Symposium on High-Performance Computer Architecture)
    *   IEEE Transactions on Computers
    *   ACM Transactions on Architecture and Code Optimization (TACO)
*   **Recursos Online:**
    *   **Nand2Tetris:** www.nand2tetris.org
    *   **MIT OpenCourseWare:** ocw.mit.edu (cursos como 6.004 Computation Structures)
    *   **RISC-V International:** riscv.org
    *   **ARM Developer:** developer.arm.com
    *   **Logisim-Evolution:** github.com/logisim-evolution/logisim-evolution
    *   **Icarus Verilog:** iverilog.icarus.com
    *   **GHDL:** ghdl.free.fr

Este é um roteiro extenso. Vá com calma, absorva os fundamentos primeiro, e pratique muito. O "know-how" vem da aplicação consistente do conhecimento teórico em projetos práticos. Boa sorte nesta jornada incrível!