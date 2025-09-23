/*Claes que simula el comportamiento de un libro, con sus parametros, metodos y constructores.
 * Jorge Arrenberg 01/04/2025
 * */
package biblioteca;

import java.time.LocalDate;

public abstract class Libro {
	// Atributos staticos finales de clase
	public static final String[] GENEROS = { "Cuento", "Novela", "Ficcion" };
	public static final String GENERO_DEF = "Cuento";
	public static final String TITULO_DEF = "LA SIRENITA";
	public static final String AUTOR_DEF = "RAFA";
	public static final LocalDate FECHA_DEF = LocalDate.of(2002, 10, 12);
	public static final boolean DISPONIBILIDAD_DEFAULT = true;
	// Atributos estaticos de clase
	protected static int contadorCuento = 1;
	protected static int contadorNovela = 1;
	protected static int contadorFiccion = 1;
	// Atributos de objeto
	protected String titulo;
	protected String autor;
	protected LocalDate fechaPublicacion;
	protected String genero;
	protected boolean disponibilidad;

	// Constructor con todos los parametros
	public Libro(String titulo, String autor, String genero, LocalDate fecha, boolean disponibilidad) {
		if (!genero.equalsIgnoreCase(GENEROS[0]) && !genero.equalsIgnoreCase(GENEROS[1])
				&& !genero.equalsIgnoreCase(GENEROS[2])) {
			throw new IllegalArgumentException("El genero de ser Cuento, Novela o Ficcion");
		}
		if (fecha.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de publicacion no puede ser posterior a la actual");
		}
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.fechaPublicacion = fecha;
		this.disponibilidad = disponibilidad;

	}

	// Metodo que devuelve los años que han pasado desde la publicacion de un libro
	public int anyosDesdePublicacion() {
		int anyos;
		anyos = LocalDate.now().getYear() - this.fechaPublicacion.getYear();
		return anyos;
	}

	// Metodo que permite cambiar la fecha de publicacion de un libro si no es
	// posterior a hoy
	public void setFechaPublicacion(LocalDate f) {
		if (f.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de publicacion no puede ser posterior a la actual");
		}
		this.fechaPublicacion = f;
	}

	public double getPrecio() {
		return 0;
	}

	public String getId() {
		return "";
	}

	// MEtodo que muestra la informacion de un objeto Libro
	public String toString() {
		String d;
		if (disponibilidad) {
			d = "Disponible";
		} else {
			d = "No disponible";
		}
		return String.format("Titulo: %s, Autor: %s, Genero: %s, Fecha de Publicacion: %s, Disponibilidad:%s", titulo,
				autor, genero, fechaPublicacion.toString(), d);
	}

}
