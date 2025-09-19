/**
 * Programa que crea un triangulo a base de un caracter dado y el numero de lineas
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca un caracter y el numero de lineas

		System.out.println("Introduzca un caracter:");
		String contenedorCaracter = teclado.nextLine();
		char caracter = contenedorCaracter.charAt(0);

		System.out.println("Introduzca el numero de lineas:");
		int numLineas = teclado.nextInt();
		
		//Mostramos el triangulo con los parametros introducidos
		
		System.out.println(" ");
		triangulo(caracter, numLineas);
		
		teclado.close();
	}
	// Muestra una trinaglo basado en el numero de lineas

	public static void triangulo(char caracter, int numLineas) {
		int contador = 1, contenedorLineas=numLineas, almacen=1;
		for (int k = 0; k < numLineas; k++) {
			for (int i = 1; i < contenedorLineas; i++) {
				System.out.print(" ");
			}
			contenedorLineas = contenedorLineas - 1;
			
			for (int j = 1; j <= contador; j++) {
				System.out.print(caracter);
			}
			
			almacen = almacen+1;
			contador = ((almacen*2)-1);
			System.out.println("");
			
		}
	}
}
