/**
 * Programa donde se crean y se dan valores a objetos de la clase Persona
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Declaracion e instanciacion de objetos persona con el constructor que hemos creado
		Persona persona1 = new Persona("77773198D","Jorge","Arrenberg",(byte) 22);
		Persona persona2 = new Persona("66666666X","Juan","Benitez",(byte)17);

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
