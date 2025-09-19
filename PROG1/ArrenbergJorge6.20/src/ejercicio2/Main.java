package ejercicio2;

public class Main {

	public static void main(String[] args) {
		// Creacion de una cafetera vacia que se llena con 250cc y que sirve tazas de
		// cafe hasta que se agota

		// Primero creamos la cafetera vacia
		System.out.printf("Creacion de una cafetera ...\n");
		Cafetera cafetera1 = new Cafetera();

		// Luego la llenamos con 250cc
		System.out.printf("\nLLenamos la cafetera con 250cc ...\n ");
		try {
			cafetera1.llenarCantidad(250);
		} catch (IllegalStateException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		} catch (IllegalArgumentException ex2) {
			System.out.printf("Error. %s", ex2.getMessage());
		} catch (Exception ex3) {
			System.out.println("Ha ocurrido un error desconocido");
		}

		// Servimos tazas de cafe hasta que se agote
		System.out.printf("\nServimos tazas de 25cc hasta que la cafetera se agote:\n");
		do {
			System.out.println("\nSirviendo una taza de 25cc ...\n");
			
			
			try {
				cafetera1.servirTaza(25);
			} catch (IllegalStateException ex1) {
				System.out.printf("Error. %s\n", ex1.getMessage()); // Preguntar a rafa como hacer q me salga
			} catch (IllegalArgumentException ex2) {
				System.out.printf("Error. %s\n", ex2.getMessage());
			} catch (Exception ex3) {
				System.out.println("Ha ocurrido un error desconocido");
			}
			
		} while (cafetera1.getCantidadActual() > 0);

		// Creacion de una cafetera llena que sirva 50 cafes de 50cc.
		// Cuando se vacia se vuelve a llenar informando al usuario

		// Creamos la cafetera llena
		Cafetera cafetera2 = new Cafetera(Cafetera.CAPACIDAD_MAXIMA_POR_DEFECTO);

		// Servimos 50 cafes de 50cc informando cuando se vacia y la rellanamos
		int tazasServidas = 0;

		// Servimos las 50 tazas rellenando la cafetera caudno haga faltaç
		System.out.printf("Servimos 50 tazas:\n");
		do {
			try {
				cafetera2.servirTaza(50);
			} catch (IllegalStateException ex1) {
				System.out.printf("Error. %s\n", ex1.getMessage()); // Preguntar a rafa como hacer q me salga
			} catch (IllegalArgumentException ex2) {
				System.out.printf("Error. %s\n", ex2.getMessage());
			} catch (Exception ex3) {
				System.out.println("Ha ocurrido un error desconocido");
			}
			if (cafetera2.getCantidadActual() == 0) {
				System.out.println("La cafetera esta vacía. Rellenandola ....");
				cafetera2.llenarCantidad(cafetera2.getCapacidadMaxima());

			}
			tazasServidas++;

		} while (tazasServidas < 50);
	}

}
