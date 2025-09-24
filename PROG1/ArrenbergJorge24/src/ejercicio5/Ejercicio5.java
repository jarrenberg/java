package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		int num = teclado.nextInt();
		int contador = 1;
		int resultado = 1;
		int almacen = 1;

		while (num > contador) {
			almacen = resultado * num;
			resultado = almacen;
			num = num - 1;

		}
		System.out.println("El factorial de " + num + " es: " + resultado);
	}
}
