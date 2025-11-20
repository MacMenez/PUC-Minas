#  Trabalho Prático 1: Hierarquia de Memória com Cache (VHDL) 💻

Este repositório contém a especificação e os entregáveis para o primeiro trabalho prático da disciplina de Arquitetura de Computadores, focado na implementação de uma hierarquia de memória com um nível de cache.

---

## 🎯 Objetivo

O objetivo deste trabalho prático é projetar e implementar, em **VHDL**, uma hierarquia de memória com um nível de cache em duas configurações distintas:

1.  **Mapeamento Direto** (Direct-Mapped)
2.  **Mapeamento Conjunto-Associativo de 4 Vias** (4-Way Set-Associative)

Além disso, os alunos devem implementar e testar pelo menos **duas políticas de substituição** para o cache associativo, analisando seu comportamento e desempenho.

---

## 📝 Descrição Geral

O trabalho será dividido em duas partes principais:

1.  **Parte 1:** Implementação de uma cache com **mapeamento direto**.
2.  **Parte 2:** Implementação de uma cache com **mapeamento conjunto-associativo de 4 vias**, incluindo a implementação e teste de políticas de substituição.

Ambas as partes devem simular o comportamento de uma memória cache integrada a uma unidade de processamento (abstraída), lidando com operações de leitura e escrita, detecção de acertos (*hits*) e falhas (*misses*), e o gerenciamento dos dados armazenados. As implementações serão síncronas, utilizando um sinal de `clk` para controlar as operações.

---

## Parte 1: Cache com Mapeamento Direto

### Requisitos Específicos

1.  **Parâmetros Genéricos:**
    *   Largura do endereço (`ADDR_WIDTH`): 32 bits.
    *   Tamanho da cache (`CACHE_SIZE`): 256 linhas.
    *   Largura da palavra (`WORD_WIDTH`): 32 bits.

2.  **Estrutura da Cache:**
    *   **Tipo:** Mapeamento Direto (Direct-Mapped).
    *   **Divisão do Endereço (32 bits):**
        *   **Tag:** Bits superiores (Identificam o bloco de memória).
        *   **Índice:** 8 bits (Para endereçar as 256 linhas, 2⁸ = 256).
        *   **Offset:** 2 bits (Para selecionar o byte dentro da palavra de 4 bytes, 2² = 4).
    *   **Arrays Internos:**
        *   Memória de Dados (armazena as palavras).
        *   Memória de Tags (armazena as tags correspondentes).
        *   Bits de Validade (um por linha).

3.  **Entradas e Saídas:**
    *   **Entradas:** `clk`, `reset`, `addr` (endereço de 32 bits), `data_in` (dado para escrita), `rd_en` (habilita leitura), `wr_en` (habilita escrita).
    *   **Saídas:** `data_out` (dado lido da cache), `hit` (sinaliza acerto), `miss` (sinaliza falha).

4.  **Funcionalidades:**
    *   Operação de **leitura** com detecção de acerto (*hit*) ou falha (*miss*).
    *   Operação de **escrita** utilizando a política **Write-Through** (escreve na cache e diretamente na memória principal - abstraída neste TP).
    *   Funcionalidade de **reset** para invalidar todas as linhas da cache (colocar bits de validade em '0').

---

## Parte 2: Cache Conjunto-Associativa de 4 Vias

### Requisitos Específicos

1.  **Parâmetros Genéricos:**
    *   Largura do endereço (`ADDR_WIDTH`): 32 bits.
    *   Tamanho da cache (`CACHE_SIZE`): 256 linhas (organizadas em 64 conjuntos de 4 vias cada).
    *   Largura da palavra (`WORD_WIDTH`): 32 bits.

2.  **Estrutura da Cache:**
    *   **Tipo:** Mapeamento Conjunto-Associativo de 4 Vias (4-Way Set-Associative).
    *   **Divisão do Endereço (32 bits):**
        *   **Tag:** Bits superiores (Identificam o bloco de memória).
        *   **Índice:** 6 bits (Para endereçar os 64 conjuntos, 2⁶ = 64, pois 256 linhas / 4 vias = 64 conjuntos).
        *   **Offset:** 2 bits (Para selecionar o byte dentro da palavra de 4 bytes).
    *   **Arrays Internos (por conjunto):**
        *   Memória de Dados (4 palavras por conjunto).
        *   Memória de Tags (4 tags por conjunto).
        *   Bits de Validade (4 bits por conjunto, um para cada via).
        *   Bits/Lógica de Controle para Políticas de Substituição (conforme necessário para LRU/Random).

