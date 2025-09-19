/**
 * Introducimos numeros en 2 arrays distintos y luego comprobamos si ambos arrays son iguales
 * Jorge Arrenberg 28/10
 */

package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamannoTotal = 20, contador1=0, contador2=0, contadorIguales=0;
		int tamannov1=(tamannoTotal/2);
		int tamannov2=(tamannoTotal/2);
		
		int[] vector1 = new int[tamannov1];
		int[] vector2 = new int[tamannov2];

		//Introducimos numeros en cada array
		
		for (int i = 0; i < tamannoTotal; i++) {
			System.out.println("Introduzca un numero");
			int num = teclado.nextInt();
			if (i < tamannov1) {
				vector1[contador1] = num;
				contador1=contador1+1;
			}
			if (i >= tamannov2) {
				vector2[contador2] = num;
				contador2=contador2+1;
			}

		}
		
		//Comparamos los valores de ambos array en las mism
		
		for(int i=0; i<tamannov1; i++) {
			if(vector1[i]==vector2[i]) {
				contadorIguales=contadorIguales+1;
			}
		}
		
		//Si el contador es igual al tamaño de los arrays es que son iguales y en caso de que no sea igual el contador al tamaño del array no son iguales
		//Mostramos los resultados
		
		if(contadorIguales==tamannov1) {
			System.out.println("Los arrays son iguales");
		}else {
			System.out.println("Los arrays no son iguales");
		}
	}

}
