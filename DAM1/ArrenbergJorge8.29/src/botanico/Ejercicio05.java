package botanico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ejercicio 5. Ordenación de especies de plantas (por nombre y longitud)
 * 
 * @author Profesor
 */
public class Ejercicio05 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables y constantes
		// ----------------------------------------------

		// Constantes

		// Variables de entrada

		// Variables auxiliares

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		// No se piden datos al usuario, ya que se usa un número fijo de elementos
		// aleatorios

		System.out.println("ORDENACIÓN DE ESPECIES DE PLANTAS");
		System.out.println("---------------------------------");

		// ----------------------------------------------
		// Procesamiento + Salida de resultados
		// ----------------------------------------------
		// 1. Crear una lista de especies de plantas
		List<String> especiesPlantas = new ArrayList<>();
		while (especiesPlantas.size() < 5) {
			String planta = Utilidades.especiePlantaAleatoria();
			if (especiesPlantas.contains(planta)) {

			} else {
				especiesPlantas.add(planta);
			}
		}

		// 3. Mostrar contenido inicial
		System.out.println("Contenido inicial de la lista:");
		mostrarLista(especiesPlantas);

		// 4. Ordenar por nombre de especie
		Collections.sort(especiesPlantas, new ComparadorEspeciePlantaPorNombre());

		// 5. Mostrar lista ordenada por nombre
		System.out.println("\nLista ordenada por nombre:");
		mostrarLista(especiesPlantas);

		// 6. Ordenar por longitud de nombre
		Collections.sort(especiesPlantas, new ComparadorEspeciePlantaPorLongitud());

		// 7. Mostrar lista ordenada por longitud
		System.out.println("\nLista ordenada por longitud:");
		mostrarLista(especiesPlantas);
	}

	// Método auxiliar para mostrar la lista
	private static void mostrarLista(List<String> lista) {
		for (String planta : lista) {
			System.out.println(planta);
		}
	}
}

// Comparador para ordenar por nombre de planta
class ComparadorEspeciePlantaPorNombre implements Comparator<String> {
	@Override
	public int compare(String planta1, String planta2) {
		return planta1.compareTo(planta2);
	}
}

// Comparador para ordenar por longitud del nombre
class ComparadorEspeciePlantaPorLongitud implements Comparator<String> {
	public int compare(String planta1, String planta2) {
		// Si tienen la misma longitud, ordenamos alfabéticamente
		if (planta1.length() == planta2.length()) {
			return planta1.compareToIgnoreCase(planta2);
		}
		return Integer.compare(planta1.length(), planta2.length());
	}

}