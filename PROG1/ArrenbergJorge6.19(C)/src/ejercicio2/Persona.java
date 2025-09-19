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
	
	public Persona(String dni, String nombre, String apellidos, byte edad)throws IllegalArgumentException{
		if(dniValido(dni)==false) {
			throw new IllegalArgumentException("DNI NO VALIDO");
		}
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	}
	public void setDni(String dni) {
		if(dniValido(dni)==true) {
			this.dni=dni;
		}else {
			
		}
	}
	
	public String getDni() {
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public String getApellidos (){
		return apellidos;
	}
	public void setEdad(byte edad) {
		this.edad=edad;
	}
	public byte getEdad() {
		return edad;
	}
	//Devuelve si un dni introducido es valido o no
	public boolean dniValido(String dni) {
		boolean valido;
		String dniUsuario=dni;
		String patron = "[0-9]{8}[A-Z]"; //Patron de un DNI
		 if (dniUsuario.matches(patron)) {//Comprobacion de que el DNI cumple el patron
			valido=true;
		 }
		 else {
			 valido=false;
		 }
		 return valido;
	}

}
