package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static final int MAXIMO_INGREDIENTES = 50;

	public static void main(String[] args) {
		ArrayList<Ingrediente> menu = new ArrayList<Ingrediente>();

		// Creando 54 ingredientes
		System.out.println("Creando 54 ingredientes ...");
		try {
			menu = generarMenu(menu, 54);
		} catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.println(menu.toString());
		
		// El chef requiere 5 unidades del ingrediente 2
		System.out.println("El chef requiere 5 unidades del ingrediente 2 ...");
		try {
			Ingrediente.actualizarMenu(2, 5, menu);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// El chef requiere 200 unidades del ingrediente 2
		System.out.println();
		System.out.println("El chef requiere 200 unidades del ingrediente 2 ...");
		try {
			Ingrediente.actualizarMenu(2, 200, menu);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		
		// El chef emite un listado de los ingredientes que llegaron al stock minimo
		System.out.println();
		System.out.println("El chef emite un listado de los ingredientes que llegaron al stock minimo ...");
		ArrayList<Integer>codigosStockMinimo = Ingrediente.codigosStockMinimo(menu);
		System.out.println("Mostrando listado:");
		System.out.println(codigosStockMinimo.toString());
		

	}

	public static ArrayList generarMenu(ArrayList<Ingrediente> l, int cantidad) throws IllegalStateException {
		ArrayList<Ingrediente> resultado = l;
		for (int i = 0; i < cantidad; i++) {
			if (resultado.size() >= 50) {
				throw new IllegalStateException(String.format("No se puede tener mas de 50 ingredientes\n"));
			} else {
				int n = generarEnteroAleatorio(100, 20);
				Ingrediente in;
				try {
					in = new Ingrediente(String.format("Ingrediente %d", (i + 1)), n, n - 10);
				} catch (NullPointerException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
					in = new Ingrediente(String.format("Error", (i + 1)), 20, 10);
				} catch (IllegalArgumentException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
					in = new Ingrediente(String.format("Error", (i + 1)), 20, 10);
				} catch (IllegalStateException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
					in = new Ingrediente(String.format("Error", (i + 1)), 20, 10);
				}
				resultado.add(in);
			}
		}

		return resultado;
	}

	public static int generarEnteroAleatorio(int max, int min) {
		return (int) (min + (Math.random() * (max - min)));

	}

}
