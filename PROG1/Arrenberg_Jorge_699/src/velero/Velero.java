/*
 * Creacion de la clase veleros, sus paramtros, constructores y metodos
 * Jorge Arrenberg 12/02/2025
 */
package velero;

import java.util.Iterator;

public class Velero {

	public static final int MIN_MASTILES = 1;
	public static final int MAX_MASTILES = 4;
	public static final byte MIN_VELOCIDAD = 2;
	public static final byte MAX_VELOCIDAD = 30;
	public static final String PATRON_POR_DEFECTO = "Sin Patron";
	public static final String RUMBO_POR_DEFECTO = "Sin Rumbo";
	public static final byte MIN_TRIPULANTES = 0;

	private static int numeroVelerosCreados;
	private static int numeroVelerosNavegando;
	private static int tiempoGlobalNavegacion;

	private final int tripulantesMaximosVelero;
	private final String nombreBarco;
	private final int numMastiles;

	private boolean estaNavegando;
	private int tiempoNavegacion;
	private int velocidad;
	private String nombrePatron;
	private String rumbo;
	private int numTripulantes;

	static {
		numeroVelerosCreados = 0;
		numeroVelerosNavegando = 0;
		tiempoGlobalNavegacion = 0;
	}

	// Constructor con 3 parametros comprobando excepcions
	public Velero(String nombre, int numMastiles, int tripulantesMaximosVelero)
			throws IllegalArgumentException, NullPointerException {
		if (nombre == null) {
			throw new NullPointerException("El nombre del velero no puede ser nulo");
		}

		if (nombre.equals("")) {
			throw new IllegalArgumentException("El nombre del velero no puede estar vacio");
		}
		if (numMastiles > MAX_MASTILES) {
			throw new IllegalArgumentException(
					String.format("El numero de mastiles introducidos (%d) es mayor al maximo permitido (%d).",
							numMastiles, MAX_MASTILES));
		}

		if (numMastiles < MIN_MASTILES) {
			throw new IllegalArgumentException(
					String.format("El numero de mastiles introducidos (%d) es menor al minimo permitido (%d).",
							numMastiles, MIN_MASTILES));
		}
		if (tripulantesMaximosVelero < MIN_TRIPULANTES) {
			throw new IllegalArgumentException(
					String.format("El numero de tripulantes debe ser, como minimo %d", MIN_TRIPULANTES));
		}
		numeroVelerosCreados++;
		this.nombreBarco = nombre;
		this.numMastiles = numMastiles;
		this.tripulantesMaximosVelero = tripulantesMaximosVelero;
		this.estaNavegando = false; // False = No Navega || True = Si Navega
		this.tiempoNavegacion = 0;
		this.velocidad = 0;
		this.nombrePatron = PATRON_POR_DEFECTO;
		this.rumbo = RUMBO_POR_DEFECTO;
		this.numTripulantes = MIN_TRIPULANTES;
	}

	// Constructor sin parametros
	public Velero() {
		this(String.format("Velero %d", (numeroVelerosCreados + 1)), MIN_MASTILES, MIN_TRIPULANTES);
	}

	// Creacion del metodo fabrica
	public static Velero[] crearArrayVelero(int tamanno) throws IllegalArgumentException {
		if (tamanno < 1 || tamanno > 10) {
			throw new IllegalArgumentException(String.format(
					"Numero de barcos incorrecto (%d), debe ser mayor o igual a 1 y menor o igual a 10.", tamanno));
		}
		Velero[] resultado = new Velero[tamanno];
		for (int i = 0; i < tamanno; i++) {
			resultado[i] = new Velero();
		}
		return resultado;
	}

	// Metodo que devuelve el nombre del barco
	public String getNombreBarco() {
		return this.nombreBarco;
	}

	// Metodo que devuelve el numero de mastiles
	public int getNumMastiles() {
		return this.numMastiles;
	}

	// Metodo que devuelve el nombre del barco
	public int getMaxTripulantes() {
		return this.tripulantesMaximosVelero;
	}

	// Metodo que devuelve si esta navegando o no
	public boolean isNavegando() {
		return this.estaNavegando;
	}

	// Metodo que devuelve el tiempo de navegacion de un barco
	public int getTiempoTotalNavegacionBarco() {
		return this.tiempoNavegacion;
	}

	// Metodo que devuelve la velocidad del barco
	public int getVelocidad() {
		return this.velocidad;
	}

	// Metodo que devuelve el rumbo
	public String getRumbo() {
		return this.rumbo;
	}

	// Metodo que devuelve el nombre del patron
	public String getPatron() {
		return this.nombrePatron;
	}

	// Metodo que devuelve la tripulacion del barco
	public int getTripulacion() {
		return this.numTripulantes;
	}

	// Metodo que devuelve el numero de barcos creados hasta el momento
	public static int getNumBarcos() {
		return numeroVelerosCreados;
	}

	// Metodo que devuelve el numero de barcos navegando

	public static int getNumBarcosNavegando() {
		return numeroVelerosNavegando;
	}

	// Metodo que devuelve el tiempo total de navegacion
	public static float getTiempoTotalNavegacion() {
		return (float) tiempoGlobalNavegacion;
	}

