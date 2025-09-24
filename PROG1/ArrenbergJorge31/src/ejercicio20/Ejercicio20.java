/**
 * Rellenamos un array con valores aleatorios de 0 a 99, pedimos un numero y verificamos si ese numero estan en el array y cuantas veces aparece
 * Jorge Arrenberg 28/10
 * 
 */


package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 1000, multiplicador = 100, contador = 0;
		int[] aleatorio = new int[tamaño];
		
		//Introducimos los numeros entre 0 y 99 en el array
		
		for (int i = 0; i < tamaño; i++) {
			aleatorio[i] = (int) ((Math.random()) * multiplicador);
		}
		
		//Pedimos un valor
		
		System.out.print("Introduzca un valor:");
		int valorN = teclado.nextInt();
		while (valorN<0||valorN>99) {
			System.out.println("Introduzca un valor en el rango entre 0 y 99:");
			valorN = teclado.nextInt();
		}

		//Calculamos cuantas veces aparece el valorN en el array aleatorios[]
		
		for (int i = 0; i < tamaño; i++) {
			if (aleatorio[i] == valorN) {
				contador = contador + 1;
			}
		}
		
		//Mostramos las veces que sale el valorN en el array
		
		System.out.println("El numero " + valorN + " aparece " + contador + " veces");
	}

}
