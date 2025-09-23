package ejercicio3;

import java.time.LocalDate;

public class Profesor extends Personal {

	private String titulacion;
	private String asignatura1;
	private String asignatura2;
	private boolean esTutor;
	private int anyosExperiencia;

	public Profesor(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, double salario,
			String telefono, String email, char genero, String titulacion, String asignatura1, String asignatura2,
			boolean esTutor, int anyosExperiencia) {
		super(dni, nombre, apellidos, fechaNacimiento, salario, telefono, email, genero);
		if (titulacion == null) {
			throw new NullPointerException("La titulacion no puede ser nula.");
		}
		if (titulacion.equals("") || titulacion.equals(" ")) {
			throw new IllegalArgumentException("La titulacion no puede estar vacia.");
		}
		
		if (asignatura1 == null) {
			throw new NullPointerException("La asignatura 1 no puede ser nula.");
		}
		if (asignatura1.equals("") || asignatura1.equals(" ")) {
			throw new IllegalArgumentException("La asignatura 1 no puede estar vacia.");
		}
		if(anyosExperiencia<0) {
			throw new IllegalArgumentException("Los años de experiencia no pueden ser negativos.");
		}
		this.titulacion=titulacion;
		this.asignatura1=asignatura1;
		this.asignatura2=asignatura2;
		this.esTutor=esTutor;
		this.anyosExperiencia=anyosExperiencia;
	}
	
	@Override
	public String toString() {
		String tutor;
		if(esTutor) {
			tutor = "Si";
		}else {
			tutor="No";
		}
		
		String resultado= String.format("%s, TITULACION: %s, ASIGNATURA 1: %s, ASIGNATURA2: %s, ES TUTOR: %s, AÑOS DE EXPERIENCIA: %d", super.toString(),titulacion,asignatura1,asignatura2,tutor,anyosExperiencia);
		return resultado;
	}
	
	
	public double aumentarSalario() {
		double salarioReal=0;
		int contador=0;
		if(anyosExperiencia>=5&&contador<1) {
			salarioReal=salario +  salario*(5/100.0);
			contador=1;
		}
		if(anyosExperiencia>=3&&contador<1) {
			salarioReal=salario + salario*(2/100.0);
			contador=1;
		}
		if(anyosExperiencia>=1&&contador<1) {
			salarioReal=salario + salario*(1/100.0);
			contador=1;
		}
		this.salario=salarioReal;
		return salarioReal;
	}
}
