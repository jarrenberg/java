
/**
 * Programa al que se le introduce una tabla y te devuelve el dia mas lluvioso por cada municipio cada dia, devuelve la media global de todo lo llovido e indica la lluvia acumulada en un municipio en un tramo de dias
 * Jorge Arrenberg 13/12/2024
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int municipio = 0;
		int[][] tabla = { { 0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22 },
				{ 24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29 },
				{ 17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32 },
				{ 2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32 },
				{ 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3 },
				{ 18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36 },
				{ 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64 },
				{ 7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0 },
				{ 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 7, 130, 43 },
				{ 4, 33, 1, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 10, 20, 31 } };

		String[] ciudades = { "MIJAS", "UBRIQUE", "PUJERRA", "OJEN", "MALAGA", "RONDA", "COIN", "TORROX", "ARDALES",
				"MARBELLA" };

		// Mostramos el municipio mas lluvioso por cada dia
		for (int i = 0; i < 16; i++) {
			System.out.println(
					"El dia " + (i + 16) + " el municipio mas lluvioso fue " + ciudades[diaMasLluvioso(tabla, i)]);
		}
		// Mostramos la media de precipitaciones global
		System.out.println("");
		System.out.println("La media de precipitaciones global es: " + media(tabla));
		System.out.println("");

		// Pedimos al usuario el dia de inicio del intervalo de dias donde quiere
		// saberse el acumulado de precipitaciones
		System.out.println("Introduzca un dia de inicio:");
		int diaInicio = teclado.nextInt();
		while (diaInicio < 16 || diaInicio > 31) { // Verificamos que el numero introducido por el usuario esta dentro
													// del rango de dias que manejamos
			System.out.println("El numero a introducir debe estar entre 16 y 31");
			diaInicio = teclado.nextInt();
		}
		// Pedimos al usuario el dia de fin del intervalo de dias donde quiere saberse
		// el acumulado de precipitaciones
		System.out.println("Introduzca un dia de fin:");
		int diaFin = teclado.nextInt();
		while (diaFin < 16 || diaFin > 31) {// Verificamos que el numero introducido por el usuario esta dentro del
											// rango de dias que manejamos
			System.out.println("El numero a introducir debe estar entre 16 y 31");
			diaFin = teclado.nextInt();
		}
		while (diaFin < diaInicio) { // Verificamos que el dia de fin es mayor que el dia de inicio
			System.out.println("El dia de fin debe ser mayor que el de inicio. Num.Inicio=" + diaInicio);
			diaFin = teclado.nextInt();
		}
		teclado.nextLine();// Limpiamos el buffer
		// Pedimos al usuario q introduzca el municipio
		System.out.println("Introduzca el municipio");
		String ciudad = teclado.nextLine();

		// Asignamos a la variable municipio el valor de la posicion en el array
		// ciudades de la ciudad introducida por el usuario
		if (ciudad.equalsIgnoreCase("mijas")) {
			municipio = 0;
		}
		if (ciudad.equalsIgnoreCase("ubrique")) {
			municipio = 1;
		}
		if (ciudad.equalsIgnoreCase("pujerra")) {
			municipio = 2;
		}
		if (ciudad.equalsIgnoreCase("ojen")) {
			municipio = 3;
		}
		if (ciudad.equalsIgnoreCase("malaga")) {
			municipio = 4;
		}
		if (ciudad.equalsIgnoreCase("ronda")) {
			municipio = 5;
		}
		if (ciudad.equalsIgnoreCase("coin")) {
			municipio = 5;
		}
		if (ciudad.equalsIgnoreCase("torrox")) {
			municipio = 7;
		}
		if (ciudad.equalsIgnoreCase("ardales")) {
			municipio = 8;
		}
		if (ciudad.equalsIgnoreCase("marbella")) {
			municipio = 9;
		}

		// Mostramos la suma de las precipitaciones en la ciudad y los dias introducidos
		// por el usuario
		System.out.println("La suma de precipitaciones en " + ciudad + " entre  el dia " + diaInicio + " y el dia "
				+ diaFin + " es: " + sumaTramo(tabla, municipio, diaInicio, diaFin));

	}

	// Devuelve la posicion en el array de la ciudad mas lluviosa cada dia
	public static int diaMasLluvioso(int[][] tabla, int i) {
		int diaMasLluvia = 0;
		int posicion = 0;
		for (int k = 0; k < 9; k++) {
			if (tabla[k][i] > diaMasLluvia) {
				diaMasLluvia = tabla[k][i];
				posicion = k;
			}
		}
		return posicion;
	}

	// Devuelve la media global de precipitaciones
	public static double media(int[][] tabla) {
		double media = 0;
		double suma = 0;
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 9; j++) {
				suma = suma + tabla[j][i];
			}
		}
		media = suma / 160.0;
		return media;
	}

	// Devuelve la suma de precipitaciones en un tramo de dias en un municipio
	public static int sumaTramo(int[][] tabla, int municipio, int diaInicio, int diaFin) {
		int sumaTramo = 0;
		int inicio = diaInicio - 16;
		int fin = diaFin - 16;
		for (int i = inicio; i <= fin; i++) {
			sumaTramo = sumaTramo + tabla[municipio][i];
		}

		return sumaTramo;
	}

}
