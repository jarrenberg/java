package empresa;

import java.time.LocalDate;

public class Ingeniero extends Trabajador {
	public static final boolean ES_SENIOR_DEFAULT = false;
	public static final boolean ES_DIRECTIVO_DEFAULT = false;

	private boolean senior;
	private boolean directivo;

	public Ingeniero(String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos, boolean senior,
			boolean directivo) {
		super(dni, nombre, apellidos, fechaInicio, numHijos);
		this.senior = senior;
		this.directivo = directivo;
	}

	public Ingeniero() {
		this(DNI_DEFAULT, NOMBRE_DEFAULT, APELLIDOS_DEFAULT, FECHA_DEFAULT, NUM_HIJOS_DEFAULT, ES_SENIOR_DEFAULT,
				ES_DIRECTIVO_DEFAULT);
	}

	@Override
	public String toString() {
		String resultado = String.format("%s\t¿ES SENIOR?: %b\t¿ES DIRECTIVO?: %b", super.toString(), senior,
				directivo);
		return resultado;
	}

	@Override
	public int calcularVacaciones() {
		int annoAntiguedad = LocalDate.now().getYear() - fechaInicio.getYear();
		int diasVacaciones = super.NUM_DIAS_VACACIONES + ((annoAntiguedad / 3) * 4);
		if (directivo == true) {
			diasVacaciones = super.NUM_DIAS_VACACIONES + 5;
		}
		return diasVacaciones;
	}
}
