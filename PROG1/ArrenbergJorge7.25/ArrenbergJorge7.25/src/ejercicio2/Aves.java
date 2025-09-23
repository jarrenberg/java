package ejercicio2;

import java.time.LocalDate;

public abstract class Aves extends Mascotas {
	protected String pico;
	protected boolean vuela;

	protected Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean habla, String pico,
			boolean vuela) throws NullPointerException,IllegalArgumentException {
		super(nombre, edad, estado, fechaNacimiento, habla);
		if (pico == null) {
			throw new NullPointerException("El tipo de pico no puede ser nulo");
		}
		if (pico.equals("")) {
			throw new IllegalArgumentException("El tipo de pico no puede estar vacio");
		}
		this.pico = pico;
		this.vuela = vuela;
	}

	public String getPico() {
		return this.pico;
	}

	public String puedeVolar() {
		String h;
		if (vuela) {
			h = "Si";
		} else {
			h = "No";
		}
		return h;
	}
	
	public void volar() {
		if(vuela) {
			vuela=false;
		}else {
			vuela=true;
		}
	}

	public String toString() {
		String mensaje = String.format("%s Pico: %s ¿Vuela?: %s", super.toString(), pico, puedeVolar());
		return mensaje;
	}

}
