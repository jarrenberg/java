/**
 * Programa que pide el alto y el ancho de un rectangulo y calcula el area y el perimetro.
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Pedimos al usuario que introduzca el alto y ancho de un rectangulo
		
		System.out.println("Introduzca el ancho de un rectangulo:");
		double ancho = teclado.nextDouble();
		
		System.out.println("Introduzca el alto de un rectangulo:");
		double alto = teclado.nextDouble();
		
		//Mostramos el perimetro y el area
		
		System.out.println("El perimetro es " + perimetroRectangulo(ancho,alto) + " cm.");
		System.out.println("El area es " + areaRectangulo(ancho,alto)+ " cm.");
		
		teclado.close();
	}
	 // Devuelve el perímetro
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro= (ancho*2)+(alto*2);
		return perimetro;
	}
	
	// Devuelve el área
	public static double areaRectangulo(double ancho, double alto) {
		double area = ancho*alto;
		return area;
		
	}

}
