
package ejemploClaseBombilla;

public class Bombilla {

	/*
	 * El estado por defecto de la bombilla sera apagado {@value ESTADO_POR_DEFECTO}
	 */
	public static final boolean ESTADO_POR_DEFECTO = false;

	/*
	 * Numero de veces que ha estado una bombilla encendida por defecto: {@value
	 * VECES_ENCENDIDA_POR_DEFECTO}
	 */
	public static final int VECES_ENCENDIDA_POR_DEFECTO = 0;

	private static int numBombillasCreadas = 0;
	private static int numBombillasEncendidas = 0;

	private boolean estado;
	private int vecesEncendida;

	// Constructo con 1 parametro
	public Bombilla(boolean estado) {
		boolean estadoUsuario = estado;
		this.estado = estadoUsuario;
		if (estadoUsuario == false) { // Visto en retroalimentacion, si el estado de la bombilla es encendido, el
										// numero de veces encendidas empieza a 1
			vecesEncendida = VECES_ENCENDIDA_POR_DEFECTO;
		} else {
			vecesEncendida = 1;
			numBombillasEncendidas = numBombillasEncendidas + 1;
		}
		numBombillasCreadas = numBombillasCreadas + 1; // Cada vez que creamos una bombilla lo contamos

	}

	// Constructo por defecto
	public Bombilla() {
		this(ESTADO_POR_DEFECTO);
	}

	// Devuelve el estado de la bombilla
	public boolean getEstado() {
		return estado;
	}

	// Visto en retroalimentacion
	// Devuelve true si la bombilla esta encendida (estado=true) y false si esta
	// apagada (estado=false)
	public boolean isEncendida() {
		boolean encendida;
		if (estado == false) {
			encendida = false;
		} else {
			encendida = true;
		}
		return encendida;
	}

	// Visto en retroalimentacion
	// Devuelve false si la bombilla esta encendida (estado=true) y true si esta
	// apagada (estado=false)
	public boolean isApagada() {
		boolean apagada;
		if (estado == false) {
			apagada = true;
		} else {
			apagada = false;
		}
		return apagada;
	}

	// Enciende una bombilla
	public void encender() throws IllegalStateException {
		if (this.estado == true) {
			throw new IllegalStateException("La bombilla ya esta encendida");
		}
		this.estado = true;
		vecesEncendida = vecesEncendida + 1;
		numBombillasEncendidas = numBombillasEncendidas + 1;
	}

	public void apagar() throws IllegalStateException {
		if (this.estado == false) {
			throw new IllegalStateException("La bombilla ya esta apagada");
		}
		this.estado = false;
		numBombillasEncendidas = numBombillasEncendidas - 1;
	}

	// Enciende la bombilla si esta apagada y la apaga si esta encendida
	public void interruptor() {
		if (estado == true) {
			apagar();
		} else {
			encender();
		}
	}

	// Devuelve el numero de veces que se ha encendido una bobmilla
	public int getVecesEncendida() {
		return vecesEncendida;
	}

	// Devuelve el numero de bombillas encendidas
	public static int numBombillasEncendidas() {
		return numBombillasEncendidas;
	}

	// Devuelve el numero de bombillas creadas
	public static int numBombillasCreadas() {
		return numBombillasCreadas;
	}

	// Devuelve un texto con la informacion de la bombilla
	public String toString() {
		String estado;
		if (this.estado == true) {
			estado = "encendida";
		} else {
			estado = "apagada";
		}
		String resultado;
		if (vecesEncendida == 1) {
			resultado = String.format("Bombilla %s. Se ha encendido %d vez.\n", estado, vecesEncendida);
		} else {
			resultado = String.format("Bombilla %s. Se ha encendido %d veces.\n", estado, vecesEncendida);
		}
		return resultado;
	}
}
