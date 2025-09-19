package empresa;

import java.time.LocalDate;

public class Programador extends Trabajador {
	public static final String LENGUAJES_PROGRAMACION_DEFAULT="Java";
	public static final int ANNOS_EXPERIENCIA_DEFAULT=0;
	public static final boolean JEFE_DE_EQUIPO_DEFAULT=false;
	
	private String lenguajesProg;
	private int annosExp;
	private boolean esJefeEquipo;
	
	public Programador(String dni, String nombre, String apellidos, LocalDate fechaInicio, int numHijos, String lenguajesProg, int annosExp,boolean esJefeEquipo) throws IllegalArgumentException{
		super(dni,nombre,apellidos,fechaInicio,numHijos);
		if(lenguajesProg==null||annosExp<0) {
			throw new IllegalArgumentException("Has introducido un parametro incorrecto");
		}
		this.lenguajesProg=lenguajesProg;
		this.annosExp=annosExp;
		this.esJefeEquipo=esJefeEquipo;
	}
	public Programador() {
		this(DNI_DEFAULT, NOMBRE_DEFAULT, APELLIDOS_DEFAULT, FECHA_DEFAULT, NUM_HIJOS_DEFAULT,LENGUAJES_PROGRAMACION_DEFAULT,ANNOS_EXPERIENCIA_DEFAULT,JEFE_DE_EQUIPO_DEFAULT);	
	}
	
	@Override
	public String toString() {
		String resultado = String.format("%s\tLENGUAJES DE PROGRAMACION:%s\tAÑOS DE EXPERIENCIA: %d\t¿ES JEFE DE EQUIPO?: %b", super.toString(),lenguajesProg,annosExp,esJefeEquipo);
		return resultado;
	}
	
	@Override
	public int calcularVacaciones() {
		int diasVacaciones = super.NUM_DIAS_VACACIONES+(annosExp*2);
		return diasVacaciones;
	}
}
