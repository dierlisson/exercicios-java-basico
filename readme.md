# Exercícios - Fundamentos da Linguagem de Programação Java 

Este repositório contém uma atividade prática desenvolvida em Java, com o objetivo de exercitar a entrada de dados via terminal e manipulação de informações básicas. O código apresenta um menu com **4 exercícios** que podem ser escolhidos pelo usuário para execução.

## 📋 Requisitos

- Java JDK 8 ou superior
- Terminal ou IDE compatível com execução de aplicações Java

## 🚀 Como Executar

1. Clone este repositório ou copie o código fonte para um arquivo `Main.java`.

2. Compile o código usando o terminal:

   ```bash
   javac Main.java
   ```

3. Execute o programa:

   ```bash
   java Main
   ```

4. Será exibido um menu com os seguintes exercícios:

   ```
   Exercícios
   1- Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos";
   2- Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela;
   3- Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela;
   4- Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
   ```

5. Digite o número do exercício desejado e siga as instruções no terminal.

## 📌 Observações

- O cálculo de idade no exercício 1 é baseado no ano atual do sistema (`java.time.LocalDate.now().getYear()`).
- Certifique-se de digitar corretamente os dados solicitados para cada exercício.
- Após a execução do exercício selecionado, o programa é encerrado automaticamente.

## 🧑‍💻 Autor

Atividade desenvolvida como exercício proposto pelo professor  de prática em entrada e processamento de dados com Java.

---

```java
// Estrutura básica usada no código:
switch (exercicioEscolhido) {
   case "1": // calcular idade
   case "2": // área do quadrado
   case "3": // área do retângulo
   case "4": // diferença de idade entre duas pessoas
   default:  // tratamento de opção inválida
}
```

---

