/*Creacion de la clase Astro, sus atributos, constructores y metodos
 *Jorge Arrenberg 03/03/2025 
 */
package ejercicio1;

public abstract class Astros {
	public static final String NOMBRE_DEFAULT = "PLANETA VEGETA";
	public static final double MASA_DEFAULT = 6000000;
	public static final double DIAMETRO_MEDIO_DEFAULT = 50;
	public static final int PERIODO_ROTACION_DEFAULT = 24;
	public static final int PERIODO_TRASLACION_DEFAULT = 365;
	public static final double DISTACIA_CUERPO_QUE_ORBITAN_DEFAULT = 3000;
	public static final double TEMPERATURA_MEDIA_DEFAULT = 20;
	public static final double GRAVEDAD_DEFAULT = 9.8;
	public static final int MAX_ASTROS_SISTEMA = 10;

	private static Astros[] sistema;
	private static int contadorAstros;

	private String nombre;
	private double masa;
	private double diametroMedio;
	private int periodoRotacion;
	private int periodoTraslacion;
	private double distanciaCuerpoQueOrbitan;
	private double temperaturaMedia;
	private double gravedad;

	static {
		sistema = new Astros[MAX_ASTROS_SISTEMA];
		contadorAstros = 0;
	}

	// Constructor con todos los parametros
	protected Astros(String nombre, double masa, double diametroMedio, int periodoRotacion, int periodoTraslacion,
			double distanciaCuerpoQueOrbitan, double temperaturaMedia, double gravedad) {
		setNombre(nombre);
		setMasa(masa);
		setDiametroMedio(diametroMedio);
		setDistanciaCuerpoQueOrbitan(distanciaCuerpoQueOrbitan);
		setPeriodoRotacion(periodoRotacion);
		setPeriodoTraslacion(periodoTraslacion);
		setTemperaturaMedia(temperaturaMedia);
		setGravedad(gravedad);
		anyadir(this);
	}

	public void anyadir(Astros a) {
		if (contadorAstros == MAX_ASTROS_SISTEMA) {
			throw new IllegalStateException("El sistema ha llegado al maximo de astros permitidos");
		}
		sistema[contadorAstros] = a;
		contadorAstros++;
	}

	public void eliminar() {
		if (contadorAstros == 0) {
			throw new IllegalStateException("El sistema ha llegado al minimo de astros permitidos");
		}
		sistema[(contadorAstros - 1)] = null;
		contadorAstros--;
	}

	public void mostrar() {
		for (int i = 0; i < sistema.length; i++) {
			if (sistema[i] != null) {
				System.out.println(sistema[i].toString());
			}
		}
	}

	// Constructor por defecto
	protected Astros() {
		this(NOMBRE_DEFAULT, MASA_DEFAULT, DIAMETRO_MEDIO_DEFAULT, PERIODO_ROTACION_DEFAULT, PERIODO_TRASLACION_DEFAULT,
				DISTACIA_CUERPO_QUE_ORBITAN_DEFAULT, TEMPERATURA_MEDIA_DEFAULT, GRAVEDAD_DEFAULT);
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo.");
		}
		if (nombre.equals("")) {
			throw new IllegalArgumentException("El nombr eno puede estar vacio");
		}
		this.nombre = nombre;

	}

	public void setMasa(double masa) {
		if (masa < 0) {
			throw new IllegalArgumentException("La masa no puede ser negativa");
		}
		this.masa = masa;
	}

	public void setDiametroMedio(double diametroMedio) {
		if (diametroMedio < 0) {
			throw new IllegalArgumentException("El diametro medio no puede ser negativo");
		}
		this.diametroMedio = diametroMedio;
	}

	public void setDistanciaCuerpoQueOrbitan(double distanciaCuerpoQueOrbitan) {
		if (distanciaCuerpoQueOrbitan < 0) {
			throw new IllegalArgumentException("La distancia a la que orbita un cuerpo no puede ser negativa");
		}
		this.distanciaCuerpoQueOrbitan = distanciaCuerpoQueOrbitan;
	}

	public void setPeriodoRotacion(int periodoRotacion) {
		if (periodoRotacion < 0) {
			throw new IllegalArgumentException("El periodo de rotacion no puede ser negativo");
		}
		this.periodoRotacion = periodoRotacion;
	}

	public void setPeriodoTraslacion(int periodoTraslacion) {
		if (periodoTraslacion < 0) {
			throw new IllegalArgumentException("El periodo de traslacion no puede ser negativo");
		}
		this.periodoTraslacion = periodoTraslacion;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		if (temperaturaMedia < 0) {
			throw new IllegalArgumentException("La temperatura media no puede ser negativa");
		}
		this.temperaturaMedia = temperaturaMedia;
	}

	public void setGravedad(double gravedad) {
		if (gravedad < 0) {
			throw new IllegalArgumentException("La gravedad no puede ser negativa");
		}
		this.gravedad = gravedad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getMasa() {
		return this.masa;
	}

	public double getDiametroMedio() {
		return this.diametroMedio;
	}

	public double getDistanciaCuerpoQueOrbitan() {
		return this.distanciaCuerpoQueOrbitan;
	}

	public int getPeriodoRotacion() {
		return this.periodoRotacion;
	}

	public int getPeriodoTraslacion() {
		return this.periodoTraslacion;
	}

	public double getTemperaturaMedia() {
		return this.temperaturaMedia;
	}

	public double getGravedad() {
		return this.gravedad;
	}

	public String toString() {
		String mensaje = String.format(
				"NOMBRE: %s, MASA(T): %.2f, DIAMETRO MEDIO(KM): %.2f, PERIODO DE ROTACION(h): %d, PERIODO DE TRASLACION (dias): %d, DISTANCIA AL CUERPO QUE ORBITA (KM): %.2f, TEMPERATURA MEDIA (ºC): %.2f, GRAVEDAD (m/s): %.2f ",
				nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaCuerpoQueOrbitan,
				temperaturaMedia, gravedad);
		return mensaje;
	}
}
