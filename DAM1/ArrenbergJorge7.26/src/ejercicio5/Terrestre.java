/*
 * Clase que simula el comportamiento de un vehiculo terrestre, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Terrestre extends Vehiculo {

	protected final int numRuedas;

	protected Terrestre(String matricula, String modelo, int numRuedas)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public String toString() {
		String mensaje = String.format("%s Numero de Ruedas: %d", super.toString(), numRuedas);
		return mensaje;
	}
}
