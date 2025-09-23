/**
 * Programa que usa los metodos de la clase CuentaBancaria para mostrar los datos y realizar acciones
 * Jorge Arrenberg 12/12/2024
 */

package ejercicio2;

import libtarea3.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Mostramos el numero de dados creados
		System.out.printf("Numero de dados creados: %d %n", Dado.getNumeroDadosCreados());

		// Mostramos el numero total de lanzamientos
		System.out.printf("Numero total de lanzamientos %d %n %n", Dado.getNumeroLanzamientosGlobal());

		// Mostramos la cantidad de veces que han salido las caras con valores 1, 2, 3 y
		// 4 en total
		System.out.printf("Veces que ha salido el 1: %d %n", Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("Veces que ha salido el 2: %d %n", Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("Veces que ha salido el 3: %d %n", Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("Veces que ha salido el 4: %d %n %n", Dado.getNumeroVecesCaraGlobal(4));
		
		// Intentamos crear 10 objetos de la clase dado

		for (int i = 0; i < 10; i++) {
			int caras = (int) (Math.random() * 9);
			int intento = i + 1;
			System.out.printf("Intento %d. Intentando crear un dado de %d caras.", intento, caras);

			try {
				//Craemos el dado con las caras correspondiente
				Dado dado = new Dado(caras);
					System.out.printf(" Correcto. Creado dado de %d caras. %n", caras);
					System.out.printf("Lo lanzamos %d veces: ", caras);
					//Lanzamos el dado las mismas veces que numero de caras tenga y mostramos el resultado
					for (int j = 0; j < caras; j++) {
						System.out.print(dado.lanzar() + " ");
					}
					System.out.printf("%n");
					long suma = 0;
					//Calculamos y mostramos la suma de todos los numeros resultado del lanzamiento del dado 
					suma = dado.getSumaPuntuacionHistorica();
					System.out.printf("Suma total de los lanzamientos del dado: %d %n", suma);
				
			} catch (java.lang.IllegalArgumentException excepcion1) { //En caso de que el numero de caras no sea valido mostrara este mensaje
				System.out.printf(" Error. El numero de caras no es valido. %n");
			}

			System.out.printf("%n");

		}
		
		//Usamos metodos de la clase dado para mostrar los resultados que nos piden
		
		System.out.printf("Numero total de dados creados: %d %n", Dado.getNumeroDadosCreados());
		System.out.printf("Numero total de lanzamientos llevados a cabo hasta el momento: %d %n",Dado.getNumeroLanzamientosGlobal());
		System.out.printf("Veces que ha salido el 1: %d %n", Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("Veces que ha salido el 2: %d %n", Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("Veces que ha salido el 3: %d %n", Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("Veces que ha salido el 4: %d %n", Dado.getNumeroVecesCaraGlobal(4));

	}

}
