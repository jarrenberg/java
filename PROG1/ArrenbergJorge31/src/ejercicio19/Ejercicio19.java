/**
 * Introduccin de valores en un array y ordenarlos de mayor a menor
 * Jorge Arrenberg 28/10
 * 
 */


package ejercicio19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 8;
		int posicion = 0;

		int[] resultados = new int[tamaño];

		//Introduccion de los valores
		
		for (int i = 0; i < tamaño; i++) {
			System.out.print("Introduzca el resultado del jugador " + (i + 1) + " :");
			int partida = teclado.nextInt();
			while (partida < 1000 || partida > 2800) {
				System.out.println("El rsultado de la partida " + (i + 1)
						+ " introducido es incorrecto (debe ser >1000 y <2800). Vuelva a introducirlo:");
				partida = teclado.nextInt();
			}
			resultados[i] = partida;
		}
		
		//Ordenamos de menor a mayor los valores
		Arrays.sort(resultados);
		
		//Mostramos los valores de mayor a menor

		for (int i = 0; tamaño > (i); tamaño--) {
			System.out.println("Puntuacion nº " + (posicion + 1) + " :" + resultados[(tamaño - 1)]);
			posicion = posicion + 1;
		}
		teclado.close();
	}
}