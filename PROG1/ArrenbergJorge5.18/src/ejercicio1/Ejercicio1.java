/**
 * Programa que usa metodos de la clase bombilla para ver y cambiar los parametros de estas
 * Jorge Arrenberg 5/1/2025
 */

package ejercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import libtarea3.Bombilla;
import libtarea3.Utilidades;

public class Ejercicio1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Declaramos tres variables referencia a objetos instancia de la clase Bombilla
		Bombilla bombilla1;
		Bombilla bombilla2;
		Bombilla bombilla3;

		System.out.printf("TRABAJO CON BOMBILLAS\n-----------------------------\n");
		System.out.printf("\n1.CONSULTA INICIAL DE VALORES GLOBALES\n----------------------------------------------\n");
		//Mostramos el numero de bombillas creadas y de bombillas encendidas
		System.out.printf("Numero de bombillas creadas hasta el momento: %d.\n", Bombilla.getBombillasCreadas());
		System.out.printf("Numero de bombillas encendidas hasta el momento: %d.\n", Bombilla.getBombillasEncendidas());

		System.out.printf("\n2.CREACION Y USO DE BOMBILLAS\n-----------------------------\n");
		System.out.printf("Creacion de bombillas (constructores)\n-------------------------------------\n");
		
		//Intentamos crear una bombilla con parametros invalidos
		System.out.printf("Intentando crear una bombilla encendida con una potencia no valida\n");
		Bombilla bombillaError1;
		try {
			bombillaError1 = new Bombilla(true,250.0);

		} catch (java.lang.IllegalArgumentException excepcion1) {
			System.out.printf("Error, capacidad del bombo no valida %.2f \n", (250.0));
		} catch (Error error) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		
		//Intentamos crear una bombilla con parametros invalidos
		System.out.printf("\nIntentando crear una bombilla con una potencia no valida\n");
		Bombilla bombillaError2;
		try {
			bombillaError2 = new Bombilla(5);

		} catch (java.lang.IllegalArgumentException excepcion2) {
			System.out.printf("Error, capacidad del bombo no valida %.2f \n", (5.0));
		} catch (Error error) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		
		System.out.printf("\nCreando bombilla encendida con una potencia valida con el constructor de 2 parámetros\n");
		//Creamos la bombilla y mostramos su estado en pantalla
		bombilla1=new Bombilla(true,100.0);
		System.out.printf("Bombilla 1 creada. Estado: %s \n\n",bombilla1.toString());
		
		System.out.printf("Creando bombilla encendida con una potencia valida con el constructor de 1 parámetros\n");
		//Creamos la bombilla y mostramos su estado en pantalla
		bombilla2=new Bombilla(true);
		System.out.printf("Bombilla 2 creada. Estado: %s \n\n",bombilla2.toString());
		
		System.out.printf("Creando bombilla con valores por defecto usando un constructor sin parametros\n");
		//Creamos la bombilla y mostramos su estado en pantalla
		bombilla3=new Bombilla();
		System.out.printf("Bombilla 3 creada. Estado: %s \n\n",bombilla3.toString());
		
		System.out.printf("Manipulacion de bombillas (metodos)\n-----------------------------------\n");
		System.out.printf("Encendiendo la primera bombilla.\n");
		//Intenamos encender la bombilla sabiendo que da error, el cual atrapamos
		try {
			bombilla1.encender();
		}catch(java.lang.IllegalStateException excepcion3) {
			System.out.printf("Error: Intentando encender bombilla ya encendida.\n");
		}catch (Error error) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		
		//Empleamos el metodo conmutar para encender y apagar la bombilla cada segundo
	
		for (int i = 0; i < 6; i++) {
			System.out.printf("\nConmutando estado de la bombilla 1.\n");
			bombilla1.conmutar();
			System.out.printf("%s\n",bombilla1.toString());
			System.out.println("Esperando 1 segundo\n");
			Utilidades.esperar(1);
		}
		
		
		//Apagamos la bombilla3
		
		System.out.printf("\nApagando la bombilla2\n");
		try {
			bombilla2.apagar();
		}catch(java.lang.IllegalStateException excepcion3) {
			System.out.printf("Error: Intentando encender bombilla ya esta apagada.\n");
		}catch (Error error) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		
		//Encendemos la bombilla3
		
		System.out.println("\nEncendiendo la bombilla3\n");
		try {
			bombilla3.encender();
		}catch(java.lang.IllegalStateException excepcion3) {
			System.out.printf("Error: Intentando encender bombilla ya encendida.\n");
		}catch (Error error) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		
		
		System.out.printf("Prueba de los getters de la primera bombilla creada:\n----------------------------------------------------\n");
		System.out.printf("Bombilla1\n");
		System.out.printf("\t Potencia: \t %.2f W\n",bombilla1.getPotencia());
		System.out.printf("\t Estado: \t %s\n",estadoBombilla(bombilla1)); //Preguntar a rafa por como poner el estado
		
		//Como el metodo .getUltimaVezEncendida solo te devuelve una fecha si esta encendida, solo mostrara la fecha cuando la bombilla este encendida
		if(bombilla1.getEstado()) {
			LocalDateTime fecha = bombilla1.getUltimaVezEncendida();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("d'/'M'/'yyyy' 'HH':'mm':'s");
			System.out.printf("\t Ultimo vez que se encendio: \t %s\n",fecha.format(formato));
		}
		
		System.out.printf("\t Nº de veces encendida: \t %d\n",bombilla1.getVecesEncendida());
		System.out.printf("\t Tiempo que lleva encendida: \t %.2f segundos \n",bombilla1.getTiempoEncendida());	
		System.out.printf("\t Potencia consumida: \t %.2f W\n",bombilla1.getPotenciaConsumida());
		
		System.out.printf("\n3.CONSULTA FINAL DE VALORES GLOBALES\n------------------------------------\n");
		System.out.printf("Numero de bombillas creadas hasta el momento: %d\n",Bombilla.getBombillasCreadas());
		System.out.printf("Numero de bombillas encendidas en este momento: %d\n",Bombilla.getBombillasEncendidas());
		
	}
	//Devuelve la interpretacion del estado de la bombilla
	public static String estadoBombilla (Bombilla bombilla) {
		String mensaje;
		if(bombilla.getEstado()==true) {
			mensaje="Encendida";
		}else {
			mensaje="Apagada";
		}
		
		return mensaje;
	}
}
