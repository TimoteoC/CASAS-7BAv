import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un número para mostrar su tabla de multiplicar (o ingrese 0 para salir):");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }
}
