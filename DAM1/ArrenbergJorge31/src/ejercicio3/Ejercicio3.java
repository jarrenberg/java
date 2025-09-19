/**
 * Introduccion de numeros en un array, recorrer el array para buscar los numeros mayores y menores, guardar dichos valores y mostrarlos
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int espacioArray = 10;
		double contenedorMayor = -999999999;
		double contenedorMenor = 999999999;
		double[] numeros = new double[espacioArray];

		// Introduzccion de los numeros en el array y los guardamos

		for (int i = 0; i < espacioArray; i++) {
			System.out.println("Introduzca un numero: ");
			double num = teclado.nextDouble();
			numeros[i] = num;

			// Recorremos el array buscando si vada valor es maximo o minimo, y en caso de
			// serlo guardarlos.

		}
		for (int i = 0; i < espacioArray; i++) {
			if (numeros[i] < contenedorMenor) {
				contenedorMenor = numeros[i];
			}
			if (numeros[i] > contenedorMayor) {
				contenedorMayor = numeros[i];
			}
		}

		// Mostramos los valores maximos y minimos

		System.out.println("El numero mayor es " + contenedorMayor);
		System.out.println("El numero menor es " + contenedorMenor);
	}

}
