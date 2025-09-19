package ejercicio1;

import java.util.Objects;

public class Alumno {

	private String grupo;
	private String nombre;
	private int notaMates;
	private int notaLengua;
	private int notaFisica;
	private int notaQuimica;
	private int notaIngles;

	public Alumno(String grupo, String nombre, int notaMates, int notaLengua, int notaFisica, int notaQuimica,
			int notaIngles) {
		if (grupo == null) {
			throw new NullPointerException("El grupo no debe ser nulo");
		}
		if (grupo.isEmpty()) {
			throw new IllegalArgumentException("El grupo no puede estar vacio");
		}
		if (nombre == null) {
			throw new NullPointerException("El nombre no debe ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}
		if (notaLengua < 0 || notaLengua > 10) {
			throw new IllegalArgumentException("La nota de lengua debe de estar entre 0 y 10");
		}
		if (notaFisica < 0 || notaFisica > 10) {
			throw new IllegalArgumentException("La nota de fisica debe de estar entre 0 y 10");
		}
		if (notaMates < 0 || notaMates > 10) {
			throw new IllegalArgumentException("La nota de mates debe de estar entre 0 y 10");
		}
		if (notaQuimica < 0 || notaQuimica > 10) {
			throw new IllegalArgumentException("La nota de quimica debe de estar entre 0 y 10");
		}
		if (notaIngles < 0 || notaIngles > 10) {
			throw new IllegalArgumentException("La nota de ingles debe de estar entre 0 y 10");
		}
		this.grupo = grupo;
		this.nombre = nombre;
		this.notaMates = notaMates;
		this.notaLengua = notaLengua;
		this.notaFisica = notaFisica;
		this.notaQuimica = notaQuimica;
		this.notaIngles = notaIngles;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getNotaMatematicas() {
		return this.notaMates;
	}

	public int getNotaLengua() {
		return this.notaLengua;
	}

	public int getNotaFisica() {
		return this.notaFisica;
	}

	public int getNotaQuimica() {
		return this.notaQuimica;
	}

	public int getNotaIngles() {
		return this.notaIngles;
	}

	public String toString() {
		return String.format("\n%s;%s;%d;%d;%d;%d;%d", grupo, nombre, notaMates, notaLengua, notaFisica, notaQuimica,
				notaIngles);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(grupo, nombre, notaFisica, notaIngles, notaLengua, notaMates, notaQuimica);
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
		return Objects.equals(grupo, other.grupo) && Objects.equals(nombre, other.nombre)
				&& notaFisica == other.notaFisica && notaIngles == other.notaIngles && notaLengua == other.notaLengua
				&& notaMates == other.notaMates && notaQuimica == other.notaQuimica;
	}


}
