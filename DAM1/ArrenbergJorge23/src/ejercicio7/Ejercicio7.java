/**
 * Jorge Arrenberg 19/10/2024
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numAleatorio = (int)(50 *Math.random());
		int num;
		do {
			System.out.println("Introduzca un numero");
			num=teclado.nextInt();
			if(num<numAleatorio) {
				System.out.println("El numero introducido es menor que el que buscas");
			}else if (num>numAleatorio) {
				System.out.println("El numero introducido es mayor que el que buscas");
			}
			
		}while (num!=numAleatorio);
		System.out.println("Felicidades, econtro el numero");
		
	}

}
