/*
 * Clase que simula el comportamiento de una casa rural y que hereda de la clase vivienda con sus metodos, atributos y constructores
 * Jorge Arrenberg 11/03/2025 
 *
 */

package viviendasTuristicas;

import java.time.LocalDate;

public class CasaRural extends Vivienda {
	
	public static final int METROS_DEF=50;
	public static final LocalDate FECHA_CONSTRUCCION_DEFAULT=LocalDate.now().minusYears(5);
	public static final boolean ADMITE_MASCOTAS_DEF=false;

	private int metros;
	private LocalDate fechaConstruccion;
	private boolean admiteMascotas;

	//Constructor con todos los parametros
	public CasaRural(String direccion, double precioNoche, boolean disponible, int metros, LocalDate fechaConstruccion,
			boolean admiteMascotas) {
		super(direccion, precioNoche, disponible);
		this.identificador = getId();
		this.metros = metros;
		this.fechaConstruccion = fechaConstruccion;
		this.admiteMascotas = admiteMascotas;

	}
	
	//Constructor por defcto
		public CasaRural() {
			this(DIRECCION_DEFAULT,PRECIO_NOCHE_DEFAULT,DISPONIBLE_DEFAULT,METROS_DEF,FECHA_CONSTRUCCION_DEFAULT,ADMITE_MASCOTAS_DEF);
		}

	private String getId() {
		String id = String.format("%s-%03d", "CR", contadorCR);
		contadorCR = contadorCR + 5;
		return id;
	}
	
	// Modifica la fecha de construccion
	public void setFechaConstruccion (LocalDate f) {
		this.fechaConstruccion=f;
	}
	
	@Override
	// Devuelve el precio de una estancia un numeo de dias
		public double calcularPrecio(int dias) throws IllegalArgumentException{
			double precio = precioNoche*dias*1.0;
			if(fechaConstruccion.isAfter(LocalDate.now().plusYears(10))) {
				precio = precio + (precio*0.1);
			}
			return precio;
		}
	
	// Devuelve si una casa rural es amigable para mascotas
	public boolean esPetFriendly() {
		boolean friendly;
		if((metros>100)&&(admiteMascotas==true)) {
			friendly=true;
		}else {
			friendly=false;
		}
		return friendly;
	}

	@Override
	// Metodo que muestra la informacion del objeto
	public String toString() {
		String a;
		if (admiteMascotas) {
			a = "Si";
		} else {
			a = "No";
		}
		String mensaje = String.format("%s Metros cuadrados: %d Fecha de Construccion: %s Admite mascotas: %s",
				super.toString(), metros, fechaConstruccion.toString(), a);
		return mensaje;
	}

}
