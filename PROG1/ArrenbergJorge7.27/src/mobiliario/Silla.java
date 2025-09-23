package mobiliario;

public final class Silla extends Asiento implements Ajustable {
	public static final int MIN_POSICION = 1;
	public static final int MAX_POSICION = 4;

	private int posiciones;

	public Silla(double precio, String descripcion, String tapiceria, String color) {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		this.posiciones = MIN_POSICION;
	}

	@Override
	public String toString() {
		String mensaje = String.format("%s Posicion: %d", super.toString(), posiciones);
		return mensaje;
	}

	@Override
	public int obtenerPosicion() {
		return this.posiciones;
	}

	@Override
	public int subirPosicion() throws IllegalStateException {
		if (this.posiciones + 1 > MAX_POSICION) {
			throw new IllegalStateException(
					String.format("Error: no se puede subir a la posicion %d, ya que la posicion máxima es %d",
							(this.posiciones + 1), MAX_POSICION));
		}
		this.posiciones = this.posiciones + 1;
		return this.posiciones;
	}
	@Override
	public int bajarPosicion() throws IllegalStateException {
		if (this.posiciones - 1 < MIN_POSICION) {
			throw new IllegalStateException(
					String.format("Error: no se puede bajar a la posicion %d, ya que la posicion minima es %d",
							(this.posiciones - 1), MIN_POSICION));
		}
		this.posiciones = this.posiciones - 1;
		return this.posiciones;
	}
}
