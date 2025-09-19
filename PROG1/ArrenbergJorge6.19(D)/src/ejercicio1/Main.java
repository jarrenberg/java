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
		punto1.imprime(); //Usamos el metdoo para mostrar informacion del punto
		
		punto2.setX(10);
		punto2.setY(10);
		punto2.imprime(); //Usamos el metdoo para mostrar informacion del punto
		
		punto3.setX(3);
		punto3.setY(-7);
		punto3.imprime(); //Usamos el metdoo para mostrar informacion del punto
		
		//Usamos el metodo para darle ambos valores a un punto
		punto3.setXY(4, -7);
		System.out.println("Asignamos los valores (4,-7) al Punto 3.");
		punto3.imprime();
		
		//Usamos el metodo para desplazar un punto una distancia determinada
		punto3.desplaza(0, -3);
		System.out.println("Punto 3 desplazado (0,-3).");
		punto3.imprime();
		
		//Usamos el metodo que calcula la distancia entre un punto y otro introducido como parametro
		System.out.printf("La distancia entre el Punto 1 y el Punto 2 es: %d.\n",punto1.distancia(punto2));

	}

}
