/**
 * Programa que emplea un metodo para calcular la multiplicacion
 * Jorge Arrenberg 11/11/2024
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos los operandos
		
		System.out.println("Introduzca un numero real");
		double a = teclado.nextDouble();

		System.out.println("Introduzca otro numero real");
		double b = teclado.nextDouble();
		
		//Mostramos el resultado de la multiplicacion
		
		System.out.println("El resultado de la multiplicacion es: " + multiplica(a,b));
		teclado.close();

	}
	
	//metodo para calcular la multiplicacion
	public static double multiplica(double a, double b) {
		double resultado=0;
		resultado = a*b;
		return resultado;
	}
}