/**
 * Programa que comprueba si dos nombre son iguales o no
 * Jorge Arrenberg 21/11/2024
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los dos nombre a comparar

		System.out.println("Introduce un nombre:");
		String nombre1 = teclado.nextLine();

		System.out.println("Introduce otro nombre");
		String nombre2 = teclado.nextLine();
		
		//Empleamos el metodo para saber si los nombre son iguales
		
		if(nombreIgual(nombre1,nombre2) == false) {
			System.out.println("Los nombres no son iguales");
		}else {
			System.out.println("Los nombre son iguales");
		}

	}

	// Deuvelve un booleano referente a si los nombres son iguales o no
	public static boolean nombreIgual(String nombre1, String nombre2) {
		boolean nombreIgual = false;
		nombreIgual = nombre1.equalsIgnoreCase(nombre2);
		return nombreIgual;
	}

}
