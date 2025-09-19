/**
 * Programa que muestra la posicion de un jugador a partir de un dorsal
 * Jorge Arrenberg 21/11/2024
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que introduzca el dorsal del jugado

		System.out.print("Introduzca el dorsal del jugador:");
		int dorsal = teclado.nextInt();

		//Empleamos el metodo para saber que posicion juega la persona dependiendo del dorsal introducido
		
		posicionJugador(dorsal);
		
	}

//Devuelve la posicion del jugador dependiendo de su dorsal
	public static void posicionJugador(int dorsal) {
		if (dorsal < 1 || dorsal > 16) {
			System.out.println("Número introducido incorrecto.");
		}
		if (dorsal == 1) {
			System.out.println("El dorsal " + dorsal + " juega el proximo partido como portero");
		}
		if ((dorsal >= 2) && (dorsal <= 5)) {
			System.out.println("El dorsal " + dorsal + " juega el proximo partido como defensa");
		}
		if ((dorsal >= 6) && (dorsal <= 8)) {
			System.out.println("El dorsal " + dorsal + " juega el proximo partido como centrocampista");
		}
		if((dorsal>=9)&&(dorsal<=11)) {
			System.out.println("El dorsal "+dorsal+" juega el proximo partido como delantero");
		}
		if((dorsal>=12) && (dorsal<=16)) {
			System.out.println("El dorsal "+dorsal+" sera suplente el proximo partido");
		}

	}
}
