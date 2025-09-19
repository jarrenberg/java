package vectores;

import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroAlumnos = 5;
		int numeroAsignaturas = 3;
		int notaMates, notaIngles, notaLengua;
		double notaMedia = 0;
		int[][] ArrayPrueba = new int[numeroAlumnos][numeroAsignaturas];
		String[] alumnos = new String[numeroAlumnos];
		String[] nomAsignaturas = new String[numeroAsignaturas];
		for (int i = 0; i < numeroAsignaturas; i++) {
			System.out.println("Introduzca el nombre de la asignatura " + (i + 1) + ":");
			String nombreMateria = teclado.nextLine();
			nomAsignaturas[i] = nombreMateria;
		}

		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.println("Introduzca el nombre del alumno: ");
			String nombre = teclado.nextLine();
			alumnos[i] = nombre;

			for (int j = 0; j < numeroAsignaturas; j++) {
				if (j == numeroAsignaturas - 3) {
					System.out.println("Introduzca la nota de " + nomAsignaturas[0] + " del alumno " + (i + 1));
					notaMates = teclado.nextInt();
					ArrayPrueba[i][j] = notaMates;
				}
				if (j == numeroAsignaturas - 2) {
					System.out.println("Introduzca la nota de " + nomAsignaturas[1] + " del alumno " + (i + 1));
					notaIngles = teclado.nextInt();
					ArrayPrueba[i][j] = notaIngles;
				}
				if (j == numeroAsignaturas - 1) {
					System.out.println("Introduzca la nota de " + nomAsignaturas[2] + " del alumno " + (i + 1));
					notaLengua = teclado.nextInt();
					ArrayPrueba[i][j] = notaLengua;
					teclado.nextLine();
				}
			}

		}
		for (int i = 0; i < numeroAlumnos; i++) {
			notaMedia = 0;
			System.out.println("Notas alumno " + alumnos[i]);
			for (int j = 0; j < numeroAsignaturas; j++) {

				if (j == numeroAsignaturas - 3) {
					System.out.println("Nota Mates: " + ArrayPrueba[i][j]);
					notaMedia = notaMedia + ArrayPrueba[i][j];
				}
				if (j == numeroAsignaturas - 2) {
					System.out.println("Nota Ingles: " + ArrayPrueba[i][j]);
					notaMedia = notaMedia + ArrayPrueba[i][j];
				}
				if (j == numeroAsignaturas - 1) {
					System.out.println("Nota Lengua: " + ArrayPrueba[i][j]);
					notaMedia = notaMedia + ArrayPrueba[i][j];
				}

			}
			notaMedia = (notaMedia / 3);
			System.out.println("La nota media del alumno " + (i + 1) + " es:" + notaMedia);
			System.out.println("");

		}
	}
}
