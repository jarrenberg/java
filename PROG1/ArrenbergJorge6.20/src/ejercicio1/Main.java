/*
 * Utilizacion de la clase Linea, usando sus metodos y constructores
 * Jorge Arrenberg 20/01/2025
 */

package ejercicio1;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		//Creando una linea por defecto y la mostramos
		System.out.println("Creando una linea por defecto:");
		Linea lineaPorDefecto = new Linea();
		lineaPorDefecto.escribirLinea();
		
		//Creacion de una linea con dos puntos y la mostramos
		System.out.println("Creando linea1:");
		Point punto1 = new Point (7,8);
		Point punto2 = new Point (3,5);
		Linea linea1 = new Linea (punto1,punto2);
		linea1.escribirLinea();
		
		//Movemos a la derecha y arriba la linea por defectoy lo mostramos
		System.out.printf("\nMovemos la linea por defecto arriba y a la derecha:\n");
		lineaPorDefecto.mueveArriba(2);
		lineaPorDefecto.mueveDerecha(5);
		lineaPorDefecto.escribirLinea();
		
		//Movemos a la izquierda y abajo la linea1 y lo mostramos
		System.out.printf("\nMovemos la linea1 abajo y a la izquierda:\n");
		linea1.mueveIzquierda(1);
		linea1.mueveAbajo(3);
		linea1.escribirLinea();
		
		//Asignamos los valores 1,1 al punto A y (3,3) al punto B de la linea por defecto y lo mostramos
		System.out.printf("\nAsignamos los valores (1,1) al punto A y (3,3) al punto B de la linea por defecto y lo mostramos:\n");
		lineaPorDefecto.setA(1, 1);
		lineaPorDefecto.setB(3, 3);
		lineaPorDefecto.escribirLinea();
		
		//Mostramos los valores de todas las coordenadas de los puntos de la linea1
		System.out.printf("\nMostramos los valores de las coordenadas de los puntos de la linea1:\n");
		System.out.printf("Punto A: [(%.1f)(%.1f)], Punto B: [(%.1f)(%.1f)].\n", linea1.getXA(),linea1.getYA(),linea1.getXB(),linea1.getYB());
		
		
		
	}

}
