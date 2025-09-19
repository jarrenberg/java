package ejercicio2;

import java.time.LocalDate;

public class Gato extends Mascotas {
	private String color;
	private boolean peloLargo;

	protected Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean habla, String color, boolean peloLargo)throws NullPointerException,IllegalArgumentException {
		super(nombre, edad, estado, fechaNacimiento, habla);
		if (color == null) {
			throw new NullPointerException("El color no puede ser nulo");
		}
		if (color.equals("")) {
			throw new IllegalArgumentException("El color no puede estar vacio");
		}
		this.color=color;
		this.peloLargo=peloLargo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String tienePeloLargo() {
		String h;
		if (peloLargo) {
			h = "Si";
		} else {
			h = "No";
		}
		return h;
	}
	
	public String toString() {
		String mensaje = String.format("%s Color: %s ¿Tiene pelo largo?: %s", super.toString(),color,tienePeloLargo());
		return mensaje;
	}
	
}
