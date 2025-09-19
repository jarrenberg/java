/**
 * Programa donde se crean y se dan valores a objetos de la clase Articulo
 * Jorge Arrenberg 8/01/2025
 */

package ejercicio4;

public class Main {

	public static void main(String[] args) {
		//Instanciacion de un objeto de la clase articulo
		Articulo articulo1 = new Articulo();
		
		//Le asignamos valores a los atributos
		articulo1.precio=10;
		articulo1.nombre="Pijama";
		articulo1.cuantosQuedan=3;
		System.out.println("Primer Precio");
		System.out.printf("%s - Precio: %.2f€ - IVA: %d  - PVP: %.2f€\n\n",articulo1.nombre,articulo1.precio,Articulo.IVA_PRODUCTO,articulo1.PvP());
		
		//Cambiamos el valor al precio y volvemos a imprimir el mensaje
		articulo1.precio=20;
		System.out.println("Segundo Precio");
		System.out.printf("%s - Precio: %.2f€ - IVA: %d  - PVP: %.2f€\n\n",articulo1.nombre,articulo1.precio,Articulo.IVA_PRODUCTO,articulo1.PvP());
		
	}
	
}
