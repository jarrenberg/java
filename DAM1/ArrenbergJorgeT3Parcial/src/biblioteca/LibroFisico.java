/*Claes que simula el comportamiento de un libro fisico, con sus parametros, metodos y constructores. hereda de la clas Libro
 * Jorge Arrenberg 01/04/2025
 * */

package biblioteca;

import java.time.LocalDate;
import java.util.Objects;

public class LibroFisico extends Libro {
	// Atributos staticos finales de clase
	public static final String[] TAPAS = { "Dura", "Blanda" };
	public static final String TAPA_DEFAULT = "Blanda";
	public static final int NUMERO_PAGINAS_DEFAULT = 100;
	// Atributos estaticos de clase
	private static int numLibrosFisicos = 0;
	// Atributos finales de objeto
	private final String idFisico;
	// Atributos de objeto
	private String tapa; // Si es dura true, false si es blanda
	private int numPag;

	// Constructor con todos los parametros
	public LibroFisico(String titulo, String autor, String genero, LocalDate fecha, boolean disponibilidad, int numPag,
			String tapa) {
		super(titulo, autor, genero, fecha, disponibilidad);
		if (numPag < 0) {
			throw new IllegalArgumentException("El numero de paginas no puede ser negativo");
		}
		if (!tapa.equals(TAPAS[0]) && !tapa.equals(TAPAS[1])) {
			this.tapa = TAPAS[1];
		} else {
			this.tapa = tapa;
		}
		this.numPag = numPag;
		this.idFisico = idForma(genero);
		numLibrosFisicos++;
	}

	// Constructor con dos parametros y el resto por defecto
	public LibroFisico(String tapa, int numPa) {
		this(TITULO_DEF, AUTOR_DEF, GENERO_DEF, FECHA_DEF, DISPONIBILIDAD_DEFAULT, numPa, tapa);
	}

	// Metodo que devueleve la forma que debe tener el identificador de los libros
	// fisicos
	private String idForma(String genero) {
		String gen = String.format("%s%s%s", genero.charAt(0), genero.charAt(1), genero.charAt(2));
		String resultado = null;
		if (genero.equalsIgnoreCase("Cuento")) {
			resultado = String.format("F-%s-%04d", gen, contadorCuento);
			contadorCuento++;
		}
		if (genero.equalsIgnoreCase("Novela")) {
			resultado = String.format("F-%s-%04d", gen, contadorNovela);
			contadorNovela++;
		}
		if (genero.equalsIgnoreCase("Ficcion")) {
			resultado = String.format("F-%s-%04d", gen, contadorFiccion);
			contadorFiccion++;
		}

		return resultado;

	}

	// Metodo que devuelve el id delos libros fisicos
	@Override
	public String getId() {
		return this.idFisico;
	}

	// Metodo que devuelve el precio de un libro fisico
	@Override
	public double getPrecio() {
		if (disponibilidad == false) {
			throw new IllegalStateException("No se puede calcular el precio porque no esta disponbile");
		}
		double precio = numPag * 0.75;
		if (tapa.equals(TAPAS[0])) {
			precio = precio + 3;
		}
		return precio;
	}
	// MEtodo que muestra la informacion de un objeto LibroFisico
	@Override
	public String toString() {
		return String.format("\"ID: %s %s, Numero Paginas. %d, Tapa: %s\n", idFisico, super.toString(), numPag, tapa);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFisico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroFisico other = (LibroFisico) obj;
		return Objects.equals(idFisico, other.idFisico);
	}

}
