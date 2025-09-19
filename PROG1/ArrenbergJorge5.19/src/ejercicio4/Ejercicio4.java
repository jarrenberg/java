/**
 * Programa que crea un array y lo rellena. Luego pide al usuario una posicion en el array para saber el valor que hay en su posicion hasta que se introduce un numero negativo,
 * tratando las correspondientes excepciones
 * Jorge Arrenberg 4/12/2024
 */

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos un vector con un tamaño igual a un numero aleatorio entre 1 y 100

		int tamanno = (int) ((Math.random() * 99) + 1);
		int vector[] = new int[tamanno];
		int posicion = 0;

		// LLenamos el vector creado con numeros aleatorios entre 1 y 10
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) ((Math.random() * 9) + 1);
		}

		// Pedimos numeros enteros al usuario mediante el metodo pedirEntero para
		// verificar que se introducen valores correctos

		do {
			posicion = pedirEntero(teclado,
					"Introduzca una posicion en el array (si introduce un numero negativo el programa terminara): ");
			try {
				System.out.println(vector[posicion]);
			} catch (ArrayIndexOutOfBoundsException execpcion1) { // Atrapamos el error que da cuando se le da una
																	// posicion a un array mayor que su tamaño
				System.out.println("El numero introducido no corresponde a una posicion en el array");
			} catch (Exception exception) { // Atrapamos errores inespecificos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (posicion >= 0);
		System.out.println("Finalizando programa");
	}

	public static int pedirEntero(Scanner tecla, String mensaje) {
		boolean correcto = false;
		int numero = 0;

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
