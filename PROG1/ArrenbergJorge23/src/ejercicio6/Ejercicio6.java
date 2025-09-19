/**
 * Programa de practica para practicar do-while con
 * condiciones para que cuando un numero sea menor que 0
 * finalize el programa
 * Jorge Arrenberg 16/10/2024
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduzca un numero. El programa se abortara si se introduce un numero negativo");
			 num = teclado.nextInt();
			 if (num<0) {
				 System.out.println("El numero introducido es negativo. Abortando programa");
			 }else {
				 System.out.println(Math.pow(num,2));
			 }
		}while(num>=0);

	}

}
