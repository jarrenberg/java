package botanico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Ejercicio 2. Búsqueda de especies de plantas populares
 * 
 * @author Profesor
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables
		// ----------------------------------------------

		// Constantes
		final int CANTIDAD_ESPECIES_PLANTAS = 10;

		// Variables de entrada

		// Variables auxiliares
		int index = 0;
		int contador = 0;
		String almacenPlanta;

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
		System.out.println("-----------------------------------------");

		// No hay, pues se usa un número fijo de elementos aleatorios

		// Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
		ArrayList<String> lista1 = new ArrayList<>();
		ArrayList<String> lista2 = new ArrayList<>();
		ArrayList<String> populares = new ArrayList<>();
		ArrayList<Integer> posicionesPopulares = new ArrayList<>();
		HashSet<String> conjuntoPopulares = new HashSet<>();

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		for (int i = 0; i < CANTIDAD_ESPECIES_PLANTAS; i++) {
			lista1.add(Utilidades.especiePlantaAleatoria());
			lista2.add(Utilidades.especiePlantaAleatoria());
		}
		
		System.out.printf("Contenido inicial de la lista 1: %s\n", lista1);
		System.out.printf("Contenido inicial de la lista 2: %s\n", lista2);

		Iterator<String> it1 = lista1.iterator();
		Iterator<String> it2 = lista2.iterator();
		int posicion = 0;

		while (it1.hasNext() && it2.hasNext()) {
			String planta1 = it1.next();
			String planta2 = it2.next();

			if (planta1.equals(planta2)) {
				// Marcar la planta como popular
				String plantaMarcada = String.format("*%s*", planta1);

				// Almacenar en las estructuras correspondientes
				populares.add(planta1);
				posicionesPopulares.add(posicion+1);
				conjuntoPopulares.add(planta1); // Sin marcar para el conjunto

				// Actualizar las listas originales con las plantas marcadas
				lista1.set(posicion, plantaMarcada);
				lista2.set(posicion, plantaMarcada);
			}
			posicion++;
		}

		// ----------------------------------------------
		// Salida de resultados
		// ----------------------------------------------

		System.out.printf("\nContenido final de la lista 1: %s\n", lista1.toString());
		System.out.printf("Contenido final de la lista 2: %s\n", lista2.toString());
		System.out.printf("Contenido final de la lista de especies populares: %s\n", populares.toString());
		System.out.printf("Contenido final de la lista de posiciones populares: %s\n", posicionesPopulares.toString());
		System.out.printf("Contenido final del conjunto de especies populares: %s\n", conjuntoPopulares.toString());
	}
}