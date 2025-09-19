/**
 * Creacion de la clase Persona con sus parametros y su constructor
 * Jorge Arrenberg 10/01/2025
 */

package ejercicio2;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;

	// Constructor con todos los parametros
	public Persona(String dni, String nombre, String apellidos, byte edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	// Metodo que guarda el valor del dni si es valido
	public void setDni(String dni) {
		if (dniValido(dni) == true) {
			this.dni = dni;
		} else {
		}
	}

	// Devuelve el dni
	public String getDni() {
		return dni;
	}

	// Meodo que guarda el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Devuelve el nombre
	public String getNombre() {
		return nombre;
	}

	// Metodo que guarda los apellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Devuelve los apellidos
	public String getApellidos() {
		return apellidos;
	}

	// Metodo que guarda la edad
	public void setEdad(byte edad) {
		this.edad = edad;
	}

	// Devuelve la edad
	public byte getEdad() {
		return edad;
	}

	// Devuelve si un dni introducido es valido o no
	public boolean dniValido(String dni) {
		boolean valido;
		String dniUsuario = dni;
		String patron = "[0-9]{8}[A-Z]"; // Patron de un DNI
		if (dniUsuario.matches(patron)) {// Comprobacion de que el DNI cumple el patron
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}

	// Muestra los valores de la persona
	public void imprime() {
		System.out.printf("DNI: %s\tNombre: %s\tApellidos: %s\tEdad: %d.\n", dni, nombre, apellidos, edad);
	}

	// Devuelve true si es mayor de edad (false si no).
	public boolean esMayorEdad() {
		boolean esMayorEdad;
		if (edad >= 18) {
			esMayorEdad = true;
		} else {
			esMayorEdad = false;
		}
		return esMayorEdad;
	}

	// Devuelve true si tiene 65 años o más (false si no).
	
	public boolean esJubilado() {
		boolean esJubilado;
		if (edad >= 65) {
			esJubilado = true;
		} else {
			esJubilado = false;
		}
		return esJubilado;
	}
	
	// Devuelve la diferencia de edad entre ‘this’ y p. Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
	public int diferenciaEdad(Persona p) {
		int diferenciaEdad=Math.abs((this.edad-p.edad));
		return diferenciaEdad;
	}
	
	
	
	
	
}
