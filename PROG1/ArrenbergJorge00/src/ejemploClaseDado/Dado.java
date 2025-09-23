package ejemploClaseDado;

public class Dado {
	public static final int NUM_CARAS_DEFAULT = 6;

	private static int numDados;
	private static int numLanzamientosGlobal;

	private final int numCaras;
	private final String[] valorCaras = { "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
			"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
			"VEINTE" };
	private int [] registro;
	private int numLanzamientos;

	static {
		numDados = 0;
		numLanzamientosGlobal = 0;
	}

	public Dado(int numCaras) throws IllegalArgumentException {
		if (numCaras != 4 && numCaras != 6 && numCaras != 8 && numCaras != 12 && numCaras != 20) {
			throw new IllegalArgumentException("El numero de caras del dado debe ser: 4,6,8,12,20");
		}
		this.registro=new int[numCaras];
		this.numCaras = numCaras;
		this.numLanzamientos = 0;
		numDados++;
	}

	public Dado() {
		this(NUM_CARAS_DEFAULT);
	}
	
	public static int getNumDados() {
		return numDados;
	}
	
	public static int getNumLanzamientosGlobal() {
		return numLanzamientosGlobal;
	}
	
	public int getVecesCara(int cara) {
		int resultado = registro[((cara)-1)];
		return resultado;
	}

	public int getNumCaras() {
		return numCaras;
	}

	public int getNumLanzamientos() {
		return numLanzamientos;
	}

	public String lanzar() {
		String resultado = null;
		int numRandom = (int) ((Math.random() * numCaras));
		registro[numRandom]=registro[numRandom]+1;
		resultado=valorCaras[(numRandom)];
		numLanzamientos++;
		numLanzamientosGlobal++;
		return resultado;
	}

	public String toString() {
		String mensaje = String.format("NUMERO DE CARAS: %d\tNUMERO DE LANZAMIENTOS:%d\n", numCaras, numLanzamientos);
		return mensaje;
	}

}
