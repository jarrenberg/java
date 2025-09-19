
/**
 * Ejercicio sobre emplear metodos de Math
 * Jorge Arrenberg Andrade 8/10/2024
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	
		System.out.println("Introduzca un numero (NUM1):");
		double num1 = teclado.nextDouble();
		
		System.out.println("Introduzca otro numero distinto (NUM2):");
		double num2 = teclado.nextDouble();
		
		String mayor;
		mayor= (num1<num2)? num1+" es menor que "+num2 : num2+" es menor que "+num1;
		
		double potencia = Math.pow(num1, num2);
		
		double raizcuadrada = Math.sqrt(num1);
		
		double aleatorio = Math.random()*num2;
		
		System.out.println(mayor);
		System.out.println("El NUM1 elevado al NUM2 es: "+potencia);
		System.out.println("La raiz cuadrada de NUM1 es: "+raizcuadrada);
		System.out.println("Un numero aleatorio  es: "+aleatorio);
		
	}

}
