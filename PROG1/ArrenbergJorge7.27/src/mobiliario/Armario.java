package mobiliario;

public final class Armario extends Almacenaje{

	public static final int MIN_PUERTAS=1;
	public static final int MAX_PUERTAS=6;

	private int numPuertas;
	
	public Armario(double precio, String descripcion, double anchura, double altura, int maxModulos,int numPuertas) throws IllegalArgumentException{
		super(precio, descripcion, anchura, altura, maxModulos);
		if(numPuertas>MAX_PUERTAS||numPuertas<MIN_PUERTAS) {
			throw new IllegalArgumentException (String.format("No se puede crear el Armario. El numero de puertas no esta dentro del rango permitido: %d",numPuertas));
		}
		this.numPuertas=numPuertas;
	}
	
	public int getNumPuertas() {
		return this.numPuertas;
	}
	
	public String toString() {
		String mensaje= String.format("%s Numero de Puertas: %d", super.toString(),numPuertas);
		return mensaje;
	}
	
	
}
