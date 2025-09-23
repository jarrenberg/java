/**
 * Ejercicio para emplear metodos ceil, floor y round de Math
 * Jorge Arrenberg Andrade 4/10/2024
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca un número:");
		double valor = teclado.nextDouble();
		
		 System.out.println("La función Math.ceil de " +valor+ " es "+Math.ceil(valor)+", y lo que hace esta funcion es redondear al alza");
		 System.out.println("La función Math.floor de " +valor+ " es "+Math.floor(valor)+", y lo que hace esta funcion es redondear a la baja");
		 System.out.println("La función Math.round de " +valor+ " es "+Math.round(valor)+", y lo que hace esta funcion es redondear  del 0.5 al 0.9 al alza y del 0.1 a 0.4 la baja ");
	}

}
