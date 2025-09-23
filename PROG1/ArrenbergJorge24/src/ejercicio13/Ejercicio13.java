package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numAleatorio;
		int min = 1, max = 100;
		int mayorOmenor;
		do {
			numAleatorio = (min + max) / 2;
			System.out.println("¿El numero " + numAleatorio + " es mayor o menor al pensado?");
			System.out.println("Introduzca 0 si es mayor y 1 si es menor o 2 si es igual");
			mayorOmenor = teclado.nextInt();

			if (mayorOmenor < 0 || mayorOmenor > 2) {
				System.out.println(
						"El numero introducido es incorrecto, introduzca 0 si es mayor y 1 si es menor o 2 si es igual");
				mayorOmenor = teclado.nextInt();
			}

			if (mayorOmenor == 1) {
					min= numAleatorio+1;
			}

			if (mayorOmenor == 0) {
					max=numAleatorio-1;
			}

		} while (mayorOmenor != 2);
		System.out.println("Este programa acerto el numero pensado ("+numAleatorio+")!!!");
	}
}
