package ejercicio3;

import java.time.Duration;
import java.time.LocalDate;

public class Personal {
	private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	protected final char genero;

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	protected double salario;
	protected String telefono;
	protected String email;

	public Personal(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, double salario,
			String telefono, String email, char genero) {
		if (dni == null) {
			throw new NullPointerException("El DNI no puede ser nulo.");
		}
		if (!validarDNI(dni)) {
			throw new IllegalArgumentException("El DNI no es valido.");
		}
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo.");
		}
		if (nombre.equals("") || nombre.equals(" ")) {
			throw new IllegalArgumentException("El nombre no puede estar vacio.");
		}
		if (apellidos == null) {
			throw new NullPointerException("Los apellidos no puede ser nulo.");
		}
		if (apellidos.equals("") || apellidos.equals(" ")) {
			throw new IllegalArgumentException("Los apellidos no puede estar vacio.");
		}
		if (fechaNacimiento == null) {

		}
		if (genero != 'H' && genero != 'M') {
			throw new IllegalArgumentException("El genero debe ser H o M.");
		}
		if (salario < 0) {
			throw new IllegalArgumentException("El salario debe ser positivo.");
		}
		if (telefono == null) {
			throw new NullPointerException("El numero de telefono no puede ser nulo.");
		}
		if (!validarTelefono(telefono)) {
			throw new IllegalArgumentException(
					String.format("El telefono introducido (%s) no cumple con el formato valido.", telefono));
		}
		if (email == null) {
			throw new NullPointerException("El email no puede ser nulo.");
		}
		if (email.equals("") || email.equals(" ")) {
			throw new IllegalArgumentException("El email no puede estar vacio.");
		}
		this.genero = genero;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
		this.salario=salario;
		this.telefono=telefono;
		this.email=email;
	}

	private boolean validarTelefono(String telefono) {
		boolean esValido;
		String formato = "[679][0-9]{8}";
		if (telefono.matches(formato)) {
			esValido = true;
		} else {
			esValido = false;
		}
		return esValido;
	}
	
	private boolean validarDNI(String dni) {
		boolean esValido=true;
		String patron = "[0-9]{8}[A-Z]";
		int numDNI =  Integer.parseInt(dni.substring(0, 8));
		char letraDNI = dni.charAt(8);
		char letraValida = LETRAS_DNI.charAt(numDNI%23);
		if(letraValida!=letraDNI) {
			esValido=false;
		}
		if(!dni.matches(patron)) {
			esValido=false;
		}
		return esValido;
	}
	public String toString() {
		String resultado=String.format("NOMBRE: %s, APELLIDOS: %s, DNI: %s, FECHA DE NACIMIENTO: %s, GENERO: %s, SALARIO: %.2f, TELEFONO: %s, EMAIL: %s ", nombre,apellidos,dni,fechaNacimiento.toString(),genero,salario,telefono,email);
		return resultado;
	}
	
	public double aumentoSalario(double porcentaje) {
		double aumentoSalario = (this.salario*(porcentaje/100));
		return aumentoSalario;
	}
	
	public int anyosJubilacion() {
		LocalDate fechaJubilacion = fechaNacimiento.plusYears(65);
		int tiempo = fechaJubilacion.getYear()-LocalDate.now().getYear();
		return tiempo;
		}

}
