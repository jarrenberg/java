/*
 * Creacion de la clase circulo, con su parametro, constructor y los metodos heredados de la interfaz Figura2D
 * Jorge Arrenberg 09/03/2025 
 * 
 */
package ejercicio6;

public class Circulo extends Figuras implements Figura2D {

	private double radio;

	public Circulo(double radio) {
		if (radio < 0) {
			throw new IllegalArgumentException("Una longitud no puede ser negativa.");
		}
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		double resultado = (((Math.PI) * 2) * radio);
		return resultado;
	}

	@Override
	public double area() {
		double resultado = ((Math.pow(radio, 2)) * Math.PI);
		return resultado;
	}

	@Override
	public void escalar(double escala) throws IllegalArgumentException {
		if (escala < 0) {
			throw new IllegalArgumentException("La escala no puede ser negativa.");
		}
		this.radio = radio * escala;

	}

	@Override
	public void imprimir() {
		String mensaje = String.format("Radio: %.2f, Perimetro: %.2f, Area: %.2f", radio, perimetro(), area());
		System.out.println(mensaje);

	}

}
