/*
 * Interfaz que contiene los metodos comunes para todas las Clases derivadas de Figuras
 * Jorge Arrenberg 09/03/2025 
 * 
 */
package ejercicio6;

public interface Figura2D {
	public double perimetro();
	public double area();
	public void escalar (double escala) throws IllegalArgumentException;
	public void imprimir ();

}
