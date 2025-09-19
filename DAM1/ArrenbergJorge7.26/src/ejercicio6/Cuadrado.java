/*
 * Creacion de la clase Cuadrado, con su parametro, constructor y los metodos heredados de la interfaz Figura2D
 * Jorge Arrenberg 09/03/2025 
 * 
 */

package ejercicio6;

public class Cuadrado extends Figuras implements Figura2D {

	private double lado;

	public Cuadrado (double lado) throws IllegalArgumentException{
		if(lado<0) {
			throw new IllegalArgumentException("Una longitud no puede ser negativa.");
		}
		this.lado=lado;
	}
	@Override
	public double perimetro() {
		double resultado = lado * 4;
		return resultado;
	}

	@Override
	public double area() {
		double resultado = Math.pow(lado, 2);
		return resultado;
	}

	@Override
	public void escalar(double escala) throws IllegalArgumentException {
		if (escala < 0) {
			throw new IllegalArgumentException("La escala no puede ser negativa.");
		}
		this.lado = (lado * escala);
	}

	@Override
	public void imprimir() {
		String mensaje = String.format("Lado: %.2f, Perimetro: %.2f, Area: %.2f", lado,perimetro(),area());
		System.out.println(mensaje);

	}

}
