/**
 * Programa que emplea un metodo para pasar de 	millas a kilometros
 * Jorge Arrenberg 11/11/2024
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca un valor en millas

		System.out.println("Introduzca un valor en millas");
		int millas = teclado.nextInt();
		while (millas < 0) {
			System.out.println("Introduzca un valor en millas positivo");
			millas = teclado.nextInt();
		}

		// Mostramos el resultado de la conversion de millas a kilometros

		System.out.println(millas + " millas son " + millas_a_kilometros(millas) + " km");
		
		teclado.close();
	}

	// Devuelve la conversión de millas a kilómetros
	public static double millas_a_kilometros(int millas) {
		double kilometros;
		kilometros = (millas * 1.60934);
		return kilometros;
	}
}
