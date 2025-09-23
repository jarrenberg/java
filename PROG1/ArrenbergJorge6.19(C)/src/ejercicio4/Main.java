/**
 * Programa donde se crean y se dan valores a objetos de la clase Articulo mediante el constructor
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio4;

public class Main {

	public static void main(String[] args) {
		//Declaracion Instanciacion de un objeto de la clase articulo
		Articulo articulo1 = null;
		try {
		articulo1 = new Articulo("Pijama", 10, 20, 4);
		}catch(IllegalArgumentException excepcion1) {
			System.out.printf("Eror: %s\n",excepcion1.getMessage());
		}catch(Exception excepcion2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		
		System.out.println("Primer Precio");
		System.out.printf("%s - Precio: %.2f€ - IVA: %d  - PVP: %.2f€\n\n",articulo1.getNombre(),articulo1.getPrecio(),articulo1.getIVA_Producto(),articulo1.PvP());
		
		//Cambiamos el valor al precio y volvemos a imprimir el mensaje
		articulo1.setPrecio(20);
		System.out.println("Segundo Precio");
		System.out.printf("%s - Precio: %.2f€ - IVA: %d  - PVP: %.2f€\n\n",articulo1.getNombre(),articulo1.getPrecio(),articulo1.getIVA_Producto(),articulo1.PvP());
	}
	
}
