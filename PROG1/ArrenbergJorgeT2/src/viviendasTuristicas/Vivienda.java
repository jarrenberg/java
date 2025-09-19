/*
 * Clase que simula el comportamiento de una vivienda turisita con sus metodos, atributos y constructores
 * Jorge Arrenberg 11/03/2025 
 *
 */

package viviendasTuristicas;

public abstract class Vivienda {

	public static final String DIRECCION_DEFAULT = "C/ de la Amargura nº5";
	public static final double PRECIO_NOCHE_DEFAULT = 30;
	public static final boolean DISPONIBLE_DEFAULT = true;

	protected static int contadorVT;
	protected static int contadorAP;
	protected static int contadorCR;
	protected static int contadorHO;

	protected  String identificador;

	protected String direccion;
	protected double precioNoche;
	protected boolean disponible;

	static {
		contadorVT = 0;
		contadorAP = 0;
		contadorCR = 0;
		contadorHO = 0;
	}

	// Constructor con todos los parametros
	public Vivienda(String direccion, double precioNoche, boolean disponible) {
		if (this instanceof Apartamento) {
			identificador = String.format("%s-%03d", "AP", contadorAP);
		}
		if (this instanceof CasaRural) {
			identificador = String.format("%s-%03d", "CR", contadorCR);
		}
		if (this instanceof Hotel) {
			identificador = String.format("%s-%03d", "HO", contadorHO);
		}

		this.direccion = direccion;
		this.precioNoche = precioNoche;
		this.disponible = disponible;
		contadorVT++;
	}

	// Constructor por defecto
	public Vivienda() {
		this(DIRECCION_DEFAULT, PRECIO_NOCHE_DEFAULT, DISPONIBLE_DEFAULT);
	}

	// Devuelve el precio de una estancia un numeo de dias
	 abstract double calcularPrecio(int dias) throws IllegalArgumentException;

	// Devuelve el numero de viviendas turisticas
	public static int getViviendasTuristicas() {
		return contadorVT;
	}


	@Override
	// Metodo que muestra la informacion del objeto
	public String toString() {
		String d;
		if (disponible) {
			d = "Si";
		} else {
			d = "No";
		}
		String mensaje = String.format("Codigo: %s, Direccion: %s Precio por Noche: %.2f Disponible: %s", identificador,
				direccion, precioNoche, d);
		return mensaje;
	}
}
