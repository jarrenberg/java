/*
 * Clase de testeo para las Clases derivadas de Figura donde se prueban sus constructores y metodos
 * Jorge Arrenberg 09/03/2025 
 * 
 */

package ejercicio6;

import java.time.LocalDate;

public class ProgramaFiguras {
	public static void main(String[] args) {
		System.out.printf("1. Crea un Array de figuras. ...\n");
		Figuras[] figuras = new Figuras[10];

		System.out.printf("\n2. Añade figuras de varios tipos. ...\n");
		Cuadrado cd1, cd2;
		try {
			cd1 = new Cuadrado(5);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			cd1 = new Cuadrado(5);
		}
		try {
			cd2 = new Cuadrado(-7);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			cd2 = new Cuadrado(7);
		}

		Rectangulo r1, r2;
		try {
			r1 = new Rectangulo(5, 6);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			r1 = new Rectangulo(3, 3);
		}
		try {
			r2 = new Rectangulo(-5, 4);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			r2 = new Rectangulo(5, 5);
		}

		Triangulo t1, t2;
		try {
			t1 = new Triangulo(5, 6);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			t1 = new Triangulo(3, 3);
		}
		try {
			t2 = new Triangulo(-5, 4);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			t2 = new Triangulo(5, 5);
		}
		Circulo c1, c2;
		try {
			c1 = new Circulo(5);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			c1 = new Circulo(3);
		}
		try {
			c2 = new Circulo(-5);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			c2 = new Circulo(5);
		}
		System.out.printf("\n3. Muestra la información de todas las figuras. ...\n");
		figuras[0] = cd1;
		figuras[1] = cd2;
		figuras[2] = r1;
		figuras[3] = r2;
		figuras[4] = t1;
		figuras[5] = t2;
		figuras[6] = c1;
		figuras[7] = c2;

		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] != null) {
				figuras[i].imprimir();
			}
		}

		System.out.printf("\n4. Escala todas las figuras con escala = 2 ...\n");
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] != null) {
				figuras[i].escalar(2);
			}
		}

		System.out.printf("\n5. Muestra de nuevo la información de todas las figuras ...\n");
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] != null) {
				figuras[i].imprimir();
			}
		}

		System.out.printf("\n6. Escala todas las figuras con escala = 0.1 ...\n");
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] != null) {
				figuras[i].escalar(0.1);
			}
		}

		System.out.printf("\n7. Muestra de nuevo la información de todas las figuras ...\n");
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] != null) {
				figuras[i].imprimir();
			}
		}
	}
}
