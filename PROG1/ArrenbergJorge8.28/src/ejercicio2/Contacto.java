package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Contacto implements Comparable<Contacto> {

	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	private LocalDate fechaNacimiento;
	private ArrayList<Llamadas> registro;

	public Contacto(String nombre, String direccion, String telefono, String email, LocalDate fechaNacimiento,
			ArrayList<Llamadas> registro) throws IllegalArgumentException, NullPointerException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}

		if (direccion == null) {
			throw new NullPointerException("La direccion no puede ser nula");
		}
		if (direccion.isEmpty()) {
			throw new IllegalArgumentException("La direccion no puede estar vacía");
		}
		if (telefono == null) {
			throw new NullPointerException("El telefono no puede ser nulo");
		}
		if (telefono.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}

		if (email == null) {
			throw new NullPointerException("La direccion de email no puede ser nula");
		}
		if (email.isEmpty()) {
			throw new IllegalArgumentException("La direccion de email no puede estar vacía");
		}

		if (fechaNacimiento == null) {
			throw new NullPointerException("La fecha de nacimiento no puede ser nula");
		}
		if (registro == null) {
			this.registro = new ArrayList<>();
		} else {
			this.registro = new ArrayList<>(registro);
		}
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Devuelve el nombre de un contacto
	public String getNombre() {
		return this.nombre;
	}

	// Devuelve la fecha de nacimiento de un contacto
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public String toString() {
		return String.format("NOMBRE: %s, DIRECCION: %s, TELEFONO: %s, EMAIL: %s, FECHA DE NACIMIENTO: %s, REGISTRO DE LLAMADAS: %s\n", nombre,
				direccion, telefono, email, fechaNacimiento.toString(),registro.toString());
	}

	// Sobrescritura de los metodos hashcode e equals para usarlo con HashSet
	@Override
	public int hashCode() {
		return Objects.hash(telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(telefono, other.telefono);
	}

	@Override
	// Compara dos objetos contacto por su atributo nombre
	public int compareTo(Contacto o) {
		return this.nombre.compareTo(o.nombre);
	}
}
