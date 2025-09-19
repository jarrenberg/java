/**
 * Programa donde se introduce una cadena de caracteres y se detecta si es palidroma o no
 * Jorge Arrenberg 10/11/2024
 */

package ejercicio5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos una variable booleana que nos diga si la frase es palindroma o no
		boolean esPalindromo = true;

		// Pedimos al usuario que introduzc una cadena de caracteres

		System.out.println("Introduzca una cadena de caracteres");
		String cadena = teclado.nextLine();

		// Creamos una cadena donde se guardara la cadena original pero sin espacios y
		// guardamos las palabras de la cadena original sin espacios

		String cadenaSinEspacios = "";

		StringTokenizer tokens = new StringTokenizer(cadena);

		do {
			String palabra = tokens.nextToken().trim();
			palabra = palabra.toLowerCase();
			cadenaSinEspacios = cadenaSinEspacios + palabra;
		} while (tokens.hasMoreTokens());

		// Calculamos la longitud de esta nueva cadena con las palabras sin espacios

		int longitud = cadenaSinEspacios.length();

		//Analizamos la cadena empezando por los extremos hasta el centro analizando si ambos caracteres son iguales, en caso de no serlos, el analisis se detiene
		
		int contador = 0;
		do {
			char caracter1 = cadenaSinEspacios.charAt(contador);
			char caracter2 = cadenaSinEspacios.charAt((longitud - 1) - contador);
			if (caracter1 != caracter2) {
				esPalindromo = false;
			}
			contador = contador + 1;
		} while ((esPalindromo == true) && (contador < (longitud / 2)));

		//Mostramos el resultado del analisis
		
		if (esPalindromo == true) {
			System.out.println("La cadena de caracteres es palindroma");
		} else {
			System.out.println("La cadena de caracteres no es palindroma");
		}
	}
}
