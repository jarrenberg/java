/**
 * Creamos una matriz con las filas y las columnas introducidas por teclado y rellenamos la matriz con valores introducidos por teclado. Tras esto, mostramos la matriz
 * Jorge Arrenberg 28/10
 */

package ejercicio3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Introducimos el nujmero de filas de columnas

		System.out.println("Introduzca el numero de filas:");
		int numN = teclado.nextInt();

		System.out.println("Introduzca el numero de columnas:");
		int numM = teclado.nextInt();

		int[][] matriz = new int[numN][numM];

		// Pedimos al usuario que introdzca valores para llenar la matriz

		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numM; j++) {
				System.out.println("Introduzca un numero en la fila " + (i + 1) + " y en la columna " + (j + 1) + ":");
				int num = teclado.nextInt();
				matriz[i][j] = num;
			}
		}

		// Mostramos la matriz

		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numM; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
