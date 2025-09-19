/**
 * Introducimos numeros aleatorios del 0 al 9 en un array y lo ordenamos de manor a mayor
 * Jorge Arrenber 28/10
 */

package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int tamanno = 30;
		
		int [] recipiente =  new int[tamanno];
		
		//Guardamos valores aleatorios de 0 a 9 en el array
		
		for(int i = 0; i<tamanno; i++) {
			recipiente [i] = (int) (Math.random()*(10));		
		}
		
		//Ordenamos de menor a mayor los numeros
		
		Arrays.sort(recipiente);
		
		//Mostramos el array
		
		for(int i = 0; i<tamanno; i++) {
			System.out.print (recipiente[i] + " ");
		}
	}
}
