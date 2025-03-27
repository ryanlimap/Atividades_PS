package view;

import java.util.Scanner;

public class Calc {
    private Scanner scanner;

    public Calc() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\nCalculadora Simples");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.print("Escolha uma operação: ");
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }

    public double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public void mostrarResultado(double resultado) {
        System.out.printf("Resultado: %.2f\n", resultado);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}