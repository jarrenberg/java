/**
 * Programa donde se crean y se dan valores a objetos de la clase Punto
 * Jorge Arrenberg 8/01/2025
 */

package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		Punto punto3 = new Punto();
		
		
		punto1.x=5;
		punto1.y=0;
		System.out.println(punto1.x+ ","+punto1.y);
		
		punto2.x=10;
		punto2.y=10;
		System.out.println(punto2.x+ ","+punto2.y);
		
		punto3.x=-3;
		punto3.y=7;
		System.out.println(punto3.x+ ","+punto3.y);

	}

}
