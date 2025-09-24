package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File f = new File("C:/Users/dam2/Documents/proyectosEclipse/AD/ArrenbergJorge2/matriculas.txt");

		// Según vamos leyendo los objetos del fichero los vamos mostrando por pantalla
		// y los vamos almacenando en un arraylist.
		System.out.println("Los coches introducidos en el documento son:\n");
		ArrayList<Vehiculo> garaje = new ArrayList<>();
		try (Scanner sc = new Scanner(f)) {
			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(",");
				try {
					System.out.println(linea);
					garaje.add(new Vehiculo(campos[0], campos[1], campos[2], Tipo.valueOf(campos[3]),
							Integer.valueOf(campos[4])));
					System.out.println("Vehiculo Introducido");

				} catch (IllegalArgumentException e) {
					System.out.println("Ha habido un error y no se ha introducido el vehiculo");

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Al finalizar la lectura de todo el fichero imprimiremos el nº de objetos
		// (coches) leídos.
		System.out.printf("\nEl numero de coches leidos es: %d\n\n", garaje.size());

		// Se plantea una búsqueda en bucle donde pedimos uno de los datos del vehiculo
		// (pe ej matricula) y mostraremos todos los datos del objeto ( modelo, color,
		// precio, kms,...)

		System.out.println("Introduzca la matricula del vehiculo:");
		Scanner sc = new Scanner(System.in);
		String matricula = sc.nextLine();
		Vehiculo vehiculo = null;

		for (Vehiculo v : garaje) {
			if (matricula.equalsIgnoreCase(v.getMatricula())) {
				vehiculo = v;
			}
		}

		if (vehiculo != null) {
			System.out.println("Se ha encontrado el vehiculo con la matricula " + matricula);
			System.out.println(vehiculo.toString());

		} else {
			System.out.println("No se ha encontrado el vehiculo con la matricula " + matricula);

		}
		sc.close();
	}

}
