/*
 * Ejmplos de usuo de la clase cancion
 * Jorge Arrenberg 03/02/2025
 */

package ejercicio2;

import ejercicio1.Cancion;

public class Main {

	public static void main(String[] args) {
		// 1. Crea un CD llamado unCd
		System.out.printf("1. Crea un CD llamado unCd\n");
		CD unCd = new CD();

		// 2. Incluye tres canciones y muestra el número de canciones que incluye.
		System.out.printf("\n2. Incluye tres canciones y muestra el número de canciones que incluye.\n");
		System.out.println("Incluyendo 3 cancines...");
		try {
			unCd.agrega(new Cancion("Envidia", "Disobey"));
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		try {
			unCd.agrega(new Cancion("Numa Numa Ye", "Cecilio G"));
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		try {
			unCd.agrega(new Cancion("Libre", "Nino Bravo"));
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		System.out.printf("El disco contiene %d canciones\n", unCd.getNumCanciones());

		// 3. Elimina la segunda canción.
		System.out.printf("\n3. Elimina la segunda canción.\n");
		System.out.println("Segunda cancion eliminada...");
		try {
			unCd.elimina(2);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error. %s", ex2.getMessage());
		}

		System.out.println(unCd.toString());

		// 4. Crea un CD llamado otroCd y copia el contenido de unCd a él.
		System.out.printf("\n4. Crea un CD llamado otroCd y copia el contenido de unCd a él.\n");
		System.out.println("Creando un CD copia...");
		CD otroCd = unCd.copia();
		// Preguntar por que no funciona el metodo copia

		// 5. Agrega una canción a otroCd.
		System.out.printf("\n5. Agrega una canción a otroCd.\n");
		System.out.println("Agregando la cancion 'Un beso y una flor' de Nino Bravo ...");
		try {
			otroCd.agrega(new Cancion("Un beso y una flor", "Nino Bravo"));
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}

		// 6. Muestra el contenido de unCd.
		System.out.printf("\n6. Muestra el contenido de unCd.\n");
		System.out.println(unCd.toString());

		// 7. Muestra el contenido de otroCd.
		System.out.printf("\n 7. Muestra el contenido de otroCd.\n");
		System.out.println(otroCd.toString());
	}

}
