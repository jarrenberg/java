package empresa;

import java.time.LocalDate;

public abstract class Trabajador {
	public static final String DNI_DEFAULT = "12345678X";
	public static final String NOMBRE_DEFAULT = "Carlos";
	public static final String APELLIDOS_DEFAULT = "Sanchez Sanchez";
	public static final LocalDate FECHA_DEFAULT = LocalDate.of(2000, 1, 1);
	public static final int NUM_HIJOS_DEFAULT = 0;
	public static final int NUM_DIAS_VACACIONES = 20;

	protected static int cuantosTrabajadoresHay;

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaInicio;
	protected int numHijos;

	static {
		cuantosTrabajadoresHay = 0;
	}

	public Trabajador(String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos)
			throws IllegalArgumentException {
		if (dni == null || nombre == null || apellidos == null || fechaInicio == null || numHijos < 0) {
			throw new IllegalArgumentException("Parametros incorrectos");
		}
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaInicio = fechaInicio;
		this.numHijos = numHijos;
		cuantosTrabajadoresHay++;
	}

	public Trabajador() {
		this(DNI_DEFAULT, NOMBRE_DEFAULT, APELLIDOS_DEFAULT, FECHA_DEFAULT, NUM_HIJOS_DEFAULT);
	}

	public String toString() {
		String resultado = String.format(
				"DNI: %s\tNOMBRE: %s\tAPELLIDOS: %s\tFECHA DE INICIO: %s\tNUMERO DE HIJOS: %d", dni, nombre,
				apellidos, fechaInicio.toString(), numHijos);
		return resultado;
	}

	public abstract int calcularVacaciones();
}
