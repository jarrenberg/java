/**
 * Creamos una matriz para almacenar el genero y el salario de cada empleado. Luego recorremos la matriz y hacemos la media de los sueldos masculinos y los femeninos y mostramos si hay breacha salarial o no
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int campos = 2;
		int mediaMasc = 0, mediaFem = 0, sumaMasc = 0, sumaFem = 0;
		int contadorMasc = 0, contadorFem = 0;

		// Introducimos el tamaño del array

		System.out.println("Introduzca el numero de empleados a comprobar");
		int tamanno = teclado.nextInt();
		while (tamanno <= 1) {
			System.out.println("El numero de empleados debe ser mayor que 1, vuelva a introducir el valor");
			tamanno = teclado.nextInt();
		}
		int[][] empleados = new int[tamanno][campos];

		// Rellenamos la matriz con los valores que introduce el usuario (El genero en la
		// primera fila y los salarios en la segunda)

		for (int i = 0; i < tamanno; i++) {
			for (int j = 0; j < campos; j++) {
				if (j == 0) {
					System.out.println("Introduzca el genero del empleado (0=varon / 1=mujer)");
					int genero = teclado.nextInt();
					while (genero < 0 || genero > 1) {
						System.out.println("Introduzca el genero del empleado (0=varon / 1=mujer)");
						genero = teclado.nextInt();

					}
					empleados[i][j] = genero;
				}
				if (j == 1) {
					System.out.println("Introduzca el salario del empleado: ");
					int salario = teclado.nextInt();
					while (salario < 0) {
						System.out.println("El numero introducido es negativo, introduzca el salario del empleado: ");
						salario = teclado.nextInt();
					}
					empleados[i][j] = salario;
				}
			}
		}

		//Comprobamos el genero del empleado, sumamos los sueldos de los empleados con un mismo genero y hacemos la media

		for (int i = 0; i < tamanno; i++) {
			for (int j = 0; j < campos; j++) {
				if (j == 0) {
					if (empleados[i][j] == 0) {
						sumaMasc = sumaMasc + empleados[i][j + 1];
						contadorMasc = contadorMasc + 1;
					}
					if (empleados[i][j] == 1) {
						sumaFem = sumaFem + empleados[i][j + 1];
						contadorFem = contadorFem + 1;
					}
				}
			}
		}
		if (contadorMasc == 0) {
			mediaMasc = 0;
		}
		if (contadorFem == 0) {
			mediaFem = 0;
		}
		if (contadorMasc != 0) {
			mediaMasc = (sumaMasc / contadorMasc);
		}
		if (contadorFem != 0) {
			mediaFem = (sumaFem / contadorFem);
		}

		//Mostramos los resultado de la matriz viendo si hay brecha salarial o no
		
		if (mediaMasc > mediaFem) {
			System.out.println("Hay diferencia salarial en favor de los hombres");
			System.out.println("Media sueldos hombres: " + mediaMasc);
			System.out.println("Media sueldos mujeres: " + mediaFem);
		}
		if (mediaMasc < mediaFem) {
			System.out.println("Hay diferencia salarial en favor de las mujeres");
			System.out.println("Media sueldos hombres: " + mediaMasc);
			System.out.println("Media sueldos mujeres: " + mediaFem);
		} else {
			System.out.println("No existe diferencia salarial");
			System.out.println("Media sueldos hombres: " + mediaMasc);
			System.out.println("Media sueldos mujeres: " + mediaFem);
		}
	}
}
