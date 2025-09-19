/*
 * Clase main en donde se ponen a prueba los metodos y constructores de las clases humano y ciudadano
 * Jorge Arrenberg 17/02/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		// Crearemos tres objetos, un objeto de la clase Humano y otros dos de la clase
		// Ciudadano. Al crearlos usaremos el constructor para darle valores en la
		// propia creación.
		System.out.printf("Creando un humano ...\n\n");
		Humano humano1;
		try {
			humano1 = new Humano("Jorge", "Arrenberg");
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
			System.out.println("Creando humano por defecto ...");
			humano1 = new Humano();
		} catch (NullPointerException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
			System.out.println("Creando humano por defecto ...");
			humano1 = new Humano();
		}

		System.out.printf("Creando un ciudadano ...\n\n");
		Ciudadano ciudadano1;
		try {
			ciudadano1 = new Ciudadano("Raquel", "Aller", "66666666X");
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
			System.out.println("Creando ciudadano por defecto ...");
			ciudadano1 = new Ciudadano(Ciudadano.NOMBRE_DEFAULT, Ciudadano.APELLIDO_DEFAULT, "12345678A");
		} catch (NullPointerException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
			System.out.println("Creando ciudadano por defecto ...");
			ciudadano1 = new Ciudadano(Ciudadano.NOMBRE_DEFAULT, Ciudadano.APELLIDO_DEFAULT, "12345678A");
		}

		System.out.printf("Creando un ciudadano ...\n\n");
		Ciudadano ciudadano2;
		try {
			ciudadano2 = new Ciudadano("Charles Foster", "Kane", "");
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
			System.out.println("Creando ciudadano por defecto ...");
			ciudadano2 = new Ciudadano(Ciudadano.NOMBRE_DEFAULT, Ciudadano.APELLIDO_DEFAULT, "12345678A");
		} catch (NullPointerException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
			System.out.println("Creando ciudadano por defecto ...");
			ciudadano2 = new Ciudadano(Ciudadano.NOMBRE_DEFAULT, Ciudadano.APELLIDO_DEFAULT, "12345678A");
		}

		// Haremos uso del método nombreCompleto en cada uno de los objetos.
		System.out.printf("\nMostrar las identificaciones de los objetos creados ...\n");
		System.out.println(humano1.getNombreCompleto());
		System.out.println(ciudadano1.getNombreCompleto());
		System.out.println(ciudadano2.getNombreCompleto());

		// Crearemos un objeto de la clase Humano con el constructor sin parámetros y
		// los datos necesarios al usuario y modificaremos los valores de
		// los atributos.
		System.out.printf("\nCreando un humano por defecto ...\n");
		Humano humano2 = new Humano();
		System.out.println(humano2.getNombreCompleto());
		
		System.out.println("Introduzca un nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Introduzca un apellido:");
		String apellido = teclado.nextLine();
		
		try {
			humano2.setNombre(nombre);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (NullPointerException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}
		
		try {
			humano2.setApellido(apellido);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (NullPointerException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}
		
		
		System.out.printf("Humano modificado ...\n");
		System.out.println(humano2.getNombreCompleto());
		
	}

}
