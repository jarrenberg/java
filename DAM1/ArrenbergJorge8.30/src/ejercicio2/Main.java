package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import ejercicio1.Alumno;
import ejercicio1.ComparadorAlumno;

public class Main {

	public static void main(String[] args) {
		File f = new File("notas1.txt");
		File f1 = new File("notasPorGrupoYNombreLS.txt");
		File f2 = new File("notas2.txt");
		File f3 = new File("LinkedList7.txt");
		/*
		 * 1. Importa la información contenida en el documento notas1.txt, donde la
		 * información tiene el siguiente formato:
		 */
		System.out.println("1. Importa la información contenida en el documento notas1.txt");
		LinkedList<Alumno> clase = new LinkedList<Alumno>();

		// Lectura del primer archivo
		try (Scanner sc = new Scanner(f)) {
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String[] parametros = linea.split(";");
				clase.add(new Alumno(parametros[0], parametros[1], Integer.parseInt(parametros[2]),
						Integer.parseInt(parametros[3]), Integer.parseInt(parametros[4]),
						Integer.parseInt(parametros[5]), Integer.parseInt(parametros[6])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error. No se ha encontrado el archivo notas1.txt");
		}

		/* 2. Muestra el número de registros que contiene. */
		System.out.printf("\n2. Muestra el número de registros que contiene.\n");
		System.out.println(clase.size());
		System.out.println();

		/* 3. Ordena los registros por grupo y nombre. */
		System.out.println("3. Ordena los registros por grupo y nombre");
		LinkedList<Alumno> claseOrdenada = new LinkedList<Alumno>(clase);
		Collections.sort(claseOrdenada, new ComparadorAlumno());
		System.out.println("Guardamos la lista ordenada en: notasPorGrupoYNombreLS.txt");
		try (FileWriter writer = new FileWriter(f1)) {
			for (Alumno a : claseOrdenada) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/* 4. Añade el registro abajo indicado en la mitad de la lista. */
		System.out.println("4. Añade el registro abajo indicado en la mitad de la lista.");
		System.out.println("1º ESO A;Plaza Gallego, Juan;1;1;3;1;1");
		Alumno a1 = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1);
		clase.add((clase.size() / 2), a1);
		System.out.printf("Posicion del registro: %d\nNúmero de registros: %d\n\n", (clase.size() / 2), clase.size());

		/* 5. Añade el mismo registro al principio de la lista */
		System.out.println("5. Añade el mismo registro al principio de la lista");
		Alumno a2 = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1);
		clase.add(0, a2);
		System.out.printf("Posicion del registro: %d\nNúmero de registros: %d\n\n", 0, clase.size());
		System.out.println();

		/*
		 * 6. Importa los registros contenidos en el documento notas2.txt en una lista
		 * auxiliar.
		 */
		System.out.println("6. Importa los registros contenidos en el documento notas2.txt en una lista auxiliar.");
		LinkedList<Alumno> auxiliar = new LinkedList<>();
		try (Scanner sc1 = new Scanner(f2)) {
			while (sc1.hasNext()) {
				String linea = sc1.nextLine();
				String[] parametros = linea.split(";");
				auxiliar.add(new Alumno(parametros[0], parametros[1], Integer.parseInt(parametros[2]),
						Integer.parseInt(parametros[3]), Integer.parseInt(parametros[4]),
						Integer.parseInt(parametros[5]), Integer.parseInt(parametros[6])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error. No se ha encontrado el archivo notas2.txt");
		}
		System.out.println("Total de registros antes de añadir: " + clase.size());
		System.out.println("Total de registros de la lista auxiliar: " + auxiliar.size());
		System.out.println();

		/* 7. Añade la lista auxiliar al principio de la lista original. */
		System.out.println("7. Añade la lista auxiliar al principio de la lista original.");
		clase.addAll(0, auxiliar);
		System.out.println("Total de registros depues de añadir: " + clase.size());
		System.out.println("Guaradamos la lista completa en: LinkedList7.txt");
		try (FileWriter writer1 = new FileWriter(f3)) {
			for (Alumno a : clase) {
				writer1.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/* 8. Muestra el registro que está en la primera posición de la lista. */
		System.out.printf("8. Muestra el registro que está en la primera posición de la lista.");
		System.out.println(clase.getFirst().toString());
		System.out.println();

		/*
		 * 9. Muestra el registro que está en la última posición posición de la lista.
		 */
		System.out.printf("9. Muestra el registro que está en la última posición posición de la lista.");
		System.out.println(clase.getLast().toString());
		System.out.println();

		/* 10. Muestra el registro que está en la mitad de la lista. */
		System.out.printf("10. Muestra el registro que está en la mitad de la lista.");
		System.out.println(clase.get((clase.size() / 2)));
		System.out.println();

		/* 11. ¿Qué posición ocupa la primera ocurrencia del registro insertado? */
		System.out.printf("11. ¿Qué posición ocupa la primera ocurrencia del registro insertado?\n");
		System.out.println(clase.indexOf(a2));
		System.out.println();

		/* 12. Qué posición ocupa la última ocurrencia del registro insertado? */
		System.out.printf("12. Qué posición ocupa la última ocurrencia del registro insertado?\n");
		System.out.println(clase.indexOf(a1));
		System.out.println();

		/*
		 * 13. ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez,
		 * Salvador;3;6;5;3;4
		 */
		System.out.println("13. ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez, Salvador;3;6;5;3;4");
		System.out.println(encontrarAlumnoNombre("Postigo Vázquez, Salvador", clase));
		System.out.println();

		/* 14. ¿Y éste? 1º ESO A;García Fernández, María;6;5;6;5;5 */
		System.out.println("14. ¿Y éste? 1º ESO A;García Fernández, María;6;5;6;5;5");
		System.out.println(encontrarAlumnoNombre("García Fernández, María", clase));
		System.out.println();

		/*
		 * 15. Elimina la primera ocurrencia del registro insertado y muestra su
		 * posición y contenido.
		 */
		System.out
				.println("15. Elimina la primera ocurrencia del registro insertado y muestra su posición y contenido.");
		System.out.printf("Primera ocurrencia [Posicion: %d Informacion: %s]\n", clase.indexOf(a2),
				clase.get(clase.indexOf(a2)).toString());
		clase.remove(a2);
		System.out.printf("Segunda ocurrencia [Posicion: %d Informacion: %s]\n", clase.indexOf(a1),
				clase.get(clase.indexOf(a1)).toString());
		System.out.println();
		/*
		 * 16. Elimina el registro que ocupa la posición media de la lista mostrando su
		 * contenido.
		 */
		System.out.println("16. Elimina el registro que ocupa la posición media de la lista mostrando su contenido.");
		System.out.printf("Primera ocurrencia [Posicion: %d Informacion: %s]\n", (clase.size() / 2),
				clase.get(clase.size() / 2));
		clase.remove(clase.size() / 2);
		System.out.println();

		/*
		 * 17. Elimina el registro cuyo nombre es: Carrillo Segura, Félix, indicando su
		 * posición y contenido.
		 */
		System.out.println(
				"17. Elimina el registro cuyo nombre es: Carrillo Segura, Félix, indicando su posición y contenido.");
		Alumno eliminar = getAlumnoPorNombre("Carrillo Segura, Félix", clase);
		if (eliminar != null) {
			System.out.printf("[Posicion: %d Informacion: %s]\n", clase.indexOf(eliminar), eliminar.toString());
			clase.remove(eliminar);
		} else {
			System.out.println("Registro no encontrado.");
		}
		System.out.println();
		/*
		 * 18. Elimina el registro cuyo nombre es: Robles Ortiz, Rafael, indicando su
		 * posición y contenido.
		 */
		System.out.println(
				"18. Elimina el registro cuyo nombre es: Robles Ortiz, Rafael, indicando su posición y contenido.");
		eliminar = getAlumnoPorNombre("Robles Ortiz, Rafael", clase);
		if (eliminar != null) {
			System.out.printf("[Posicion: %d Informacion: %s]\n", clase.indexOf(eliminar), eliminar.toString());
			clase.remove(eliminar);
		} else {
			System.out.println("Registro no encontrado.");
		}
		System.out.println();

		/*
		 * 19. Intenta simular una pila con la lista original. Realiza dos inserciones y
		 * extracciones detallando su funcionamiento.
		 */
		System.out.println(
				"19. Intenta simular una pila con la lista original. Realiza dos inserciones y extracciones detallando su funcionamiento.");
		// Para simular una pila, debemos añadir los elementos al principio de la lista
		System.out.println("Para simular una pila, debemos añadir los elementos al principio de la lista");
		System.out.println("Añadiendo 2 Alumnos de nombre 'Plaza Gallego, Juan' al principio de la lista ...");
		clase.push(a1);
		clase.push(a1);
		System.out.println(clase.toString());
		System.out.println();
		// Para simular una pila, debemos eliminar los ultimos elementos introducidos
		System.out.println(
				"Para simular una pila, debemos eliminar los ultimos elementos introducidos, así que eliminamos los dos elementos introducidos antes ...");
		try {
			clase.pop();
			clase.pop();
		} catch (NoSuchElementException ex) {
			System.out.printf("Error. %s", ex.getMessage());
		}
		System.out.println(clase.toString());
		System.out.println();
		/*
		 * 20. Intenta simular una cola con la lista original. Realiza dos inserciones y
		 * extracciones detallando su funcionamiento.
		 */
		System.out.println(
				"20. Intenta simular una cola con la lista original. Realiza dos inserciones y extracciones detallando su funcionamiento.");

		// Para simular una cola, debemos añadir los elementos al final de la lista
		System.out.println("Para simular una cola, debemos añadir los elementos al final de la lista");
		System.out.println("Añadiendo 2 Alumnos de nombre 'Plaza Gallego, Juan' al final de la lista ...");
		clase.offer(a1);
		clase.offer(a1);
		System.out.println(clase.toString());
		System.out.println();
		// Para simular una cola, debemos eliminar los primeros elementos introducidos
		// en la lista
		System.out.println(
				"Para simular una cola, debemos eliminar los primeros elementos introducidos en la lista, así que eliminamos los dos elementos introducidos antes ...");
		clase.pollLast();
		clase.pollLast();
		System.out.println(clase.toString());
		System.out.println();

	}

	public static String encontrarAlumnoNombre(String nombre, LinkedList<Alumno> clase) {
		String resultado = null;
		boolean encontrado = false;
		for (Alumno alumno : clase) {
			if (alumno.getNombre().equals(nombre)) {
				resultado = String.format("Información del alumno encontrado: %s", alumno.toString());
				encontrado = true;
			}
		}

		if (!encontrado) {
			resultado = String.format("No se encontró al alumno %s", nombre);
		}
		return resultado;
	}

	public static Alumno getAlumnoPorNombre(String nombre, LinkedList<Alumno> clase) {
		Alumno resultado = null;
		for (Alumno alumno : clase) {
			if (alumno.getNombre().equals(nombre)) {
				resultado = alumno;
			}
		}
		return resultado;
	}
}
