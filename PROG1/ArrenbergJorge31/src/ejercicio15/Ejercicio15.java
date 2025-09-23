/**
 * Introduccion de tamaño y contenido en un array
 * Jorge Arrenberg 28/10
 * 
 */


package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		//Introducimos el tamaño del array
		
		System.out.print("Introduzca el tamaño del Array:");
		int tamaño = teclado.nextInt();

		//Introducimos el contenido
		
		System.out.print("Introduzca el contenido del Array:");
		int contenido = teclado.nextInt();

		int[] vector = new int[tamaño];
		
		//Guardamos el contenido en cada posicion del array
		
		for (int i = 0; i < tamaño; i++) {
			vector[i]=contenido;
		}
		
		//Mostramos el array
		
		for(int i=0;i<tamaño;i++) {
			System.out.print(vector[i] + " ");
		}
	}
}
