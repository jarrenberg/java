/*
 * Clase que simula el comportamiento de un coche, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Coches extends Terrestre {

	private boolean aireAcondicionado;

	protected Coches(String matricula, String modelo, int numRuedas, boolean aireAcondicionado)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo, numRuedas);
		this.aireAcondicionado = aireAcondicionado;
	}

	public boolean getAireAcondicionado() {
		return this.aireAcondicionado;
	}

	public String toString() {
		String ac;
		if (aireAcondicionado) {
			ac = "Si";
		} else {
			ac = "No";
		}
		String mensaje = String.format("%s Aire Acondicionado: %s", super.toString(), ac);
		return mensaje;
	}

}
