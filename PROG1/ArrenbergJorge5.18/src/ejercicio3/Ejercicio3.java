/**
 * Programa donde se le introduce un año y se muestra cuantos domingos hay en cada mes y en total en dicho año
 * Jorge Arrenberg 5/1/2025
 */

package ejercicio3;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creamos un contador para tener registrados cuantos domingos hay en cada mes y
		// en total
		int contadorMes;
		int contadorAnno = 0;

		// Pedimos al usuario que introduzca un año en el rango especificado
		int anno = pedirEnteroRango(teclado, "Introduce un año entre 1900 y 2100:", 2100, 1900);
		LocalDate fecha = LocalDate.of(anno, 1, 1);

		System.out.printf("\nCANTIDAD DE DOMINGOS DEL AÑO %d\n---------------------------------\n", anno);
		for (int i = 1; i <= 12; i++) {
			contadorMes = 0; // Cada vez que cambia de mes reseteamos el contador mensual
			for (int j = 1; j <= diasMes(i, anno); j++) { // Usamos el metodo diasMes que hemos creado para sabr los
															// dias que tiene cada mes
				fecha = LocalDate.of(anno, i, j);
				int valorDia = fecha.getDayOfWeek().getValue();// Usamos estos metodos para saber el valor numerico del
																// dia de la semana en el que estamos
				if (valorDia == 7) {
					contadorMes++;
					contadorAnno++;
				}
			}

			// Mostramos el mes en el que esamos y el numero de domingos de dicho mes
			String nombreMes = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
			System.out.printf("%s: \t%d\n", nombreMes, contadorMes);

		}
		// Tras terminar el programa mostramos el contador de domingos global
		System.out.printf("Numero total de domingos: %d", contadorAnno);

	}

	// Metodo que devuelve un entero dentro de un rango
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
					System.out.printf("Introduzca un numero dentro del rango especificado (%d - %d)\n", min, max);
					numero = tecla.nextInt();
				}
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.printf(
						"Te has equivocado. Por favor, ingresa un número dentro del rango especificado (%d - %d)\n",
						min, max);
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);
		tecla.nextLine();
		return numero;
	}

	// Metodo que devulve los dias de un mes
	public static int diasMes(int mes, int anno) {
		int diasMes = 0;
		LocalDate fecha = LocalDate.of(anno, mes, 1);
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			diasMes = 31;
			break;
		case 4, 6, 9, 11:
			diasMes = 30;
			break;
		case 2:
			if (fecha.isLeapYear()) {
				diasMes = 29;
			} else {
				diasMes = 28;
			}
			break;
		}
		return diasMes;
	}
}
