/**
 * Programa donde se crean y se dan valores a objetos de la clase Persona
 * Jorge Arrenberg 8/01/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Declaracion e instanciacion de objetos persona
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();

		// Pedimos los datos de la persona1 al usuario

		System.out.println("Introduzca el dni de la persona1:");
		persona1.dni = teclado.nextLine();

		System.out.println("Introduzca el nombre de la persona1:");
		persona1.nombre = teclado.nextLine();

		System.out.println("Introduzca el apellido de la persona1");
		persona1.apellido = teclado.nextLine();

		System.out.println("Introduzca la edad de la persona1");
		persona1.edad = teclado.nextByte();
		teclado.nextLine();

		// Pedimos los datos de la persona2 al usuario

		System.out.println("Introduzca el dni de la persona2:");
		persona2.dni = teclado.nextLine();

		System.out.println("Introduzca el nombre de la persona2:");
		persona2.nombre = teclado.nextLine();

		System.out.println("Introduzca el apellido de la persona2");
		persona2.apellido = teclado.nextLine();

		System.out.println("Introduzca la edad de la persona2");
		persona2.edad = teclado.nextByte();
		teclado.nextLine();

		// Mostramos el resultado de la persona1

		System.out.printf("%s %s con DNI %s%s\n", persona1.nombre, persona1.apellido, persona1.dni,
				mayorDeEdad(persona1));

		// Mostramos el resultado de la persona2

		System.out.printf("%s %s con DNI %s%s\n", persona2.nombre, persona2.apellido, persona2.dni,
				mayorDeEdad(persona2));

	}

	public static String mayorDeEdad(Persona persona) {
		String mensaje;

		if (persona.edad >= 18) {
			mensaje = "  es mayor de edad";
		} else {
			mensaje = " es menor de edad";
		}
		return mensaje;
	}
}
