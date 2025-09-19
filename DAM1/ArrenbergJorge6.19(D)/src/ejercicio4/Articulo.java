/**
 * Creacion de la clase Articulo con sus parametros y su constructor
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio4;

import java.util.InputMismatchException;

public class Articulo {

	private String nombre;
	private double precio;
	private int IVA_Producto = 21;
	private int cuantosQuedan;

	// Constructo con 4 parametros de la clas articulo con sus condiciones
	public Articulo(String nombre, double precio, int IVA_Producto, int cuantosQuedan) throws IllegalArgumentException {
		if (nombre == null || nombre == "") {
			throw new InputMismatchException(String.format("El nombre introducido (%s) es incorrecto.\n", nombre));
		}
		if (precio < 0) {
			throw new InputMismatchException(String.format("El precio introducido (%.2f) es incorrecto.\n", precio));
		}
		if (IVA_Producto < 0) {
			throw new InputMismatchException(String.format("El IVA introducido (%d) es incorrecto.\n", IVA_Producto));
		}
		if (cuantosQuedan < 0) {
			throw new InputMismatchException(
					String.format("La cantidad de productos restantes (%d) es incorrecta.\n", cuantosQuedan));
		}

		this.nombre = nombre;
		this.precio = precio;
		this.IVA_Producto = IVA_Producto;
		this.cuantosQuedan = cuantosQuedan;
	}

	// Asigna un valor a la variable nombre si cumple la condicion
	public void setNombre(String nombre) {
		String nombreUser = nombre;
		if (nombreUser == null || nombreUser == "") {
			throw new InputMismatchException(String.format("El nombre introducido (%s) es incorrecto.\n", nombre));
		} else {
			this.nombre = nombreUser;
		}
	}

	// Asigna un valor a la variable precio si cumple la condicion
	public void setPrecio(double precio) {
		double precioUser = precio;
		if (precioUser < 0) {
			throw new InputMismatchException(String.format("El precio introducido (%.2f) es incorrecto.\n", precio));
		} else {
			this.precio = precioUser;
		}
	}

	// Asigna un valor a la variable IVA_Producto si cumple la condicion
	public void setIVA_Producto(int IVA_Producto) {
		int IVAUser = IVA_Producto;
		if (IVAUser < 0) {
			throw new InputMismatchException(String.format("El IVA introducido (%d) es incorrecto.\n", IVA_Producto));
		} else {
			this.IVA_Producto = IVAUser;
		}
	}

	// Asigna un valor a la variable cuantosQuedan si cumple la condicion
	public void setCuantosQuedan(int cuantosQuedan) {
		int cuantosQuedanUser = cuantosQuedan;
		if (cuantosQuedanUser < 0) {
			throw new InputMismatchException(
					String.format("La cantidad de productos restantes (%d) es incorrecta.\n", cuantosQuedan));
		} else {
			this.cuantosQuedan = cuantosQuedanUser;
		}
	}

	// Devuelve el valor de la variable nombre
	public String getNombre() {
		return nombre;
	}

	// Devuelve el valor de la variable precio
	public double getPrecio() {
		return precio;
	}

	// Devuelve el valor de la variable IVA_Producto
	public int getIVA_Producto() {
		return IVA_Producto;
	}

	// Devuelve el valor de la variable cuantosQuedan
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	// Muestra los valores de un articulo
	public void imprime() {
		System.out.printf("Articulo || Nombre: %s Precio: %.2f IVA: %d Restantes: %d\n", nombre, precio, IVA_Producto,
				cuantosQuedan);
	}

	// Devuelve el PVP de un articulo
	public double getPvP() {
		double PvP = (precio + (precio * (IVA_Producto / 100.0)));
		return PvP;
	}

	// Devuelve el PVP de un articulo tras aplicarle un descuento como parametro
	public double getPVPDescuento(int descuento) {
		int descuentoUser = descuento;
		double getPVPDescuento = this.getPvP() - (this.getPvP() * (descuentoUser / 100.0));
		return getPVPDescuento;
	}

	// Devuelve si se puede vender cierta cantidad de articulos introducidos como
	// paramtro
	public boolean vender(int cantidad) {
		boolean esVendible;
		int cantidadUser = cantidad;
		if ((cuantosQuedan - cantidadUser >= 0)) {
			esVendible = true;
			this.cuantosQuedan = cuantosQuedan - cantidadUser;
		} else {
			esVendible = false;
		}
		return esVendible;
	}

	// Devuelve si se puede almacenar cierta cantidad de articulos introducidos como
	// paramtro
	public boolean almacenar(int cantidad) {
		boolean esAlmacenable;
		int cantidadUSer = cantidad;
		if (cantidadUSer > 0) {
			esAlmacenable = true;
			this.cuantosQuedan = cantidadUSer + cuantosQuedan;
		} else {
			esAlmacenable = false;
		}
		return esAlmacenable;
	}
}
