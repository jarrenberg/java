package ejercicio1;

public class Planeta extends Astros {
	public static final double DISTANCIA_AL_SOL_DEFAULT = 0;
	public static final boolean ORBITA_AL_SOL_DEFAULT = false;
	public static final boolean TIENE_SATELITES_DEFAULT = false;
	
	private double distanciaAlSol;
	private boolean orbitaAlSol;
	private boolean tieneSatelites;
	
	public Planeta(String nombre, double masa, double diametroMedio, int periodoRotacion, int periodoTraslacion,
			double distanciaCuerpoQueOrbitan, double temperaturaMedia, double gravedad,double distanciaAlSol,boolean orbitaAlSol,boolean tieneSatelites) {
		super(nombre,masa,diametroMedio,periodoRotacion,periodoTraslacion,distanciaCuerpoQueOrbitan,temperaturaMedia,gravedad);

		setDistanciaAlSol(distanciaAlSol);
		setOrbitaAlSol(orbitaAlSol);
		setTieneSatelites(tieneSatelites);
		}
	
	public Planeta () {
		this(NOMBRE_DEFAULT, MASA_DEFAULT, DIAMETRO_MEDIO_DEFAULT, PERIODO_ROTACION_DEFAULT, PERIODO_TRASLACION_DEFAULT,
				DISTACIA_CUERPO_QUE_ORBITAN_DEFAULT, TEMPERATURA_MEDIA_DEFAULT, GRAVEDAD_DEFAULT,DISTANCIA_AL_SOL_DEFAULT,ORBITA_AL_SOL_DEFAULT,TIENE_SATELITES_DEFAULT);
	}
	
	public void setDistanciaAlSol (double distanciaAlSol) {
		if(distanciaAlSol<0) {
			throw new IllegalArgumentException ("La distancia al sol no puede ser negativa");
		}
		this.distanciaAlSol=distanciaAlSol;
	}
	
	public void setOrbitaAlSol (boolean orbitaAlSol) {
		this.orbitaAlSol=orbitaAlSol;
	}
	public void setTieneSatelites (boolean tieneSatelites) {
		this.tieneSatelites=tieneSatelites;
	}
	public double getDistanciaAlSol () {
		return this.distanciaAlSol;
	}
	public boolean getOrbitAlSol() {
		return this.orbitaAlSol;
	}
	public boolean getTieneSatelites() {
		return this.tieneSatelites;
	}
	
	@Override
	public String toString () {
		String satelites;
		if(tieneSatelites) {
			satelites = "Si";
		}else {
			satelites = "No";
		}
		
		String orbita;
		if(orbitaAlSol) {
			orbita = "Si";
		}else {
			orbita = "No";
		}
			
		String mensaje = String.format("%s, DISTANCIA AL SOL (KM): %.2f, ¿ORBITA UN SOL?: %s, ¿TIENE SATELITES?: %s ", super.toString(),distanciaAlSol,orbita,satelites);
		return mensaje;
	}
	
}
