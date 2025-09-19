/**
 * Introduccion de numeros aleatorios en un array, buscar los numeros iguales al introducido y mostrar las posiciones donde se encuentra este numero
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float alturaMax = 0, sumaConsecutiva = 0, alturaMin = 4, alturaMedia = 0;

		//Introducimos el tamaño del array
		
		System.out.println("Introduzca un valor N que sera el tamaño del array");
		int tamanno = teclado.nextInt();

		float[] alturas = new float[tamanno];
		
		//El usuario introduice en el array los valores de las alturas
		
		for (int i = 0; i < tamanno; i++) {
			System.out.println("Introduzca la altura en metros del usuario " + (i + 1) + " :");
			float altura = teclado.nextFloat();
			while (altura > 3 || altura < 0) {
				System.out.println("La altura debe estar comprendida entre 0 y 3 metros.Vuevla a introducirla");
				altura = teclado.nextFloat();
			}
			alturas[i]=altura;
		}
		
		//Recorremos el array y guardamos los valores maximos, minimos y la suma de todos los valores introducidos en el array
		
		for (int i = 0; i < tamanno; i++) {
			if (alturaMax < alturas[i]) {
				alturaMax = alturas[i];
			}
			if (alturas[i] < alturaMin) {
				alturaMin = alturas[i];
			}
			sumaConsecutiva = sumaConsecutiva + alturas[i];
			
			//Calculamos la altura media
			alturaMedia = (sumaConsecutiva / tamanno);
		}
		
		//Mostramos los valores de la altura maxima, minima y la media
		
		System.out.println("La altura minima es: " + alturaMin);
		System.out.println("La altura maxima es: " + alturaMax);
		System.out.println("La altura media es: " + alturaMedia);
	}
}
