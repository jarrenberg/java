/**
 * Ejercicio sobre hacer un cambio de valor monetario
 * Jorge Arrenberg Andrade 4/10/2024
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduzca la cantidad en pesetas");
	double cantPtas= teclado.nextDouble() ;
	
	double cambioPtas= (cantPtas/166.836);
	
	System.out.println(cantPtas+ "pesteas equivalen a " +cambioPtas+ "€.");
	
	
	System.out.println("Introduzca la cantidad de Euros");
	double cantEuros= teclado.nextDouble() ;
	
	double cambioEuros= (cantEuros*166.836);
	
	System.out.println(cantEuros+ "€ equivalen a " +cambioEuros+ "Ptas.");
	}

}
