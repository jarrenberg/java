/*
 * Clase que simula el comportamiento de una moto, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Motos extends Terrestre {
	private String color;

	protected Motos(String matricula, String modelo, int numRuedas, String color)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo, numRuedas);
		if (color == null) {
			throw new NullPointerException("El color no puede ser nulo.");
		}
		if(color.equals("")) {
			throw new IllegalArgumentException ("El color no puede estar vacio.");
		}
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public String toString() {
		String mensaje = String.format("%s Color: %s", super.toString(), color);
		return mensaje;
	}

}
