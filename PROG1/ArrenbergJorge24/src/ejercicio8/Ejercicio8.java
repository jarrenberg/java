package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, contadorNeg = 0, contadorPos = 0;
		String afirmaNeg = " ";

		do {
			System.out.println("Introduzca un numero:");
			num = teclado.nextInt();

			if (num < 0) {
				contadorNeg = contadorNeg + 1;
			}
			if (num > 0) {
				contadorPos = contadorPos + 1;
			}

		} while (num != 0);

		if (contadorNeg > 0) {
			afirmaNeg = "Si.";
		} else {
			afirmaNeg = "No.";
		}
		System.out.println("¿Se han introducido numeros negativos?: " + afirmaNeg);
		System.out.println("Numero positivos introducidos: " + contadorPos);
		System.out.println("Numero negativos introducidos: " + contadorNeg);


	}

}
