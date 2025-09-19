package ejercicio5;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Creando una clase de 20 alumnos
		System.out.println("Creando una clase de 20 alumnos ...");
		LinkedList<Alumno> clase = generarAlumnos(20);
		System.out.println(clase.toString());
		System.out.println();

		// Añadiendo 1 alumno a la clase
		System.out.println("Añadiendo 1 alumno a la clase");
		try {
			if (Alumno.anyadirAlumno(new Alumno("123", "Arrenberg", "Jorge", "C/CNBL", "666666666", "321", 10,
					LocalDate.of(2024, 9, 16)), clase)) {
				System.out.println("Alumno añadido con exito");
			} else {
				System.out.println("No se ha podido añadir al alumno");
			}
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.println();

		// Añadiendo 1 alumno nulo a la clase
		System.out.println("Añadiendo 1 alumno nulo a la clase");
		try {
			if (Alumno.anyadirAlumno(null, clase)) {
				System.out.println("Alumno añadido con exito");
			} else {
				System.out.println("No se ha podido añadir al alumno");
			}
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.println();

		// Mostrando por pantalla la informacion de un alumno a partir de su codigo
		System.out.println("Mostrando por pantalla la informacion de un alumno a partir de su codigo ...");
		System.out.println("Introduzca el codigo:");
		String codigo = teclado.nextLine();
		try {
			System.out.println(Alumno.informacionAlumno(codigo, clase));
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Dar de baja a un alumno a partir de su nombre y apellidos
		System.out.println("Dar de baja a un alumno a partir de su nombre y apellidos ...");
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Introduzca su apellido");
		String apellido = teclado.nextLine();
		try {
			Alumno.darDeBaja(nombre, apellido, clase);
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		System.out.println(clase.toString());
		System.out.println();

		// Modificar el ciclo del alumno segun su codigo de ciclo
		System.out.println("Modificar el ciclo del alumno segun su codigo de ciclo");
		Alumno a = clase.getLast();
		System.out.println("Introduzca el codigo del nuevo ciclo:");
		String codCiclo = teclado.nextLine();
		a.cambiarCurso(codCiclo);
		System.out.println(a.toString());
		// Modificar la dirección y/o teléfono de un alumno, dado su código de alumno

		System.out.println("Modificar la dirección y/o teléfono de un alumno, dado su código de alumno");
		System.out.println("Introduzca el codigo:");
		do {
			codigo = teclado.nextLine();
		} while (codigo == null);
		try {
			Alumno.modificarDireccionTelefono(codigo, teclado, clase);
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
	}

	public static LinkedList<Alumno> generarAlumnos(int cantidad) {
		LinkedList<Alumno> resultado = new LinkedList<Alumno>();
		for (int i = 0; i < cantidad; i++) {
			try {
				resultado.add(new Alumno(String.format("Codigo %d", (i + 1)), String.format("Apellidos %d", (i + 1)),
						String.format("Nombre %d", (i + 1)), String.format("Direccion %d", (i + 1)),
						String.format("Telefono %d", (i + 1)), String.format("Codigo Ciclo %d", (i + 1)), (i + 1),
						LocalDate.now().minusYears(1)));
			} catch (NullPointerException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			} catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}
		}
		return resultado;
	}
}
