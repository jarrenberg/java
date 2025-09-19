/**
 * ejercicio sobre condicionales if-else anidados
 * Jorge Arrenberg 14/10/2024
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca su nombre");
		String nombre = teclado.nextLine();

		System.out.println("Introduzca sus apellidos");
		String apellidos = teclado.nextLine();

		System.out.println("Introduzca su edad");
		int edad = teclado.nextInt();

		System.out.println("Introduzca su salario deseado");
		int salario = teclado.nextInt();

		if (salario > 30000 || edad > 45 || edad < 16) {
			System.out.println("Lo sentimos"+nombre+" "+apellidos+", pero no cumple con nuestro perfil");
		} else {
			System.out.println("Años de experiencia");
			int exp = teclado.nextInt();

			System.out.println("Nº de proyectos trabajados anteriormente");
			int projects = teclado.nextInt();
			if (exp >= 2 && projects > 3) {
				if(exp > 5 || projects > 5){
					System.out.println("Enhorabuena "+nombre+" "+apellidos+", usted ha sido contratado con un salario de 30.000€");
				}else {
					System.out.println("Enhorabuena "+nombre+" "+apellidos+", ha sido contratado con un salario de 25.000€");
				}
			} else {
				System.out.println("Lo sentimos "+nombre+" "+apellidos+", pero no cumple los requisitos");
			}

		}

	}
}
