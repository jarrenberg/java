/**
 * Programa que calcula el descuento de una compra
 * Jorge Arrenberg 21/11/2024
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos los datos al usuario

		System.out.println("Introduzca el nombre del prodcuto");
		String nombreProducto = teclado.nextLine();

		System.out.println("Introduzca el precio del articulo");
		double precio = teclado.nextDouble();

		System.out.println("Introduzca la cantidad del articulo");
		int cantidad = teclado.nextInt();

		System.out.println("Introduzca el porcentaje de descuento");
		int descuento = teclado.nextInt();

		// Mostramos el precio con descuento
		System.out.println("Usted ha adquirido " + cantidad + " de productos " + nombreProducto
				+ ", a un precio de "+precio+" euros la unidad.");
		System.out.println("El precio a pagar es " + (precio * cantidad) + ", pero al aplicarle el descuento del "
				+ descuento + "% el precio final a pagar es: " + productosDescuento(precio, cantidad, descuento) + "€");

	}

//Devuelve el precio con descuento
	public static double productosDescuento(double precio, int cantidad, int descuento) {
		double valorDescuento, precioConDescuento;
		valorDescuento = (((precio * cantidad) * descuento) / 100);
		precioConDescuento = ((precio * cantidad) - valorDescuento);
		return precioConDescuento;
	}
}
