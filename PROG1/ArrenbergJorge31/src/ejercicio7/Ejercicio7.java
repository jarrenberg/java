/**
 * Introduccion de numeros, creacion de un array con el espacio entre esos numeros y mostramos los numeros entre ambos numeros introducidos
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamannoArray, contenedor = 0;

		System.out.println("Introduzca un numero P");
		int letraP = teclado.nextInt();
		int letraPOriginal=letraP;

		System.out.println("Introduzca un numero Q");
		int letraQ = teclado.nextInt();
		int letraQOriginal=letraQ;
		
		//Para calcular el tamaño del array restamos ambos valores y hacemos el valor absoluto en caso de que la resta diera negativa
		
		int resta = letraP - letraQ;
		tamannoArray = (Math.abs(resta)-1);

		int[] numeros = new int[tamannoArray];
		
		// Introducimos los valores entre P y Q dentro del array numeros[]
		
		for (int i = 0; i < tamannoArray; i++) {
			if (letraP >= letraQ) {
				numeros[i] = letraQ+1;
				letraQ = letraQ+1;
			}
			if (letraP < letraQ) {
				numeros[i] = letraP+1;
				letraP = letraP + 1;
			}
		}
		
		//Mostramos el array con los numeros entre P y Q
		
		System.out.println("Los numeros entre " +letraPOriginal+ " y " +letraQOriginal+" son:");
		for (int i = 0; i < tamannoArray; i++) {
			
			System.out.print(numeros[i] + " ");

		}
	}
}
