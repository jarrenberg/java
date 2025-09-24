package mobiliario;

public final class Estanteria extends Almacenaje {

	private String tipo;

	public Estanteria(double precio, String descripcion, double anchura, double altura, int maxModulos, String tipo) {
		super(precio, descripcion, anchura, altura, maxModulos);
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String toString() {
		String mensaje = String.format("%s Tipo: %s", super.toString(), tipo);
		return mensaje;
	}

	@Override
	// Preguntar a rafa por esto
	public void anyadirModulo(Modulo modulo)
			throws IllegalStateException, NullPointerException, IllegalArgumentException {
		
		if(modulo==null) {
			throw new NullPointerException ("Error. El modulo es nulo.");
		}
		if (modulo != Modulo.BALDA) {
			throw new IllegalArgumentException("Error. Solo se pueden introducir Baldas en una Estantería.");
		}
		super.anyadirModulo(modulo);
	}

}
