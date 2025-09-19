/*
 * Clase que simula el comportamiento de un barco, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public class Barcos extends Acuatico {
	private boolean tieneMotor;

	protected Barcos(String matricula, String modelo, double eslora, boolean tieneMotor)
			throws NullPointerException, IllegalArgumentException {
		super(matricula, modelo, eslora);
		this.tieneMotor = tieneMotor;
	}

	public boolean getTieneMotor() {
		return this.tieneMotor;
	}
	public String toString() {
		String tm;
		if (tieneMotor) {
			tm = "Si";
		} else {
			tm = "No";
		}
		String mensaje = String.format("%s Tiene motor: %s", super.toString(), tm);
		return mensaje;
	}

}
