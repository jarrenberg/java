/*
 * Programa que usa la libreria teatro para realizar funciones
 * Jorge Arrenberg 14/01/2025
 */

package ejercicio1;

import libtarea3.Teatro;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 2.- Declarar tres variables referencia a objetos instancia de la clase
		// Teatro.
		Teatro teatro1;
		Teatro teatro2;
		Teatro teatro3;

		// 3.- Instanciar cada una de las tres variables con un valor proporcionado por
		// aforoAleatorio.
		teatro1 = new Teatro("Teatro1", aforoAleatorio(750, 850));
		teatro2 = new Teatro("Teatro2", aforoAleatorio(750, 850));
		teatro3 = new Teatro("Teatro3", aforoAleatorio(750, 850));

		// 4.- Mostrar el nombre y el aforo de los teatros creados o el mensaje
		// correspondiente en caso de que no se hayan creado
		System.out.println(teatro1.toString());
		System.out.println(teatro2.toString());
		System.out.println(teatro3.toString());

		// 5.- Obtener el número de entradas vendidas en todos los teatros y para todas
		// las obras que se han representado hasta el momento utilizando la herramienta
		// de E/S System.out.printf.
		System.out.println("Ejercicio5");
		System.out.printf("\nNumero de entradas vendidas en Total: %d\n", Teatro.getEntradasVendidasTotales());
		System.out.printf("Obras activas en todos los teatros: %d\n", Teatro.getObrasActivas());

		// 6.- Declarar e instanciar un teatro por defecto. El identi�cador de la
		// variable referencia a ese teatro será tu primer apellido.
		Teatro arrenberg = new Teatro();

		// 7.- Terminar de representar una obra en el teatro del apartado anterior
		System.out.println("Ejercico6");
		try {
			arrenberg.terminarObra();
		} catch (IllegalStateException ex1) {
			System.out.printf("\nError. %s\n", ex1.getMessage());
		}

		// 8.- Asignar la obra "El Rey León" al teatro declarado en el apartado 6. Una
		// vez asignada la obra, deberás llenar el teatro, mostrando a continuación el
		// número de entradas vendidas.
		arrenberg.asignarObra("El Rey León");
		arrenberg.llenarTeatro();
		System.out.println("Ejercicio8");
		System.out.printf("\nEl teatro %s ha vendido %d entradas.\n", "Arrenberg", arrenberg.getEntradasVendidas());

		// 9.- Devolver 50 entradas del teatro declarado en el apartado 6. Mostrar las
		// entradas
		// vendidas de la obra que se representa en el teatro del apartado 6

		arrenberg.devolverEntradas(50);
		System.out.println("Ejercicio9");
		System.out.printf("\nEntradas Vendidas en el Teatro %s: %d\n", "Arrenberg", arrenberg.getEntradasVendidas());

		// 10.- Mostrar la siguiente información:
		System.out.println("Ejercicio10");
		// 10.1.- número de teatros creados hasta el momento.
		System.out.printf("\nTeatros creados hasta el momento: %d\n", Teatro.getTeatrosTotales());

		// 10.2.- número de obras que se están representando en este momento en todos
		// los teatros.
		System.out.printf("Numero de obras representadas en este momento: %d\n", Teatro.getObrasActivas());
	}

	// Devuelve un numero aleatorio dentro de un rango
	public static int aforoAleatorio(int min, int max) {
		int aforo = (int) ((Math.random() * 100) + min);
		while (aforo > max || aforo < min) {
			aforo = (int) ((Math.random() * 100) + min);
		}
		return aforo;
	}
}
