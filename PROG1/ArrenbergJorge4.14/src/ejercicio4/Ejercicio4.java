/**
 * Programa que emplea un metodo para analizar si un numero es positivo, negativo o 0
 * Jorge Arrenberg 11/11/2024
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimios el numero a analizar

		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		
		//Mostramos el resultado del analisis en funcion al resultado proporcionado por el metodo
		if (dimeSigno(num) == 0) {
			System.out.println("El numero es 0");
		}
		if (dimeSigno(num) > 0) {
			System.out.println("El numero es positivo");
		}
		if (dimeSigno(num) < 0) {
			System.out.println("El numero es negativo");
		}
		
		teclado.close();
	}

	// Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
	public static int dimeSigno(int num) {
		int analisis = 0;
		if (num > 0) {
			analisis = 1;
		}
		if (num == 0) {
			analisis = 0;
		}
		if (num < 0) {
			analisis = -1;
		}
		return analisis;
	}

}
