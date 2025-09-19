/**
 * Ejercicio sobre la estructura if
 * Jorge Arrenberg 08/10/202
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca un número");
		double num1 = teclado.nextDouble();
		
		System.out.println("Introduzca otro número");
		double num2 = teclado.nextDouble();
		
		if(num1==num2) {
			System.out.println("Los números son el mismo");
		}
		if(num1<num2) {
			System.out.println("El primer número introducido es menor que el segundo");
		}
		if(num1>num2) {
		System.out.println("El primer número introducido es mayor que el segundo");
		}
	}	

}
