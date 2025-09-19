/**
 * Programa al que se le introducen dos cadenas de texto y muestra si son iguales o no sin diferencia entre mayusculas y minusculas
 * Jorge Arrenberg 10/11/2024
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean esIgual;

		// Pedimos al usuario que introduzca dos cadenas de texto

		System.out.println("Introduzca una frase:");
		String cadena1 = teclado.nextLine();
		System.out.println("Introduzca otra frase:");
		String cadena2 = teclado.nextLine();

		esIgual = cadena1.equalsIgnoreCase(cadena2);

		if (esIgual == true) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}

	}
}
