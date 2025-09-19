# 🎬 ScreenMatch: Fundamentos de Orientação a Objetos em Java

## 📝 Sobre o Projeto

Este projeto, **ScreenMatch**, é uma aplicação de console desenvolvida em Java para demonstrar os conceitos fundamentais da **Programação Orientada a Objetos (POO)**. Através da modelagem de entidades como Filmes, Séries e Episódios, o código explora como criar um sistema coeso e reutilizável.

O objetivo principal é prático: calcular o tempo total necessário para maratonar uma lista de títulos e filtrar recomendações, tudo isso aplicando os pilares da POO.

-----

## 🧱 Conceitos de POO Demonstrados

O código na classe `alura.curso.screenmatch.Principal.Principal` e em suas dependências ilustra os seguintes conceitos:

* **Abstração e Modelagem:**

    * Criação de classes como `Filme`, `Serie` e `Episodio` para representar objetos do mundo real, cada uma com seus próprios atributos (ex: `nome`, `anoDeLancamento`) e comportamentos (ex: `avalia()`).

* **Encapsulamento:**

    * Uso de métodos `getters` e `setters` (ex: `setNome()`, `getDuracaoEmMinutos()`) para controlar o acesso e a modificação dos atributos das classes, protegendo o estado interno dos objetos.

* **Polimorfismo:**

    * A classe `CalculadoraDeTempo` é um exemplo claro de polimorfismo. Seu método `inclui()` é capaz de receber objetos de diferentes tipos (`Filme`, `Serie`) e tratá-los de forma unificada para somar suas durações. Isso sugere que ambas as classes herdam de uma superclasse em comum (como `Titulo`).

* **Composição:**

    * A relação entre `Serie` e `Episodio` demonstra composição, onde uma série "é composta por" episódios.

* **Uso de Coleções:**

    * Utilização de `ArrayList` para criar e gerenciar uma lista de objetos do tipo `Filme`, demonstrando como agrupar e iterar sobre múltiplos objetos de forma eficiente.

-----

## 📂 Estrutura do Projeto

A organização do código em pacotes, inferida pelos `imports`, segue as boas práticas de separação de responsabilidades:

```
(src)
├── alura/curso/screenmatch/
│   ├── calculos/
│   │   ├── CalculadoraDeTempo.java
│   │   └── FiltroDeRecomendacao.java
│   └── modelo/
│       ├── Episodio.java
│       ├── Filme.java
│       └── Serie.java
└── alura.curso.screenmatch.Principal.Principal.java
```

* **`modelo`**: Contém as classes que representam os dados da aplicação.
* **`calculos`**: Contém as classes com a lógica de negócio e operações sobre os modelos.
* **`alura.curso.screenmatch.Principal.Principal.java`**: O ponto de entrada da aplicação, responsável por criar os objetos e orquestrar as ações.

-----

## 🚀 Como Executar o Projeto

Para executar esta aplicação, você só precisa do Kit de Desenvolvimento Java (JDK) instalado.

### Pré-requisitos

* [Java (JDK 8 ou superior)](https://www.oracle.com/java/technologies/downloads/)

### Passos

1.  **Estrutura de Arquivos:**

    * Certifique-se de que todos os arquivos (`.java`) estejam na estrutura de pastas descrita acima.

2.  **Navegue até o diretório raiz (`src`):**

    * Abra o terminal e navegue até a pasta que contém o diretório `alura` e o arquivo `alura.curso.screenmatch.Principal.Principal.java`.

3.  **Compile todos os arquivos Java:**

    ```bash
    javac alura/curso/screenmatch/modelo/*.java alura/curso/screenmatch/calculos/*.java alura.curso.screenmatch.Principal.Principal.java
    ```

4.  **Execute a classe `alura.curso.screenmatch.Principal.Principal`:**

    ```bash
    java alura.curso.screenmatch.Principal.Principal
    ```

5.  **Pronto\!** ✨ A saída do programa, com os cálculos de tempo e as listas de filmes, será exibida no console.