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

		}

		// Mostrar por pantalla sus coordenadas
		try {
			System.out.printf("Coordenadas del rectangulo1: (%d,%d)(%d,%d)\n", rectangulo1.x1, rectangulo1.y1,
					rectangulo1.x2, rectangulo1.y2);
			System.out.printf("Coordenadas del rectangulo2: (%d,%d)(%d,%d)\n", rectangulo2.x1, rectangulo2.y1,
					rectangulo2.x2, rectangulo2.y2);
			System.out.printf("Perimetro del rectangulo1: %d\n", rectangulo1.perimetro());
			System.out.printf("Perimetro del rectangulo2: %d\n", rectangulo2.perimetro());
			System.out.printf("Area del rectangulo1: %d\n", rectangulo1.area());
			System.out.printf("Area del rectangulo2: %d\n", rectangulo2.area());

		} catch (NullPointerException excepcion3) {
			System.out.printf("Error. %s\n", excepcion3.getMessage());
		}
	}
}
