package trabajoWhile;

import java.util.Scanner;

public class TrabajoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número");
		int numero = teclado.nextInt();

		int cont = 0;

		while (cont < 4) {
			while (numero != 0) {
				if (numero < 0) {
					if (numero % 2 == 0) {
						System.out.println("El número es negativo y par");
					} else {
						System.out.println("El número introducido es negativo e impar");
					}
				} else {
					if (numero % 2 == 0) {
						System.out.println("El número es positivo y par");
					} else {
						System.out.println("El número es positivo e impar");
						;
					}
				}
				System.out.println("Introduzca un número");
				numero = teclado.nextInt();
			}
			if (numero == 0) {
				System.out.println("Fin del programa");

			}
		}
	}
}
