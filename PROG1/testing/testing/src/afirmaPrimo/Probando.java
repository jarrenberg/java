package afirmaPrimo;

import java.util.Scanner;

public class Probando {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int afirmaPrimo = 1, contenedor = 1;

		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		while (num < 0) {
			System.out.println("El numero debe ser positivo introduzcalo de nuevo");
			num = teclado.nextInt();
		}

		System.out.println("Introduzca otro numero");
		int num2 = teclado.nextInt();
		
		while (num2 < num ||num2<0) {
			System.out.println("El segundo numero debe ser mayor al primero y positivo, introduzcalo de nuevo");
			num2 = teclado.nextInt();
		}
		
		for (int j = num; j <= num2; j++) {
			afirmaPrimo = 1;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					afirmaPrimo = 0;
				}
			}
			if (afirmaPrimo == 1) {
				System.out.println("El numero "+j+ " es primo.");
			} else {
				System.out.println("El numero "+j+ " no es primo.");
			}
		}
		}
}
