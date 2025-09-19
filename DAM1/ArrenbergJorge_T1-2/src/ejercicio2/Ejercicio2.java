/**
 * Programa que calucla los 5 primeros divisores de numeros entre 1 y 50 mientras no se introduzca un 0
 * jorge arrenberg 26/11/2024
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int dividendo1 = 1;
		int dividendo2 = 1;
		int contador1 = 1;
		int contador2 = 1;
		int cociente1;
		int cociente2;
		do {
			
			//Pedimso datos al usario
			System.out.println("Introduzca un numero entre 1 y 50");
			num1 = teclado.nextInt();
			while (num1 < 0 || num1 > 50) {//verificamos la entrada de datso
				System.out.println("Vuelva a introducir un numero");
				num1 = teclado.nextInt();
			}

			System.out.println("Introduzca otro numero entre 1 y 50");
			num2 = teclado.nextInt();
			while (num2 < 0 || num2 > 50) {//verificamos la entrada de datso
				System.out.println("Vuelva a introducir un numero");
				num2 = teclado.nextInt();
				
				
				
			}
			if (num1>0&&num2>0) {
				System.out.println("");
				System.out.println("Los numeros mulitpolos de " + num1+" son");
				dividendo1=1;
				contador1=1;
			do {
				cociente1 = num1 % dividendo1;
				if (cociente1 == 0) {
					System.out.print(dividendo1 + " ");
					contador1 = contador1 + 1;
				}
				dividendo1 = dividendo1 + 1;

			} while ((dividendo1 <= num1) && (contador1 <= 5));
			
			System.out.println("");
			System.out.println("Los numeros mulitpolos de " + num2+" son");
			
			dividendo2=1;
			contador2=1;
			do {
				cociente2 = num2 % dividendo2;
				if (cociente2 == 0) {
					System.out.print(dividendo2 + " ");
					contador2 = contador2 + 1;
				}
				dividendo2 = dividendo2 + 1;

			} while ((dividendo2 <= num2) && (contador2 <= 5));
			}
			System.out.println("");
			System.out.println("");

		} while (num1 != 0 || num2 != 0);
		System.out.println("Fin del programa");

	}

}
