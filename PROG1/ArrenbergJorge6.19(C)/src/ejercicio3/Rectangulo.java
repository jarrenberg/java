/**
 * Creacion de la clase Rectangulo con sus parametros y su constructor
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio3;

public class Rectangulo {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	// Devuelve el perimetro del rectangulo segun sus coordenadas
	public int perimetro() {
		int x_1 = x1;
		int y_1 = y1;
		int x_2 = x2;
		int y_2 = y2;
		int perimetro = (2 * ((x_2) - (x_1)) + 2 * ((y_2) - (y_1)));
		return Math.abs(perimetro);
	}

	// Devuelve el area del rectangulo segun sus coordenadas
	public int area() {
		int x_1 = x1;
		int y_1 = y1;
		int x_2 = x2;
		int y_2 = y2;
		int area = (((x_2) - (x_1)) * ((y_2) - (y_1)));
		return Math.abs(area);
	}

	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}else {
			throw new IllegalArgumentException(String.format("El parametro X1 (%d) debe ser menor a X2 (%d).",x1,x2));
		}
	}

	public void setX2(int x2) {
		if (x2 > x1) {
			this.x2 = x2;
		}else {
			throw new IllegalArgumentException(String.format("El parametro X2 (%d) debe ser mayor a X1 (%d).",x2,x1));
		}
	}

	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}else {
			throw new IllegalArgumentException(String.format("El parametro Y1 (%d) debe ser menor a Y2 (%d).",y1,y2));
		}
	}

	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}else {
			throw new IllegalArgumentException(String.format("El parametro Y2 (%d) debe ser mayor a Y1 (%d).",y2,y1));
		}
	}
	public int getX1() {
		return x1;
	}
	public int getX2() {
		return x2;
	}

	public int getY1() {
		return y1;
	}

	public int getY2() {
		return y2;
	}


//Construcor de la clase Rectangulo ocn 3 parametros
	public Rectangulo(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
		if (x1 >= x2 || y1 > y2)
			throw new IllegalArgumentException(String.format(
					"El punto1 (%d,%d) debe tener una posicion X y Y menores al punto2 (%d,%d)\n", x1, y1, x2, y2));

		// Si no salta el error IllegalArgumentException, le asignamos los valores
		// validos al nuevo objeto
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}
