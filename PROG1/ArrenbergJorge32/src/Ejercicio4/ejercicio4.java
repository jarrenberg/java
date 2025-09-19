/**
 * Introducimos las notas de 5 asignaturas de 4 alumnos y calculamos la media, la nota maxima y la minima. Por ultimo, mostramos dichas notas de cada alumno
 * Jorge Arrenberg 28/10
 */

package Ejercicio4;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numAlumnos = 4, numAsignaturas = 5;
		float notaMin = 11, notaMax = 0, sumaConsecutiva = 0, media = 0;

		float[][] notas = new float[numAlumnos][numAsignaturas];
		float[] notaMinima = new float[numAlumnos];
		float[] notaMaxima = new float[numAlumnos];
		float[] notaMedia = new float[numAlumnos];

		// Pedimos las notas de cada alumno y las guardamos en la matriz

		for (int i = 0; i < numAlumnos; i++) {
			for (int j = 0; j < numAsignaturas; j++) {
				System.out.println("Introduzca la nota del alumno " + (i + 1) + " en la asignatura " + (j + 1));
				float calificacion = teclado.nextFloat();
				notas[i][j] = calificacion;
				while (calificacion < 0 || calificacion > 10) {
					System.out.println("Valor introducido incorrecto, la nota va de 0 a 10");
					calificacion = teclado.nextFloat();
					notas[i][j] = calificacion;
				}
			}
		}

		// Guardamos en distintos arrays las notas maximas, minimas y la media de cada alumno

		for (int i = 0; i < numAlumnos; i++) {
			notaMax = 0;
			notaMin = 11;
			sumaConsecutiva = 0;
			for (int j = 0; j < numAsignaturas; j++) {
				if (notas[i][j] > notaMax) {
					notaMax = notas[i][j];
					notaMaxima[i] = notaMax;
				}
				if (notas[i][j] < notaMin) {
					notaMin = notas[i][j];
					notaMinima[i] = notaMin;
				}
				sumaConsecutiva = sumaConsecutiva + notas[i][j];
			}
			media = (sumaConsecutiva / numAsignaturas);
			notaMedia[i] = media;
		}
		
		// Mostramos las notas maximas , minimas y la media de cada alumno
		
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Las notas del alumno " + (i + 1) + " son:");
			System.out.println("Nota minima: " + notaMinima[i]);
			System.out.println("Nota maxima: " + notaMaxima[i]);
			System.out.println("Media alumno " + (i + 1) + ": " + notaMedia[i]);
		}
	}
}
