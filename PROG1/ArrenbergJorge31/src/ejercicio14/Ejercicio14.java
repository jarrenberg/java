/**
 * Introduccion de una secuencia de numerosen un array y mostrar la secuencia
 * Jorge Arrenberg 28/10
 * 
 */


package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sumaConsecutiva = 0, contadorPosicion = 0, contadorNum;
		
		//Calculamos el tamaño del array
		
		for (int i = 0; i <= 10; i++) {
			sumaConsecutiva = sumaConsecutiva + (i);
		}
		int[] secuencia = new int[sumaConsecutiva];

		//Introducimos la seuencia de numeros dentro del array
		
		for (int i = 1; i <= 10; i++) {
			contadorNum=0;
			while (contadorNum < i) {
				secuencia[contadorPosicion] = i;
				contadorNum++;
				contadorPosicion++;
			}
		}
		
		//Mostramos los valores del array 
		
		System.out.println("La secuencia es: ");
		for (int i = 0; i < sumaConsecutiva; i++) {
			System.out.print(secuencia[i] + " ");
		}
	}
}
