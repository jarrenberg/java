package ejercicio8;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import ejercicio2.Contacto;

public class DiaTemperatura implements Comparable<DiaTemperatura> {
	public static final int ANYO = 2025;
	public static final int MES = 03;
	public static final int DIA_MAXIMO = 31;

	private static int dia;

	private int numDia;
	private String diaSemana;
	private Double tempMedia;

	static {
		dia = 1;
	}

	public DiaTemperatura(double tempMedia) {
		LocalDate f = LocalDate.of(ANYO, MES, dia);
		this.numDia = dia;
		this.diaSemana = f.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")).toUpperCase();
		this.tempMedia = tempMedia;
		dia++;
	}

	public static void menu(Scanner teclado, ArrayList<DiaTemperatura> calendario) {
		int accion = 5;
		do {
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1. Introducir las temperaturas de cada dia del mes de marzo de 2025.");
			System.out.println("2. Mostrar las temperaturas ordendas de mayor a menor.");
			System.out.println("3. Mostrar las temperatura media del mes.");
			System.out.println("4. Mostrar el dia o dias mas calurosos del mes.");
			System.out.println("5. Salir.");
			accion = pedirEnteroRango(teclado, 5, 1);
			switch (accion) {
			case 1:
				for (int i = 0; i < DIA_MAXIMO; i++) {
					System.out.printf("Introduzca la temperatura del dia %s:\n", (i + 1));
					double t = temperatura(50, (-20));
					System.out.println(String.format("%.2f", t));
					calendario.add(new DiaTemperatura(t));
				}
				break;
			case 2:
				ArrayList<DiaTemperatura> a = calendario;
				Collections.sort(a);
				for (DiaTemperatura d : a) {
					System.out.println(d.toString());
				}
				break;
			case 3:
				double suma = 0;
				for (DiaTemperatura d : calendario) {
					suma = suma + d.tempMedia;
				}
				System.out.printf("La temperatura media del mes es: %.2fºC\n", suma / DIA_MAXIMO);
				break;
			case 4:
				String m = "";
				ArrayList<DiaTemperatura> b = calendario;
				double tempMax = b.getFirst().tempMedia;
				Collections.sort(b);
				for (DiaTemperatura d : b) {
					if (d.tempMedia == tempMax) {
						m = String.format("%s%s", m, d.toString());
					}
				}
				System.out.println(String.format("El dia o dias mas calurosos fueron:\n %s", m));
				break;
			}
		} while (accion != 5);
	}

	// Devuelve un numero dentro de un rango
	private static double temperatura(double max, double min) {
		return min + (Math.random() * (max - min));
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

	public String toString() {
		return String.format("Dia %d, %s e hizo %.2f ºC\n", numDia, diaSemana, tempMedia);
	}

	@Override
	public int compareTo(DiaTemperatura o) {
		if (o == null) {
			throw new NullPointerException("El parametro es un objeto nulo");
		}
		return o.tempMedia.compareTo(this.tempMedia);
	}
}
