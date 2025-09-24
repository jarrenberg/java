/**
 * Programa al que se le introduce una cadena de texto y muestra cada palabra en una linea distinta
 * Jorge Arrenberg 10/11/2024
 */

package ejercicio1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos la cadena de texto al usuario

		System.out.println("Introduzca una cadena de texto:");
		String texto = teclado.nextLine();

		//Empleamos la clase StringTokenizer para seprarar las palabras.
		
		StringTokenizer tokens = new StringTokenizer(texto);

		// Mostramos las palabras en cada linea
		do {
			String palabra = tokens.nextToken().trim();
			System.out.println(palabra);
		} while (tokens.hasMoreTokens());

	}
}
 