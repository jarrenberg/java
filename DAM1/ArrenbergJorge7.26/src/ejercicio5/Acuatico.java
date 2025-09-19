/*
 * Clase que simula el comportamiento de un vehiculo acuatico, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Acuatico extends Vehiculo {

	private final double eslora;

	protected Acuatico(String matricula, String modelo, double eslora)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo);
		if (eslora < 0 || eslora > 50) {
			throw new IllegalArgumentException("La eslora no esta dentro de los limites permitidos");
		}
		this.eslora = eslora;
	}

	public double getEslora() {
		return this.eslora;
	}

	public String toString() {
		String mensaje = String.format("%s Eslora: %.2f", super.toString(), eslora);
		return mensaje;
	}

}
