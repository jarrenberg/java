/**
 * Introduccion de numeros en un array, sumamos los numeros positivos y los negativos por separados y los mostramos
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int espacioArray = 20;
		double sumaPositivos = 0;
		double sumaNegativos = 0;
		double[] numeros = new double[espacioArray];
		
		//Introducimos los numeros en el array los guardamos en las posiciones
		
		for (int i = 0; i < espacioArray; i++) {
			System.out.println("Introduzca un numero: ");
			double num = teclado.nextDouble();
			numeros[i] = num;
		}
		
		//Recorremos el array buscando que numero es positivo y negativo y los sumamos consecutivamente
		
		for (int i = 0; i < espacioArray; i++) {
			if(numeros[i]<0) {
				sumaNegativos=sumaNegativos+numeros[i];
			}
			if(numeros[i]>0) {
				sumaPositivos=sumaPositivos+numeros[i];
			}
		}
		
		// Mostramos la suma de los valores positivos y negativos
		
		System.out.println("La suma de los numeros positivos es: " +sumaPositivos);
		System.out.println("La suma de los numeros negativos es: " +sumaNegativos);
	}

}
