/**
 * Programa que pide un entero y lo muestra empleando el tratamiento de excepciones
 * Jorge Arrenberg 2/12/2024
 */

package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos el numero usando el metodo pedirEntero para tratar los posibles
		// errores y lo mostramos
		int numero = pedirEntero(teclado, "Dame un numero:");
		System.out.println("El numero ingresado es " + numero);
		teclado.close();
	}

	// Este codigo sirve cada vez que necesite recibir un entero
	public static int pedirEntero(Scanner tecla, String mensaje) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextInt();
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.println("Te has equivocado. Por favor, ingresa un número válido.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

}
