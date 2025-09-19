package mobiliario;

public final class Mesa extends Mueble{
	public static final int MIN_COMENSALES=4;
	public static final int MAX_COMENSALES=16;
	
	private String forma;
	private int numComensales;

	protected Mesa(double precio, String descripcion,String forma,int numComensales ) {
		super(precio, descripcion);
		if(numComensales>MAX_COMENSALES||numComensales<MIN_COMENSALES) {
			throw new IllegalArgumentException (String.format("Error. El numero de comensales introducidos (%d) no entra en el rango admitido.", numComensales));
		}
		this.numComensales=numComensales;
		this.forma=forma;
	}
	
	public String getForma() {
		return this.forma;
	}
	
	public int getComensales() {
		return this.numComensales;
	}
	
	public String toString() {
		String mensaje = String.format("%s Forma: %s Numero de Comensales: %d", super.toString(),forma,numComensales);
		return mensaje;
	}
	
	
}
