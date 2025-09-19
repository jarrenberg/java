package practicaExamen;

import java.util.Scanner;

public class PracticaExamen {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contadorCadenas = 0;
		boolean cadenaFinal = false;
		String cadenaFin = "fin";
		String cadena;
		String[] contenedor = new String[10];
		do {
			System.out.println("Introduzca una cadena de texto");
			cadena = teclado.nextLine();
			contenedor[contadorCadenas] = cadena;
			cadenaFinal = cadena.equalsIgnoreCase(cadenaFin);
			contadorCadenas = contadorCadenas + 1;

		} while ((contadorCadenas < 10) && (cadenaFinal == false));

		

		// num vocales por cadena
		// cadenas con punto

		for (int i = 0; i < contadorCadenas; i++) {
			System.out.println(contenedor[i]);
			System.out.println(vocales(contenedor[i]));
			
		}
	}

	// Devuelve la cadena de texto mas larga
	public static String cadenaLarga(String[] contenedor) {
		int longitud = 0;
		int tamanno = 0;
		String almacen = "";
		String cadenaLarga = "";
		for (int i = 0; i < 10; i++) {
			almacen = contenedor[i];
			tamanno = almacen.length();
			if (tamanno > longitud) {
				longitud = tamanno;
				cadenaLarga = almacen;
			}
		}
		return cadenaLarga;
	}

	// Deuvelve cuantas bocales tiene cada cadena
	public static int vocales(String texto) {
		char caracter;
		int contadorVocales=0;
		int longitud = texto.length();
		for (int i = 0; i < longitud; i++) {
			caracter = texto.charAt(i);
			if ((caracter == 'a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
				contadorVocales = contadorVocales + 1;
			}
		}
		return contadorVocales;
	}

	// devuelve si la cadena tiene punto
	public static boolean tienePunto(String[] contenedor) {
		boolean tienePunto = false;
		int longitud = 0;
		char caracter;
		for (int j = 0; j < 10; j++) {
			longitud = contenedor[j].length();
			for (int i = 0; i < longitud; i++) {
				String subcad = contenedor[j].substring(i);
				subcad = subcad.toLowerCase();
				caracter = subcad.charAt(0);
				if (caracter == '.') {
					tienePunto = true;
				}
			}
		}
		return tienePunto;
	}
}