3.  **Entradas e Saídas:**
    *   **Entradas:** `clk`, `reset`, `addr`, `data_in`, `rd_en`, `wr_en`.
    *   **Saídas:** `data_out`, `hit`, `miss`.

4.  **Funcionalidades:**
    *   **Leitura:** Verificar as tags das 4 vias dentro do conjunto indexado. Sinalizar `hit` se uma tag válida corresponder; caso contrário, `miss`.
    *   **Escrita:** Se ocorrer `hit`, atualizar a via correspondente (política **Write-Through**). Se ocorrer `miss`, selecionar uma via para substituição (usando a política ativa), carregar o novo bloco (abstraído) e então escrever.
    *   **Substituição:** Implementar e permitir a seleção (via genérico/constante ou porta de entrada) de **duas** políticas de substituição quando um *miss* requer a substituição de um bloco em um conjunto cheio:
        *   **LRU (Least Recently Used):** Substituir a via que foi acessada menos recentemente.
        *   **Random:** Substituir uma via aleatoriamente (pode ser implementado com um contador simples ou um LFSR - Linear Feedback Shift Register).
    *   **Reset:** Invalidar todas as linhas em todas as vias da cache.

### Políticas de Substituição (Detalhes)

*   **LRU:** Requer lógica adicional para rastrear o uso das vias dentro de cada conjunto. Pode ser feito com contadores de idade ou bits de estado que são atualizados a cada acesso ao conjunto.
*   **Random:** Implementar um mecanismo pseudoaleatório simples para selecionar uma das 4 vias (índice 0 a 3) para substituição.

---

##  deliverables Entregáveis

1.  **Código VHDL (📁):**
    *   Dois arquivos `.vhd` bem comentados e organizados:
        *   `cache_direct_mapped.vhd`
        *   `cache_4way_associative.vhd` (incluindo ambas as políticas de substituição, selecionáveis).
2.  **Testbench (🧪):**
    *   Um arquivo testbench (`.vhd`) para cada módulo de cache.
    *   Os testbenches devem incluir cenários como:
        *   Inicialização com `reset`.
        *   Sequência de ~10 operações de escrita em endereços distintos.
        *   Sequência de ~10 operações de leitura que resultem em *hits* e *misses*.
        *   **Para Cache Associativa:** Cenários que forcem colisões em um mesmo conjunto para testar explicitamente as políticas de substituição (LRU e Random).
3.  **Relatório (📄):**
    *   Um documento conciso (máximo 3 páginas) contendo:
        *   Breve descrição das arquiteturas implementadas (Mapeamento Direto e Conjunto-Associativo 4-Vias).
        *   Comparação conceitual entre as duas abordagens (vantagens e desvantagens).
        *   Explicação detalhada da implementação das políticas de substituição (LRU e Random).
        *   Resultados das simulações: Incluir *waveforms* (formas de onda) capturadas que demonstrem claramente o funcionamento, incluindo *hits*, *misses*, e o processo de substituição.
        *   Análise comparativa básica do desempenho observado nos testes (por exemplo, taxa de acertos para sequências específicas).

---

## ✅ Critérios de Avaliação

*   **Funcionalidade Correta (50%):** Ambos os módulos de cache operam conforme especificado para leituras, escritas, hits e misses.
*   **Implementação das Políticas de Substituição (20%):** Corretude lógica e implementação eficaz do LRU e Random na cache associativa.
*   **Qualidade do Código VHDL (15%):** Código limpo, bem comentado, organizado e legível. Uso adequado de sinais, processos e componentes.
*   **Qualidade do Testbench (10%):** Cobertura adequada dos casos de teste, clareza na simulação dos cenários.
*   **Relatório (5%):** Clareza, completude da análise e apresentação dos resultados.

---

## ℹ️ Observações

*   O trabalho pode ser realizado **individualmente** ou em **grupos de até 4 pessoas**.
*   Utilize ferramentas de simulação VHDL como **ModelSim, GHDL, Xilinx Vivado Simulator**, etc.
*   **Não é necessário** modelar a Memória Principal completa ou uma CPU. O foco é exclusivamente nos módulos de cache e sua lógica interna. As interações com a memória principal (leituras/escritas em caso de miss/write-through) podem ser abstraídas ou sinalizadas nas saídas/entradas.

---