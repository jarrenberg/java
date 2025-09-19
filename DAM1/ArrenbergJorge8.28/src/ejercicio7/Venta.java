package ejercicio7;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Venta {

	private static String[] meses = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
			"OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };
	private String mes;
	private Integer cantidad;

	public Venta(String mes, Integer cantidad) {
		if (mes == null) {
			throw new NullPointerException("El mes no puede ser nulo");
		}
		if (mes.isEmpty()) {
			throw new IllegalArgumentException("El mes no puede estar vacío");
		}
		if ((!mes.equalsIgnoreCase(meses[0])) && (!mes.equalsIgnoreCase(meses[1])) && (!mes.equalsIgnoreCase(meses[2]))
				&& (!mes.equalsIgnoreCase(meses[3])) && (!mes.equalsIgnoreCase(meses[4]))
				&& (!mes.equalsIgnoreCase(meses[5])) && (!mes.equalsIgnoreCase(meses[6]))
				&& (!mes.equalsIgnoreCase(meses[7])) && (!mes.equalsIgnoreCase(meses[8]))
				&& (!mes.equalsIgnoreCase(meses[9])) && (!mes.equalsIgnoreCase(meses[10]))
				&& (!mes.equalsIgnoreCase(meses[11]))) {
			throw new IllegalArgumentException("El mes introducido es invalido");
		}
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantidad no puede ser negativa");
		}
		this.mes = mes;
		this.cantidad = cantidad;
	}

	public static void menu(Scanner teclado,HashMap < String,Integer > libroDeVentas ) {
		int accion = 6;
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1. Introducir las ventas de coches de cada mes del año.");
			System.out.println("2. Mostrar las ventas de coches de cada mes del año.");
			System.out.println("3. Mostrar las ventas de coches de todo el año.");
			System.out.println("4. Mostrar las ventas totales de coches de los meses que empiezan por A.");
			System.out.println("5. Mostrar el nombre del mes con mas ventas.");
			System.out.println("6. Salir.");
			accion = pedirEnteroRango(teclado, 6, 1);
			switch (accion) {
			case 1:
				for (int i = 0; i < meses.length; i++) {
					System.out.printf("Introduce la cantidad de coches vendidos en %s:\n", meses[i]);
					Integer cantidad = pedirEnteroRango(teclado, 1000, 0);
					String mes = meses[i];
					libroDeVentas.put(mes, cantidad);
				}
				break;
			case 2:
				for (Map.Entry<String, Integer> entry : libroDeVentas.entrySet()) {
					String key = entry.getKey();
					Integer val = entry.getValue();
					System.out.println(String.format("Las ventas del mes %s fueron %d.", key, val));
				}
				break;
			case 3:
				int suma = 0;
				for (Map.Entry<String, Integer> entry : libroDeVentas.entrySet()) {
					Integer val = entry.getValue();
					suma = suma + val;
				}
				System.out.printf("La suma de todas las ventas del año fue: %d\n", suma);
				break;
			case 4:
				int sumaTotal = 0;
				for (Map.Entry<String, Integer> entry : libroDeVentas.entrySet()) {
					char letra = entry.getKey().charAt(0);
					if (letra == 'A') {
						Integer val = entry.getValue();
						sumaTotal = sumaTotal + val;
					}
				}
				System.out.println("La suma total de los meses que empiezan por 'A' es: "+sumaTotal);
				break;
			case 5:
				int index = 0, vMax = 0;
				for (Map.Entry<String, Integer> entry : libroDeVentas.entrySet()) {
					Integer val = entry.getValue();
					if (val > vMax) {
						vMax = val;
					}
				}
				for (Map.Entry<String, Integer> entry : libroDeVentas.entrySet()) {
					if (entry.getValue() == vMax) {
						System.out.printf("El mes con mas ventas ha sido %s con %d ventas.\n", entry.getKey(), vMax);
					}
				}
				break;
			}
		} while (accion != 6);
	}

	// Devuelve un entero en un rango especificado
	private static int pedirEnteroRango(Scanner tecla, int max, int min) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				numero = tecla.nextInt();
				while (numero < min || numero > max) {
					System.out.printf("Introduzca un numero dentro del rango especificado (%d - %d)\n", min, max);
					numero = tecla.nextInt();
				}
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.printf(
						"Te has equivocado. Por favor, ingresa un número dentro del rango especificado (%d - %d)\n",
						min, max);
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);
		return numero;

	}
}
