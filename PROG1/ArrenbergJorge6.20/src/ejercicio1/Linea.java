/*
 * Creacion de la clase Linea
 * Jorge Arrenberg 20/01/2025
 */
package ejercicio1;

import java.awt.Point;

public class Linea {
	// Atributos
	private static final Point PUNTO_A_DEFULT = new Point();
	private static final Point PUNTO_B_DEFULT = new Point();

	private Point puntoA = new Point(0, 0);
	private Point puntoB = new Point(1, 1);

	// Constructor con todos los parametros
	public Linea(Point a, Point b) {
		puntoA = a;
		puntoB = b;
	}

	// Constructor sin parametros
	public Linea() {
		this(PUNTO_A_DEFULT, PUNTO_B_DEFULT); // Llamamos al constructor con todos los parametros
	}
	

	// Asigna valores a las coordenadas del punto A
	public void setA(double XA, double YA) {
		double posicionX = XA;
		double posicionY = YA;
		puntoA.setLocation(posicionX, posicionY);
	}

	// Asigna valores a las coordenadas del punto B
	public void setB(double XB, double YB) {
		double posicionX = XB;
		double posicionY = YB;
		puntoB.setLocation(posicionX, posicionY);
	}

	// Devuelve el valor de la coordenada Y del punto A
	public double getXA() {
		return puntoA.getX();
	}

	// Devuelve el valor de la coordenada Y del punto A
	public double getYA() {
		return puntoA.getY();
	}

	// Devuelve el valor de la coordenada X del punto B
	public double getXB() {
		return puntoB.getX();
	}

	// Devuelve el valor de la coordenada Y del punto B
	public double getYB() {
		return puntoB.getY();
	}
	
	//Mueve una linea a la derecha
	public void mueveDerecha(double distancia) {
		double distanciaUser = distancia;
		puntoA.setLocation((puntoA.getX() + distanciaUser), puntoA.getY());
		puntoB.setLocation((puntoB.getX() + distanciaUser), puntoB.getY());
	}
	
	//Mueve una linea a la izquierda
	public void mueveIzquierda(double distancia) {
		double distanciaUser = distancia;
		puntoA.setLocation((puntoA.getX() - distanciaUser), puntoA.getY());
		puntoB.setLocation((puntoB.getX() - distanciaUser), puntoB.getY());
	}
	
	//Mueve una linea hacia arriba
	public void mueveArriba(double distancia) {
		double distanciaUser = distancia;
		puntoA.setLocation(puntoA.getX(), (puntoA.getY() + distanciaUser));
		puntoB.setLocation(puntoB.getX(), (puntoB.getY() + distanciaUser));
	}
	
	//Mueve una linea hacia arriba
	public void mueveAbajo(double distancia) {
		double distanciaUser = distancia;
		puntoA.setLocation(puntoA.getX(), (puntoA.getY() - distanciaUser));
		puntoB.setLocation(puntoB.getX(), (puntoB.getY() - distanciaUser));
	}
	
	//Muestra por pantalla las caracteristicas de la linea
	public void escribirLinea() {
		System.out.printf("Punto A: [(%.1f)(%.1f)], Punto B: [(%.1f)(%.1f)].\n", puntoA.getX(),puntoA.getY(),puntoB.getX(),puntoB.getY());
	}
}
