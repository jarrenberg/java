package ejemploArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad = numAleatorio(100, 1);

		// Creacion de la coleccion
		ArrayList<Integer> miLista = new ArrayList<Integer>(cantidad);
		for (int i = 0; i < cantidad; i++) {
			miLista.add(numAleatorio(100, 1));
		}
		// Mostrando su tamaño y el contenido
		System.out.println(miLista.size());
		System.out.println(miLista.toString());

		// Mostrando los elementos de la coleccion en posiciones pares
		for (int i = 0; i < cantidad; i = i + 2) {
			System.out.print(miLista.get(i) + " ");
		}

		// Comprobando que mi coleccion contiene un elemento
		System.out.println();
		System.out.println("Introduzca un numero:");
		int num = teclado.nextInt();

		boolean contiene = miLista.contains(num);
		if (contiene) {
			System.out.println("El numero " + num + " esta en la coleccion");
		} else {
			System.out.println("El numero " + num + " no esta en la coleccion");
		}

		// Eliminando un elemento por posicion
		int posicion = 0;
		do {
			System.out.println("Introduzca una posicion:");
			posicion = teclado.nextInt();
		} while (posicion < 0 || posicion > cantidad);

		miLista.remove(posicion - 1);

		System.out.println(miLista.toString());

		// Introduciendo una coleccion en mi coleccion
		cantidad = numAleatorio(10, 1);
		ArrayList<Integer> miLista2 = new ArrayList<Integer>(cantidad);
		for (int i = 0; i < cantidad; i++) {
			miLista2.add(numAleatorio(100, 1));
		}
		System.out.println("Coleccion 1:");
		System.out.println(miLista.toString());
		try {
		miLista.addAll(miLista2);
		}catch (NullPointerException ex) {
			System.out.println("La coleccioin esta vacia");
		}
		System.out.println("Coleccion 2:");
		System.out.println(miLista2.toString());
		System.out.println("Coleccion 1 + Coleccion 2:");
		System.out.println(miLista.toString());
		
		// Introducir otra coleccion en mi coleccion en una posicion aleatoria
		posicion = numAleatorio(50,1);
		try {
			miLista.addAll(posicion,miLista2);
			}catch (NullPointerException ex) {
				System.out.println("La coleccioin esta vacia");
			}catch(IndexOutOfBoundsException ex) {
				System.out.println("La posicion esta fuera de los limites");
			}
		System.out.println("Mostrando miLista con miLista2 añadida en la posicion "+posicion+":");
		System.out.println(miLista);
	}

	public static int numAleatorio(int max, int min) {
		int num = (int) ((Math.random() * (max - min)) + 1);
		return num;
	}
}
