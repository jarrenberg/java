 package ejercicio2;

import java.io.PrintStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Creando un inventario ...");
		Inventario inventario = new Inventario();
		if (inventario != null) {
			System.out.println("Inventario creado con exito ...");
			System.out.println();
		}
		System.out.println("Creando una mascota de cada tipo ...");

		Perro p1 = null;
		Gato g1 = null;
		Canario c1 = null;
		Loro l1 = null;

		try {
			System.out.println();
			System.out.println("Creando un perro ...");
			p1 = new Perro("Toby", 16, "Vivo", LocalDate.of(2008, 11, 11), false, "Bullterier", 17);
			System.out.println("Perro creado con exito ...");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		}

		try {
			System.out.println();
			System.out.println("Creando un gato ...");
			g1 = new Gato("Peter", 6, "Vivo", LocalDate.of(2007, 12, 11), false, "Persa", false);
			System.out.println("Gato creado con exito ...");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		}

		try {
			System.out.println();
			System.out.println("Creando un canario ...");
			c1 = new Canario("Troy", 2, "Enfermo", LocalDate.of(2016, 05, 07), false, "Fino", true, "Azul", true);
			System.out.println("Canario creado con exito ...");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		}

		try {
			System.out.println();
			System.out.println("Creando un loro ...");
			l1 = new Loro("Mark", 3, "Enfermo", LocalDate.of(2025, 07, 12), true, "Redondo", true, "Africa");
			System.out.println("Loro creado con exito ...");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error.%s\n", ex.getMessage());
		}
		System.out.println();

		System.out.println("Añadiendo los animales al inventario ...");
		inventario.anyadir(p1);
		inventario.anyadir(g1);
		inventario.anyadir(c1);
		inventario.anyadir(l1);
		menu(teclado, inventario);

	}

	public static void menu(Scanner teclado, Inventario inventario) {
		int accion = 1;
		do {
			System.out.println();
			System.out.printf("Menu de la Veterinaria Caneibol\nInserte el numero de la accion que desee realizar:\n");
			System.out.println("1. Mostrar la lista de animales simplificada.");
			System.out.println("2. Mostrar todos los datos de un animal a partir de su nombre.");
			System.out.println("3. Mostrar todos los datos de todos los animales.");
			System.out.println("4. Insertar un animal.");
			System.out.println("5. Eliminar un animal.");
			System.out.println("6. Vaciar el invenario.");
			System.out.println("7. Salir");

			accion = pedirEntero(teclado);

			while (accion < 1 || accion > 7) {
				System.out.println("Numero de accion incorrecto. Vuelve a introducirlo:");
				accion = pedirEntero(teclado);
			}

			if (accion == 1) {
				inventario.mostrarInventarioSimple();
			}
			if (accion == 2) {
				teclado.nextLine(); // Limpiar buffer
				System.out.println("Introduzca el nombre del animal:");
				String nombre = teclado.nextLine();
				inventario.mostrarInfoNombre(nombre);
			}
			if (accion == 3) {
				inventario.mostrarInventarioCompleto();
			}
			if (accion == 4) {
				
			}
			if (accion == 5) {
				System.out.println("Eliminando un animal ...");
				inventario.eliminar();

			}
			if (accion == 6) {
				System.out.println("Vaciando el inventario de animales ...");
				inventario.vaciar();

			}
			if (accion == 7) {
				System.out.println("Saliendo ...");
			}

		} while (accion != 7);
	}

	public static int pedirEntero(Scanner tecla) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				numero = tecla.nextInt();
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caractere
															// invalidos
				correcto = false;
				System.out.printf("Te has equivocado. Por favor, ingresa un número valido\n");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

}
