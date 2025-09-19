/**
 * Programa que crea un array de tamaño 5 y lo llena con valores introducidos por el usuario, tratando las correspondientes excepciones
 * Jorge Arrenberg 3/12/2024
 */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos un vector de tamaño 5

		double vector[] = new double[5];

		// Lo llenamos con valores introducidos por el usuarios, verificando que son
		// valores double mediante el metodo pedirDouble

		for (int i = 0; i < vector.length; i++) {
			vector[i] = pedirDouble(teclado, "Dame un numero");

		}
		System.out.println("Valores introducidos");

	}

	public static double pedirDouble(Scanner tecla, String mensaje) {
		boolean correcto = false;
		double numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextDouble();
			} catch (InputMismatchException excepcion1) {// Atrapamos los errores producidos por introducir caracteres
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
