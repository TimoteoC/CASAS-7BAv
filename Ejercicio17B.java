import java.util.Scanner;

public class Ejercicio17B {
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

        int PruebadePar1 = 0;
        PruebadePar1 = evaluacion1 % 2;
        int PruebadePar2 = 0;
        PruebadePar2 = evaluacion2 % 2;
        int PruebadePar3 = 0;
        PruebadePar3 = evaluacion3 % 2;
        
        while(promedio>=7)
        	System.out.println("aprobado");
        
        switch(promedio) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        	System.out.println("reprobado");
        	break;
        case 7:
        case 8:
        case 9:
        case 10:
        	System.out.println("aprobado");
        	break;
        } 
        
        switch(PruebadePar1) {
        case 1:
        	switch(PruebadePar2) {
        	case 1:
        		switch(PruebadePar3) {
        		case 0:
        			System.out.println("la suma de notas pares es" + evaluacion3);
        			break;
        		case 1:
        			System.out.println("la suma de notas pares es 0, ya que no hay notas pares");
        		}
        		break;
        	case 0:
        		switch(PruebadePar3) {
        		case 0:
        			System.out.println("la suma de notas pares es" + (evaluacion3 + evaluacion2));
        			break;
        		case 1:
        			System.out.println("la suma de notas pares es" + evaluacion2);
        			break;
        		}
        		break;
        	}
        	break;
        case 0:
        	switch(PruebadePar2) {
        	case 1:
        		switch(PruebadePar3) {
        		case 0:
        			System.out.println("la suma de notas pares es" + (evaluacion3 + evaluacion1));
        			break;
        		case 1:
        			System.out.println("la suma de notas pares es" + evaluacion1);
        			break;
        		}
        		break;
        	case 0:
        		switch(PruebadePar3) {
        		case 0:
        			System.out.println("la suma de notas pares es" + (evaluacion3 + evaluacion2 + evaluacion1));
        			break;
        		case 1: 
        			System.out.println("la suma de notas pares es" + (evaluacion2 + evaluacion1));
        			break;
        		}
        		break;
        	}
        }
    }
