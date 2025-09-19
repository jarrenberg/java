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
		
		//Mostramos los valores del articulo con su PVP
		System.out.println("Primer Precio");
		articulo1.imprime();
		System.out.printf("El PVP del Articulo1 es: %.2f\n",articulo1.getPvP());
		
		//Mostamos el articulo con el precio rebajado
		System.out.printf("Articulo1 con 50%% de descuento: %.2f\n\n",articulo1.getPVPDescuento(50));
		
		//Cambiamos el valor al precio y volvemos a imprimir el mensaje
		articulo1.setPrecio(20);
		System.out.println("Segundo Precio");
		articulo1.imprime();
		System.out.printf("El PVP del Articulo1 es: %.2f\n",articulo1.getPvP());
		System.out.printf("Articulo1 con 50%% de descuento: %.2f\n\n",articulo1.getPVPDescuento(50));
		
		//Usamos el metodo vender
		System.out.println("Probando si puedo vender 3 Pijamas:");
		if(articulo1.vender(3)==true) {
			System.out.printf("Se han vendido con existo 3 Pijamas, quedan %d.\n\n",articulo1.getCuantosQuedan());
		}else {
			System.out.println("No se pueden vender tres pijamas");
		}
		
		//Usamos el metodo almacenar
		System.out.println("Probando si puedo almacenar -2 Pijamas:");
		if(articulo1.almacenar(-2)==true) {
			System.out.printf("Se han almacenado con existo -2 Pijamas, quedan %d.\n\n",articulo1.getCuantosQuedan());
		}else {
			System.out.println("No se pueden vender -2 pijamas");
		}

	}
	
}
