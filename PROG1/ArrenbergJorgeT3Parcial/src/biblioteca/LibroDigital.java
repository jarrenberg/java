/*Claes que simula el comportamiento de un libro digital, con sus parametros, metodos y constructores. hereda de la clas Libro
 * Jorge Arrenberg 01/04/2025
 * */

package biblioteca;

import java.time.LocalDate;

public class LibroDigital extends Libro {
	// Atributos staticos finales de clase
	public static final String[] FORMATOS = { "pdf", "epub", "mobi" };
	public static final String FORMATO_DEFAULT = "epub";
	public static int TAMANYO_DEFAULT = 100;
	// Atributos estaticos de clase
	private static int numLibrosDigitales = 0;
	// Atributos finales de objeto
	private final String idDigital;
	// Atributos de objeto
	private double tamanyo;
	public String formato;

	// Constructor con todos los parametros
	public LibroDigital(String titulo, String autor, String genero, LocalDate fecha, boolean disponibilidad,
			double tamanyo, String formato) {
		super(titulo, autor, genero, fecha, disponibilidad);
		if (tamanyo < 0) {
			throw new IllegalArgumentException("El tamaño no puede ser negativo");
		}
		if (!formato.equalsIgnoreCase(FORMATOS[0]) && !formato.equalsIgnoreCase(FORMATOS[1])
				&& !formato.equalsIgnoreCase(FORMATOS[2])) {
			this.formato = FORMATOS[1];
		} else {
			this.formato = formato;
		}
		this.tamanyo = tamanyo;
		this.idDigital = idForma(genero);
		numLibrosDigitales++;
	}

	// Constructor con dos parametros y el resto por defecto
	public LibroDigital(String formato, double tamanyo) {
		this(TITULO_DEF, AUTOR_DEF, GENERO_DEF, FECHA_DEF, DISPONIBILIDAD_DEFAULT, tamanyo, formato);
	}

	// Constructor por defectos
	public LibroDigital() {
		this(TITULO_DEF, AUTOR_DEF, GENERO_DEF, FECHA_DEF, DISPONIBILIDAD_DEFAULT, TAMANYO_DEFAULT, FORMATO_DEFAULT);
	}

	// Metodo que devueleve la forma que debe tener el identificador de los libros
	// digitales
	private String idForma(String genero) {
		String gen = String.format("%s%s%s", genero.charAt(0), genero.charAt(1), genero.charAt(2));
		String resultado = null;
		if (genero.equalsIgnoreCase("Cuento")) {
			resultado = String.format("D-%s-%04d", gen, contadorCuento);
			contadorCuento++;
		}
		if (genero.equalsIgnoreCase("Novela")) {
			resultado = String.format("D-%s-%04d", gen, contadorNovela);
			contadorNovela++;
		}
		if (genero.equalsIgnoreCase("Ficcion")) {
			resultado = String.format("D-%s-%04d", gen, contadorFiccion);
			contadorFiccion++;
		}

		return resultado;

	}

	// Pseudo constructor que genera objetos de la clase LibroDigital
	public static LibroDigital crearLibro(String titulo, String autor, LocalDate fecha, String genero,
			boolean disponibilidad, double tamanyo, String formato) {
		LibroDigital resultado;
		try {
			resultado = new LibroDigital(titulo, autor, genero, fecha, disponibilidad, tamanyo, formato);
		} catch (IllegalArgumentException ex) {
			// En caso de dar error, se devuelve un objeto por defecto
			System.out.printf("Error. %s\n", ex.getMessage());
			resultado = new LibroDigital(LibroDigital.FORMATO_DEFAULT, LibroDigital.TAMANYO_DEFAULT);
		}
		return resultado;

	}

	// Metodo que devuelve el id delos libros digitales
	@Override
	public String getId() {
		return this.idDigital;
	}

	// Metodo que devuelve el precio de un libro digital
	@Override
	public double getPrecio() {
		if (disponibilidad == false) {
			throw new IllegalStateException("No se puede calcular el precio porque no esta disponbile");
		}
		double precio = precio = (tamanyo * 0.45);
		if (formato.equals(FORMATOS[1])) {
			precio = precio + 1.5;
		}
		return precio;
	}

	// MEtodo que muestra la informacion de un objeto LibroDigital
	public String toString() {
		return String.format("ID: %s %s, Tamaño: %.2f Formato: %s\n", idDigital, super.toString(), tamanyo, formato);
	}

}
