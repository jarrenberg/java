/**
 * Programa donde se crean y se dan valores a objetos de la clase Rectangulo
 * Jorge Arrenberg 8/01/2025
 */

package ejercicio3;

public class Main {
	public static void main(String[] args) {
		
		//Declaracion e instanciacion de dos objetos rectangulo
		System.out.println("Creando rectangulo1:...");
		Rectangulo rectangulo1= new Rectangulo();
		System.out.println("Creando rectangulo2:...");
		Rectangulo rectangulo2= new Rectangulo();
		
		//Introduccion de parametros al rectangulo1
		rectangulo1.x1=0;
		rectangulo1.y1=0;
		rectangulo1.x2=5;
		rectangulo1.y2=5;
		
		//Introduccion de parametros al rectangulo2
		rectangulo2.x1=7;
		rectangulo2.y1=9;
		rectangulo2.x2=2;
		rectangulo2.y2=3;
		
		//Mostrar por pantalla sus coordenadas
		System.out.printf("Coordenadas del rectangulo1: (%d,%d)(%d,%d)\n",rectangulo1.x1,rectangulo1.y1,rectangulo1.x2,rectangulo1.y2);
		System.out.printf("Coordenadas del rectangulo1: (%d,%d)(%d,%d)\n",rectangulo2.x1,rectangulo2.y1,rectangulo2.x2,rectangulo2.y2);
		System.out.printf("Perimetro del rectangulo1: %d\n",rectangulo1.perimetro());
		System.out.printf("Perimetro del rectangulo2: %d\n",rectangulo2.perimetro());
		System.out.printf("Area del rectangulo1: %d\n",rectangulo1.area());
		System.out.printf("Area del rectangulo2: %d\n",rectangulo2.area());
		
		
	}
}
