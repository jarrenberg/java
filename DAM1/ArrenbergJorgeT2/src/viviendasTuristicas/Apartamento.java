/*
 * Clase que simula el comportamiento de un apartamento y que hereda de la clase vivienda con sus metodos, atributos y constructores
 * Jorge Arrenberg 11/03/2025 
 *
 */

package viviendasTuristicas;

import java.time.Duration;
import java.time.LocalDate;

public class Apartamento extends Vivienda {
	
	public static final int HABITACION_DEFAULT =2;
	public static final int DISTANCIA_AL_CENTRO_DEFAULT =3;
	public static final LocalDate ULTIMA_REFORMA_DEFAULT = LocalDate.now().minusYears(5);

	private int numHabitacion;
	private int distanciaAlCentro;
	private LocalDate ultimaReforma;

	//Constructor con todos los parametros
	public Apartamento(String direccion, double precioNoche, boolean disponible, int numHabitacion,
			int distanciaAlCentro, LocalDate ultimaReforma) {
		super(direccion, precioNoche, disponible);
		this.identificador = getId();
		this.numHabitacion = numHabitacion;
		this.distanciaAlCentro = distanciaAlCentro;
		this.ultimaReforma = ultimaReforma;

	}
	
	//Constructor por defcto
	public Apartamento() {
		this(DIRECCION_DEFAULT,PRECIO_NOCHE_DEFAULT,DISPONIBLE_DEFAULT,HABITACION_DEFAULT,DISTANCIA_AL_CENTRO_DEFAULT,ULTIMA_REFORMA_DEFAULT);
	}
	
	
	private String getId() {
		String id = String.format("%s-%03d", "AP", contadorAP);
		contadorAP = contadorAP + 5;
		return id;
	}
	
	@Override
	// Devuelve el precio de una estancia un numeo de dias
	public double calcularPrecio(int dias)throws IllegalArgumentException{
		double precio = precioNoche * dias * 1.0;
		if (distanciaAlCentro < 1) {
			precio = precio + (precio * 0.2);
		}
		return precio;
	}

	// Devuelve los dias desde la ultima reforma
	public long diasDesdeUltimaReforma() {
		Duration tiempo = Duration.between(ultimaReforma, LocalDate.now());
		long dias = tiempo.toDays();
		return dias;
	}

	@Override
	// Metodo que muestra la informacion del objeto
	public String toString() {
		String mensaje = String.format("%s Numero de Habitacion: %d Distancia al centro: %d KM, Ultima reforma: %s",
				super.toString(), numHabitacion, distanciaAlCentro, ultimaReforma.toString());
		return mensaje;
	}


}
