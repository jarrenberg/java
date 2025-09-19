/*
 * Puesta a prueba de la clase Pelicula
 * jorge arrenberg 18/02/2025
 */
package ejercicio1;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// 1. Una película (pelicula1) con los valores por defecto que consideres
		// oportunos
		System.out.println("1. Una película (pelicula1) con los valores por defecto que consideres oportunos");
		Pelicula pelicula1 = new Pelicula();
		System.out.println(pelicula1.toString());
		// 2. Calcular el número de años desde que se realizó la película.
		System.out.println("2. Calcular el número de años desde que se realizó la película.");
		System.out.printf("Han pasado %d años.\n", pelicula1.annosRealizacion());

		// 3. Modificar la calificación de la película con un valor aleatorio entre 5 y
		// 15.
		System.out.println("3. Modi�car la cali�cación de la película con un valor aleatorio entre 5 y 15.");
		try {
			pelicula1.setCalificacion(numRandom(15, 5));
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s.\n", ex1.getMessage());
		}

		// 4. Indicar si la película es recomendable (si tiene una cali�cación superior
		// a 5) y menos de
		// 5 años de antigüedad
		System.out.println(
				"4. Indicar si la película es recomendable (si tiene una cali�cación superior a 5) y menos de 5 años de antigüedad");
		System.out.println(pelicula1.recomendable());

		// 5. Crear otra película (pelicula2) solicitando al usuario todas las
		// características.
		System.out.println("Introduzca el nombre de la pelicula:");
		String nombre = teclado.nextLine();

		System.out.println("Introduzca la fecha de realizacion:");
		String fechaCadena = teclado.nextLine();
		LocalDate fecha;
		try {
			fecha = LocalDate.parse(fechaCadena);
		}catch(java.time.format.DateTimeParseException ex1) {
			System.out.printf("Error.%s\n",ex1.getMessage());
			System.out.println("Usando fecha por defecto...");
			fecha = Pelicula.FECHA_REALIZACION_DEFAULT;
		}

		System.out.println("Introduzca el genero:");
		String genero = teclado.nextLine();

		int duracion = pedirEntero(teclado,"Introduzca la duracion:");

		int calificacion = pedirEntero(teclado,"Introduzca la calificacion");

		Pelicula pelicula2;
		try {
			pelicula2 = new Pelicula(nombre, fecha, genero, duracion, calificacion);
		} catch (IllegalStateException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
			System.out.println("CREANDO PELICULA POR DEFECTO...");
			pelicula2 = new Pelicula();
		} catch (IllegalArgumentException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
			System.out.println("CREANDO PELICULA POR DEFECTO...");
			pelicula2 = new Pelicula();
		}

		System.out.println(pelicula2.toString());
		// 7. Mostrar la duración total de las películas existentes y la duración total
		// de las películas
		// de SUSPENSE.
		System.out.println("7. Mostrar la duración total de las películas existentes y la duración total de las películas de SUSPENSE.");
		System.out.printf("Duracion global de las peliculas: %d\n",Pelicula.getDuracionGlobal());
		System.out.printf("Duracion global de las peliculas de suspense: %d\n",Pelicula.getDuracionGlobalSuspense());
	}

	public static int numRandom(int max, int min) {
		int numero = (int) (Math.random() * max);
		if (numero < min) {
			numero = numero + min;
		}
		return numero;
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
				System.out.printf(
						"Te has equivocado.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}
}
