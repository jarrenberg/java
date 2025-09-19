/**
 * ejercicio sobre estructura switch
 * Jorge Arrenberg 14/10/2024
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Intrdouzca la nota del alumno");
		int nota = teclado.nextInt();

		switch (nota) {
		case 0:
			System.out.println("La nota es un 0 (suspenso)");
			break;
		case 1:
			System.out.println("La nota es un 1 (suspenso)");
			break;
		case 2:
			System.out.println("La nota es un 2 (suspenso)");
			break;
		case 3:
			System.out.println("La nota es un 3 (suspenso)");
			break;
		case 4:
			System.out.println("La nota es un 4 (suspenso)");
			break;
		case 5:
			System.out.println("La nota es un 5 (suficiente)");
			break;
		case 6:
			System.out.println("La nota es un 6 (bien)");
			break;
		case 7:
			System.out.println("La nota es un 7 (notable)");
			break;
		case 8:
			System.out.println("La nota es un 8 (notable)");
			break;
		case 9:
			System.out.println("La nota es un 9 (sobresaliente)");
			break;
		case 10:
			System.out.println("La nota es un 10 (sobresaliente)");
			break;
		default:
			System.out.println("El numero introducido es incorrecto");
			break;
		
		}
	}

}
