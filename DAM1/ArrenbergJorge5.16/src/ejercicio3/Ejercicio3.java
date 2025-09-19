/**
 * Programa que sirve como agenda para ver en la clase en la que estas
 * Jorge Arrenberg 13/12/2024
 */

package ejercicio3;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos un objeto de la clase LocalTime que marca el inicio de las clases y
		// un formato

		LocalTime inicio = LocalTime.of(8, 0);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("H':'mm");

		// Pedimos una hora y unos minutos al usuario para que sepa que clase hay a esa
		// hora, verificando que la entrada sean horas y minutos validos

		int hora = pedirEnteroEnIntervalo(teclado, "Introduzca la hora:", 0, 23);
		int minutos = pedirEnteroEnIntervalo(teclado, "Introduzca los minutos:", 0, 59);

		// Creamos un objeto de la clase LoalTime con la hora introducida por el usuario

		LocalTime horaUsuario = LocalTime.of(hora, minutos);
		System.out.println("Hora introducida: " + horaUsuario.format(formato));

		// Empleamos metodos de la clase LocalTime para saber si la hora introducida por
		// el usuario coincide con alguna clase o cuanto queda para que empiezen o
		// acabaron
		
		//Tambien realizamos un tratamiento de las posibles excepciones que podrian ocurrir

		try {
			if (horaUsuario.isBefore(inicio) == true) {
				Duration tiempoHasta = Duration.between(horaUsuario, inicio);
				long mins = tiempoHasta.toMinutes();
				System.out.println("Aun no ha comenzado la jornada. Faltan " + mins + " minutos para comnezar");
			} else if (horaUsuario.isBefore(inicio.plusHours(2))) {
				System.out.println("Clase correspondiente: Programacion");
			} else if (horaUsuario.isBefore(inicio.plusHours(4))) {
				System.out.println("Clase correspondiente:  Sistemas Informaticos");
			} else if (horaUsuario.isBefore(inicio.plusHours(6))) {
				System.out.println("Clase correspondiente:  Entornos de Desarrollo");
			} else {
				Duration tiempoDesde = Duration.between(inicio.plusHours(6), horaUsuario);
				long mins = tiempoDesde.toMinutes();
				System.out.println("Ya han pasado las clases. Han pasado " + mins + " minutos desde el fin");
			}
		} catch (NullPointerException excepcion1) { //En caso de que la fecha de inicio diera error
			System.out.printf("Ha ocurrido un error con la hora de inicio %n");
		} catch (DateTimeException excepcion2) { //En caso de que no se pueda obtener el intervalo de tiempo
			System.out.printf(
					"No se ha podido obtener el intervalo de tiempo (en segundos) entre la hora introducida y la de inicio %n");
		} catch (ArithmeticException excepcion3) { //En caso de que el numero de segundos exceda las capacidades de la clase
			System.out.printf("El calculo de los segundos excede las capacidades de la clase %n");
		} catch (Exception exception) { //En caso de que se produzca un error y no sepamos que lo ha provocado
			System.out.println("Se ha producido un error inesperado.");
		}
	}

	// Devuelve un numero entero entre un intervalo
	public static int pedirEnteroEnIntervalo(Scanner tecla, String mensaje, int min, int max) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextInt();
				//En caso de que el numero no cumpla los requisitos de estar dentro del intervalo volvera a pedirlo
				if (numero < min || numero > max) {
					correcto = false;
					System.out.println("Error. Las horas van desde " + min + " hasta " + max);
					tecla.nextLine();
				}
			} catch (InputMismatchException excepcion1) {// Atrapamos los errores producidos por introducir caracteres
				// invalidos
				correcto = false;
				System.out.println("Te has equivocado. Por favor, ingresa un número válido.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { //Atrapamos errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

}
