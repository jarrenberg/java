/**
 * Programa que pide un numero y calcula el sumatorio, el productorio, y el valor intermedio entre 1 y el numero introducido
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos el numero al usuario
		
		System.out.println("Introduzca un numero entero:");
		int num = teclado.nextInt();
		
		//Mostramos los resultados llamando a los metodos
		
		System.out.println("El sumatorio de numeros desde 1 hasta " +num+ " es: " + suma1aN(num));
		
		System.out.println("El factorial de numeros desde 1 hasta " +num+ " es: " + producto1aN(num));
		
		System.out.println("El numero entre 1 y " +num+ " es: " +intermedio1aN(num));
		
		teclado.close();
	}
	// Devuelve la suma de enteros de 1 a num
	public static int suma1aN(int num) {
		int contenedor=0;
		for(int i = 1; i<=num;i++) {
			contenedor=contenedor+i;
		}
		return contenedor;
	}
	
	// Devuelve el producto de enteros de 1 a num
	public static int producto1aN(int num) {
		int contenedor=1;
		for(int i = 1; i<=num;i++) {
			contenedor=contenedor*i;
		}
		return contenedor;
		
		
	}
	
	// Devuelve el valor intermedio entre 1 y num
	public static double intermedio1aN(int num) {
		double numMedio;
		double numero = (double) num;
		numMedio = ((1+numero)/2);
		return numMedio;
		
	}
}
