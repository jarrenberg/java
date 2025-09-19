/**
 * Programa que muestra las tablas de multiplicar del 1 al 10 y luego muestra una tabla de multiplicar que el usuario introduzca
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Mostramos las tablas de multiplicar del 1 al 10
		
		tablasMultiplicar1a10();
		
		//Pedimos al usuario que tabla de multiplicar le interesa ver
		
		System.out.println("Introduzca un numero para saber su tabla de multiplicar:");
		int num = teclado.nextInt();
		
		//Mostramos la tabla de multiplicar del numero intoducido por el usuario
		tablaMultiplicar(num);
		
		teclado.close();
	}

//Muestra las tablas de multiplicar del 1 al 10
	public static void tablasMultiplicar1a10() {
		int contador = 1, multiplo;
		for (int i = 1; i < 11; i++) {
			System.out.println("Tabla de multiplicar del " +i);
			System.out.println("");
			contador=1;
			do {
				multiplo = contador * i;
				System.out.println(i + "x" + contador + " = " + multiplo);
				contador++;
			} while (contador <= 10);
			System.out.println("");
		}
	}
	//Muestra la tabla de multiplicar de un numero introducido por le usuario
	public static void tablaMultiplicar(int num) {
		int contador=1, multiplo;
		while(contador<=10) {
			multiplo = contador*num;
			System.out.println(num+"x"+contador+ " = " +multiplo);
			contador++;
		}
	}
}