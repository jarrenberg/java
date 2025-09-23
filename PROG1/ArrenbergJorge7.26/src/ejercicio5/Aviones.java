/*
 * Clase que simula el comportamiento de un avion, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Aviones extends Aereo {
	private double tiempoMaxVuelo;

	protected Aviones(String matricula, String modelo, int numAsientos, double tiempoMaxVuelo)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo, numAsientos);
		if (tiempoMaxVuelo < 0) {
			throw new IllegalArgumentException("La profundidad maxima no puede ser negativa.");
		}
		this.tiempoMaxVuelo = tiempoMaxVuelo;
	}

	public double getTiempoMaxVuelo() {
		return this.tiempoMaxVuelo;
	}

	public String toString() {
		String mensaje = String.format("%s Tiempo Maximo de Vuelo: %.2f", super.toString(), tiempoMaxVuelo);
		return mensaje;
	}

}
