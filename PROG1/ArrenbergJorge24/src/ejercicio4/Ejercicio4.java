package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un numero");
		int n = teclado.nextInt();
		int contador=1;
		
		System.out.println("Los numero de 1 a " +n+ " son:");
		while (contador<=n) {
			System.out.println(contador);
			contador=contador+1;
		}
	}
}
