/**
 * Programa que crea un array de tamaño introducido por el usuario y lo rellana de numeros aleatorios
 * Jorge Arrenberg 15/11/2024
 */

package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca el tamaño del array y creamos un array de
		// dicho tamaño

		System.out.println("Introduzca el tamaño del array:");
		int tamanno = teclado.nextInt();

		double[] vector = new double[tamanno];
		
		//Llamanos al metodo 
		rellenoArray(vector, tamanno);
		
		teclado.close();	
	}
	
//Metodo que rellana un array con valores aleatorios
	public static void rellenoArray(double[] vector, int tamanno) {
		for (int i = 0; i < tamanno; i++) {
			vector[i] = Math.random();
		}
	}
}
