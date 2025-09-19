package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número X");
		double x = teclado.nextDouble();

		System.out.println("Introduzca un número Y");
		double y = teclado.nextDouble();

		System.out.println("Introduzca un número Z");
		double z = teclado.nextDouble();

		double operacion_1 = (x / 3) + 8;
		double operacion_2 = ((Math.pow(x, 2))/Math.pow(y, 2))+(Math.pow(y, 2)/Math.pow(z, 2));
		double operacion_3 = ((Math.pow(x, 2) + (3*x*y) +Math.pow(y, 2))/(1/Math.pow(x, 2)));

		System.out.println("El resultado de la operacion 1 es: " + operacion_1);
		System.out.println("El resultado de la operacion 2 es: " + operacion_2);
		System.out.println("El resultado de la operacion 3 es: " + operacion_3);

	}

}
