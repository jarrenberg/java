package ejercicio2;

import java.util.Scanner;

public class Ejerciccio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el nombre del producto:");
		String nomProducto = teclado.nextLine();

		System.out.println("Introduzca el precio sin descuento:");
		double precio = teclado.nextDouble();

		System.out.println("Introduzca una cantidad de producto");
		int cantidad = teclado.nextInt();

		System.out.println("Introduzca el porcentaje de descuento:");
		int descuento = teclado.nextInt();

		System.out.println("Usted ha adquirido " + cantidad + "  de productos " + nomProducto + ", a un precio de "
				+ precio + " euros la unidad");

		System.out.println("El precio a pagar es de " + (precio * cantidad) + ", pero al aplicarle el descuento del "
				+ descuento + "% precio final a pagar es: " + productosDescuento(precio, cantidad, descuento));
	}

//Devuelve el precio a pagar aplicando el porcentaje
	public static double productosDescuento(double precio, int cantidad, int descuento) {
		double precioRebajado = 0;
		double precioSinDescuento = 0;
		double precioTotal = cantidad * precio;
		precioSinDescuento = (precioTotal * descuento) / 100;
		precioRebajado = precioTotal - precioSinDescuento;

		return precioRebajado;
	}
}
