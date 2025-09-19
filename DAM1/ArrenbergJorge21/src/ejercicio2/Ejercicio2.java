/**
 * Ejercicio sobre la estructura if-else
 * Jorge Arrenberg 08/10/202
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el nombre del usuario:");
		String nombre = teclado.nextLine();

		System.out.println("Introduzca la edad del usuario:");
		int edad = teclado.nextInt();

		System.out.println("Introduzca la nota del usuario:");
		double nota = teclado.nextDouble();

		if ((edad >= 18) && (nota > 7) && (nota <=10)) {
			System.out.println(nombre+", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		}else {
			System.out.println(nombre+", lo sentimos, usted no ha sido admitido en el curso ya que cumple las condiciones requeridas.");
		}
		
	}

}
