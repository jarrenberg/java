/*
 * Clase que simula el comportamiento de un vehiculo aereo, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Aereo extends Vehiculo {
	private final int numAsientos;

	protected Aereo(String matricula, String modelo, int numAsientos)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo);
		if (numAsientos < 0 || numAsientos > 1000) {
			throw new IllegalArgumentException("El numero de asientos no esta dentro de los limites permitidos");
		}
		this.numAsientos = numAsientos;
	}

	public int getNumAsientos() {
		return this.numAsientos;
	}

	public String toString() {
		String mensaje = String.format("%s Numero de Asientos: %d", super.toString(), numAsientos);
		return mensaje;
	}
}
