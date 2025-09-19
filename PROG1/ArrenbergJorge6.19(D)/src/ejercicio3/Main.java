/**
 * Programa donde se crean y se dan valores a objetos de la clase Rectangulo
 * Jorge Arrenberg 10/01/2025
 */
package ejercicio3;

public class Main {
	public static void main(String[] args) {
		// Declaracion e instanciacion de dos objetos rectangulo asignandole los valores
		// con el constructor
		Rectangulo rectangulo1 = null;
		Rectangulo rectangulo2 = null;
		try {
			System.out.println("Creando rectangulo1:...");
			rectangulo1 = new Rectangulo(0, 0, 5, 5);
			System.out.println("Creando rectangulo2:...");
			rectangulo2 = new Rectangulo(7, 9, 2, 3);
		} catch (IllegalArgumentException excepcion1) {
			System.out.printf("Error. %s\n", excepcion1.getMessage());
		} catch (Exception excepcion2) {
			System.out.println("Error desconocido.");
		}
		
		// Usamos el metodo para guardar x1,y1
		try {
		rectangulo1.setX1Y1(1, 1);
		}catch (IllegalArgumentException ex) {
			System.out.printf("Error.%s\n",ex);
		}catch (NullPointerException excepcion3) {
			System.out.printf("Error. %s\n", excepcion3.getMessage());
		}catch (Exception excepcion4) {
			System.out.println("Error desconocido.");
		}

		// Usamos el metodo para guardar x2,y2
		try {
		rectangulo1.setX2Y2(-1,-1);
		}catch (IllegalArgumentException ex) {
			System.out.printf("Error.%s\n",ex);
		}catch (NullPointerException excepcion5) {
			System.out.printf("Error. %s\n", excepcion5.getMessage());
		}catch (Exception excepcion6) {
			System.out.println("Error desconocido.");
		}

		// Usamos el metodo para guardar todos los parametros
		try {
		rectangulo2.setAll(1, 2, 2, 3);
		}catch (NullPointerException excepcion7) {
			System.out.printf("Error. %s\n", excepcion7.getMessage());
		}catch (Exception excepcion8) {
			System.out.println("Error desconocido.");
		}

		// Mostrar por pantalla sus coordenadas
		try {
			System.out.println("Informacion rectangulo1:");
			rectangulo1.imprime();
			System.out.println("Informacion rectangulo2:");
			rectangulo2.imprime();
		} catch (NullPointerException excepcion10) {
			System.out.printf("Error. %s\n", excepcion10.getMessage());
		}
		
		try {
		System.out.printf("Perimetro del rectangulo1: %d\n", rectangulo1.getPerimetro());
		System.out.printf("Perimetro del rectangulo2: %d\n", rectangulo2.getPerimetro());
		} catch (NullPointerException excepcion10) {
			System.out.printf("Error. %s\n", excepcion10.getMessage());
		}
		try {
		System.out.printf("Area del rectangulo1: %d\n", rectangulo1.getArea());
		System.out.printf("Area del rectangulo2: %d\n", rectangulo2.getArea());
		} catch (NullPointerException excepcion10) {
			System.out.printf("Error. %s\n", excepcion10.getMessage());
		}

	}
}
