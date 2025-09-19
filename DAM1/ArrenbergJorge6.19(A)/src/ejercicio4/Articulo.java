/**
 * Creacion de la clase Punto con sus parametros y un metodo
 * Jorge Arrenberg 8/01/2025
 */

package ejercicio4;

public class Articulo {
	final static int IVA_PRODUCTO = 21;
	String nombre;
	double precio;
	int cuantosQuedan;

	public double PvP() {
		double PvP=(precio+(precio*(IVA_PRODUCTO/100.0)));
		return PvP;
	}
}
