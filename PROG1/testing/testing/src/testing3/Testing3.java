package testing3;

import java.util.Scanner;

public class Testing3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contadorCadenas = 0;
		String cadena;
		String cadenaFin = "fin";
		boolean cadenaFinal = false;
		String[] contenedor = new String[10];

		do {
			System.out.println("Introduzca la cadena de caracteres " + (contadorCadenas + 1) + ":");
			cadena = teclado.nextLine();
			cadenaFinal = cadena.equalsIgnoreCase(cadenaFin);
			if (cadenaFinal == false) {
				contenedor[contadorCadenas] = cadena;
				contadorCadenas = contadorCadenas + 1;
			}

		} while ((contadorCadenas < 10) && (cadenaFinal == false));

		// Mostramos las cadenas de texto y el numero de vocales de cada cadena
		System.out.println("Las cadenas de texto introducidas son:");
		mostrarCadenas(contenedor, contadorCadenas);
		numVocales(contenedor, contadorCadenas);

		// Mostramos la cadena de texto mas larga
		System.out.println("La cadena mas larga es: " + cadenaLarga(contenedor, contadorCadenas));
		System.out.println("");

		// Mostramos las cadenas de caracteres que contienen un punto
		System.out.println("Estas son las cadenas de caracteres que contienen un punto:");
		tienePunto(contenedor, contadorCadenas);

	}

	// Devuelve las cadenas de texto introducidas
	public static void mostrarCadenas(String[] contenedor, int contadorCadenas) {
		for (int i = 0; i < contadorCadenas; i++) {
			System.out.println("Cadena " + (i + 1) + ": " + contenedor[i]);
			System.out.println("");
		}
	}

	// Devuelve el numero de vocales por cadena de texto

	public static void numVocales(String[] contenedor, int contadorCadenas) {
		int contadorVocales = 0;
		;
		for (int i = 0; i < contadorCadenas; i++) {
			contadorVocales = 0;
			int x = contenedor[i].length();
			for (int j = 0; j < x; j++) {
				char caracter = contenedor[i].charAt(j);
				if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o')
						|| (caracter == 'u')) {
					contadorVocales = contadorVocales + 1;
				}
			}
			System.out.println("La cadena de caracteres " + (i + 1) + " tiene " + contadorVocales + " vocales.");
			System.out.println("");

		}
	}

	// Devuelve la cadena mas larga
	public static String cadenaLarga(String[] contenedor, int contadorCadenas) {
		String cadenaLarga = "";
		int numMasLarga = 0;
		for (int i = 0; i < contadorCadenas; i++) {
			int tamanno = contenedor[i].length();
			if (tamanno > numMasLarga) {
				numMasLarga = tamanno;
				cadenaLarga = contenedor[i];
			}

		}

		return cadenaLarga;
	}

	// Devuelve las frases que contienen un punto
	public static void tienePunto(String[] contenedor, int contadorCadenas) {
		String[] tienePunto = new String[contadorCadenas];
		for (int i = 0; i < contadorCadenas; i++) {
			int x = contenedor[i].length();
			for (int j = 0; j < x; j++) {
				char caracter = contenedor[i].charAt(j);
				if (caracter == '.') {
					System.out.println(contenedor[i]);
				}
			}
		}
	}
}
