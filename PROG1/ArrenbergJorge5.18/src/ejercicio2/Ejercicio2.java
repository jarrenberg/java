/**
 * Pograma que crea bombos controlando los posibles errores y realiza acciones con ellos a traves de metodos, mostrando luego sus resulados
 * Jorge Arrenberg 5/1/2025
 */

package ejercicio2;

import libtarea3.Bombo;

public class Ejercicio2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Creamos una variable tamaño para poder crear los bombos con capacidades
		int tamanno;

		System.out.printf("USO DE BOMBOS \n-------------\n\n");
		System.out.printf(
				"----------------------------------\nCREACION DE BOMBOS (CONSTRUCTORES) \n----------------------------------\n");

		// Intentamos crear un bombo con una capacidad inferior a la permitida
		System.out.printf("INTENTANDO CREAR BOMBO CON CAPACIDAD INFERIOR A LA PERMITIDA\n");
		Bombo bomboError1 = crearBombo(Bombo.MINIMA_CAPACIDAD - 1);

		// Intentamos crear un bombo con una capacidad superior a la permitida
		System.out.printf("\nINTENTANDO CREAR BOMBO CON CAPACIDAD SUPERIOR A LA PERMITIDA\n");
		Bombo bomboError2 = crearBombo(Bombo.MAXIMA_CAPACIDAD + 1);

		// Creamos un bombo por omision
		System.out.printf("\nCREANDO BOMBO POR OMISION\n");
		Bombo bombo1 = new Bombo();
		System.out.printf("Correcto. Creando bombo de 90 elementos\n");
		System.out.printf(
				"Estado inicial del bombo. %s\n",bombo1.toString());

		// Creamos bombo con 15 elementos
		System.out.printf("\nINTENTANDO CREAR BOMBO DE 15 ELEMENTOS\n");
		tamanno = 15;
		Bombo bombo2 = crearBombo(tamanno);
		System.out.printf("Correcto. Creando bombo de %d elementos\n", tamanno);
		infoBombos(bombo2, tamanno);

		System.out.printf("\n---------------------\nPRUEBAS DE EXTRACCION\n---------------------\n");
		System.out.printf(
				"PRUEBA 1: EXTRACCION DE TODAS LAS PELOTAS DE UN BOMBO\n-----------------------------------------------------\n");
		System.out.printf("Extrayendo todas las pelotas del bombo\n");

		// Sacamos las bolas del bombo

		do {
			System.out.printf("Extraida la bola: %d \n", bombo2.extraerBola());
		} while (bombo2.isVacio() == false);

		// Mostramos la informacionde los bombos

		infoBombos(bombo2, tamanno);

		System.out.printf("\nPRUEBA 2: REINICIO DEL BOMBO\n-------------------------------------\n");
		bombo2.reset(); // Reiniciamos el bombo
		System.out.printf(
				"Rellenamos de nuevo el bombo con la misma cantidad.\nSe han añadido %d bolas.\nEstado del bombo tras rellenar: %s\n",
				tamanno, bombo2.toString());

		System.out.printf(
				"\nPRUEBA 3: EXTRACCION DE UN NUMERO ALEATORIO DE BOLAS DE UN BOMBO\n----------------------------------------------------------------\n");
		System.out.printf("Extrayendo todas las pelotas del bombo\n");
		
		//Buscamos el numero aleatorio de bolas a extraer y creamos un contador
		
		int numBolas = numRandom(14,11);
		int contador = 0;
		
		//Extraemos el numero de bolas 
		
		do {
			System.out.printf("Extraida la bola: %d \n", bombo2.extraerBola());
			contador++;
		}while(contador<numBolas);
		
		//Mostramos la informacion del bombo
		System.out.println("");
		infoBombos(bombo2,tamanno);
		
	}
	//Devuelve un bombo si el tamaño es valido
	public static Bombo crearBombo(int tamanno) {
		Bombo bombo = null;
		try {
			bombo = new Bombo(tamanno);

		} catch (java.lang.IllegalArgumentException excepcion3) {
			System.out.printf("Error, capacidad del bombo no valida %d \n", (tamanno));
		} catch (Error error) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		return bombo;
	}
	//Devuelve la informacion de los bombos
	public static void infoBombos(Bombo bombo, int tamanno) {
		System.out.printf("Estado del bombo. %s \n", bombo.toString());
		System.out.printf("Bolas extraidas: %s\nCantidad de bolas extraidas: %d\n", bombo.getBolasExtraidas(),
				bombo.getCantidadBolasExtraidas()); // tamanno esta mal puesto preguntar a rafa como sacar el array de
													// bolas extraidas
		System.out.printf("Bolas restantes: %s\nCantidad de bolas restantes: %d\n", bombo.getBolasRestantes(),
				bombo.getCantidadBolasRestantes()); // tamanno esta mal puesto preguntar a rafa como sacar el array de
													// bolas restantes
	}
	
	//Devuelve un numero aleatorio en un intervalo
	public static int numRandom(int max, int min) {
		int numRandom = (int) (Math.random() * 100);
		while (numRandom > max || numRandom < min) {
			numRandom = (int) (Math.random() * 100);
		}
		return numRandom;
	}
	
	//Devuelve el array de las bolas extraidas
	public static int[] bolasExtraidas (Bombo bombo,int tamanno) {
		int[] bolasExtraidas = new int[tamanno];
		bolasExtraidas=bombo.getArrayBolasExtraidas();
		return bolasExtraidas;
	}
	
}
