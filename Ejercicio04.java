import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la categoría (A, B o C): ");
        String categoria = scanner.nextLine();

        if (categoria.equals("A")) {
            System.out.println("hijo");
        } else if (categoria.equals("B")) {
            System.out.println("padres");
        } else if (categoria.equals("C")) {
            System.out.println("abuelos");
        } else {
            System.out.println("Categoría inválida. Por favor, ingrese una categoría válida (A, B o C).");
        }
    }
}
