/**
 * Programa que crea un juego de dados donde se para cuadno la suma de los valores de las caras llega a un numero aleatorio entre 30 y 60
 * Tras esto muestra al ganador y los resultados
 * Jorge Arrenberg 5/1/2025
 */

package ejercicio1;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Cramos los dados asignado a cada jugador

		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		Dado dado3 = new Dado(6);
		Dado dadoGanador = new Dado(6);

		// Variables para guardar el numero del dado ganador y su ultimo lanzamiento

		byte jugGanador = 0;
		byte lanzamientoGanador = 0;

		// Asignamos el numero maximo de la suma de los lanzamientos

		int valorMax = valorMax(60, 30);
		System.out.printf("Numero máximo de puntos: %d \n", valorMax);

		// Creamos una variable para guardar la suma de los valores de las caras de los
		// dados

		long sumaGlobal;

		// Creamos un contador para ver el numero de lanzamientos

		int contador = 1;

		// Creamos una variable para guardar el valor de cada lanzamiento

		byte lanza1;
		byte lanza2;
		byte lanza3;

		// Procedemos al lanzamiento de dados hasta llegar al numero maximo

		do {
			sumaGlobal = 0;
			System.out.printf("\n\t\t\t DADO1 \t DADO2 \t DADO3 \n");
			lanza1 = dado1.lanzar();
			lanza2 = dado2.lanzar();
			lanza3 = dado3.lanzar();
			System.out.printf("Lanzamiento nº %d:\t %d \t %d \t %d \t \n", contador, lanza1, lanza2, lanza3);
			sumaGlobal = dado1.getSumaPuntuacionHistorica() + dado2.getSumaPuntuacionHistorica()
					+ dado3.getSumaPuntuacionHistorica();
			contador++;
		} while (sumaGlobal < valorMax);

		// Calculamos el dado ganador y guardamos el numero del jugador y su ultima
		// tirada
		if (lanza1 >= lanza2) {
			if (lanza1 >= lanza3) {
				dadoGanador = dado1;
				jugGanador = 1;
				lanzamientoGanador = lanza1;
			}
		}
		if (lanza2 >= lanza1) {
			if (lanza2 >= lanza3) {
				dadoGanador = dado2;
				jugGanador = 2;
				lanzamientoGanador = lanza2;
			}
		}
		if (lanza3 >= lanza1) {
			if (lanza3 >= lanza2) {
				dadoGanador = dado3;
				jugGanador = 3;
				lanzamientoGanador = lanza3;
			}
		}

		// Mostramos la informacion sobre el juego
		
		System.out.printf("\nJuego terminado. La suma de los lanzamientos es: %d. \n", sumaGlobal);
		System.out.printf("\nEl ganador es el dado %d con %d puntos en la ultima jugada. \n", jugGanador,
				lanzamientoGanador);
		System.out.printf(
				"\nEl valor %d ha salido %d veces en todo el juego y se han realizado un total de %d lanzamientos.\n",
				lanzamientoGanador, Dado.getNumeroVecesCaraGlobal(lanzamientoGanador),
				Dado.getNumeroLanzamientosGlobal());
		System.out.printf("\nTodos los lanzamientos del dado %d: %s", jugGanador,
				dadoGanador.getSerieHistoricaLanzamientos());

	}

	// Devuelve el numero maximo de la suma de los lanzamientos
	public static int valorMax(int max, int min) {
		int valorMax = (int) (Math.random() * 100);
		while (valorMax > max || valorMax < min) {
			valorMax = (int) (Math.random() * 100);
		}
		return valorMax;
	}

}
