import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la clase del auto (a, b, c): ");
        char claseAuto = scanner.nextLine().charAt(0);

        switch (claseAuto) {
            case 'a':
                System.out.println("El auto tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("El auto tiene 4 ruedas, un motor, cierre centralizado y aire.");
                break;
            case 'c':
                System.out.println("El auto tiene 4 ruedas, un motor, cierre centralizado, aire y airbag.");
                break;
            default:
                System.out.println("Clase de auto inválida.");
                break;
        }
    }
}
