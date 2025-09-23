/**
 * Programa donde se introduce una cadena de caracteres y se contabilizan el numero de cada vocal
 * Jorge Arrenberg 10/11/2024
 */

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char  caracter;
		//Creamos los contadores de las letras
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		//Pedimos al usuario que introduzca una cadena de caracteres
		
		System.out.println("Introduzca una cadena de caracteres:");
		String cadena = teclado.nextLine();
		
		//Calculamos la longitud de la cadena
		
		int longitud = cadena.length();

		//Analizamos letra por letra la cadena de caracteres y comprobamos si cumple las condiciones
		
		for (int i = 0; i < longitud; i++) {
			String subcad = cadena.substring(i);
			subcad=subcad.toLowerCase();
			caracter = subcad.charAt(0);
			if(caracter=='a') {
				contadorA=contadorA+1;
			}
			if(caracter=='e') {
				contadorE=contadorE+1;
			}
			if(caracter=='i') {
				contadorI=contadorI+1;
			}
			if(caracter=='o') {
				contadorO=contadorO+1;
			}
			if(caracter=='u') {
				contadorU=contadorU+1;
			}
		}
		
		//Mostramos el resultado
		
		System.out.println("Contador A: " +contadorA);
		System.out.println("Contador E: " +contadorE);
		System.out.println("Contador I: " +contadorI);
		System.out.println("Contador O: " +contadorO);
		System.out.println("Contador U: " +contadorU);
	}
}
