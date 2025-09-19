/**
 * Programa donde se crean y se dan valores a objetos de la clase Punto
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		//Declaramso e instanciamos objetos de la clase Punto con el constructor que hemos creado
		Punto punto1 = new Punto(5,0);
		Punto punto2 = new Punto(10,10);
		Punto punto3 = new Punto(3,-7);
		
		//Damos valores a los parametros de los objetos Punto
		punto1.setX(5);
		punto1.setY(0);
		System.out.println(punto1.getX()+ ","+punto1.getY());
		
		punto2.setX(10);
		punto2.setY(10);
		System.out.println(punto2.getX()+ ","+punto2.getY());
		
		punto3.setX(3);
		punto3.setY(-7);
		System.out.println(punto3.getX()+ ","+punto3.getY());

	}

}
