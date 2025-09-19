/*
 * Clase donde usaremos los metodos y el menu de la clase CuentaBancaria, creada anteriormente
 * 04/02/2024 Jorge Arrenberg
 */

package ejercicio1;

import java.util.Scanner;

public class PlayamarBank {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		String titular = null;
		try {
			titular = teclado.nextLine();
		} catch (IllegalStateException ex1) {
			System.out.println("Error. El teclado esta cerrado");
		}

		System.out.println("Introduzca su IBAN:");
		String iban = null;
		try {
			iban = teclado.nextLine();
		} catch (IllegalStateException ex1) {
			System.out.println("Error. El teclado esta cerrado");
		}
		// Creando cuenta bancaria
		CuentaBancaria cuenta1;
		try {
			cuenta1 = new CuentaBancaria(iban, titular);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
			System.out.println("Creando cuenta bancaria por defecto...");
			cuenta1=new CuentaBancaria(CuentaBancaria.IBAN_DEFAULT,CuentaBancaria.TITULAR_DEFAULT);
		}

		System.out.printf("\nMostrando menu de su cuenta bancaria...\n");
		cuenta1.menu(teclado);

	}

}
