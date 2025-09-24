/*
 * Programa que extrae información de un documento txt y realiza operaciones sobre él
 * Jorge Arrenberg 29/03/2025
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File f = new File("notas1.txt");
		File f1 = new File("notasPorGrupoYNombre.txt");
		File f2 = new File("notas2.txt");
		File f3 = new File("registroCompletoDeNotas.txt");
		File f4 = new File("registrosBorrados.txt");
		File f5 = new File("registrosEliminadosMatematicas.txt");
		File f6 = new File("nombre_y_nota_media.txt");
		/*
		 * 1. Importa la información contenida en el documento notas1.txt, donde la
		 * información tiene el siguiente formato:
		 */
		System.out.println("1. Importa la información contenida en el documento notas1.txt");

		ArrayList<Alumno> clase = new ArrayList<>();

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
		ArrayList<Alumno> claseOrdenada = new ArrayList<>(clase);
		Collections.sort(claseOrdenada, new ComparadorAlumno());

		System.out.println("Guardamos la lista ordenada en: notasPorGrupoYNombre.txt");
		try (FileWriter writer = new FileWriter(f1)) {
			for (Alumno a : claseOrdenada) {
				writer.write(a.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/* 4. Inserta siguiente registro:1º ESO D;López Muro, Rosario;3;3;4;4;3. */
		System.out.println("4. Inserta siguiente registro:1º ESO D;López Muro, Rosario;3;3;4;4;3");
		clase.add(new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3));
		System.out.printf("Número de registros: %d\n\n", clase.size());

		/*
		 * 5. Insertar el siguiente registro en mitad de la lista: 1º ESO B;Duarte
		 * Durán, Alba;2;3;4;1;3
		 */
		System.out.println(
				"5. Insertar el siguiente registro en mitad de la lista: 1º ESO B;Duarte Durán, Alba;2;3;4;1;3");
		int index = clase.size() / 2;
		Alumno a = new Alumno("1º ESO B", "Duarte Durán, Alba", 2, 3, 4, 1, 3);
		clase.add(index, a);
		System.out.printf("Añadiendo alumno en la posición %d\n\n", index);

		/* 6. Mostrar la posición que ocupa el último registro anterior insertado */
		System.out.println("6. Mostrar la posición que ocupa el último registro anterior insertado");
		System.out.printf("La posición del objeto introducido es: %d\n\n", clase.indexOf(a));

		/*
		 * 7. Importa los registros del documento notas2.txt a un ArrayList auxiliar e
		 * incluye los elementos de este ArrayList auxiliar al primer ArrayList.
		 */
		System.out.println("7. Importa los registros del documento notas2.txt a un ArrayList auxiliar...");
		System.out.printf("Total de registros antes de añadir: %d\n", clase.size());
		ArrayList<Alumno> auxiliar = new ArrayList<>();

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

		System.out.printf("Total de registros de la lista auxiliar: %d\n", auxiliar.size());
		clase.addAll(auxiliar);
		System.out.printf("Total de registros de la lista clase tras añadir la auxiliar: %d\n\n", clase.size());

		System.out.println("Guardamos la lista completa y ordenada en: registroCompletoDeNotas.txt");
		claseOrdenada = new ArrayList<>(clase);
		Collections.sort(claseOrdenada, new ComparadorAlumno());

		try (FileWriter writer1 = new FileWriter(f3)) {
			for (Alumno a1 : claseOrdenada) {
				writer1.write(a1.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		/*
		 * 8. Busca el registro con el nombre “Cordero Benítez, Alejandro” y muestra
		 * toda su información.
		 */
		System.out.println(
				"8. Busca el registro con el nombre “Cordero Benítez, Alejandro” y muestra toda su informacion:");
		System.out.println(encontrarAlumnoNombre("Cordero Benítez, Alejandro", clase));
		System.out.println();
		/*
		 * 9. Busca el registro con el nombre “Fernández Villalón, Carlos” y muestra
		 * toda su información.
		 */
		System.out.println(
				"9. Busca el registro con el nombre “Fernández Villalón, Carlos” y muestra toda su informacion:");
		System.out.println(encontrarAlumnoNombre("Fernández Villalón, Carlos", clase));
		System.out.println();

		/*
		 * 10. Borra el registro que está en la posición mitad más 1, indicando la
		 * información del registro que borras.
		 */
		System.out.println(
				"10. Borra el registro que está en la posición mitad más 1, indicando la información del registro que borras");
		// Me sale un registro mas que a rafa, a pesar que tenemos la misma cantidad de
		// registros añadidos
		index = ((clase.size() / 2) + 1);
		Collections.sort(clase, new ComparadorAlumno());
		System.out.println("Posicion de la mitad +1: " + index);
		System.out.printf("\nRegistro en la posicion %d: %s\n", index, clase.remove(index).toString());
		System.out.printf("\nNuevo regitro en la posicion %d: %s\n\n", index, clase.get(index).toString());

		/* 11. Borra los primeros 10 registros. */
		System.out.println("11. Borra los primeros 10 registros");
		System.out.println("Total de registros antes de borrar: " + clase.size());
		try (FileWriter writer2 = new FileWriter(f4)) {
			for (int i = 0; i < 10; i++) {
				Alumno al = clase.remove(0);
				writer2.write(al.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Total de registros despues de borrar: " + clase.size());
		System.out.println();
		/*
		 * 12. Borra todos los registros que tengan en matemáticas un 2. Indica cuántos
		 * registros borras.
		 */
		System.out.println(
				"12. Borra todos los registros que tengan en matemáticas un 2. Indica cuántos registros borras.");
		int contadorAlumnosEliminados = 0;
		try (FileWriter writer2 = new FileWriter(f5)) {
			for (Iterator iterator = clase.iterator(); iterator.hasNext();) {
				Alumno alumno = (Alumno) iterator.next();
				if (alumno.getNotaMatematicas() == 2) {
					writer2.write(alumno.toString());
					iterator.remove();
					contadorAlumnosEliminados++;
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("Se han borrado %d registros\n", contadorAlumnosEliminados);
		System.out.printf("Se recogen los registros borrados en: registrosEliminadosMatemáticas.txt\n\n");

		/*
		 * 13. Calcula la nota media para cada alumno.
		 */
		System.out.println("13. Calcula la nota media para cada alumno.");
		System.out.println(clase.toString());
		try (FileWriter writer2 = new FileWriter(f6)) {
			for (Alumno alumno : clase) {
				double media = ((alumno.getNotaMatematicas() + alumno.getNotaLengua() + alumno.getNotaFisica()
						+ alumno.getNotaQuimica() + alumno.getNotaIngles()) / 5.0);
				writer2.write(String.format("Nombre: %s\tNota Media: %.2f\n", alumno.getNombre(), media));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Se ha guardado el nombre y la nota media de cada registro en: nombre_y_nota_media.txt");

		/*
		 * 14. Crea una sublista por cada grupo y ordénala por nombre descendente.
		 */

		/* 15. Calcula para cada grupo la nota media de cada materia. */
		/*
		 * 16. Para cada grupo muestra las diez mejores notas en matemáticas ordenadas
		 * por nota y nombre.
		 */

	}

	public static String encontrarAlumnoNombre(String nombre, ArrayList<Alumno> clase) {
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

}
