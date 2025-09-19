package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

import ejercicio1.Alumno;
import ejercicio1.ComparadorAlumno;

public class Main {

	public static void main(String[] args) {
		File f = new File("notas1hs.txt");
		File f1 = new File("notas2hs.txt");
		File f2 = new File("HashSet3.txt");
		File f3 = new File("HashSet7.txt");
		File f4 = new File("notas3hs.txt");
		File f5 = new File("HashSet10.txt");
		File f6 = new File("HashSet11.txt");
		File f7 = new File("HashSet13.txt");
		File f8 = new File("HashSet18.txt");
		/*
		 * 1. Importa la información contenida en el documento notas1.txt, donde la
		 * información tiene el siguiente formato:
		 */
		System.out.println("1. Importa la información contenida en el documento notas1hs.txt");
		HashSet<Alumno> clase = new HashSet<Alumno>();

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
		System.out.println();

		/* 2. Muestra el número de registros que contiene. */
		System.out.println("2. Muestra el número de registros que contiene");
		System.out.printf("Numero de registros añadidos: %d\n\n", clase.size());

		/* 3. Ordena los registros por grupo y nombre. */
		System.out.println("3. Ordena los registros por grupo y nombre.");
		// Para ordenar el hashhset, lo convertimos en un array list y de ahi lo
		// ordenamos.
		ArrayList<Alumno> claseOrdenada = ordenarHashSet(clase);
		Collections.sort(claseOrdenada, new ComparadorAlumno());
		// Preguntar a rafa si puedo pasar de arrayList a hashset
		System.out.println(claseOrdenada.toString());
		System.out.println();

		System.out.println("Guardamos la lista ordenada en: HashSet3.txt");
		try (FileWriter writer = new FileWriter(f2)) {
			for (Alumno a : claseOrdenada) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/*
		 * 4. Añade el registro abajo indicado. 1º ESO A;Plaza Gallego, Juan;1;1;3;1;1
		 */
		System.out.println("4. Añade el registro abajo indicado. 1º ESO A;Plaza Gallego, Juan;1;1;3;1;1");
		boolean repetido = false;
		Alumno comparacion = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1);
		for (Alumno a : clase) {
			if (a.equals(comparacion)) {
				repetido = true;
			}
		}
		if (!repetido) {
			clase.add(comparacion);
			System.out.printf("Registro añadido. Numero de registros: %d\n\n", clase.size());
		} else {
			System.out.printf("No se ha introducido el registro porque ya está\n\n");
		}

		/*
		 * 5. Añade el registro abajo indicado.1º ESO A;Suárez Cano, Francisco
		 * José;2;3;4;1;2
		 */
		System.out.println("5. Añade el registro abajo indicado.1º ESO A;Suárez Cano, Francisco José;2;3;4;1;2");
		repetido = false;
		comparacion = new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2);
		for (Alumno a : clase) {
			if (a.equals(comparacion)) {
				repetido = true;
			}
		}
		if (!repetido) {
			clase.add(comparacion);
			System.out.printf("Registro añadido. Numero de registros: %d\n\n", clase.size());
		} else {
			System.out.printf("No se ha introducido el registro porque ya esta\n\n");
		}

