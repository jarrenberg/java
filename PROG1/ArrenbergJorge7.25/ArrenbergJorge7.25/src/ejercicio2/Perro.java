package ejercicio2;

import java.time.LocalDate;

public class Perro extends Mascotas {
	private String raza;
	private int numPulgas;

	protected Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean habla, String raza,
			int numPulgas) throws NullPointerException, IllegalArgumentException {
		super(nombre, edad, estado, fechaNacimiento, habla);
		if (raza == null) {
			throw new NullPointerException("La raza no peude ser nula");
		}
		if (raza.equals("")) {
			throw new IllegalArgumentException("La raza no peude estar vacia");
		}
		if (numPulgas < 0) {
			throw new IllegalArgumentException("El numero de pulgas no puede ser negativo");
		}
		this.raza = raza;
		this.numPulgas = numPulgas;
	}

	public String getRaza() {
		return this.raza;
	}

	public int getNumPulgas() {
		return this.numPulgas;
	}

	public String toString() {
		String mensaje = String.format("%s Raza: %s Numero de pulgas: %d", super.toString(), raza, numPulgas);
		return mensaje;
	}
}