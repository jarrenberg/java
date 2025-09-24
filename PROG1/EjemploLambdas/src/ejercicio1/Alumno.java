package ejercicio1;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private Integer edad;

	public Alumno(String nombre, int edad) {
		if (nombre == null) {
			throw new NullPointerException("El nombre no debe ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}

		this.nombre = nombre;
		this.edad = edad;

	}

	public String getNombre() {
		return this.nombre;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public String toString() {
		return String.format("\n%s,%d", nombre, edad);
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}


}
