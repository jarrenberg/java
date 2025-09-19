package botanico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Ejercicio 3. Calendario de especies de plantas
 * 
 * @author Profesor
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables y constantes
		// ----------------------------------------------
		HashMap<LocalDate, String> calendario = new HashMap<LocalDate, String>();
		// Constantes

		// Variables de entrada

		// Variables auxiliares
		String contenedor;

		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		// No se piden datos al usuario, ya que se usa un número fijo de elementos
		// aleatorios

		System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");
		System.out.println("---------------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------
		// 1. Declaramos un Map ordenado por fecha (LinkedHashMap mantiene el orden de
		// inserción)
		Map<LocalDate, String> calendarioPlantas = new LinkedHashMap<>();

		// Lista de especies de plantas posibles (usando la clase Utilidades)
		ArrayList<String> especiesDisponibles = new ArrayList<>();

		// Generamos 7 especies únicas para la semana
		while (especiesDisponibles.size() < 7) {
			String nuevaPlanta = Utilidades.especiePlantaAleatoria();
			if (!especiesDisponibles.contains(nuevaPlanta)) {
				especiesDisponibles.add(nuevaPlanta);
			}
		}

		// Obtenemos la fecha actual
		LocalDate fechaActual = LocalDate.now();

		// 2. Rellenamos el calendario para una semana (7 días)
		for (int i = 0; i < 7; i++) {
			// Asignamos una planta diferente cada día
			String plantaSeleccionada = especiesDisponibles.get(i);

			// Añadimos al calendario
			calendarioPlantas.put(fechaActual.plusDays(i), plantaSeleccionada);
		}

		// 3. Mostramos el contenido del Map
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Calendario de plantas para la semana:");
		System.out.println("-----------------------------------");

		for (Map.Entry<LocalDate, String> entrada : calendarioPlantas.entrySet()) {
			String fechaFormateada = entrada.getKey().format(formatter);
			System.out.println(fechaFormateada + " - " + entrada.getValue());
		}
	}
}