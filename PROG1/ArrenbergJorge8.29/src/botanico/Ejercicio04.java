package botanico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio 4. Clasificación de especies de plantas coincidentes (con el mismo
 * nombre y en la misma posición)
 * 
 * @author Profesor
 */
public class Ejercicio04 {

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

		System.out.println("CLASIFICACIÓN DE COINCIDENTES");
		System.out.println("-----------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();

		for (int i = 0; i < 20; i++) {
			lista1.add(Utilidades.especiePlantaAleatoria());
			lista2.add(Utilidades.especiePlantaAleatoria());
		}

		Map<String, ArrayList<Integer>> mapa = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < lista1.size(); i++) {
			String planta1 = lista1.get(i);
			String planta2 = lista2.get(i);

			if (planta1.equals(planta2)) {
				// Si las plantas son iguales en la misma posición
				if (!mapa.containsKey(planta1)) {
					// Si la planta no está en el mapa, creamos una nueva lista
					mapa.put(planta1, new ArrayList<Integer>());
				}
				// Añadimos la posición a la lista correspondiente a esta planta
				mapa.get(planta1).add(i + 1);
			}
		}

		// ----------------------------------------------
		// Salida de resultados
		// ----------------------------------------------
		System.out.println("Lista 1: " + lista1.toString());
		System.out.println("Lista 2: " + lista2.toString());
		System.out.println(mapa.toString());
	}
}