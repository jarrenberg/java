/**
 * Programa que pide dos numero y realiza la division entre ellos, tratando las correspondientes excepciones
 * Jorge Arrenberg 2/12/2024
 */

package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dividendo = 0, divisor = 0;
		double resultado = 0;

		// Pedimos los numeros al usuario
		dividendo = pedirEntero(teclado, "Introduce el valor A");

		divisor = pedirEntero(teclado, "Introduce el valor B");
		try {
			// Intentamos realizar la división
			resultado =dividendo / divisor;
			System.out.println("El resultado de " + dividendo + " entre " + divisor + " es: " + resultado);
			teclado.close();

		} catch (ArithmeticException excepcion2) { // Atrapamos el error que se da al intentar dividir entre 0
					System.out.println("Error: No se puede dividir entre cero.");

		}

	}

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
