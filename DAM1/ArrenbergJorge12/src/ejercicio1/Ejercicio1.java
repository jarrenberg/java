package ejercicio1;
/*
 * Practica de entrada de datos por teclado y mostrarlos
 * Jorge Arrenberg 03/01/2024
 */

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.nextLine();
		
		System.out.println("¿Cómo te apellidas?");
		String apellidos = teclado.nextLine();
		
		System.out.println("¿Cuantos años tienes?");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("¿Donde vives?");
		String direccion = teclado.nextLine();
		
		System.out.println("¿Cuanto mides en cm?");
		float altura = teclado.nextFloat();
		
		System.out.println("¿Cuanto pesas?");
		float peso = teclado.nextFloat();
		
		System.out.println("Usted se llama " +nombre);
		System.out.println("Usted se apellida " +apellidos);
		System.out.println("Usted tiene " +edad+ " años");
		System.out.println("Usted vive en " +direccion);
		System.out.println("Usted mide " +altura+ "cm");
		System.out.println("Usted pesa " +peso+ "kg");
	}

}
