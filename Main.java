import java.util.ArrayList;


public class Main {
    public static int dividir(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Error"); // Manejo de error deficiente
            return 0;
        }
    }

    public static void main(String[] args) {
        A obj = new A(5, 10);
        System.out.println(obj.suma());

        System.out.println(dividir(10, 0));
    }
}