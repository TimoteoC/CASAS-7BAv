import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Competidor 1: Elija una opción (0 = piedra, 1 = papel, 2 = tijera): ");
        int jugador1 = scanner.nextInt();

        System.out.println("Competidor 2: Elija una opción (0 = piedra, 1 = papel, 2 = tijera): ");
        int jugador2 = scanner.nextInt();

        if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("El ganador es el Competidor 1.");
        } else if ((jugador2 == 0 && jugador1 == 2) || (jugador2 == 1 && jugador1 == 0) || (jugador2 == 2 && jugador1 == 1)) {
            System.out.println("El ganador es el Competidor 2.");
        } else {
            System.out.println("Es un empate.");
        }
    }
}
