package ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Atleta {

	private String nombre;
	private int edad;
	private double altura;

	public Atleta(String nombre, int edad, double altura) {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		if (edad < 0 || edad > 80) {
			throw new IllegalArgumentException("Las edades deben estar entre 0 y 80 años");
		}

		if (altura < 0 || altura > 2) {
			throw new IllegalArgumentException("Las alturas deben estar entre 0 y 3 metros");
		}

		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	// Devuelve la edad de un atleta
	public int getEdad() {
		return this.edad;
	}

	// Devuelve la altura de un atleta
	public double getAltura() {
		return this.altura;
	}

	// Devuelve el nombre de un atleta
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura) && edad == other.edad
				&& Objects.equals(nombre, other.nombre);
	}

	public String toString() {
		return String.format("Nombre: %s, Edad: %d, Altura: %.2f", nombre, edad, altura);
	}
}
