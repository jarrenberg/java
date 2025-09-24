/**
 * Programa que pide encontrar a Wally introduciendo coordenadas. En caso de fallar tres veces, mostrara el tablero con la coordenada donde estaba Wally
 * Jorge Arrenberg 18/11/2024
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Creamos la matriz tablero
		
		int[][] tablero = new int[5][4];

		// Asignamos los valores de las coordenadas donde se encontrara Wally

		int coordenadaFila = (int) ((Math.random()) * 5);
		int coordenadaColumna = (int) ((Math.random()) * 4);

		// Creamos una variable contador que contara los intentos que tardas en acertar

		int contador = 1;

		// Creamos una variable booleana que nos indicara si hemos acertado o no

		boolean esCorrecto = false;

		// Rellenamos la matriz del tablero

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) { //Asignamos el valor 0 a los espacios vacios
				tablero[i][j] = 0;
				if ((i == coordenadaFila) && (j == coordenadaColumna)) { // En caso de que estemos en la posicion donde
																			// se encuentra Wally, lo identificamos con
																			// un 1
					tablero[(i)][(j)] = 1;
				}
			}
		}
		
		System.out.println("Tienes tres intentos para averiguar donde esta Wally");

		// Pedimos al usuario las coordenadas mientras se cumplan con dos condiciones,
		// que las coordenadas introducidas hayan sido incorrectas y que el contador de
		// intentos sea menor a 4
		do {

			// Pedimos las coordenadas al usuario

			System.out.println("Intento " + contador + ":");
			System.out.println("Introduzca la coordenada de la columna:");
			int averiguaColumna = teclado.nextInt();

			System.out.println("Introduzca la coordenada de la fila:");
			int averiguaFila = teclado.nextInt();

			// Comprobamos a ver si las coordenadas introducidas por el usuario es donde se
			// encuentra Wally

			if ((averiguaColumna == (coordenadaColumna + 1)) && (averiguaFila == (coordenadaFila + 1))) {

				// Cuando se introducen las coordenadas correctas muestra una felicitacion y el
				// tablero

				esCorrecto = true;
				System.out.println("Felicidades, lo encontraste (Wally será representado con el numero 1)");
				for (int i = 0; i < 5; i++) {
					System.out.println("");
					for (int j = 0; j < 4; j++) {
						System.out.print(tablero[i][j] + " | ");
					}
				}
			}

			// Si las coordendas introducidas no han sido correctas, el contador de intentos
			// aumenta y se vuelve a repetir el bucle

			contador = contador + 1;
			
		} while (contador < 4 && esCorrecto == false);

		// En caso de haber fallado los tres intentos, mostramos al usuario que ha
		// perdido el juego y mostramos el tablero

		if (esCorrecto == false) {
			System.out.println("Has perdido, Wally estaba aqui (Wally será representado con el numero 1)");
			for (int i = 0; i < 5; i++) {
				System.out.println("");
				for (int j = 0; j < 4; j++) {
					System.out.print(tablero[i][j] + " | ");
				}
			}

		}
		teclado.close();
	}

}
