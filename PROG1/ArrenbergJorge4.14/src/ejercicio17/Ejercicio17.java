/**
 * Programa que averigua si un numero es primo o no y se detiene cuando se le introduce el 0
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduzca un numero: ");
			num = teclado.nextInt();
			if (num > 0) {
				if (esPrimo(num) == false) {
					System.out.println("El numero no es primo");
				} else {
					System.out.println("El numero es primo");
				}
			}

		} while (num != 0);

		System.out.println("Fin del programa");
		
		teclado.close();
	}

//Averigua si un numero es primo o no
	public static boolean esPrimo(int num) {
		boolean esPrimo=true;
		int i=2;
		while((i<num) && (esPrimo==true)) {
			if(num%i==0) {
				esPrimo=false;
			}
			i++;
		}
		if(num==1) {
			esPrimo=false;
		}
		if (num == 2) {
			esPrimo = true;
		}
		return esPrimo;
	}
}
