/**
 * Ejercicio sobre usar una variable contenedor
 * Jorge Arrenberg Andrade 4/10/2024
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca un número que se llamará NUM1");
		double num1 = teclado.nextDouble();
		
		System.out.println("Introduzca otro número que se llamará NUM2");
		double num2 = teclado.nextDouble();
		
		double recipiente;
		
		recipiente = num2;
		num2=num1;
		num1 = recipiente;
		
		System.out.println("Ahora el NUM1 es " +num1+ " y el NUM2 es " +num2);
		
		
	}

}
