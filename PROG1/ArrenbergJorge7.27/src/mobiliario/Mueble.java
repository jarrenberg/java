package mobiliario;

public abstract class Mueble {
	public static final double MIN_PRECIO = 0.01;
	public static final double MAX_PRECIO = 10000.00;

	private static int contador = 1;

	private final int id;
	protected final String descripcion;
	
	protected double precio;

	protected Mueble(double precio, String descripcion) {
		if (precio > MAX_PRECIO || precio < MIN_PRECIO) {
			throw new IllegalArgumentException(String.format("El precio no esta en el rango permitido: %.2f", precio));
		}
		this.id = contador;
		this.precio = precio;
		this.descripcion = descripcion;
		contador++;
	}

	public int getId() {
		return this.id;
	}

	public double getPrecio() {
		return this.precio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	@Override
	public String toString() {
		String mensaje = String.format("Tipo: %s Id: %d Precio: %.2f Descripcion: %s", this.getClass().getSimpleName(),
				id, precio, descripcion);
		return mensaje;
	}
}
