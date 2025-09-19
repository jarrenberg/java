/*
 * Programa que simula una biblioteca de peliculas con sus metodos,atributos y constructores
 * jorge arrenberg 18/02/2025
 */
package ejercicio1;

import java.time.LocalDate;

public class Pelicula {
	public static final String NOMBRE_DEFAULT = "Ciudadano Kane";
	public static final LocalDate FECHA_REALIZACION_DEFAULT = LocalDate.of(1966, 8, 8);
	public static final String GENERO_DEFAULT = "ACCION";
	public static final int DURACION_DEFAULT = 90;
	public static final int CALIFICACION_DEFAULT = 5;
	public static final int DURACION_MAXIMA=180;
	public static final int DURACION_MINIMA=0;

	private static int contador;
	private static int duracionGlobal;
	private static int duracionSuspenseGlobal;

	private String id;
	private String nombre;
	private LocalDate fechaRealizacion;
	private String genero;
	private int duracion;
	private int calificacion;
	static {
		contador = 9999;
		duracionGlobal = 0;
		duracionSuspenseGlobal = 0;
	}

	public Pelicula(String nombre,LocalDate fechaRealizacion,String genero,int duracion,int calificacion) throws IllegalArgumentException,IllegalStateException{
		if(nombre==null||nombre.equals("")||nombre.equals(" ")) {
			throw new IllegalArgumentException("El nombre no puede estar vacio.");
		}
		if(fechaRealizacion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de realizacion debe ser anterior a la actural.");
		}
		if(!genero.equals("ACCION")&&!genero.equals("COMEDIA")&&!genero.equals("DRAMA")&&!genero.equals("SUSPENSE")) {
			throw new IllegalArgumentException("Los generos son: ACCION,COMEDIA,DRAMA,SUSPENSE.");
		}
		if(duracion<DURACION_MINIMA) {
			throw new IllegalArgumentException("La duracion no puede ser negativa.");
		}
		if(duracion>DURACION_MAXIMA) {
			throw new IllegalArgumentException("La duracion debe ser menor a 180 minutos.");
		}
		if(calificacion<0||calificacion>10) {
			throw new IllegalArgumentException("Las calificaciones deben de estar entre 0 y 10.");
		}
		if(genero.equals("SUSPENSE")) {
			duracionSuspenseGlobal= duracionSuspenseGlobal+duracion;
		}
		if(contador<9699) {
			throw new IllegalStateException("Se ha superado el limite de 300 peliculas.");
		}
		duracionGlobal=duracionGlobal+duracion;
		this.id=idForma(genero);
		this.nombre=nombre;
		this.fechaRealizacion=fechaRealizacion;
		this.genero=genero;
		this.duracion=duracion;
		this.calificacion=calificacion;
		contador--;
	}
	public Pelicula() {
		this(NOMBRE_DEFAULT,FECHA_REALIZACION_DEFAULT,GENERO_DEFAULT,DURACION_DEFAULT,CALIFICACION_DEFAULT);
	}
	
	private String idForma(String genero) {
		String resultado =String.format("%s%s%s-%d",genero.charAt(0),genero.charAt(1),genero.charAt(2),contador );
		return resultado;
	}
	public int annosRealizacion() {
		int resultado = LocalDate.now().getYear() - fechaRealizacion.getYear();
		return resultado;
	}
	
	public void setCalificacion(int calificacion) throws IllegalArgumentException {
		if(calificacion<0||calificacion>10) {
			throw new IllegalArgumentException("Las calificaciones deben de estar entre 0 y 10.");
		}
		this.calificacion=calificacion;
	}
	
	public String recomendable() {
		String recomendable;
		if((calificacion>5)&&(annosRealizacion()<5)) {
			recomendable="La pelicula es recomendable";
		}else {
			recomendable = "La pelicula no es recomendable";
		}
		return recomendable;
	}
	
	public static int getDuracionGlobal() {
		return duracionGlobal;
	}
	public static int getDuracionGlobalSuspense() {
		return duracionSuspenseGlobal;
	}
	
	public String toString() {
		String resultado = String.format("ID: %s, NOMBRE: %s, FECHA DE REALIZACION: %s, GENERO: %s , DURACION: %d, CALIFICACION: %d. ", id,nombre,fechaRealizacion,genero,duracion,calificacion);
		return resultado;
	}
}
