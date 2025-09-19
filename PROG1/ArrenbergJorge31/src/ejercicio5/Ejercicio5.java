/**
 * Introduccion de numeros en un array, calculamos la media de los numeros introducidos y mostramos la media
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int espacioArray = 20;
		double sumaConsecutiva=0;
		double media;
		double [] numeros = new double[espacioArray];
		
		//Introducimos y guardamos los numeros en el array. A medida que los vamos introduciendo, vamos acumulando sus valores en la variable sumaConsecutiva

		for (int i = 0; i < espacioArray; i++) {
			System.out.println("Introduzca un numero: ");
			double num = teclado.nextDouble();
			numeros[i]=num;
			sumaConsecutiva=sumaConsecutiva+numeros[i];
		}
		
		//Calculamos la media de los numeros introducidos diviendo la sumaConsecutiva entre el espacio del array.
		
		media=(sumaConsecutiva/espacioArray);
		
		//Mostramos la media
		
		System.out.println("La media de los valores introducidos es: " +media);
	}

}
