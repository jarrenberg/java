/**
 * Programa de maquina de cafe 
 * jorge arrenberg 2024
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public enum cafes {SOLO, CON_LECHE, NUBE, MANCHADO, IRLANDES};

	public static void main(String[] args) {
		cafes solo = cafes.SOLO;
		cafes conLeche = cafes.CON_LECHE;
		cafes nube = cafes.NUBE;
		cafes manchado = cafes.MANCHADO;
		cafes irlandes = cafes.IRLANDES;

		Scanner teclado = new Scanner(System.in);
		int comando, contador = 0;

		do {
			//Mostramos la interfaz
			System.out.println("Bienvenido a la maquina de cafe");
			System.out.println("Seleccione una bebida");
			System.out.println("1." +solo+  "- 1.5€");
			System.out.println("2." +conLeche+ "- 1.6€");
			System.out.println("3." +nube+" - 1.75€");
			System.out.println("4." +manchado+" - 1.7€");
			System.out.println("5." +irlandes+ " - 2.5€");
			System.out.println("0 - Salir");
			System.out.println("Seleccione una opcion");
			comando = teclado.nextInt();
			//Si el comanod es incorrecto lo pedimos hasta que lo sea
			while (comando < 0 || comando > 5) {
				System.out.println("Numero incorrecto, vuelva a introducirlo");
				System.out.println(" ");
				System.out.println("Seleccione una bebida");
				System.out.println("1." +solo+  "- 1.5€");
				System.out.println("2." +conLeche+ "- 1.6€");
				System.out.println("3." +nube+" - 1.75€");
				System.out.println("4." +manchado+" - 1.7€");
				System.out.println("5." +irlandes+ " - 2.5€");
				System.out.println("0 - Salir");
				System.out.println("Seleccione una opcion");
				comando = teclado.nextInt();

			}
			if (comando == 1) {
				contador = 0;
				System.out.println("Ha seleccionado " + solo + ".El precio es 1.5€");
				System.out.println("Introduzca una cantidad en euros");
				double cantidad = teclado.nextDouble();
				if (cantidad < (1.5)) {
					do {
						System.out.println("Dinero insuficiente, vuelva a introducir la cantidad");
						cantidad = teclado.nextDouble();
						contador++;
						if (cantidad >= (1.5)) {
							contador = 2;
						}
					} while (contador < 2);
				}
				if (cantidad >= (1.5)) {
					System.out.println("Compra exitosa. Su cambio es " + (cantidad - (1.5)) + "€");
					System.out.println("Disfrute su " + solo);
				}
			}

			if (comando == 2) {
				contador = 0;
				System.out.println("Ha seleccionado " + conLeche + ". El precio es 1.6€");
				System.out.println("Introduzca una cantidad en euros");
				double cantidad = teclado.nextDouble();
				if (cantidad < (1.6)) {
					do {
						System.out.println("Dinero insuficiente, vuelva a introducir la cantidad");
						cantidad = teclado.nextDouble();
						contador++;
						if (cantidad >= (1.6)) {
							contador = 2;
						}
					} while (contador < 2);
				}
				if (cantidad >= (1.6)) {
					System.out.println("Compra exitosa. Su cambio es " + (cantidad - (1.6)) + "€");
					System.out.println("Disfrute su " + conLeche);
				}
			}

			if (comando == 3) {
				contador = 0;
				System.out.println("Ha seleccionado " + nube + ". El precio es 1.75€");
				System.out.println("Introduzca una cantidad en euros");
				double cantidad = teclado.nextDouble();
				if (cantidad < (1.75)) {
					do {
						System.out.println("Dinero insuficiente, vuelva a introducir la cantidad");
						cantidad = teclado.nextDouble();
						contador++;
						if (cantidad >= (1.75)) {
							contador = 2;
						}
					} while (contador < 2);
				}
				if (cantidad >= (1.75)) {
					System.out.println("Compra exitosa. Su cambio es " + (cantidad - (1.75)) + "€");
					System.out.println("Disfrute su " + nube);
				}
			}

			if (comando == 4) {
				contador = 0;
				System.out.println("Ha seleccionado " + manchado + ". El precio es 1.7€");
				System.out.println("Introduzca una cantidad en euros");
				double cantidad = teclado.nextDouble();
				if (cantidad < (1.7)) {
					do {
						System.out.println("Dinero insuficiente, vuelva a introducir la cantidad");
						cantidad = teclado.nextDouble();
						contador++;
						if (cantidad >= (1.7)) {
							contador = 2;
						}
					} while (contador < 2);
				}
				if (cantidad >= (1.7)) {
					System.out.println("Compra exitosa. Su cambio es " + (cantidad - (1.7)) + "€");
					System.out.println("Disfrute su " + manchado);
				}
			}

			if (comando == 5) {
				contador = 0;
				System.out.println("Ha seleccionado " + irlandes + ". El precio es 2.5€");
				System.out.println("Introduzca una cantidad en euros");
				double cantidad = teclado.nextDouble();
				if (cantidad < (2.5)) {
					do {
						System.out.println("Dinero insuficiente, vuelva a introducir la cantidad");
						cantidad = teclado.nextDouble();
						contador++;
						if (cantidad >= (2.5)) {
							contador = 2;
						}
					} while (contador < 2);
				}
				if (cantidad >= (2.5)) {
					System.out.println("Compra exitosa. Su cambio es " + (cantidad - (2.5)) + "€");
					System.out.println("Disfrute su " + irlandes);
				}
			}

			System.out.println(" ");
		} while (comando != 0);

		System.out.println("Gracias por usar la maquina, hasta luego");
	}

}
