package ejercicio2;

import java.time.LocalDateTime;

public class Llamadas {
	public enum Estado {
		ENTRANTE, SALIENTE
	};

	private String telefono;
	private LocalDateTime fechaLlamada;
	private Estado estado;

	public Llamadas(String telefono, LocalDateTime fechaLlamada, int estado) {
		if (telefono == null) {
			throw new NullPointerException("El telefono no puede ser nulo.");
		}
		if (fechaLlamada == null) {
			throw new NullPointerException("La fecha de la llamada no puede ser nula.");
		}
		if (estado < 1 || estado > 2) {
			throw new IllegalArgumentException("El estado de la llamada solo puede ser 1 (Entrante) o 2 (Saliente).");
		}
		this.telefono = telefono;
		this.fechaLlamada = fechaLlamada;
		if (estado == 1) {
			this.estado = Estado.ENTRANTE;
		} else {
			this.estado = Estado.SALIENTE;
		}
	}

	public String toString() {
		return String.format("TELEFONO: %s, FECHA Y HORA: %s, %s ", telefono, fechaLlamada.toString(), estado);
	}

}
