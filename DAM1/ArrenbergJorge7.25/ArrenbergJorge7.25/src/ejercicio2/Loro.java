package ejercicio2;

import java.time.LocalDate;

public class Loro extends Aves{
	private String origen;

	protected Loro(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean habla, String pico,
			boolean vuela,String origen) throws NullPointerException,IllegalArgumentException{
		super(nombre, edad, estado, fechaNacimiento, habla, pico, vuela);
		if (origen == null) {
			throw new NullPointerException("El color no puede ser nulo");
		}
		if (origen.equals("")) {
			throw new IllegalArgumentException("El color no puede estar vacio");
		}
		this.origen=origen;
	}
	
	public String getOrigen() {
		return this.origen;
	}
	
	public String toString() {
		String mensaje = String.format("%s Origen: %s", super.toString(),origen);
		return mensaje;
	}

}
