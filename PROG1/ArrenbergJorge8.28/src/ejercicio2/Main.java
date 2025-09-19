package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		LinkedList<Contacto> agenda = null;
		// Añadimos objetos precargados desde un archivo
		System.out.println("Cargando objetos precargados ...");
		try {
			agenda = anyadirContactosDesdeArchivo("agenda.txt");
		} catch (FileNotFoundException e) {
			System.out.printf("Error. %s\n", e.getMessage());
		}

		// Añadimos objetos precargados creados por mi mismo
		System.out.println();
		try {
			Contacto a1 = new Contacto("Marcos", "C/Cnbl", "622024489", "crr@g.educaands.es", LocalDate.now(),
					anyadirListaLlamadasDesdeArchivo("llamadas.txt"));
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s", ex.getMessage());
			System.out.println();
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.printf("Error. %s", e.getMessage());
			System.out.println();
		}

		try {
			Contacto a2 = new Contacto("Carlos", "C/prueba", "45", "crl@g.educaands.es", LocalDate.now().minusMonths(2),
					anyadirListaLlamadasDesdeArchivo("llamadas.txt"));
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s", ex.getMessage());
			System.out.println();
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.printf("Error. %s", e.getMessage());
			System.out.println();
		}

		try {
			Contacto a3 = new Contacto("Marcos", "C/java", "622024487", "mrc@g.educaands.es",
					LocalDate.now().minusYears(4), anyadirListaLlamadasDesdeArchivo("llamadas.txt"));
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s", ex.getMessage());
			System.out.println();
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.printf("Error. %s", e.getMessage());
			System.out.println();
		}

		try {
			Contacto a4 = new Contacto("Jorge", "C/python", "952601208", "jrg@g.educaands.es", LocalDate.now(),
					anyadirListaLlamadasDesdeArchivo("llamadas.txt"));
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s", ex.getMessage());
			System.out.println();
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.printf("Error. %s", e.getMessage());
			System.out.println();
		}

		try {
			Contacto a5 = new Contacto("María", "C/pomodoro", "856123456", "mra@g.educaands.es",
					LocalDate.now().minusWeeks(5), anyadirListaLlamadasDesdeArchivo("llamadas.txt"));
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s", ex.getMessage());
			System.out.println();
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.printf("Error. %s", e.getMessage());
			System.out.println();
		}
		System.out.println(agenda.toString());

		// Empleamos el metodo menu
		menu(teclado, agenda);
		System.out.println("Saliendo ...");

	}

	// Menu que nos permite interactuar y realizar acciones
	public static void menu(Scanner teclado, LinkedList<Contacto> agenda) {
		int accion = 0;
		do {
			System.out.println("MENU:");
			System.out.println("1. Ingresar datos");
			System.out.println("2. Consultar un nombre y mostrar todos sus datos");
			System.out.println("3. Mostrar todos los datos de la agenda ordenados por nombre");
			System.out.println("4. Mostrar aquellos contactos que tienen la fecha de nacimiento introducida ");
			System.out.println("5. Salir");
			System.out.println("Introduzca la accion a realizar:");
			accion = pedirEnteroRango(teclado, 5, 1);
			teclado.nextLine();
			switch (accion) {
			case 1:
				System.out.println("Introduzca un nombre:");
				String nombre = null;
				try {
					nombre = teclado.nextLine();
				} catch (NoSuchElementException ex) {
					System.out.printf("Error. %s", ex.getMessage());
				} catch (IllegalStateException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
				}

				System.out.println("Introduzca una direccion:");
				String direccion = null;
				try {
					direccion = teclado.nextLine();
				} catch (NoSuchElementException ex) {
					System.out.printf("Error. %s", ex.getMessage());
				} catch (IllegalStateException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
				}

				System.out.println("Introduzca un telefono:");
				String telefono = null;
				try {
					telefono = teclado.nextLine();
				} catch (NoSuchElementException ex) {
					System.out.printf("Error. %s", ex.getMessage());
				} catch (IllegalStateException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
				}

				System.out.println("Introduzca un email:");
				String email = null;
				try {
					email = teclado.nextLine();
				} catch (NoSuchElementException ex) {
					System.out.printf("Error. %s", ex.getMessage());
				} catch (IllegalStateException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
				}

				System.out.println("Introduzca su fecha de nacimiento (YYYY-MM-DD):");
				String fecha = teclado.nextLine();
				LocalDate f;
				try {
					f = LocalDate.parse(fecha);
				} catch (DateTimeParseException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
					System.out.println("Utilizando fecha por defecto ...");
					f = LocalDate.of(2000, 01, 01);
				}

				try {
					Contacto a = new Contacto(nombre, direccion, telefono, email, f,
							anyadirListaLlamadasDesdeArchivo("llamadas.txt"));
					System.out.println("Contacto creado ...");
				} catch (NullPointerException ex) {
					System.out.printf("Error. %s", ex.getMessage());
					System.out.println();
				} catch (IllegalArgumentException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
					System.out.println();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.printf("Error. %s", e.getMessage());
					System.out.println();
				}
				break;

			case 2:
				System.out.println("Introduzca un nombre:");
				nombre = teclado.nextLine();
				int c = 0;
				for (Contacto n : agenda) {
					if (n.getNombre().matches(nombre)) {
						c++;
						System.out.println(n.toString());
					}
				}
				if (c == 0) {
					System.out.println("No existe nadie con ese nombre");
					System.out.println();
				}
				break;
			case 3:
				LinkedList<Contacto> a = agenda;
				Collections.sort(a);
				System.out.println(a.toString());
				break;
			case 4:
				System.out.println("Introduzca una fecha de nacimiento:");
				fecha = teclado.nextLine();
				LocalDate fechaUser = null;
				try {
					fechaUser = LocalDate.parse(fecha);
				} catch (DateTimeParseException ex) {
					System.out.printf("Error. %s", ex.getMessage());
				}
				for (Contacto n : agenda) {
					if (n.getFechaNacimiento().equals(fechaUser)) {
						System.out.println(n.toString());
					}
				}
				break;

			}

		} while (accion != 5);
	}

	public static ArrayList<Llamadas> anyadirListaLlamadasDesdeArchivo(String localizacion)
			throws FileNotFoundException {
		ArrayList<Llamadas> resultado = new ArrayList<>();
		File f = new File(localizacion);
		Scanner sc;
		String[] contenedor;
		String nombre, direccion, telefono, email, fechaNacimiento;
		int dia, mes, anyo;
		try {
			sc = new Scanner(f);
			while (sc.hasNext()) {
				String cadena = sc.nextLine();
				contenedor = cadena.split(";");

				try {
					resultado.add(new Llamadas(contenedor[0], LocalDateTime.parse(contenedor[1]),
							Integer.parseInt(contenedor[2])));
				} catch (IllegalArgumentException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
				} catch (NullPointerException ex1) {
					System.out.printf("Error. %s\n", ex1.getMessage());
				}
			}
			sc.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		return resultado;
	}

	// Añade los contactos en la localización pasada como parametro
	public static LinkedList<Contacto> anyadirContactosDesdeArchivo(String localizacion) throws FileNotFoundException {
		LinkedList<Contacto> agenda = new LinkedList<Contacto>();
		File f = new File(localizacion);
		Scanner sc;
		String[] contenedor;
		String nombre, direccion, telefono, email, fechaNacimiento;
		int dia, mes, anyo;
		try {
			sc = new Scanner(f);
			while (sc.hasNext()) {
				String cadena = sc.nextLine();
				contenedor = cadena.split(";");
				nombre = contenedor[0];
				direccion = contenedor[1];
				telefono = contenedor[2];
				email = contenedor[3];
				fechaNacimiento = contenedor[4];
				contenedor = fechaNacimiento.split("-");
				dia = Integer.parseInt(contenedor[0]);
				mes = Integer.parseInt(contenedor[1]);
				anyo = Integer.parseInt(contenedor[2]);
				try {
					agenda.add(new Contacto(nombre, direccion, telefono, email, LocalDate.of(anyo, mes, dia),anyadirListaLlamadasDesdeArchivo("llamadas.txt")));
				} catch (IllegalArgumentException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
				} catch (NullPointerException ex1) {
					System.out.printf("Error. %s\n", ex1.getMessage());
				}
			}
			sc.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		return agenda;
	}

	// Devuelve un entero dentro de un rango especificado
	public static int pedirEnteroRango(Scanner tecla, int max, int min) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				numero = tecla.nextInt();
				while (numero < min || numero > max) {
					System.out.printf("Introduzca un numero dentro del rango especificado (%d - %d)\n", min, max);
					numero = tecla.nextInt();
				}
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.printf(
						"Te has equivocado. Por favor, ingresa un número dentro del rango especificado (%d - %d)\n",
						min, max);
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

}
