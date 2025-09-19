package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creando una lista con la plantilla
		System.out.println("Creando una lista con la plantilla ...");
		ArrayList<Trabajador> plantilla = crearListaTrabajadores(15);
		ArrayList<Trabajador> plantillaOrdenada = plantilla;

		// Mostrar los trabajadores ordenados por sexo y estado civil
		System.out.println();
		System.out.println("Mostrando los trabajadores ordenados por sexo y estado civil ...");
		trabajadoresOrdenados(plantilla);

		// Mostrar la cantidad de trabajadores del sexo masculino
		System.out.println();
		System.out.println("Mostrando la cantidad de trabajadores del sexo masculino ...");
		System.out.printf("El numero de hombres en plantilla es: %d\n", cantidadHombresPlantilla(plantilla));

		// Mostrar la cantidad de trabajadoras casadas
		System.out.println();
		System.out.println("Mostrando la cantidad de trabajadoras casadas ...");
		System.out.printf("El numero de trabajadoras casadas en plantilla es: %d\n",
				cantidadMujeresCasadasPlantilla(plantilla));

		// Mostrar la suma de todos los sueldos
		System.out.println();
		System.out.println("Mostrando la suma de todos los sueldos ...");
		System.out.println("El sueldo total de la plantilla es: "+ sueldoTotalPlantilla(plantilla));
		
	}

	// Devuelve una lista de objetos de tipo Trabajador del tamaño indicado como
	// parametro
	public static ArrayList<Trabajador> crearListaTrabajadores(int cantidad) {
		ArrayList<Trabajador> resultado = new ArrayList<Trabajador>();
		String sexo, estadoCivil;
		for (int i = 0; i < cantidad; i++) {
			if (i % 2 == 0) {
				sexo = "H";
				estadoCivil = "Viudo";
			} else {
				sexo = "M";
				estadoCivil = "Casada";
			}
			try {
				resultado.add(new Trabajador(String.format("Nombre %d", (i + 1)), (cantidad + i), sexo, estadoCivil,
						(cantidad + 1200)));
			} catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			} catch (NullPointerException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}
		}
		return resultado;
	}

	// Devuelve la cantidad de hombres que hay en la plantilla
	public static int cantidadHombresPlantilla(ArrayList<Trabajador> plantilla) {
		int resultado = 0;
		for (Trabajador t : plantilla) {
			if (t.getSexo().equals("H")) {
				resultado++;
			}
		}
		return resultado;
	}

	// Devuelve la cantidad de mujeres que estan casadas que hay en la plantilla
	public static int cantidadMujeresCasadasPlantilla(ArrayList<Trabajador> plantilla) {
		int resultado = 0;
		for (Trabajador t : plantilla) {
			if (t.getSexo().equals("M") && t.getEstadoCivil().equals("Casada")) {
				resultado++;
			}
		}
		return resultado;
	}

	// Devuelve el sueldo total de la plantilla
	public static double sueldoTotalPlantilla(ArrayList<Trabajador> plantilla) {
		double resultado = 0;
		for (Trabajador t : plantilla) {
			resultado = resultado + t.getSalarioBase();
		}
		return resultado;
	}

	// Ordena a los trabajadores por sexo y estado civil
	public static void trabajadoresOrdenados(ArrayList<Trabajador> plantilla) {
		ArrayList<Trabajador> contenedor = plantilla;
		Collections.sort(contenedor, new ComparadorTrabajadores());
		for (Trabajador t : contenedor) {
			System.out.println(t.toString());
		}
	}
}
