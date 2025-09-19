/**
 * Programa que pide un numero y muestra su tabla de multipicar
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos un numero al usuario
		
		System.out.println("Introduzca un numero: ");
		int num = teclado.nextInt();
		
		//Mostramos la tabla de multiplicar
		
		System.out.println("La tabla del " +num+ " es:");
		tablaMultiplicar(num);
		
		teclado.close();
	}
	//Calcula y devuelve la tabla de multiplicar del numero
	public static void tablaMultiplicar(int num) {
		int contador=1, multiplo;
		while(contador<=10) {
			multiplo = contador*num;
			System.out.println(num+"x"+contador+ " = " +multiplo);
			contador++;
		}
	}
}
