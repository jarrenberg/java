/**
 * Programa que recibe un numero en km y lo pasa a millas
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca una cantidad en kilometros

		System.out.print("Introduzca un numero en km: ");
		float kilometros = teclado.nextFloat();
		while (kilometros<0) {
			System.out.println("Introduzca un numero valido de kilometros");
		}
		
		//Mostramos el resultado de la conversion
		
		System.out.println(kilometros + " km son "+ conversor(kilometros) + " millas");

		teclado.close();
	}
//Devuelve la una cantidad de kilometros pasada a millas
	public static float conversor (float kilometros) {
		float millas;
		millas = (float) ((kilometros) *( 0.621371));
		return millas;
	}
}
