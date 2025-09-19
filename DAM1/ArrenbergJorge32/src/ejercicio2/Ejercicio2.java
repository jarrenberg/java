/**
 * Creamos una matriz donde cada fila sera una tabla de multiplicar del 1 al 10
 * Jorge Arrenberg 28/10
 */

package ejercicio2;

import java.util.Iterator;

public class Ejercicio2 {
	public static void main(String[] args) {
		int espaciototal = 100;
		int tamanno = (int)Math.sqrt(espaciototal);
		
		//Introducimos los valores en la matriz
		
		int [][] multiplicaciones = new int [tamanno][tamanno];
		
		for (int i = 0; i < tamanno; i++) {
			for (int j = 0; j < tamanno; j++) {
				multiplicaciones[i][j]= (i+1)*(j+1);
			}
		}
		
		//Mostramos los valores de la matriz
		
		for (int i = 0; i < tamanno; i++) {
			System.out.print(" Tabla de multiplicar del " + (i+1) + ":  ");
			for (int j = 0; j < tamanno; j++) {
				System.out.print(multiplicaciones[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
