/**
 * Calculamos el tamaño de un array, introducimos en este una secuencia de numeros y lo mostramos
 * Jorge Arrenberg 28/10
 * 
 */


package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		int sumaConsecutiva=0;
		
		//Calculamos el tamaño del array
		
		for (int i = 0; i<=10;i++) {
		sumaConsecutiva = sumaConsecutiva+(i);
		}
		
		int inicio=0,fin=0;
		
		int[] numeros = new int[sumaConsecutiva];
		
		//Llenamos el array con la secuencia
		
		for (int i = 1; i<11; i++) {
			fin=inicio+i;
			
			Arrays.fill(numeros, inicio, fin, i);
			
			inicio=fin;			
		}
		
		//Mostramos el array
		
		for (int i = 0; i<sumaConsecutiva; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
