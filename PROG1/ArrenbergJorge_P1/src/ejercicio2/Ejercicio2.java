/**
 * Programa que pide dos caracteres al usuaro por teclado y comprueba sin son iguales o no
 * En caso de que sean 'n' o 'o', el programa finaliza
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Declaramos los caracteres

		char caracter1;
		char caracter2;

		// Creamos un bucle que siga pidiendo caracteres hasta que estos sean 'n' o 'o'

		do {
			System.out.println("Introduzca el caracter 1");
			String input1 = teclado.nextLine();
			caracter1 = input1.charAt(0); // Guardamos la letra que es un String como caracter con charAt

			System.out.println("Introduzca el caracter 2");
			String input2 = teclado.nextLine();
			caracter2 = input2.charAt(0);// Guardamos la letra que es un String como caracter con charAt

			if (caracter1 == caracter2) {
				System.out.println("Los caracteres introducidos son identicos");
			}
			if (caracter1 != caracter2) {
				System.out.println("Los caracteres introducidos no son identicos");
			}

			System.out.println(" ");
		} while ((caracter1 != 'n' && caracter1 != 'N') || (caracter2 != 'o' && caracter2 != 'O')); //Condiciones para que el programa se siga ejecutando
		System.out.println("Finalizando");

	}

}
