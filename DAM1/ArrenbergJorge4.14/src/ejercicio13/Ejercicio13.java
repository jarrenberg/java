/**
 * Programa que calcula el descuento de un producto
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos al usuario el precio sin descuento y el precio con descuento
		
		System.out.println("Introduzca el precio sin descuento:");
		float precioCompleto = teclado.nextFloat();
				
		System.out.println("Introduzca el precio con descuento");
		float precioDescuento = teclado.nextFloat();

		//Mostramos el porcentaje de descuento
		
		System.out.printf("El porcentaje de descuento es: %.2f%%\n",porcentajeDescuento(precioCompleto,precioDescuento));
		
		teclado.close();
	}
//Devuelve el porcentaje de descuento aplicado a un producto
	public static float porcentajeDescuento(float precioCompleto, float precioDescuento) {
		float diferencia;
		float porcentaje;
		diferencia = (1-(precioDescuento/precioCompleto));
		porcentaje = diferencia*100;
		return porcentaje;
	}
}
