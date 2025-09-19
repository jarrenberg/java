package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

import ejercicio2.Contacto;

public class Trabajador {
	private String nombre;
	private int edad;
	private String sexo;
	private String estadoCivil;
	private double salarioBase;


	
	public Trabajador (String nombre,int edad, String sexo, String estadoCivil, double salarioBase ) throws NullPointerException, IllegalArgumentException{
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		if(edad<0||edad>120) {
			throw new IllegalArgumentException ("La edad introducida no esta dentro del rango permitido");
		}
		if(!sexo.equals("H")&&!sexo.equals("M")) {
			throw new IllegalArgumentException ("Los sexos permitidos son 'H' y 'M'");
		}
		if (estadoCivil == null) {
			throw new NullPointerException("El estado civil no puede ser nulo");
		}
		if (estadoCivil.isEmpty()) {
			throw new IllegalArgumentException("El estado civil no puede estar vacío");
		}
		if(salarioBase<1080) {
			throw new IllegalArgumentException ("El salario base no puede ser inferior al salario minimo interprofesional");
		}
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.estadoCivil=estadoCivil;
		this.salarioBase=salarioBase;
	}
	
	// Devuelve el sexo del trabajador
	public String getSexo() {
		return this.sexo;
	}
	
	// Devuelve el estado civil del trabajador
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public String toString() {
		return String.format("NOMBRE: %s, EDAD: %d, SEXO: %s, ESTADO CIVIL: %s, SALARIO BASE: %.2f\n",nombre,edad,sexo,estadoCivil,salarioBase);
	}

}
