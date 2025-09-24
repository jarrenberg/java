/**
 * Ejercicio sobre la estructura if-else
 * Jorge Arrenberg 08/10/202
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca la edad del usuario:");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		if (edad>=18){
			System.out.println("Introduzca su nombre:");
			String nombre = teclado.nextLine();
			
			System.out.println("Introduzca sus apellidos:");
			String apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " +nombre);
			System.out.println("Apellidos: " +apellidos);
			System.out.println("Edad: " +edad);
			System.out.println("Usted ha sido admitido");
		}else {
			System.out.println("No tiene la edad requerida para realizar estos estudios");
		}
		
	}

}
