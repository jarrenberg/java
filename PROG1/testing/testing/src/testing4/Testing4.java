package testing4;

import java.util.Scanner;

public class Testing4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int dividendo = teclado.nextInt();
		System.out.println("La suma es :" + suma(dividendo));

	}

	public static int suma(int dividendo) {
		int suma = 0;
		int divisor = 10;
		int cociente = 0;
		int resto = 0;

		while (dividendo > 9) {
			if (dividendo > 10) {
				cociente = dividendo / divisor;
				resto = dividendo % divisor;
				dividendo = cociente;
				suma = suma + resto;
			}
			if (dividendo < 9) {
				suma=suma+dividendo;
			}
		}

		return suma;
	}

}