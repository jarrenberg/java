/**
 * Creacion de la clase Rectamgiñp con sus parametros
 * Jorge Arrenberg 8/01/2025
 */

package ejercicio3;

public class Rectangulo {
int x1;
int y1;
int x2;
int y2;

//Devuelve el perimetro del rectangulo segun sus coordenadas
public int perimetro () {
	int x_1=x1;
	int y_1=y1;
	int x_2=x2;
	int y_2=y2;
	int perimetro= (2*((x_2)-(x_1))+2*((y_2)-(y_1)));
	return Math.abs(perimetro);
}
//Devuelve el area del rectangulo segun sus coordenadas
public int area () {
	int x_1=x1;
	int y_1=y1;
	int x_2=x2;
	int y_2=y2;
	int area= (((x_2)-(x_1))*((y_2)-(y_1)));
	return Math.abs(area);
}
}
