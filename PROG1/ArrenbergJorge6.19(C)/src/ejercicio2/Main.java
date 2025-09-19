/*
 * Programa donde se crean y se dan valores a objetos de la clase Persona
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Declaracion e instanciacion de objetos persona con el constructor que hemos
		// creado
		Persona persona1 = new Persona("77773198D", "Jorge", "Arrenberg", (byte) 22);
		Persona persona2 = new Persona("66666666X", "Juan", "Benitez", (byte) 17);
		persona1.setNombre("Paco");
		persona2.setApellidos("Locura");
		persona1.setDni("78479541G");
		persona2.setEdad((byte)23);
		// Mostramos el resultado de la persona1

		System.out.printf("%s %s con DNI %s%s\n", persona1.getNombre(), persona1.getApellidos(), persona1.getDni(),
				mayorDeEdad(persona1));

		// Mostramos el resultado de la persona2

		System.out.printf("%s %s con DNI %s%s\n", persona2.getNombre(), persona2.getApellidos(), persona2.getDni(),
				mayorDeEdad(persona2));

	}

	public static String mayorDeEdad(Persona persona) {
		String mensaje;

		if (persona.getEdad() >= 18) {
			mensaje = "  es mayor de edad";
		} else {
			mensaje = " es menor de edad";
		}
		return mensaje;
	}
}
