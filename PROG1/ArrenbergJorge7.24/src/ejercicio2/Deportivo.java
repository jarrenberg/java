/*
 * Creacion de la clase ciudadano, sus atributos, metodos y constructores
 * Jorge Arrenberg 17/02/2025
 */
package ejercicio2;

import java.time.LocalDate;

public class Deportivo extends Coche {
	private String traccion;

	public Deportivo(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, double cilindrada,
			double potencia, String traccion) throws IllegalArgumentException, NullPointerException {
		super(matricula, nombrePropietario, fechaMatriculacion, cilindrada, potencia);

		setTraccion(traccion);
	}

	public void setTraccion(String traccion) throws IllegalArgumentException {
		System.out.println(traccion);
		if ((!traccion.equals("total") )&&( !traccion.equals("delantera"))) {
			throw new IllegalArgumentException("La traccion puede ser total o delantera.");
		}
		this.traccion = traccion;
	}
	public String getTraccion() {
		return this.traccion;
	}
	
	public String toString() {
		String resultado=String.format("%s, Traccion: %s", super.toString(),traccion);
		return resultado;
	}
}
