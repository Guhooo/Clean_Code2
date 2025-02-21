import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        ArrayList<Calculadora> calculadoras = new ArrayList<>();
        calculadoras.add(new Calculadora(5, 10));

        for (Calculadora calc : calculadoras) {
            System.out.println("Suma: " + calc.sumar());
        }

        try {
            System.out.println("División: " + Calculadora.dividir(10, 2));
            System.out.println("División errónea: " + Calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
