/**
 * Introduccion de numeros aleatorios en un array, buscar los numeros iguales al introducido y mostrar las posiciones donde se encuentra este numero
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio9;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 10, contador = 0;
		int[] numeros = new int[tamaño];
		int[] posiciones = new int[tamaño];

		// Rellenamos el array con numeros aleatorios entre 1 y 10

		for (int i = 0; i < tamaño; i++) {
			numeros[i] = (int) (1 + (Math.random() * 10));
		}

		// Pedimos al usuario que introduzca un numero entre 1 y 10 y que no se guarde
		// hasta que el valor introducido este entre dicho rango

		System.out.println("Introduzca un numero entre 1 y 10:");
		int valor = teclado.nextInt();
		while (valor < 1 || valor > 10) {
			System.out.println("El numero introducido es incorrecto, entroduzca un numero entre 1 y 10:");
			valor = teclado.nextInt();
		}

		// Recorremos el array posicion por posicion y si el valor en dicha posicion es
		// igual al valor introducido por el usuario guardamos dicha position en el
		// array posiciones[]

		for (int i = 0; i < tamaño; i++) {
			if (numeros[i] == valor) {
				posiciones[(contador)] = i + 1;
				contador = contador + 1;
			}
		}
		
		//Mostramos los valores del array posiciones[] (dicho array contiene las posiciones donde aparece el numero introducido por el usuario en el array numeros[])
		
		System.out.println("El valor " + valor + " sale en las posiciones: ");
		for (int i = 0; i < tamaño; i++) {
			//Si el valor del array posiciones[] es  a 0 no lo mostramos
			if (posiciones[i] != 0) { 
				System.out.print(posiciones[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("El array original es: ");
		for (int i = 0; i < tamaño; i++) {
			
			System.out.print(numeros[i]+ " ");
		}
	}
}
