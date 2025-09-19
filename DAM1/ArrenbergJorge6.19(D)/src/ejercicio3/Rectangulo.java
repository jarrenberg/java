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

	// Construcor de la clase Rectangulo ocn 3 parametros
	public Rectangulo(int x1, int y1, int x2, int y2) throws IllegalArgumentException{
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

	// Guarda un valor para la posicion x1 si cumple con las condiciones requieridas
	public void setX1(int x1) throws IllegalArgumentException {
		if (x1 < x2) {
			this.x1 = x1;
		} else {
			throw new IllegalArgumentException(String.format("El parametro X1 (%d) debe ser menor a X2 (%d).", x1, x2));
		}
	}

	// Guarda un valor para la posicion x2 si cumple con las condiciones requieridas
	public void setX2(int x2) throws IllegalArgumentException {
		if (x2 > x1) {
			this.x2 = x2;
		} else {
			throw new IllegalArgumentException(String.format("El parametro X2 (%d) debe ser mayor a X1 (%d).", x2, x1));
		}
	}

	// Guarda un valor para la posicion y1 si cumple con las condiciones requieridas
	public void setY1(int y1) throws IllegalArgumentException {
		if (y1 < y2) {
			this.y1 = y1;
		} else {
			throw new IllegalArgumentException(String.format("El parametro Y1 (%d) debe ser menor a Y2 (%d).", y1, y2));
		}
	}

	// Guarda un valor para la posicion y2 si cumple con las condiciones requieridas
	public void setY2(int y2) throws IllegalArgumentException {
		if (y2 > y1) {
			this.y2 = y2;
		} else {
			throw new IllegalArgumentException(String.format("El parametro Y2 (%d) debe ser mayor a Y1 (%d).", y2, y1));
		}
	}

	// Devuelve el valor de x1
	public int getX1() {
		return x1;
	}

	// Devuelve el valor de x2
	public int getX2() {
		return x2;
	}

	// Devuelve el valor de y1
	public int getY1() {
		return y1;
	}

	// Devuelve el valor de y2
	public int getY2() {
		return y2;
	}

	// Devuelve el perimetro del rectangulo segun sus coordenadas
	public int getPerimetro() {
		int x_1 = x1;
		int y_1 = y1;
		int x_2 = x2;
		int y_2 = y2;
		int perimetro = (2 * ((x_2) - (x_1)) + 2 * ((y_2) - (y_1)));
		return Math.abs(perimetro);
	}

	// Devuelve el area del rectangulo segun sus coordenadas
	public int getArea() {
		int x_1 = x1;
		int y_1 = y1;
		int x_2 = x2;
		int y_2 = y2;
		int area = (((x_2) - (x_1)) * ((y_2) - (y_1)));
		return Math.abs(area);
	}
	//Asigna valores a las coordenadas del primer punto
	public void setX1Y1(int x1, int y1) throws IllegalArgumentException {
		if (x1 >= x2 || y1 > y2)
			throw new IllegalArgumentException(String.format(
					"El punto1 (%d,%d) debe tener una posicion X y Y menores al punto2 (%d,%d)\n", x1, y1, x2, y2));

		this.x1 = x1;
		this.y1 = y1;
	}
	//Asigna valores a las coordenadas del segundo punto
	public void setX2Y2(int x2, int y2)throws IllegalArgumentException {
		if (x1 >= x2 || y1 > y2)
			throw new IllegalArgumentException(String.format(
					"El punto1 (%d,%d) debe tener una posicion X y Y menores al punto2 (%d,%d)\n", x1, y1, x2, y2));

		this.x2 = x2;
		this.y2 = y2;
	}
	//Asigna valores a todas las coordenadas
	public void setAll(int x1, int y1, int x2, int y2)throws IllegalArgumentException  {
		if (x1 >= x2 || y1 > y2)
			throw new IllegalArgumentException(String.format(
					"El punto1 (%d,%d) debe tener una posicion X y Y menores al punto2 (%d,%d)\n", x1, y1, x2, y2));

		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	//Muestra la informacion del objeto en pantalla
	public void imprime() {
		System.out.printf("Posiciones X1,Y1: (%d,%d)\nPosiciones X2,Y2: (%d,%d).\n",x1,y1,x2,y2);
	}

}
