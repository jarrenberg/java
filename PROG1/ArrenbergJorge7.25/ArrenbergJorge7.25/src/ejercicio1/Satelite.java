package ejercicio1;

public class Satelite extends Astros {
	public static final double DISTANCIA_AL_PLANETA_DEFAULT = 50000;
	public static final double ORBITA_PLANETARIA_DEFAULT = 200000;
	public static final String PLANETA_QUE_ORBITA_DEFAULT = "TIERRA";

	private double distanciaAlPlaneta;
	private double orbitaPlanetaria;
	private String planetaQueOrbita;

	public Satelite(String nombre, double masa, double diametroMedio, int periodoRotacion, int periodoTraslacion,
			double distanciaCuerpoQueOrbitan, double temperaturaMedia, double gravedad, double distanciaAlPlaneta,
			double orbitaPlanetaria, String planetaQueOrbita) {
		super(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaCuerpoQueOrbitan,
				temperaturaMedia, gravedad);
		setDistanciaAlPlaneta(distanciaAlPlaneta);
		setOrbitaPlanetaria(orbitaPlanetaria);
		setPlanetaQueOrbita(planetaQueOrbita);

	}

	public Satelite() {
		this(NOMBRE_DEFAULT, MASA_DEFAULT, DIAMETRO_MEDIO_DEFAULT, PERIODO_ROTACION_DEFAULT, PERIODO_TRASLACION_DEFAULT,
				DISTACIA_CUERPO_QUE_ORBITAN_DEFAULT, TEMPERATURA_MEDIA_DEFAULT, GRAVEDAD_DEFAULT,
				DISTANCIA_AL_PLANETA_DEFAULT, ORBITA_PLANETARIA_DEFAULT, PLANETA_QUE_ORBITA_DEFAULT);
	}

	public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
		if (distanciaAlPlaneta < 0) {
			throw new IllegalArgumentException("La distancia al planeta no puede ser negativa");
		}
		this.distanciaAlPlaneta = distanciaAlPlaneta;
	}

	public void setOrbitaPlanetaria(double orbitaPlanetaria) {
		if (orbitaPlanetaria < 0) {
			throw new IllegalArgumentException("La orbita planetaria no puede ser negativa");
		}
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	public void setPlanetaQueOrbita(String planetaQueOrbita) {
		if (planetaQueOrbita == null) {
			throw new NullPointerException("El nombre del planeta no puede ser nulo");
		}
		if (planetaQueOrbita.equals("")) {
			throw new IllegalArgumentException("El nombre del planeta no puede estar vacio");
		}
		this.planetaQueOrbita = planetaQueOrbita;
	}

	public double getDistanciaAlPlaneta() {
		return this.distanciaAlPlaneta;
	}

	public double setOrbitaPlanetaria() {
		return this.orbitaPlanetaria;
	}

	public String getPlanetaQueOrbita() {
		return this.planetaQueOrbita;
	}

	@Override
	public String toString() {
		String mensaje = String.format(
				"%s, DISTANCIA AL PLANETA (KM): %.2f, ORBITA PLANETARIA: %.2f, PLANETA AL QUE ORBITA: %s ",
				super.toString(), distanciaAlPlaneta, orbitaPlanetaria, planetaQueOrbita);
		return mensaje;
	}
}