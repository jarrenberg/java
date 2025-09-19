/**
 * Mmostramos una interfaz con opciones para introducir numeros en un array, mostrar los valores del array y finalizar el programa
 * Jorge Arrenberg 28/10
 * 
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño = 10, posicion;
		int[] numeros = new int[tamaño];
		for (int i = 0; i < tamaño; i++) {
			numeros[i] = 0;
		}
		
		System.out.println("Introduzca:");
		System.out.println("0) Mostrar Valores");
		System.out.println("1) Introducir Valor");
		System.out.println("2) Salir");
		int accion = teclado.nextInt();

		while (accion < 0 || accion > 2) {
			System.out.println("La accion introducida es incorrecta:");
			System.out.println("Introduzca:");
			System.out.println("0) Mostrar Valores");
			System.out.println("1) Introducir Valor");
			System.out.println("2) Salir");
			accion = teclado.nextInt();
		}
		if (accion == 0) {
			do {
				for (int i = 0; i < tamaño; i++) {
					System.out.print(numeros[i] + " ");
				}
				System.out.println(" ");
				System.out.println("Introduzca:");
				System.out.println("0) Mostrar Valores");
				System.out.println("1) Introducir Valor");
				System.out.println("2) Salir");
				accion = teclado.nextInt();
			} while (accion == 0);
		}

		if (accion == 1) {
			do {
			System.out.println("Introduzca una posicion del array del 1 al " + tamaño);
			posicion = teclado.nextInt();
			while (posicion < 1 || posicion > 10) {
				System.out.println("Las posiciones van del 1 al " + tamaño + ". Vuelva a introducir la posicion:");
				posicion = teclado.nextInt();
			}
			posicion = posicion - 1;
			System.out.println("Introduzca un valor");
			int valor = teclado.nextInt();
			numeros[posicion] = valor;
			System.out.println("Introduzca:");
			System.out.println("0) Mostrar Valores");
			System.out.println("1) Introducir Valor");
			System.out.println("2) Salir");
			accion = teclado.nextInt();
			while (accion == 0){
				for (int i = 0; i < tamaño; i++) {
					System.out.print(numeros[i] + " ");
				}
				System.out.println(" ");
				System.out.println("Introduzca:");
				System.out.println("0) Mostrar Valores");
				System.out.println("1) Introducir Valor");
				System.out.println("2) Salir");
				accion = teclado.nextInt();
			}
			
			}while (accion==1);
		}
		if (accion == 2) {
			System.out.println("Finalizando programa");
		}
	}
}
