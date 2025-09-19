/*
 * Clase que simula el comportamiento de un hotel y que hereda de la clase vivienda con sus metodos, atributos y constructores
 * Jorge Arrenberg 11/03/2025 
 *
 */

package viviendasTuristicas;

public class Hotel extends Vivienda {

	public static final int ESTRELLAS_DEFAULT = 3;
	public static final int NUM_HABITACION_DEF = 3;
	public static final boolean TIENE_SPA_DEFAULT = false;

	private int estrellas;
	private int numHabitaciones;
	private boolean tieneSpa;

	// Constructor con todos los parametros
	public Hotel(String direccion, double precioNoche, boolean disponible, int estrellas, int numHabitaciones,
			boolean tieneSpa) {
		super(direccion, precioNoche, disponible);
		this.identificador = getId();
		this.estrellas = estrellas;
		this.numHabitaciones = numHabitaciones;
		this.tieneSpa = tieneSpa;
	}
	
	public void setTieneSpa(boolean tieneSpa) {
		this.tieneSpa=tieneSpa;
	}

	// Constructor por defcto
	public Hotel() {
		this(DIRECCION_DEFAULT, PRECIO_NOCHE_DEFAULT, DISPONIBLE_DEFAULT, ESTRELLAS_DEFAULT, NUM_HABITACION_DEF,
				TIENE_SPA_DEFAULT);
	}

	private String getId() {
		String id = String.format("%s-%03d", "HO", contadorHO);
		contadorHO = contadorHO + 5;
		return id;
	}

	@Override
	// Devuelve el precio de una estancia un numeo de dias
	public double calcularPrecio(int dias) throws IllegalArgumentException{
		double precio = precioNoche * dias * 1.0;
		if (estrellas >= 3) {
			precio = precio + (precio * 0.05);
		}
		if (tieneSpa) {
			precio = precio + 30;
		}
		return precio;
	}

	// Metodo que devuelve si un hotel es lujoso o no
	public boolean esLujoso() {
		boolean lujo;
		if ((this.estrellas == 5) && (tieneSpa == true)) {
			lujo = true;
		} else {
			lujo = false;
		}
		return lujo;
	}

	@Override
	// Metodo que muestra la informacion del objeto
	public String toString() {
		String a;
		if (tieneSpa) {
			a = "Si";
		} else {
			a = "No";
		}
		String mensaje = String.format("%s Estrellas: %d Numero de habitacionens: %d Tiene Spa: %s", super.toString(),
				estrellas, numHabitaciones, a);
		return mensaje;
	}
}
