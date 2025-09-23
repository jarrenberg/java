/**
 * Introduccion de numeros en un array y mostrarlos
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int espacioArray = 10;
		double[] numeros = new double[espacioArray];

		// Introducimos numeros en el array y lo guardamos en las posiciones

		for (int i = 0; i < espacioArray; i++) {
			System.out.println("Introduzca un numero: ");
			double num = teclado.nextDouble();
			numeros[i] = num;
		}
		// Mostramos los numeros del array

		for (int i = 0; i < espacioArray; i++) {
			System.out.println("El numero en la posicion " + (i + 1) + " es " + numeros[i]);
		}
	}

}
