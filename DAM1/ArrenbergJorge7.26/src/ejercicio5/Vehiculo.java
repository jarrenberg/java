/*
 * Clase que simula el comportamiento de un vehiculo, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio5;

public abstract class Vehiculo {
	private final String matricula;
	private final String modelo;

	protected Vehiculo(String matricula, String modelo) throws NullPointerException, IllegalArgumentException {
		if (matricula == null) {
			throw new NullPointerException("La matricula no puede ser nula.");
		}
		if (modelo == null) {
			throw new NullPointerException("El modelo no puede ser nulo.");
		}
		if (!verificarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula introducida no cumple el patron");
		}
		this.matricula = matricula;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public String getModelo() {
		return this.modelo;
	}

	private boolean verificarMatricula(String matricula) {
		boolean correcta = false;
		String matriculaTerrestre = "[0-9]{4}[A-Z]{3}";
		String matriculaAcuatico = "[A-Z]{3,10}";
		String matriculaAereo = "[A-Z]{4}[0-9]{6}";
		
		if (this.getClass().getSimpleName().equals("Terrestre")||this.getClass().getSimpleName().equals("Coches")||this.getClass().getSimpleName().equals("Motos")) {
			if (matricula.matches(matriculaTerrestre)) {
				correcta = true;
			} else {
				correcta = false;
			}
		}
		if (this.getClass().getSimpleName().equals("Acuatico")||this.getClass().getSimpleName().equals("Barcos")||this.getClass().getSimpleName().equals("Submarinos")) {
			if (matricula.matches(matriculaAcuatico)) {
				correcta = true;
			} else {
				correcta = false;
			}
		}
		if (this.getClass().getSimpleName().equals("Aereo")||this.getClass().getSimpleName().equals("Aviones")||this.getClass().getSimpleName().equals("Helicopteros")) {
			if (matricula.matches(matriculaAereo)) {
				correcta = true;
			} else {
				correcta = false;
			}
		}
		return correcta;
	}

	public String toString() {
		String mensaje = String.format("Matricula: %s Modelo: %s", matricula, modelo);
		return mensaje;
	}
}
