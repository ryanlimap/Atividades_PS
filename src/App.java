import controller.Calc_controller;
import view.Calc;

public class App {
    public static void main(String[] args) {
        Calc view = new Calc();
        Calc_controller controller = new Calc_controller(view);
        controller.iniciar();
    }
}