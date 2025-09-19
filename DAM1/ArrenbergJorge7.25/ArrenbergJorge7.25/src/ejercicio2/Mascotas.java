package ejercicio2;

import java.time.LocalDate;

public abstract class Mascotas {
	protected String nombre;
	protected int edad;
	protected String estado;
	protected LocalDate fechaNacimiento;
	protected boolean habla;

	// preguntar a rafa posibles excepciones de fechaNacimiento, si pongo
	// directamente el localdate of como parametro
	public  Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean habla)
			throws NullPointerException, IllegalArgumentException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (estado == null) {
			throw new NullPointerException("El estado no puede ser nulo");
		}
		if (fechaNacimiento == null) {
			throw new NullPointerException("La fecha de nacimiento no puede ser nula");
		}
		if (nombre.equals("")) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}

		if (estado.equals("")) {
			throw new IllegalArgumentException("El estado no puede estar vacio");
		}
		if (edad < 0) {
			throw new IllegalArgumentException("La edad no puede ser negativo");
		}
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
		this.habla = habla;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public boolean getHabla() {
		return this.habla;
	}
	
	public String toString() {
		String mensaje = String.format("Animal: %s Nombre: %s Edad: %d Estado: %s Fecha de Nacimiento:  %s ¿Habla?: %s",this.getClass().getSimpleName(), nombre,
				edad, estado, fechaNacimiento.toString(), habla());
		return mensaje;
	}
	

	public String cumpleanyos() {
		String mensaje = String.format("Cumpleaños: %d/%d", fechaNacimiento.getDayOfMonth(),
				fechaNacimiento.getMonthValue());
		return mensaje;
	}

	public void morir() {
		this.estado = "Muerto";
	}

	public String habla() {
		String h;
		if (habla) {
			h = "Si";
		} else {
			h = "No";
		}
		return h;
	}
}