		/*
		 * 6. Importa los registros contenidos en el documento notas2hs.txt en un
		 * arralist.
		 */
		System.out.println("6. Importa los registros contenidos en el documento notas2hs.txt en un arraylist.");
		ArrayList<Alumno> auxiliar = new ArrayList<>();
		try (Scanner sc1 = new Scanner(f1)) {
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
		System.out.println("Total de registros de la lista auxiliar: " + auxiliar.size());
		System.out.println();

		/* 7. Inserta los registros contenidos en el arralist anterior en el HashSet. */
		System.out.println("7. Inserta los registros contenidos en el arralist anterior en el HashSet.");
		System.out.printf("Total de registros antes de añadir: %d\n", clase.size());
		clase.addAll(auxiliar);
		System.out.printf("Total de registros despues de añadir: %d\n", clase.size());
		System.out.println("Guardamos la lista ordenada en: HashSet7.txt");
		try (FileWriter writer = new FileWriter(f3)) {
			for (Alumno a : clase) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/* 8. Comprueba que el registro del punto 4 está en el conjunto. */
		System.out.println("8. Comprueba que el registro del punto 4 está en el conjunto.");
		if (clase.contains(new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1))) {
			System.out.println("El registro esta en la lista");
		} else {
			System.out.println("El registro no esta en la lista");
		}
		System.out.println();

		/* 9. Comprueba que el registro del punto 5 está en el conjunto. */
		System.out.println("9. Comprueba que el registro del punto 5 está en el conjunto.");

		if (clase.contains(new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2))) {
			System.out.println("El registro esta en la lista");
		} else {
			System.out.println("El registro no esta en la lista");
		}
		System.out.println();
		/* 10. Crea un arraylist con los registros contenidos en notas3hs.txt. */
		System.out.println("10. Crea un arraylist con los registros contenidos en notas3hs.txt.");
		ArrayList<Alumno> auxiliar1 = new ArrayList<>();
		try (Scanner sc = new Scanner(f4)) {
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String[] parametros = linea.split(";");
				auxiliar1.add(new Alumno(parametros[0], parametros[1], Integer.parseInt(parametros[2]),
						Integer.parseInt(parametros[3]), Integer.parseInt(parametros[4]),
						Integer.parseInt(parametros[5]), Integer.parseInt(parametros[6])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error. No se ha encontrado el archivo notas1.txt");
		}

		System.out.println("Guardamos todos los objetos del ArrayList en HashSet10.txt");
		try (FileWriter writer = new FileWriter(f5)) {
			for (Alumno a : auxiliar1) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/*
		 * 11. Aplica la intersección del HashSet y del arraylist del punto anterior.
		 * Muestra el resultado.
		 */
		System.out.println(
				"11. Aplica la intersección del HashSet y del arraylist del punto anterior. Muestra el resultado");
		ArrayList<Alumno> interseccion = new ArrayList<>(clase);
		interseccion.retainAll(auxiliar1);
		System.out.println("Guardamos la interseccion en HashSet11.txt");
		try (FileWriter writer = new FileWriter(f6)) {
			for (Alumno a : auxiliar1) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/*
		 * 12. Crea un HashSet e inserta el arraylist anterior. Inserta los objetos
		 * creados en el punto 4 y 5.
		 */
		System.out.println(
				"12. Crea un HashSet e inserta el arraylist anterior. Inserta los objetos creados en el punto 4 y 5.");
		HashSet<Alumno> contenedor = new HashSet<>(interseccion);
		contenedor.add(new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1));
		contenedor.add(new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2));
		System.out.println();

		/* 13. Aplica la intersección de los dos HashSet. Muestra su contenido. */
		System.out.println("13. Aplica la intersección de los dos HashSet. Muestra su contenido.");
		HashSet<Alumno> interseccion1 = new HashSet<>(clase);
		interseccion.retainAll(contenedor);
		System.out.println("Guardamos la interseccion en HashSet13.txt");
		try (FileWriter writer = new FileWriter(f7)) {
			for (Alumno a : auxiliar1) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/* 14. Busca y muestra el registro con nombre “Romero Farfán, Estefanía”. */
		System.out.printf("14. Busca y muestra el registro con nombre “Romero Farfán, Estefanía”");
		boolean esta = false;
		for (Alumno a : clase) {
			if (a.getNombre().equals("Romero Farfán, Estefanía")) {
				esta = true;
				System.out.println(a.toString());
			}
		}
		if (!esta) {
			System.out.println("No existe un registro con dicho nombre");
		}
		System.out.println();

		/* 15. Busca y muestra el registro con nombre “Gutiérrez Martín, Marina”. */
		System.out.println("15. Busca y muestra el registro con nombre “Gutiérrez Martín, Marina”");
		esta = false;
		for (Alumno a : clase) {
			if (a.getNombre().equals("Gutiérrez Martín, Marina")) {
				esta = true;
				System.out.println(a.toString());
			}
		}
		if (!esta) {
			System.out.println("No existe un registro con dicho nombre");
		}
		System.out.println();

		/* 16. Elimina el objeto insertado en el punto 4. */
		System.out.println("16. Elimina el objeto insertado en el punto 4.");
		System.out.printf("Total de registros antes de eliminar: %d\n", clase.size());
		clase.remove(new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1));
		System.out.printf("Total de registros despues de eliminar: %d\n\n", clase.size());

		/* 17. Elimina el objeto insertado en el punto 5. */
		System.out.println("17. Elimina el objeto insertado en el punto 5");
		System.out.printf("Total de registros antes de eliminar: %d\n", clase.size());
		clase.remove(new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2));
		System.out.printf("Total de registros despues de eliminar: %d\n\n", clase.size());

		/* 18. Exporta el HashSet original a un documento de texto. */
		System.out.println("18. Exporta el HashSet original a un documento de texto.");
		System.out.println("Guardamos la lista completa en HashSet18.txt");
		try (FileWriter writer = new FileWriter(f8)) {
			for (Alumno a : clase) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// Devuelve una lista ordenada con el contenido del hashset pasado como
	// parametro
	public static ArrayList<Alumno> ordenarHashSet(HashSet<Alumno> h) {
		ArrayList<Alumno> claseArray = new ArrayList<>(h);
		Collections.sort(claseArray, new ComparadorAlumno());
		return claseArray;
	}
}
