/*
 * Clase que simula el comportamiento de una empresa, con sus parametors, constructor y metodos
 * Jorge Arrenberg 09/03/2025
 * 
 */

package ejercicio4;

public class Empresa {
	public static final int MIN_EMPLEADOS = 0;
	public static final int MAX_EMPLEADOS = 100;

	private static int numEmpleados;

	private final String nombre;
	private final String cif;
	private String telefono;
	private String direccion;
	private Empleados[] empleados;

	public Empresa(String nombre, String cif, String telefono, String direccion) {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo.");
		}
		if (cif == null) {
			throw new NullPointerException("El cif no puede ser nulo.");
		}
		if (nombre.equals("")) {
			throw new NullPointerException("El nombre no puede estar vacio.");
		}
		if (cif.equals("")) {
			throw new IllegalArgumentException("El cif no puede estar vacio.");
		}

		this.nombre = nombre;
		this.cif = cif;
		this.telefono = telefono;
		this.direccion = direccion;
		this.empleados = new Empleados[MAX_EMPLEADOS];
		numEmpleados = 0;
	}
	public static int getNumEmpleados() {
		return numEmpleados;
	}

	public void eliminarEmpleado() {
		if (numEmpleados == MIN_EMPLEADOS) {
			throw new IllegalStateException("Se ha llegado al minimo de empleados.");
		}
		numEmpleados--;
		int contador = 0;
		for (int i = (empleados.length-1); i >= 0; i--) {
			if (empleados[i] != null && contador ==0) {
				empleados[i] = null;
				contador++;
			}
		}
	}

	public void anyadirEmpleado(Empleados e) throws IllegalStateException {
		if (numEmpleados == MAX_EMPLEADOS) {
			throw new IllegalStateException("Se ha llegado al maximo de empleados.");
		}
		numEmpleados++;
		int contador = 0;
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] == null&&contador==0) {
				empleados[i] = e;
				contador=1;
			}
		}
	}

	public String infoPlantillaTotal() {
		String mensaje = "";
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				mensaje = String.format("%s%s\n", mensaje, empleados[i].toString());
			}
		}
		return mensaje;
	}

	public String infoPlantillaParcial() {
		String mensaje = "";
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				mensaje = String.format("%s DNI: %s Sueldo Bruto: %.2f Sueldo Neto: %.2f\n", mensaje,
						empleados[i].getDNI(), empleados[i].getSueldoBruto(), empleados[i].sueldoNeto());
			}
		}
		return mensaje;
	}

	public double sumaSueldosBrutos() {
		double suma = 0;
		for (int i = 0; i < empleados.length; i++) {
			suma = suma + empleados[i].getSueldoBruto();
		}
		return suma;
	}

	public double sumaSueldosNetos() {
		double suma = 0;
		for (int i = 0; i < empleados.length; i++) {
			suma = suma + empleados[i].sueldoNeto();
		}
		return suma;
	}
}
