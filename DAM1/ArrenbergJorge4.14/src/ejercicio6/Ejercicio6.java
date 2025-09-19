/**
 * Programa que pide unos precios y emplea un metodo para sumarle el iva
 * Jorge Arrenberg 11/11/2024
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int contador=0;
		do {
			System.out.println("Introduzca un precio");
			double precio = teclado.nextDouble();
			while(precio<0) {
				System.out.println("Introduzca un precio vaido");
				precio = teclado.nextDouble();	
			}
			
			//Mostramos el precio total calculado con el metodo
			System.out.println("El precio con IVA del producto es " + precioConIVA(precio)+ "€");
			contador++;
			
		}while (contador<5);
		
		//Mostramos que el programa ha terminado
		System.out.println(" ");
		System.out.println("Fin del programa");
		
		teclado.close();
	}
	// Devuelve el precio tras sumarle un 21% de IVA
	public static double precioConIVA(double precio) { 
		double precioTotal;
		precioTotal=((precio)*(1.21));
		return precioTotal;
	}
}
