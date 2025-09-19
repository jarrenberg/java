/**
 * Creacion de la clase Articulo con sus parametros y su constructor
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio4;

import java.util.InputMismatchException;

public class Articulo {

	String nombre;
	double precio;
	int IVA_Producto = 21;
	int cuantosQuedan;

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