	public void iniciarNavegacion(int velocidad, String rumbo, String nombrePatron, int numTripulantes)
			throws IllegalArgumentException, IllegalStateException {
		if (velocidad > MAX_VELOCIDAD || velocidad < MIN_VELOCIDAD) {
			throw new IllegalArgumentException(
					String.format("La velocidad de navegacion %d nudos es incorrecta", velocidad));
		}

		if (estaNavegando == true) {
			throw new IllegalStateException(
					String.format("El velero %s ya esta navegando y se encuentra fuera del puerto", this.nombreBarco));
		}
		if (rumbo == null) {
			throw new NullPointerException(
					"El rumbo no puede ser nulo, debes indicar el rumbo para iniciar la navegacion");
		}
		if (rumbo.equals("")) {
			throw new IllegalArgumentException(
					"El rumbo no puede estar vacio, debes indicar  el rumbo para iniciar la navegacion");
		}

		if (nombrePatron == null) {
			throw new NullPointerException(
					"El patron del barco no puede ser nulo, se necesita un patron para iniciar la navegacion");
		}
		if (nombrePatron.equals("")) {
			throw new IllegalArgumentException(
					"El patron del barco no puede estar vacio, debes indicar un patron para iniciar la navegacion");
		}
		if (numTripulantes < MIN_TRIPULANTES) {
			throw new IllegalArgumentException(String.format("El numero de tripulantes debe estar entre %d y %d",
					MIN_TRIPULANTES, tripulantesMaximosVelero));
		}
		this.velocidad = velocidad;
		this.rumbo = rumbo;
		this.nombrePatron = nombrePatron;
		this.numTripulantes = numTripulantes;
		this.estaNavegando = true;
		numeroVelerosNavegando++;
	}

	public void pararNavegacion(int tiempoNavegacion) throws IllegalStateException, IllegalArgumentException {
		if (estaNavegando == false) {
			throw new IllegalStateException(String.format("El velero %s no esta navegando", this.nombreBarco));
		}

		if (tiempoNavegacion < 0) {
			throw new IllegalArgumentException("El tiempo de navegacion debe ser mayor que cero");
		}

		tiempoGlobalNavegacion = tiempoGlobalNavegacion + tiempoNavegacion;
		this.tiempoNavegacion = tiempoNavegacion;
		this.estaNavegando = false;
		numeroVelerosNavegando--;
	}

	// MOdificar
	public void setRumbo(String rumboUser) throws IllegalStateException, IllegalArgumentException {
		String rumbo1 = "ceñida";
		String rumbo2 = "empopada";
		if (this.estaNavegando == false) {
			throw new IllegalStateException(
					String.format("El velero %s no esta navegando, no se puede cambiar el rumbo", this.nombreBarco));
		}

		if (rumboUser == null) {
			throw new IllegalStateException(
					String.format("El rumbo no puede ser nulo, debes indicar el rumbo (%s,%s)para poder modificarlo",
							rumbo1, rumbo2));
		}
		if (rumboUser.equals("")) {
			throw new IllegalArgumentException(String.format(
					"El rumbo no es correcto, debes indicar el rumbo (%s,%s)para poder modificarlo", rumbo1, rumbo2));
		}
		this.rumbo = rumboUser;

	}

	public String iniciarRegata(Velero velero) throws IllegalStateException, NullPointerException {
		if (this.estaNavegando == false) {
			throw new IllegalStateException(
					String.format("No se puede iniciar una regata,el velero %s no esta navegando.", this.nombreBarco));
		}
		if (velero.estaNavegando == false) {
			throw new IllegalStateException(String
					.format("No se puede iniciar una regata,el velero %s no esta navegando.", velero.nombreBarco));
		}
		if (this.rumbo.equals(velero.rumbo) == false) {
			throw new IllegalStateException(
					String.format("No se puede iniciar una regata,los barcos %s y %s deben navegar con el mismo rumbo.",
							this.nombreBarco, velero.nombreBarco));
		}
		if (this.numMastiles != velero.numMastiles) {
			throw new IllegalStateException(String.format(
					"No se puede iniciar una regata,los barcos %s y %s no tienen el mismo numero de mastiles.",
					this.nombreBarco, velero.nombreBarco));
		}

		if (velero == null) {
			throw new NullPointerException("El barco con el que se intenta regatear no existe");
		}
		String resultado = null;

		if (this.velocidad > velero.velocidad) {
			resultado = String.format("El barco %s ha llegado antes a la linea de llegada", this.nombreBarco);
		}
		if (this.velocidad < velero.velocidad) {
			resultado = String.format("El barco %s ha llegado antes a la linea de llegada", velero.nombreBarco);
		}

		if (this.velocidad == velero.velocidad) {
			resultado = String.format("Los barcos %s y %s ha llegado al mismo tiempo a la linea de llegada",
					this.nombreBarco, nombreBarco);
		}
		return resultado;

	}

	public String toString() {
		String estadoNavegacion;
		if (this.estaNavegando == true) {
			estadoNavegacion = "Si";
		} else {
			estadoNavegacion = "No";
		}
		String resultado;
		if (this.estaNavegando == false) {
			resultado = String.format(
					"{NOMBRE DEL BARCO: %s, NUMERO DE MASTILES: %d, TRIPULACION: %d, ESTA NAVEGANDO: %s, TIEMPO TOTAL NAVEGANDO: %.2f horas }",
					this.nombreBarco, this.numMastiles, this.numTripulantes, estadoNavegacion,
					(this.tiempoNavegacion / 60.0));
		} else {
			resultado = String.format(
					"{NOMBRE DEL BARCO: %s, NUMERO DE MASTILES: %d, TRIPULACION: %d, ESTA NAVEGANDO: %s, CON EL PATRON %s EN %s A %d NUDOS, TIEMPO TOTAL NAVEGANDO: %.2f horas }",
					this.nombreBarco, this.numMastiles, this.numTripulantes, estadoNavegacion, this.nombrePatron,
					this.rumbo, this.velocidad, (this.tiempoNavegacion / 60.0));
		}
		return resultado;
	}
}
