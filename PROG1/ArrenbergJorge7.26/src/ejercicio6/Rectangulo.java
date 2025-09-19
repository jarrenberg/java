/*
 * Creacion de la clase Rectangulo, con su parametro, constructor y los metodos heredados de la interfaz Figura2D
 * Jorge Arrenberg 09/03/2025 
 * 
 */

package ejercicio6;

public class Rectangulo extends Figuras implements Figura2D {

	private double ancho;
	private double alto;
	
	public Rectangulo(double ancho, double alto) throws IllegalArgumentException {
		if(ancho<0||alto<0) {
			throw new IllegalArgumentException("Una longitud no puede ser negativa.");
		}
		this.alto=alto;
		this.ancho=ancho;
	}
	@Override
	public double perimetro() {
		double resultado = (ancho*2) + (alto*2);
		return resultado;
	}

	@Override
	public double area() {
		double resultado = ancho*alto;
		return resultado;
	}

	@Override
	public void escalar(double escala) throws IllegalArgumentException {
		if (escala < 0) {
			throw new IllegalArgumentException("La escala no puede ser negativa.");
		}
		this.alto=alto*escala;
		this.ancho=ancho*escala;
		
	}

	@Override
	public void imprimir() {
		String mensaje = String.format("Ancho: %.2f, Alto: %.2f, Perimetro: %.2f, Area: %.2f", ancho,alto,perimetro(),area());
		System.out.println(mensaje);
		
	}

}
