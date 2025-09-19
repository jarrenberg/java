/**
 * Programa que emplea un metodo para mostrar el numero menor entre dos numeros introducidos por teclado
 * Jorge Arrenberg 11/11/2024
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Pedimios los numeros
		
		System.out.println("Introduzca un numero:");
		int num1 = teclado.nextInt();

		System.out.println("Introduzca otro numero:");
		int num2 = teclado.nextInt();
		
		//Mostramos el numero mas pequeño
		
		System.out.println("El numero mas pequeño es " + minimo(num1,num2));
		
		teclado.close();

	}
	 // Devuelve el menor entre num1 y num2
	public static int minimo(int num1, int num2) {
		int minimo=0;
		if(num1<num2) {
			minimo=num1;
		}
		if(num1>num2) {
			minimo=num2;
		}
		if (num1==num2) {
			minimo=num2;
		}
		return minimo;
	}
}
