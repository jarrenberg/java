package cadenadecaracteres;

import java.util.Scanner;

public class EdadEntero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cual es tu edad en numeros enteros?");
		int edad = teclado.nextInt();
		System.out.println("Su edad es " +edad);

	}
}