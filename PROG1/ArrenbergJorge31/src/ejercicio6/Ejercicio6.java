/**
 * Introducimos el tamaño del array, el valor que va a tener en todas las posiciones y lo mostramos
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Introducimos el tamaño del array

		System.out.println("Introduzca un numero N (TAMAÑO DEL ARRAY)");
		int tamanno = teclado.nextInt();
		while (tamanno<1) {
			System.out.println("Introduzca un tamaño del array mayor a 1");
			tamanno = teclado.nextInt();
		}

		// Introducimos el contenido de todas las posiciones del array

		System.out.println("Introduzca un numero M (CONTENIDO DEL ARRAY)");
		int contenido = teclado.nextInt();

		int[] vector = new int[tamanno];

		// Introducimos el contenido en todas las posiciones del array

		for (int i = 0; i < tamanno; i++) {
			vector[i] = contenido;
		}

		// Mostramos el tamaño del array y el contenido

		System.out.println("El tamaño del array es " + tamanno + " y el contenido es: ");
		for (int i = 0; i < tamanno; i++) {
			System.out.print(vector[i] + " ");
		}
	}
}
