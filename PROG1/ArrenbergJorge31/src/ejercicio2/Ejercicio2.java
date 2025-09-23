/**
 * Introduccion de numeros en un array y mostrarlos, ademas calcular la suma de todos los valores
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int espacioArray = 10;
		double sumaConsecutiva = 0;
		double[] numeros = new double[espacioArray];

		// Introducimos numeros en el array y lo guardamos en las posiciones

		for (int i = 0; i < espacioArray; i++) {
			System.out.println("Introduzca un numero: ");
			double num = teclado.nextDouble();
			numeros[i] = num;
		}
		// Recorremos el array y vamos sumando los valores en cada posicion

		for (int i = 0; i < espacioArray; i++) {
			sumaConsecutiva = sumaConsecutiva + numeros[i];
		}
		System.out.println("La suma de los numeros introducidos en el array es: " + sumaConsecutiva);
	}

}
