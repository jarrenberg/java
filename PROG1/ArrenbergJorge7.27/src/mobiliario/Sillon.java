package mobiliario;

public final class Sillon extends Asiento implements Ajustable {
	public static final int POS_BAJADO=0;
	public static final int POS_SUBIDO=1;
	
	private int posicionesPieSillon;
	
	public Sillon(double precio, String descripcion, String tapiceria, String color) {
		super(precio,descripcion,Asiento.MIN_PLAZAS,tapiceria,color);
		this.posicionesPieSillon=POS_BAJADO;
	}
	
	@Override
	public String toString() {
		String reposaPies=null;
		if(posicionesPieSillon==0) {
			reposaPies = "Bajado";
		}
		if(posicionesPieSillon==1) {
			reposaPies = "Subido";
		}
		String mensaje = String.format("%s Posicion Reposapies: %s", super.toString(),reposaPies);
		return mensaje;
	}

	@Override
	public int obtenerPosicion() {
		return this.posicionesPieSillon;
	}

	@Override
	public int subirPosicion() throws IllegalStateException {
		if(this.posicionesPieSillon+1>POS_SUBIDO) {
			throw new IllegalStateException("Error. No se puden subir los pies del sillón. Ya estan subidos");
		}
		this.posicionesPieSillon=posicionesPieSillon+1;
		return this.posicionesPieSillon;
	}

	@Override
	public int bajarPosicion() throws IllegalStateException {
		if(this.posicionesPieSillon-1<POS_BAJADO) {
			throw new IllegalStateException("Error. No se puden bajar los pies del sillón. Ya estan bajados");
		}
		this.posicionesPieSillon=posicionesPieSillon-1;
		return this.posicionesPieSillon;
	}
	
}
