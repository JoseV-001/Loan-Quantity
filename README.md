## 🏷️ Interest Service – Cálculo de Juros Compostos em Java

Este projeto é um exercício prático voltado ao estudo de **interfaces com métodos default**, **injeção de dependência** e uso de **exceções personalizadas** em Java.

Ele simula o cálculo de pagamentos futuros com base em taxas de juros compostos, aplicadas por diferentes serviços (Brasil e EUA).

-----

### ✨ Destaques do Projeto

  * **📘 Interfaces com métodos default**
      * A interface `InterestService` define o comportamento padrão de cálculo (`payment`) que pode ser reutilizado por diferentes implementações, reduzindo duplicação de código.
  * **🧩 Injeção de dependência simples**
      * A classe `Main` depende da abstração `InterestService`, permitindo alternar facilmente entre `BrazilInterestService` e `UsaInterestService` sem alterar o código principal.
  * **⚙️ Encapsulamento e boas práticas**
      * Cada serviço (`BrazilInterestService`, `UsaInterestService`) armazena sua própria taxa de juros, mantendo a lógica isolada e flexível.
  * **🚫 Validação de entrada com exceções**
      * O método `payment` lança `InvalidParameterException` caso o número de meses seja inválido.

### 🧱 Estrutura do Projeto

```
src/
 ├── application/
 │   └── Main.java                → Ponto de entrada da aplicação
 └── model/
     └── services/
         ├── InterestService.java → Interface com método default
         ├── BrazilInterestService.java
         └── UsaInterestService.java
```

### ▶️ Como Executar

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/SeuUsuario/InterestService.git
    ```

2.  Abra o projeto na sua IDE (IntelliJ ou Eclipse).

3.  Execute `application.Main`.

4.  **Informe:**

      * Valor inicial (`Amount`)
      * Número de meses (`Months`)

#### 📤 Saída esperada:

```
Amount: 200
Months: 3
Payment after 3 months: 212.24
```

-----

### 🧠 Conceitos Estudados

  * Interfaces e métodos default
  * Injeção de dependência via construtor
  * Exceções e validação de parâmetros
  * Modularização e separação de responsabilidades

-----
