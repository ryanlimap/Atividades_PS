# Calculadora em Java utilizando MVC e Reflection

## 📝 Descrição

Este projeto implementa uma calculadora em Java que utiliza os padrões **MVC** e **Reflection** para criar e gerenciar operações matemáticas básicas dinamicamente. A abordagem permite adicionar novas operações sem modificar o código existente, seguindo o princípio **Open/Closed** do SOLID.

## ✨ Funcionalidades

- Operações básicas (Soma, Subtração, Multiplicação, Divisão)
- Extensibilidade para novas operações via Reflection
- Tratamento de exceções para operações inválidas

## ▶️ Como Executar

1. Clone o repositório
2. Compile o projeto:
   ```bash
   javac -d bin src/App.java src/controller/*.java src/model/*.java src/view/*.java
   ```
3. Execute a calculadora:
   ```bash
   java -cp bin App
   ```

## 📌 Observações

- Reflection permite descobrir operações em runtime
- Novas operações são plugáveis sem modificar código existente
