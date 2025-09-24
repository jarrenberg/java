package ejercicio4;

import java.util.LinkedList;

public class Persona {
	private String nombre;
	private String sexo;
	private String estadoCivil;
	private int edad;

	public Persona(String nombre, String sexo, String estadoCivil, int edad)
			throws NullPointerException, IllegalArgumentException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		if (edad < 0 || edad > 120) {
			throw new IllegalArgumentException("La edad introducida no esta dentro del rango permitido");
		}
		if (sexo == null) {
			throw new NullPointerException("El sexo no puede ser nulo");
		}
		if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("femenino")) {
			throw new IllegalArgumentException("Los sexos permitidos son 'masculino' y 'femenino'");
		}
		if (estadoCivil == null) {
			throw new NullPointerException("El estado civil no puede ser nulo");
		}
		if (!estadoCivil.equalsIgnoreCase("soltero") && !estadoCivil.equalsIgnoreCase("casado")
				&& !estadoCivil.equalsIgnoreCase("viudo") && !estadoCivil.equalsIgnoreCase("divorciado")) {
			throw new IllegalArgumentException(
					"Los estados civiles permitidos son 'soltero', 'casado', 'viudo' y 'divorciado'");
		}
		this.nombre = nombre;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}

	public String geteEstadoCivil() {
		return this.estadoCivil;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getEdad() {
		return this.edad;
	}

	public String toString() {
		return String.format("NOMBRE: %s, EDAD: %d, SEXO: %s, ESTADO CIVIL: %s\n", nombre, edad, sexo, estadoCivil);
	}

}
