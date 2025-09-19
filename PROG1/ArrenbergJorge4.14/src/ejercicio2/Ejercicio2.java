/**
 * Programa que emplea un metodo para verificar si se es mayor de edad
 * Jorge Arrenberg 11/11/2024
 */


package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Pedimos la edad al usuario
		
		System.out.println("Introduzca su edad:");
		byte edad = teclado.nextByte();
		
		//Mostramos si es o no mayor de edad
		
		if(esMayorEdad(edad)==true) {
			System.out.println("Usted es mayor de edad");
		}else {
			System.out.println("Usted no es mayor de edad");
		}
		teclado.close();
	}
	
	 // Devuelve verdadero si a>=18, falso en caso contrario
	public static boolean esMayorEdad(int edad) { 
		boolean verificador;
		if(edad>=18) {
			verificador=true;
		}else {
			verificador=false;
		}
		return verificador;
	}

}
