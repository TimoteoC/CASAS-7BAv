import java.util.Scanner;

public class Ejercicio17A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de la primera evaluación: ");
        int evaluacion1 = scanner.nextInt();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        int evaluacion2 = scanner.nextInt();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        int evaluacion3 = scanner.nextInt();

        int promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        int sumaPares = 0;

        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
        }
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
        }
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
        }

        System.out.println("Suma de los valores pares: " + sumaPares);

        scanner.close();
    }
}
