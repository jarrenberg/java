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
		
	}
	//Configura el valor de la coordenada X de un punto
	public void setX(int x) {
		this.x = x;
	}
	//Configura el valor de la coordenada Y de un punto
	public void setY(int y) {
		this.y = y;
	}
	//Devuelve el valor de la coordenada X de un punto
	public int getX() {
		return x;
	}
	//Devuelve el valor de la coordenada Y de un punto
	public int getY() {
		return y;
	}
	
	//Muestra por pantalla la informacion sobre un punto
	public void imprime() {
		System.out.printf("Las coordendas del punto son: (%d,%d).\n",x,y);
	}
	
	//Guarda valores para los parametros X e Y
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Desplaza un punto el numero de coordenadas indicada como parametro
	public void desplaza(int dx, int dy) {
		this.x=x+dx;
		this.y=y+dy;
		
	}
	//Devuelve la distancia entre el punto y otro punto introducido como parametro
	public int distancia(Punto p) {
		int x1=this.getX();
		int y1 = this.getY();
		int x2=p.getX();
		int y2=p.getY();
		
		int distancia=(int)Math.sqrt(((int)Math.pow((x1-x2),2)+(int)Math.pow((y1-y2),2)));
		return distancia;
	}
}
