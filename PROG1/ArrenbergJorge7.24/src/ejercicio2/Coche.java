/*
 * Creacion de la clase coche, sus atributos, metodos y constructores
 * Jorge Arrenberg 17/02/2025
 */
package ejercicio2;

import java.time.LocalDate;

public class Coche {
	public static final String MATRICULA_DEFAULT = "9999 AAA";
	public static final String NOMBRE_PROPIETARIO_DEFAULT = "Pedro";
	public static final LocalDate FECHA_MATRICULACION_DEFAULT = LocalDate.of(2000, 1, 1);
	public static final double CILINDRADA_DEFAULT = 2000.0;
	public static final double POTENCIA_DEFAULT = 150.0;

	private final LocalDate fechaMatriculacion;

	private String matricula;
	private String nombrePropietario;
	private double cilindrada;
	private double potencia;

	private boolean matriculaValida(String matricula) {
		boolean esValida;
		String patron = "[0-9]{4} [A-Z]{3}";
		if (matricula.matches(patron)) {
			esValida = true;
		} else {
			esValida = false;
		}
		return esValida;
	}

	public Coche(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, double cilindrada,
			double potencia) throws NullPointerException, IllegalArgumentException {

		if (fechaMatriculacion == null) {
			throw new NullPointerException("La fecha de matriculacion no puede ser nulo.");
		}

		setMatricula(matricula);
		setNombrePropietario(nombrePropietario);
		this.fechaMatriculacion = fechaMatriculacion;
		setCilindrada(cilindrada);
		setPotencia(potencia);
	}

	public Coche() {
		this(MATRICULA_DEFAULT, NOMBRE_PROPIETARIO_DEFAULT, FECHA_MATRICULACION_DEFAULT, CILINDRADA_DEFAULT,
				POTENCIA_DEFAULT);
	}

	public void setMatricula(String matricula) {
		if (matriculaValida(matricula) == false) {
			throw new IllegalArgumentException(
					String.format("La matricula introducida (%s) no cumple con el formato {9999 AAA}", matricula));
		}
		this.matricula = matricula;

	}

	public void setNombrePropietario(String nombrePropietario) {
		if (nombrePropietario == null) {
			throw new NullPointerException("El nombre del propietario no puede ser nulo.");
		}
		if (nombrePropietario.equals("") || nombrePropietario.equals(" ")) {
			throw new IllegalArgumentException("El nombre del propietario no puede estar vacio");
		}
		this.nombrePropietario = nombrePropietario;
	}

	public void setCilindrada(double cilindrada) {
		if (cilindrada < 0) {
			throw new IllegalArgumentException("La cilindrada no puede ser negativa");
		}
		this.cilindrada = cilindrada;
	}

	public void setPotencia(double potencia) {
		if (potencia < 0) {
			throw new IllegalArgumentException("La potencia no puede ser negativa");
		}
		this.potencia = potencia;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public String getNombrePropietario() {
		return this.nombrePropietario;
	}

	public LocalDate getFechaMatriculacion() {
		return this.fechaMatriculacion;
	}

	public double getCilindrada() {
		return this.cilindrada;
	}

	public double getPotencia() {
		return this.potencia;
	}
	
	public String toString() {
		String resultado = String.format("Matricula: %s, Nombre del propietario: %s, Fecha de Matriculacion: %s, Cilindrada: %.2f CC, Potencia: %.2f CV", matricula,nombrePropietario,fechaMatriculacion.toString(),cilindrada,potencia);
		return resultado;
	}
}
