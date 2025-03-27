package model;
import view.Calc;

public class Divisao implements Operacao {

    private Calc view;

    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            view.mostrarMensagem("Divisão por zero não permitida!!");
        }
        return num1 / num2;
    }
}