/**
 * Creacion de la clase Punto con sus parametros y su constructor
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio1;

public class Punto {
	private int x;
	private int y;

	// Constructor de la clase Punto con 2 parametros
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
