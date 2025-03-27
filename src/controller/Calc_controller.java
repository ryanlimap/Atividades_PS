package controller;

import java.lang.reflect.Constructor;
import model.Operacao;
import view.Calc;

public class Calc_controller {
    private Calc view;

    public Calc_controller(Calc view) {
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();

            if (opcao >= 1 && opcao <= 4) {
                double num1 = view.lerNumero("Digite o primeiro número: ");
                double num2 = view.lerNumero("Digite o segundo número: ");

                try {
                    String nomeClasse = getNomeClasseOperacao(opcao);
                    Operacao operacao = instanciarOperacao(nomeClasse);
                    double resultado = operacao.calcular(num1, num2);
                    view.mostrarResultado(resultado);
                } catch (Exception e) {
                    view.mostrarMensagem("Erro: " + e.getMessage());
                }
            } else if (opcao != 0) {
                view.mostrarMensagem("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    private String getNomeClasseOperacao(int opcao) {
        return switch (opcao) {
            case 1 -> "model.Soma";
            case 2 -> "model.Subtracao";
            case 3 -> "model.Multiplicacao";
            case 4 -> "model.Divisao";
            default -> null;
        };
    }

    private Operacao instanciarOperacao(String nomeClasse) throws Exception {
        Class<?> classe = Class.forName(nomeClasse);
        Constructor<?> Constructor = classe.getDeclaredConstructor();
        return (Operacao) Constructor.newInstance();
    }
}
