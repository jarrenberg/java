/*
 * Crecion de una clase Cancion con atributos titulo y autor, con metodos setter y getter y constructores
 * Jorge Arrenberg 01/02/2025
 */
package ejercicio1;

public class Cancion {
	public static final String TITULO_DEFAULT = "Intro";
	public static final String AUTOR_DEFAULT = "Cecilio G";

	private String titulo;
	private String autor;

	// Constructor con 2 parametoros
	public Cancion(String titulo, String autor) throws IllegalArgumentException {
		// Si el titulo o el autor son nulos lanzamos una excepcion
		if (titulo == null || titulo == "") {
			throw new IllegalArgumentException("El titulo no puede ser nulo");
		}
		if (autor == null || autor == "") {
			throw new IllegalArgumentException("El nombre del autor no puede ser nulo");
		}
		// Si no salta ninguna excepcion creamos el objeto con los parametros indicados
		this.autor = autor;
		this.titulo = titulo;
	}

	// Constructor sin parametors
	public Cancion() {
		// Llamada al constructor con 2 parametros
		this(TITULO_DEFAULT, AUTOR_DEFAULT);
	}

	// Metodo que devuelve un nuevo objeto con las caracteristicas del objeto clonado
	public Cancion clonar() {
		Cancion clon = new Cancion(this.titulo, this.autor);
		return clon;
	}

	// Metdoo que permite poner un titulo a una cancion
	public void ponTitulo(String titulo) throws IllegalArgumentException {
		// Si el titulo es nulo lanzamos la excepcion
		if (titulo == null || titulo == "") {
			throw new IllegalArgumentException("El titulo no puede ser nulo");
		}
		// Si no salta la excepcion asignamos el parametro como titulo
		this.titulo = titulo;
	}
	
	// Metdoo que permite poner un autor a una cancion
	public void ponAutor(String autor) throws IllegalArgumentException {
		// Si el autor es nulo lanzamos la excepcion
		if (autor == null || autor == "") {
			throw new IllegalArgumentException("El nombre del autor no puede ser nulo");
		}
		// Si no salta la excepcion asignamos el parametro como autor
		this.autor = autor;
	}

	// Metodo que devuele el titulo de una cancion	
	public String dameTitulo() {
		return this.titulo;
	}
	
	// Metodo que devuelve el autor de una cancion
	public String dameAutor() {
		return this.autor;
	}

	// Metodo toStringn adaptado a esta clase
	public String toString() {
		String resultado = String.format("{Titulo de la cancion: %s.\tAutor de la cancion: %s}", this.titulo,
				this.autor);
		return resultado;
	}
}
