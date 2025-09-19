/*
 * Programa para practicar la entrada de datos en Java
 * Jorge Arrenberg 01/10/2024
 */

package jEntradadeDatos;

import java.util.Scanner;

public class JEdD {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.nextLine();
		
		
		System.out.println("¿Cuantos años tienes?");
		int edad = teclado.nextInt();
		
		System.out.println("¿Cuanto pesas?");
		double peso = teclado.nextDouble();
		
		teclado.nextLine();
		System.out.println("¿Donde vives?");
		String localidad = teclado.nextLine();
		
		System.out.println("Usted se llama " +nombre+", tiene " +edad+ " años, pesa " +peso+ " kg y vive en " +localidad+ ".");
	}

}

