/*
 * Clase donde se pone a prueba los metodos y constructores de la clase teatro, tratando sus excepciones
 * Jorge Arrenberg 11/03/2025
 */
package teatro;

import java.util.Iterator;

import libtarea3.Teatro;

public class PrincipalTeatro {

	public static void main(String[] args) {
		//1. Crea diez teatros por defecto.
		//Evidencia: mostrar el estado de los teatros creados 
		System.out.println("1. Crea diez teatros por defecto.");
		// Creacion de un array de 10 teatros por defecto
		Teatro [] teatros = new Teatro [10];
		for (int i = 0; i < teatros.length; i++) {
			teatros[i] = new Teatro ();
		}
		System.out.printf("\nMostrando estado ...\n");
		// Muestra de los 10 teatros contenidos en el array
		for (int i = 0; i < teatros.length; i++) {
			System.out.println(teatros[i].toString());
		}
		System.out.println();
		//2. Compra 25 entradas para cada uno de los teatros creados. 
		//Evidencia: mostrar el estado de los teatros creados 
		System.out.println("2. Compra 25 entradas para cada uno de los teatros creados. ");
		//Comprando 25 entradas para cada teatro
		for (int i = 0; i < teatros.length; i++) {
				try {
					teatros[i].comprarEntradas(25);
				}catch (IllegalArgumentException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
				}catch (IllegalStateException ex) {
					System.out.printf("Error. %s\n", ex.getMessage());
				}
		}
		System.out.printf("\nMostrando estado ...\n");
		// Muestra de los 10 teatros contenidos en el array
		for (int i = 0; i < teatros.length; i++) {
			System.out.println(teatros[i].toString());
		}
		System.out.println();
		
		
		//3. Asigna la obra "La Celestina" a los cinco primeros teatros creados.
		//Evidencia: mostrar el estado de los cinco teatros.
		System.out.println("3. Asigna la obra \"La Celestina\" a los cinco primeros teatros creados.");
		// Asignando la obra la celestina a los 5 primeros teatros
		for (int i = 0; i < 5; i++) {
			try {
				teatros[i].asignarObra("La celestina");
			}catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}catch (IllegalStateException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}catch(NullPointerException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}
		}
		System.out.printf("\nMostrando estado ...\n");
		// Muestra de los 10 teatros contenidos en el array
		for (int i = 0; i < 5; i++) {
			System.out.println(teatros[i].toString());
		}
		System.out.println();
		
		
		//4. Crea un teatro con el nombre "Cervantes" y aforo 500. Asigna la obra "La vida es bella" a este teatro.
		//Evidencia: mostrar el estado del teatro creado.
		System.out.println("4. Crea un teatro con el nombre \"Cervantes\" y aforo 500. Asigna la obra \"La vida es bella\" a este teatro.");
		//Creando el teatro con el nombre y aforo
		Teatro cervantes;
		try {
			cervantes = new Teatro ("Cervantes",500);
		}catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			System.out.println("Creando teatro por defecto ...");
			cervantes = new Teatro();
		}catch(NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			System.out.println("Creando teatro por defecto ...");
			cervantes = new Teatro();
		}
		// Asignando la obra "La vida es bella" al teatro anteriormente creado.
		try {
			cervantes.asignarObra("La vida es bella");
		}catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}catch(NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.printf("\nMostrando estado ...\n");
		//Mostrando el estado del teatro creado
		System.out.println(cervantes.toString());
		System.out.println();
		
		//5. Compra un número de entradas aleatorio entre 100 y 1000. En el caso de que supere las entradas disponibles, se comprarán todas las posibles.
		//Evidencia: mostrar el número de entradas a comprar y el estado del teatro Cervantes.
		System.out.println("5. Compra un número de entradas aleatorio entre 100 y 1000. En el caso de que supere las entradas disponibles, se comprarán todas las posibles.");
		
		// Comprando un numero de entradas entre 100 y 1000
		int entradasDisponibles= (cervantes.getAforo()-cervantes.getEntradasVendidas());
		try {
			cervantes.comprarEntradas(numAleatorio(1000,100));
		}catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			System.out.println("Comprando todas las entradas posibles ...");
			
			try {
				cervantes.comprarEntradas(entradasDisponibles);
			}catch (IllegalArgumentException ex1) {
				System.out.printf("Error. %s\n", ex1.getMessage());
			}catch (IllegalStateException ex1) {
				System.out.printf("Error. %s\n", ex1.getMessage());
			}
			
		}catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			System.out.println("Comprando todas las entradas posibles ...");
			try {
				cervantes.comprarEntradas(entradasDisponibles);
			}catch (IllegalArgumentException ex1) {
				System.out.printf("Error. %s\n", ex1.getMessage());
			}catch (IllegalStateException ex1) {
				System.out.printf("Error. %s\n", ex1.getMessage());
			}
		}
		System.out.printf("\nMostrando estado ...\n");
		//Mostrando el estado del teatro creado
		System.out.printf("Entradas vendidas: %d\n",cervantes.getEntradasVendidas());
		System.out.println(cervantes.toString());
		System.out.println();
		
		
		//6. Crea un teatro con el nombre "Soho Málaga" y aforo 1000.
		//Evidencia: mostrar el estado del teatro Soho Málaga.
		System.out.println("6. Crea un teatro con el nombre \"Soho Málaga\" y aforo 1000.");
		
		//Creando un teatro de nombres Soho Málaga y aforo 1000
		Teatro soho;
		try {
			soho = new Teatro ("Soho Málaga",1000);
		}catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			System.out.println("Creando teatro por defecto ...");
			soho = new Teatro();
		}catch(NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			System.out.println("Creando teatro por defecto ...");
			soho = new Teatro();
		}
		
		System.out.printf("\nMostrando estado ...\n");
		//Mostrando el estado del teatro creado
		System.out.println(soho.toString());
		System.out.println();
		
		//7. Traspasa la obra asignada del teatro "Cervantes" al teatro "Soho Málaga".
		//Evidencia: mostrar el estado de los teatros.
		
		System.out.println("7. Traspasa la obra asignada del teatro \"Cervantes\" al teatro \"Soho Málaga\".");
		// Traspasando la obra de un teatro a otro
		try {
			cervantes.traspasarObra(soho);
		}catch (IllegalStateException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}catch(NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.printf("\nMostrando estado ...\n");
		//Mostrando el estado de los teatros
		System.out.println(cervantes.toString());
		System.out.println(soho.toString());
		System.out.println();
		
		//8. Muestra el número de entradas vendidas y entradas por vender de los teatros "Cervantes" y "Soho Málaga".
		//Evidencia: mostrar el número de entradas vendidas y por vender para los teatros.
		System.out.println("8. Muestra el número de entradas vendidas y entradas por vender de los teatros \"Cervantes\" y \"Soho Málaga\".");
		
		System.out.printf("Numero de entrada vendidas en Cervantes: %d\tNumero de entradas por vender en Cervantes: %d\n",cervantes.getEntradasVendidas(),(cervantes.getAforo()-cervantes.getEntradasVendidas()));
		System.out.printf("Numero de entrada vendidas en Soho Málaga: %d\tNumero de entradas por vender en Soho Málaga: %d\n",soho.getEntradasVendidas(),(soho.getAforo()-soho.getEntradasVendidas()));
		
		
	}
	// Metodo que devuelve un numero aleatorio entre dos valores
	public static int numAleatorio(int max, int min) {
		int num = (int) ((Math.random() * (max - min)) + 1);
		return num;
	}
}
