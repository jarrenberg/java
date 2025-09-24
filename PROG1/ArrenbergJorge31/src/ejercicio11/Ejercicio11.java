/**
 * Introduccion de numeros aleatorios en un array, buscar los numeros iguales al introducido y mostrar las posiciones donde se encuentra este numero
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int tamanno = 100;
		int[] vector1 = new int[tamanno];
		int[] vector2 = new int[tamanno];
		
		//Introducimos los valores del 1 al 100 en el vector1
		
		for (int i = 0; i < tamanno; i++) {
			vector1[i] = i + 1;
			System.out.print(vector1[i] + " ");
		}
		System.out.println(" ");
		
		// Usamos vector1[] y recorremos el array en orden inverso para luego guardar dicho valor en vector2[]
 		
		for (int i = 0; i < tamanno; i++) {
			vector2[i] = vector1[(tamanno - 1) - i];
			System.out.print(vector2[i] + " ");
		}
	}
}
