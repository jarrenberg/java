package ejemploClaseAlumno;

import java.time.LocalDate;
import java.time.LocalTime;

public class EjemploClaseAlumno {
	public static void main(String[] args) {
		

	}
	
	public class Alumno {
		// ATRIBUTOS DE CLASE: sólo habrá un atributo (común para todos los objetos)
		// parar representar estas características
		// -----------------------------------------------------------------------------------------------------------------

		// Atributos de clase constantes (representan características "inmutables" de la
		// clase como por ejemplo restricciones o valores informativos)
		public static final int MAX_ALUMNOS = 1000;
		public static final LocalTime HORA_MAXIMA = LocalTime.of(22, 0);
		public static final byte MAX_ALUMNOS_GRUPO=35;
		public static final byte MIN_ALUMNOS_GRUPO=5;
		// Atributos de clase variables (representan información de la clase que es
		// común e independiente de cualquier objeto Vehiculo en particular)
		private static int numAlumnos;
		private static byte minAlumnosGrupo=5;

		// ATRIBUTOS DE OBJETO: cada alumno tendrá su propio valor para representar
		// estas características
		// ------------------------------------------------------------------------------------------------

		// Atributos de objeto constantes (representan características "inmutables" del
		// alumno)
		
		private final LocalDate fechaNac=null;
		
		// Atributos de objeto variables (representan el estado del alumno en un instante dado)
		private String dni;
		private String nombre;
		private String apellidos;
		private double peso;
		private double altura;
		private boolean esMayorDeEdad;
		private int numHermanos;
		private LocalTime horaMax;
		
		//Revisar bien los constructores
		
		public Alumno (String dni,String nombre,String apellidos,double peso,double altura,boolean esMayorDeEdad,int numHermanos,LocalTime horaMax)throws IllegalArgumentException{
			if(dni.length()>9) {
				throw new IllegalArgumentException(String.format("El DNI no tiene mas de 9 caracteres alfanumericos"));
			}
			if(numHermanos>127||numHermanos<0) {
				throw new IllegalArgumentException(String.format("El numero de hermanos introducidos es incorrectos"));
			}
			if(esMayorDeEdad!=true&&esMayorDeEdad!=false) {
				throw new IllegalArgumentException(String.format("El valor de si es mayor de edad o no es incorrecto"));
			}
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.peso= peso;
			this.altura=altura;
			this.esMayorDeEdad=esMayorDeEdad;
			this.numHermanos=numHermanos;
			this.horaMax=horaMax;
		}

	}
}
