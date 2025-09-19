/**
 * Programa al que se le introducen 3 cadenas de texto y luego muestra un codigo de usuario
 * Jorge Arrenberg 10/11/2024
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca el nombre y los apellidos

		System.out.println("Introduce un nombre:");
		String nombre = teclado.nextLine();

		System.out.println("Introduce un apellido:");
		String apellido1 = teclado.nextLine();

		System.out.println("Introduce un segundo apellido:");
		String apellido2 = teclado.nextLine();
		System.out.println("");

		// Mostramos el codigo de usuario cogiendo las tres primeras letras de cada
		// palabra
		System.out.println("Su codigo de usuario es:");

		String letrasNombre = nombre.substring(0, 3);
		System.out.print(letrasNombre.toUpperCase());

		String letrasApellido1 = apellido1.substring(0, 3);
		System.out.print(letrasApellido1.toUpperCase());

		String letrasApellido2 = apellido2.substring(0, 3);
		System.out.print(letrasApellido2.toUpperCase());

	}
}
