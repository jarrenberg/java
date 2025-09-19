/*
 * Clase que simula el comportamiento de un submarino, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Submarinos extends Acuatico {
	private double profundidadMax;

	protected Submarinos(String matricula, String modelo, double eslora, double profundidadMax)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo, eslora);
		if (profundidadMax < 0) {
			throw new IllegalArgumentException("La profundidad maxima no puede ser negativa.");
		}
		this.profundidadMax = profundidadMax;
	}
	public double getProfundidadMax() {
		return this.profundidadMax;
	}

	public String toString() {
		String mensaje = String.format("%s Profundidad Maxima: %.2f", super.toString(), profundidadMax);
		return mensaje;
	}
}
