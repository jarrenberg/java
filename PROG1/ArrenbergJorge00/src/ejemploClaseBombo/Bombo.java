package ejemploClaseBombo;

public class Bombo {
	public static final int CAPACIDAD_MAX = 90;
	public static final int CAPACIDAD_MIN = 9;
	public static final int CAPACIDAD_DEFAULT = CAPACIDAD_MAX;

	public static int bombosCreados;
	// Visto en retroalimentacion
	final int[] listado;
	private int bolasExtraidas;

	static {
		bombosCreados = 0;
	}

	// Constructor con 1 parametro
	public Bombo(int capacidad) throws IllegalArgumentException {
		if (capacidad > CAPACIDAD_MAX || capacidad < CAPACIDAD_MIN) {
			throw new IllegalArgumentException(
					String.format("El numero de bolas introducidos (%d) debe ser mayor a %d y menor a %d.\n", capacidad,
							CAPACIDAD_MIN, CAPACIDAD_MAX));
		}
		listado = new int[capacidad];
		rellenar();
		bombosCreados++;
	}

	// Constructor por defecto
	public Bombo() {
		this(CAPACIDAD_DEFAULT);
	}

	// Visto en retroalimentacion
	private void rellenar() {
		for (int i = 0; i < listado.length; i++) {
			listado[i] = i + 1;
		}
	}

	// Metodo que devuelve la capacidad del bombo
	public int getCapacidad() {
		return listado.length;
	}

	// Metodo que devuelve la cantidad de bolas restantes en el bombo
	public int getCantidadBolasRestantes() {
		int bolasRestantes = (listado.length) - bolasExtraidas;
		return bolasRestantes;
	}

	// Metodo que devuelve la cantidad de bolas extraidas del bombo
	public int getCantidadBolasExtraidas() {
		int bolasExtraidas = this.bolasExtraidas;
		return bolasExtraidas;
	}

	// Metodo que devuelve si el bombo esta completo
	public boolean isCompleto() {
		boolean isCompleto;
		if ((getCapacidad() - getCantidadBolasExtraidas()) == getCapacidad()) {
			isCompleto = true;
		} else {
			isCompleto = false;
		}
		return isCompleto;
	}

	// Metodo que devuelve si el bombo esta vacio
	public boolean isVacio() {
		boolean isVacio;
		if ((getCapacidad() - getCantidadBolasExtraidas()) == 0) {
			isVacio = true;
		} else {
			isVacio = false;
		}
		return isVacio;
	}

	// Metodo que devuelve la informacion del bombo
	public String toString() {
		String mensaje = String.format("Cantidad: %d.\tCantidad de bolas extraidas: %d", listado.length,
				bolasExtraidas);
		return mensaje;
	}
//Metodo para extraer una bola extraido de la retroalimentacion
	public int extraerBola() throws IllegalStateException {
		if (this.isVacio()) {
			throw new IllegalStateException("bombo vacío");
		} else {
			int aleatoria = this.bolasExtraidas + (int) (Math.random() * (this.getCapacidad() - this.bolasExtraidas)); // Visto en retroalimentacion
			int bola = listado[aleatoria]; // bola extraída
			listado[aleatoria] = listado[this.bolasExtraidas];
			listado[this.bolasExtraidas] = bola;
			this.bolasExtraidas++;
			return bola;
		}
	}

	

	// Metodo que resetea el bombo y devuelve el numero de bolas que ha habido que
	// introducir
	public int reset() {
		int bolasReintroducidas = this.bolasExtraidas;
		this.bolasExtraidas = 0;
		rellenar();
		return bolasReintroducidas;
	}
}
