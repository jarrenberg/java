package ejercicio2;

import java.time.LocalDate;

public class Canario extends Aves {

	private String color;
	private boolean canta;

	protected Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean habla, String pico,
			boolean vuela, String color, boolean canta) throws NullPointerException,IllegalArgumentException {
		super(nombre, edad, estado, fechaNacimiento, habla, pico, vuela);
		if (color == null) {
			throw new NullPointerException("El color no puede ser nulo");
		}
		if (color.equals("")) {
			throw new IllegalArgumentException("El color no puede estar vacio");
		}
		this.color = color;
		this.canta = canta;
	}

	public String getColor() {
		return this.color;
	}

	public String puedeCantar() {
		String h;
		if (canta) {
			h = "Si";
		} else {
			h = "No";
		}
		return h;
	}

	public String toString() {
		String mensaje = String.format("%s Color: %s ¿Canta?: %s", super.toString(), color, puedeCantar());
		return mensaje;
	}

}
