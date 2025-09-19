/**
 * Introducimos valores y los mostramos en una matriz de 5x5
 * Jorge Arrenberg 28/10
 */

package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tamanno = (int) Math.sqrt(25), contador = 0;
		int[][] filas = new int[tamanno][tamanno];

		// Introducimos los valores en las posiciones de la matriz
		for (int i = 0; i < tamanno; i++) {
			for (int j = 0; j < tamanno; j++) {
				contador = contador + 1;
				filas[i][j] = contador;
			}
		}
		
		// Mostramos los valores de la matriz
		
		for (int i = 0; i < tamanno; i++) {
			for (int j = 0; j < tamanno; j++) {
				System.out.print(filas[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
}
