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

	// Guarda un nombre si cumple las conidiciones requeridas
	public void setNombre(String nombre) throws InputMismatchException {
		if (nombre == null || nombre == "") {
			throw new InputMismatchException(String.format("El nombre introducido (%s) es incorrecto.\n", nombre));
		} else {
			this.nombre = nombre;
		}
	}

	// Guarda un precio si cumple las conidiciones requeridas
	public void setPrecio(double precio) throws InputMismatchException {
		if (precio < 0) {
			throw new InputMismatchException(String.format("El precio introducido (%.2f) es incorrecto.\n", precio));
		} else {
			this.precio = precio;
		}
	}

	// Guarda un IVA si cumple las conidiciones requeridas
	public void setIVA_Producto(int IVA_Producto) throws InputMismatchException {
		if (IVA_Producto < 0) {
			throw new InputMismatchException(String.format("El IVA introducido (%d) es incorrecto.\n", IVA_Producto));
		} else {
			this.IVA_Producto = IVA_Producto;
		}
	}

	// Guarda cuantos productos quedan si cumple las conidiciones requeridas
	public void setCuantosQuedan(int cuantosQuedan) throws InputMismatchException {
		if (cuantosQuedan < 0) {
			throw new InputMismatchException(
					String.format("La cantidad de productos restantes (%d) es incorrecta.\n", cuantosQuedan));
		} else {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
	//Devuelve el nombre de un objeto de la clase articulo
	public String getNombre() {
		return nombre;
	}
	//Devuelve el precio de un objeto de la clase articulo
	public double getPrecio() {
		return precio;
	}
	//Devuelve el IVA de un objeto de la clase articulo
	public int getIVA_Producto() {
		return IVA_Producto;
	}
	//Devuelve el numero de elementos restantes de un objeto de la clase articulo
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

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

	public double PvP() {
		double PvP = (precio + (precio * (IVA_Producto / 100.0)));
		return PvP;
	}

}
