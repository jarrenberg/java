package condicional;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int numero = teclado.nextInt();
		
		if (numero<0) {
			if (numero%2==0) {
				System.out.println("El número es negativo y par");
			}else {
					System.out.println("El número introducido es negativo e impar");
			}
		}else {
			if (numero%2==0) {
				System.out.println("El número es positivo y par");
			}else {
				System.out.println("El número es positivo e impar");
			}
		}		
	}
}

