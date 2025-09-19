/**
 * Introduccion el tamaño de un array, introducimos un numero base y un multiplicador, guardamos la secuencia en un array y lo mostramos
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Introducimos las veces que se va a repetir la secuencia
		
		System.out.print("Introduzca la longitud de la secuencia:");
		int tamanno = teclado.nextInt();
		
		//Introducimos el balor base

		System.out.println("Introduzca el numero V:");
		int numV = teclado.nextInt();
		
		//Introducimos el multiplicador

		System.out.println("Introduzca el numero I:");
		int numI = teclado.nextInt();

		int[] secuencia = new int[tamanno];
		
		//Guardamos la operacoin en el array secuencia[]
		
		for (int i = 0; i < tamanno; i++) {
			secuencia[i] = numV + (numI * i);
		}
		
		//Mostramos los valores del array
		
		for (int i = 0; i < tamanno; i++) {
			System.out.print(secuencia[i] + " ");
		}
	}

}
