# 🖥️ Simulador de Sistemas de Arquivos

Projeto desenvolvido como parte da disciplina **Sistemas Operacionais**, com o objetivo de **simular diferentes métodos de alocação de arquivos em disco** e demonstrar de forma didática conceitos como fragmentação, tempo de acesso e eficiência de armazenamento.

---

## 👩‍💻 Autoras
- **Letícia de Fragas**  
- **Maria Eduarda Schell**

---

## 📌 Objetivos do Projeto
- Implementar um **simulador de sistemas de arquivos** em Java.  
- Representar o **disco como uma sequência de blocos** livres ou ocupados.  
- Simular operações de **criação, exclusão, extensão e leitura de arquivos**.  
- Permitir a escolha de diferentes **estratégias de alocação**:
  - Alocação Contígua   
- Calcular e exibir **métricas importantes**:
  - Fragmentação interna  
  - Fragmentação externa (no caso da alocação contígua)  
  - Tempo de acesso sequencial vs. aleatório  
  - Eficiência de armazenamento  
  - Overhead de metadados  

---

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java  
- **Interface:** Terminal (ASCII/Unicode + cores ANSI)  
- **Paradigma:** Programação Orientada a Objetos  

---

## 📂 Estrutura do Projeto
simulador/
├── Arquivo.java # Representa os arquivos

├── Disco.java # Representa o disco e seus blocos

├── Alocacao.java # Interface para diferentes estratégias

├── AlocacaoContigua.java # Implementação da alocação contígua

├── Visualizacao.java # Mostra o estado do disco no terminal

├── Metricas.java # Calcula fragmentação e tempos de acesso

└── Main.java # Menu principal e loop da simulação

---

##📖 Funcionalidades
- **Criar Arquivo:** usuário informa nome e tamanho em blocos.
- **Deletar Arquivo:** remove o arquivo e libera os blocos.
- **Ler Arquivo:** simula leitura sequencial ou aleatória, exibindo tempo estimado.
- **Visualização:** mostra o disco em uma grade de blocos numerados (L para livre, A1, A2... para arquivos).
- **Métricas:** calcula fragmentação interna e tempo de acesso após cada leitura.
