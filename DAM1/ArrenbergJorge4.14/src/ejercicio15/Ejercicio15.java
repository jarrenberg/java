/**
 * Programa que crea y llena un array, del cual se calcula la suma y la media de su contenido
 * Jorge Arrenberg 15/11/2024
 */

package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Creamons un array de tamaño 50 con los numeros naturales entre 50 y 99
		int[] vectorPrueba = new int[50];
		for (int i = 0; i < vectorPrueba.length; i++) {
			vectorPrueba[i] = (50 + i);
		}
		//Mostramos el resulatdo de la suma de los valores y su media
		System.out.println("La suma de los valores del vector es "+sumaVector(vectorPrueba));
		System.out.println("La media de los valores del vector es "+mediaVector(vectorPrueba));

	}
//Devuelve la suma de todos los numeros contenidos en el array vectorPrueba
	public static int sumaVector (int[] vectorPrueba) {
		int suma=0;
		for(int i = 0; i < 50; i++) {
			suma = suma + vectorPrueba[i];
		}
		return suma;
	}

// Devuelve la media de los numeros contenidos en el array vectorPrueba
	public static float mediaVector (int [] vectorPrueba) {
		float media=0;
		media=((float)sumaVector(vectorPrueba)/50);
		return media;
	}
}
