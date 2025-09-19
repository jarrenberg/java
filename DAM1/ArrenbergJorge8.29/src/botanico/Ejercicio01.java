package botanico;

import java.util.HashSet;

/**
 * Ejercicio 1. Creando jardín botánico
 * 
 * @author Profesor
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables
		// ----------------------------------------------
		
		
		
		
		// Constantes

		// Variables de entrada

		// Variables auxiliares

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		// No hay, pues se usa un número fijo de elementos aleatorios

		System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
		System.out.println("--------------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		// Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya
		HashSet<String> c1 = new HashSet<>();
		HashSet<String> c2 = new HashSet<>();
		// CANTIDAD_ESPECIES_PLANTAS
		for (int i = 0; i < 5; i++) {
			c1.add(Utilidades.especiePlantaAleatoria());
			c2.add(Utilidades.especiePlantaAleatoria());
		}
		
		// Unión de los dos conjuntos
		HashSet<String> c3 = new HashSet<>(c1);
		c3.addAll(c2);
		

		// Intersección de los conjuntos
		HashSet<String> c4 = new HashSet<>(c1);
		c4.retainAll(c2);
	
		
		// Diferencia de los conjuntos
		HashSet<String> c5 = new HashSet<>(c2);
		c5.removeAll(c1);
		
		// ----------------------------------------------
		// Salida de Resultados
		// ----------------------------------------------
		System.out.printf("Conjunto C1: %s\n", c1.toString());
		System.out.printf("Conjunto C2: %s\n", c2.toString());
		System.out.printf("Union C1 y C2: %s\n",c3.toString());
		System.out.printf("Interseccion C1 y C2: %s\n",c4.toString());
		System.out.printf("Diferencia entre C1 y C2: %s\n",c5.toString());
		
		
		
		// Recorremos el conjunto y mostramos su contenido por pantalla

	}
}