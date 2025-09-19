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
		persona2.setEdad((byte) 70);
		// Mostramos el resultado de la persona1

		persona1.imprime();

		// Mostramos el resultado de la persona2

		persona2.imprime();

		// Usamos el metodo para saber si es mayor de edad
		System.out.printf("¿Es la persona1 mayor de edad?: %b\n", persona1.esMayorEdad());

		// Usamos el metodo para saber si es jubilada
		System.out.printf("¿Es la persona2 jubilada?: %b\n", persona2.esJubilado());
		
		//Usamos el metodo para calcular la diferncia de edad entre ambas personas
		System.out.printf("La diferencia de edad entre ambas personas es: %d.\n",persona1.diferenciaEdad(persona2));

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
