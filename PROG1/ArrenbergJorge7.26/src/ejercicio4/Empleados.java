/*
 * Clase que simula el compartment de un empleado, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio4;

public class Empleados {

	private final String nombre;
	private final String dni;
	private double sueldoBruto;
	private int edad;
	private String telefono;
	private String direccion;

	public Empleados(String nombre, String dni, double sueldoBruto, int edad, String telefono, String direccion)
			throws NullPointerException, IllegalArgumentException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo.");
		}
		if (dni == null) {
			throw new NullPointerException("El dni no puede ser nulo.");
		}
		if (nombre.equals("")) {
			throw new IllegalArgumentException("El nombre no puede estar vacio.");
		}
		if (dni.equals("")) {
			throw new IllegalArgumentException("El dni no puede estar vacio.");
		}

		this.nombre = nombre;
		this.dni = dni;
		setSueldoBruto(sueldoBruto);
		setEdad(edad);
		setTelefono(telefono);
		setDireccion(direccion);

	}

	public void setSueldoBruto(double sueldoBruto) {
		if (sueldoBruto < 0) {
			throw new IllegalArgumentException("El sueldo bruto no puede ser negativo.");
		}
		this.sueldoBruto = (sueldoBruto * 12);
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad no puede ser negativa.");
		}
		this.edad = edad;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDNI() {
		return this.dni;
	}

	public double getSueldoBruto() {
		return this.sueldoBruto;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public double sueldoNeto() {
		double resultado;
		int irpf = 0;
		if (sueldoBruto < 12000) {
			irpf = 20;
		}
		if (sueldoBruto <= 25000 || sueldoBruto >= 12000) {
			irpf = 30;
		}
		if (sueldoBruto > 25000) {
			irpf = 40;
		}
		resultado = sueldoBruto - (sueldoBruto * (irpf / 100.0));
		return resultado;

	}

	public String toString() {
		String mensaje = String.format(
				"Nombre: %s DNI: %s Sueldo Bruto: %.2f Sueldo Neto: %.2f Edad: %d Telefono: %s Direccion: %s", nombre,
				dni, sueldoBruto, this.sueldoNeto(), edad, telefono, direccion);
		return mensaje;
	}
}
