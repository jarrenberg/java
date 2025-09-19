package ejercicio9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Creamos un cliente
		System.out.println("Creando un cliente c1 ...");
		ArrayList<String> telefonos = new ArrayList();
		telefonos.add("622024489");
		telefonos.add("626471013");
		telefonos.add("952601208");
		Cliente c1 = null;
		try {
			c1 = new Cliente("Juan", "juan@gmail.com", telefonos);

		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Añadimos un telefono al cliente
		System.out.println();
		System.out.println("Añadimos un telefono al cliente ...");
		try {
			c1.addTelefono("952601208");
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Mostrando el tercer telefono del cliente
		System.out.println();
		System.out.println("Mostrando el tercer telefono del cliente ...");
		try {
			System.out.println("telefono " + c1.getTelefono(3));
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Mostramos los telefonos que contenga al cadena '62'
		System.out.println();
		System.out.println("Mostramos los telefonos que contenga al cadena '62' ...");
		System.out.println(c1.buscarTelefono("62").toString());

		// Añadimos productos a la lista de la compra
		System.out.println();
		System.out.println("Añadimos productos a la lista de la compra ...");
		try {
			c1.addCompra(4, "leche");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		try {
			c1.addCompra(1, "queso");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		try {
			c1.addCompra(5, "leche");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		try {
			c1.addCompra(7, "cafe");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Eliminamos un producto de la lista
		System.out.println();
		System.out.println("Eliminamos un producto de la lista ...");
		try {
			c1.eliminarProducto("queso");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		// Mostramos los productos de la lista de los clientes
		System.out.println("Mostramos los productos de la lista de los clientes ...");
		System.out.println(c1.verProductos().toString());
	}

}
