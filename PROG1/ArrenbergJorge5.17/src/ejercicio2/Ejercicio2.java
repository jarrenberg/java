/**
 * Programa que pide al usuario la fecha de su cumpleaños, verificando la entrada de datos. Luego muestra el dia de la semana en el que nacio y las veces que su cumpleaños ha sido el mismo dia de la semana que nació
 * Jorge Arrenberg 5/1/2025
 */

package ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos un formato para la fecha
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d'/'M'/'yyyy");

		// Solicitamos el año y el mes al usuario
		int anno = pedirEnteroRango(teclado, "Introduce un año entre 1900 y 2024:", 2024, 1900);
		int mes = pedirEnteroRango(teclado, "Introduce un mes:", 12, 1);
		LocalDate fecha = LocalDate.of(anno, mes, 1);
		// Averiguamos el numero de dias de cada mes dependiendo del mes introducido por
		// el usuario
		int diaMax = 0;
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			diaMax = 31;
			break;
		case 4, 6, 9, 11:
			diaMax = 30;
			break;
		case 2:
			if (fecha.isLeapYear()) {
				diaMax = 29;
			} else {
				diaMax = 28;
			}
			break;
		}
		// Solicitamos el dia del mes al usuario
		int dia = pedirEnteroRango(teclado, "Introduce un dia:", diaMax, 1);

		// Asignamos al objeto LocalDate la fecha del cumpleaños
		fecha = LocalDate.of(anno, mes, dia);

		// Guardamos el numero del dia de la semana de su cumpleaños y mostramos al
		// usuario que dia de la semana nació.
		int diaSemana = fecha.getDayOfWeek().getValue();
		String nombreDia = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		System.out.printf("\nEl dia que naciste fue: %s\n", nombreDia);

		// Comprobamos y mostramos al usuario los dias en los que su cumpleaños coincide
		// con el dia de la semana en el que nació con el formato indicado

		System.out.printf("\n¿Cuantas veces ha caido tu cumpleaños en %s?\n", nombreDia);
		LocalDate contenedor = null;
		int contador = 0;
		for (int i = (anno + 1); i <= 2024; i++) {
			try {
				contenedor = LocalDate.of(i, mes, dia);
				int diaSemanaAnno = contenedor.getDayOfWeek().getValue();
				if (diaSemana == diaSemanaAnno) {
					System.out.println(contenedor.format(formato));
					contador++;
				}
			} catch (DateTimeException excepcion1) {
			} catch (Error error) {
			}

		}
		System.out.printf("\nNumero total de coincidencias: %d\n", contador);
		teclado.close();
	}

//Devuelve un numero entero dentro de un rango
	public static int pedirEnteroRango(Scanner tecla, String mensaje, int max, int min) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextInt();
				while (numero < min || numero > max) {
					System.out.printf("Introduzca un numero dentro del rango especificado (%d - %d)\n", max, min);
					numero = tecla.nextInt();
				}
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.printf(
						"Te has equivocado. Por favor, ingresa un número dentro del rango especificado (%d - %d)\n",
						max, min);
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}
}
