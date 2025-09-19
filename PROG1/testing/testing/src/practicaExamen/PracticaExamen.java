package practicaExamen;

import java.util.Scanner;

public class PracticaExamen {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contadorCadenas = 0, numMasLarga = 0, tamanno = 0;
		String cadena;
		String cadenaFin = "fin";
		boolean cadenaFinal = false;
		String cadenaLarga = "";
		String[] contenedor = new String[10];

		do {
			System.out.println("Introduzca una cadena de texto");
			cadena = teclado.nextLine();
			cadenaFinal = cadena.equalsIgnoreCase(cadenaFin);
			contenedor[contadorCadenas] = cadena;
			contadorCadenas = contadorCadenas + 1;
		} while ((contadorCadenas < 10) && (cadenaFinal == false));

		// Mostramos las cadenas de texto
		System.out.println("Las cadenas de texto introducidas son:");
		System.out.println("");
		for (int i = 0; i < contadorCadenas; i++) {
			int contadorVocales = 0;
			System.out.println(contenedor[i]);
			int x = contenedor[i].length();
			for (int j = 0; j < x; j++) {
				char caracter = contenedor[i].charAt(j);
				if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o')
						|| (caracter == 'u')) {
					contadorVocales = contadorVocales + 1;
				}
			}
			System.out.println("Esta cadena de caracteres tine " + contadorVocales + " vocales.");
			System.out.println("");

		}

		// Mostramos la cadena de texto mas larga
		for (int i = 0; i < contadorCadenas; i++) {
			tamanno = contenedor[i].length();
			if (tamanno > numMasLarga) {
				numMasLarga = tamanno;
				cadenaLarga = contenedor[i];
			}

		}

		System.out.println("La cadena mas larga es: " + cadenaLarga);

		System.out.println("Estas son las cadenas de caracteres que contienen un punto.");
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
	//Devuelve las frases que contienen un punto
}
