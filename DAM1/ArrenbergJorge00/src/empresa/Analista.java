package empresa;

import java.time.LocalDate;

public class Analista extends Trabajador {
	public static final String HERRAMIENTA_DEFAULT = "SQL WORKBENCH";
	public static final int ANNOS_EXPERIENCIA_DEFAULT = 0;
	public static final boolean HA_SIDO_PROGRAMADOR_DEFAULT = false;

	private String herramienta;
	private int annosExp;
	private boolean haSidoProgramador;

	public Analista(String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos,
			String herramienta, int annosExp, boolean haSidoProgramador) {
		super(dni, nombre, apellidos, fechaInicio, numHijos);
		if (herramienta == null || annosExp < 0) {
			throw new IllegalArgumentException("Has introducido un parametro incorrecto");
		}
		this.herramienta = herramienta;
		this.annosExp = annosExp;
		this.haSidoProgramador = haSidoProgramador;
	}

	public Analista() {
		this(DNI_DEFAULT, NOMBRE_DEFAULT, APELLIDOS_DEFAULT, FECHA_DEFAULT, NUM_HIJOS_DEFAULT, HERRAMIENTA_DEFAULT,
				ANNOS_EXPERIENCIA_DEFAULT, HA_SIDO_PROGRAMADOR_DEFAULT);
	}

	@Override
	public String toString() {
		String resultado = String.format("%s\tHERRAMIENTA:%s\tAÑOS DE EXPERIENCIA: %d\t¿HA SIDO PROGRAMADOR?: %b",
				super.toString(), herramienta, annosExp, haSidoProgramador);
		return resultado;
	}

	@Override
	public int calcularVacaciones() {
		int diasVacaciones = super.NUM_DIAS_VACACIONES + ((annosExp/3) * 3);
		return diasVacaciones;
	}

}
