import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del chico: ");
        int edad = scanner.nextInt();

        if (edad == 0) {
            System.out.println("El chico está en el jardín de infantes.");
        } else if (edad >= 1 && edad <= 6) {
            System.out.println("El chico está en primaria.");
        } else if (edad >= 7 && edad <= 12) {
            System.out.println("El chico está en secundaria.");
        } else {
            System.out.println("La edad ingresada no corresponde al rango exigido");
        }
    }
}
