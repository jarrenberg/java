/*
 * Clase que simula el comportamiento de un helicoptero, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Helicopteros extends Aereo {
	private int numHelices;

	protected Helicopteros(String matricula, String modelo, int numAsientos, int numHelices)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo, numAsientos);
		if (numHelices < 0) {
			throw new IllegalArgumentException("El numero de helices no puede ser negativo.");
		}
		this.numHelices = numHelices;
	}

	public int getNumHelices() {
		return this.numHelices;
	}

	public String toString() {
		String mensaje = String.format("%s Numero de Helices: %d", super.toString(), numHelices);
		return mensaje;
	}
}
