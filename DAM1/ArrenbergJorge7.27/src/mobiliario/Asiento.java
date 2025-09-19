package mobiliario;

public abstract class Asiento extends Mueble {
	public static final int MIN_PLAZAS = 1;
	public static final int MAX_PLAZAS = 9;

	private final int plazas;
	private final String tapiceria;
	private final String color;

	protected Asiento(double precio, String descripcion, int plazas, String tapiceria, String color) {
		super(precio,descripcion);
		if(plazas<MIN_PLAZAS||plazas>MAX_PLAZAS) {
			throw new IllegalArgumentException (String.format("El numero de plazas no esta en el rango permitido: %d", plazas));
		}
		this.plazas=plazas;
		this.tapiceria=tapiceria;
		this.color=color;
	}
	
	public int getNumPlazas() {
		return this.plazas;
	}
	public String getTapiceria() {
		return this.tapiceria;
	}
	public String getColor() {
		return this.color;
	}
	
	@Override
	public String toString() {
		String mensaje = String.format("%s Tapiceria: %s Color: %s Plazas: %d",super.toString(),tapiceria,color,plazas);
		return mensaje;
	}
}
