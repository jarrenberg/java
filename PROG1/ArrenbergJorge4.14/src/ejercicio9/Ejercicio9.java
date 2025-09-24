/**
 * Programa que pide tres valores enteros y nos devuelve el mas pequeño
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos los datos al usuario

		System.out.println("Introduzca un numero:");
		int num1 = teclado.nextInt();

		System.out.println("Introduzca otro numero:");
		int num2 = teclado.nextInt();

		System.out.println("Introduzca otro numero:");
		int num3 = teclado.nextInt();
		
		//Utilizamos el metodo para averiguar el num menor
		int contenedorMenor = numMenor(num1, num2);
		numMenor(contenedorMenor, num3);
		
		System.out.println("El numero más pequeño de los introducidos es: "+numMenor(contenedorMenor,num3));
		
		teclado.close();
	}
//Devuelve el numero menor
public static int numMenor(int num1, int num2) {
	int numMenor;
	if(num1<num2) {
		numMenor=num1;
	}else {
		numMenor=num2;
	}
	return numMenor;
}
}
