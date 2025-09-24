package mobiliario;

public final class Sofa extends Asiento {
	
	private String composicion;
	
	public Sofa(double precio, String descripcion, int plazas, String tapiceria, String color, String composicion) {
		super(precio,descripcion,plazas,tapiceria,color);
		this.composicion=composicion;
	}
	
	public String getComposicion() {
		return this.composicion;
	}
	
	public String toString() {
		String mensaje = String.format("%s Composicion: %s", super.toString(),composicion);
		return mensaje;
	}
}
