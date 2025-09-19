package ejemploClaseVehiculo;

public class Vehiculo {
	private static final double MIN_CONSUMO_MEDIO = 2;
	private static final double MAX_CONSUMO_MEDIO = 20;
	private static final double MIN_DEPOSITO = 10;
	private static final double MAX_DEPOSITO = 120;
	private static final double CONSUMO_AL_ARRANCAR = 0.02;
	private static final double CONSUMO_DEFAULT = 5;
	private static final double DEPOSITO_DEFAULT = 50;

	private static double kmRecorridosFlota;
	private static double consumoFlota;
	private static int vehiculosEncendidos;

	private final double consumoMedio;
	private final double capacidadDeposito;

	private boolean estadoMotor; // TRUE cuando esta arrancado y FALSE cuando esta apagado
	private double nivelDeposito;
	private double kmRecorridosUltimoTrayecto;
	private double kmRecorridosGlobal;
	private double consumoUltimoTrayecto;
	private double consumoGlobal;

	static {
		kmRecorridosFlota = 0;
		consumoFlota = 0;
		vehiculosEncendidos = 0;
	}

	// Constructor con 2 parametros
	public Vehiculo(double consumoMedio, double capacidadDeposito) throws IllegalArgumentException {
		if (consumoMedio < MIN_CONSUMO_MEDIO) {
			throw new IllegalArgumentException(
					String.format("El consumo medio introducido (%.2fL/KM) debe ser mayor que (%.2fL/KM).\n",
							consumoMedio, MIN_CONSUMO_MEDIO));
		}
		if (consumoMedio > MAX_CONSUMO_MEDIO) {
			throw new IllegalArgumentException(
					String.format("El consumo medio introducido (%.2fL/KM) debe ser menor que (%.2fL/KM).\n",
							consumoMedio, MAX_CONSUMO_MEDIO));
		}
		if (capacidadDeposito < MIN_DEPOSITO) {
			throw new IllegalArgumentException(
					String.format("El tamaño de deposito introducido (%.2fL) debe ser mayor que (%.2fL).\n",
							capacidadDeposito, MIN_DEPOSITO));
		}
		if (capacidadDeposito > MAX_DEPOSITO) {
			throw new IllegalArgumentException(
					String.format("El tamaño de deposito introducido (%.2fL) debe ser menor que (%.2fL).\n",
							capacidadDeposito, MAX_DEPOSITO));
		}

		this.consumoMedio = consumoMedio;
		this.capacidadDeposito = capacidadDeposito;
		this.estadoMotor = false;
		this.nivelDeposito = 0; // Lo inicializamos a la mitad de la capacidad total del deposito
		this.kmRecorridosUltimoTrayecto = 0;
		this.kmRecorridosGlobal = 0;
		this.consumoUltimoTrayecto = 0;
		this.consumoGlobal = 0;
	}

	// Constructor por defecto
	public Vehiculo() {
		this(CONSUMO_DEFAULT, DEPOSITO_DEFAULT);
	}

	// Añade a la clase Vehiculo los métodos consultores (getters) para poder
	// obtener la siguiente información

	// Devuelve true si el estado es arrancado y false si es falso
	public boolean isArrancado() {
		return this.estadoMotor;
	}

	// Devuelve el consumo medio del vehiculo en litros/100km
	public double getConsumoMedio() {
		return this.consumoMedio;
	}

	// Devuelve la capcidad del deposito en litros
	public double getCapacidadDeposito() {
		return this.capacidadDeposito;
	}

	// Devuelve el nivel actual del depósito de combustible del vehículo (en
	// litros);
	public double getNivelCombustible() {
		return this.nivelDeposito;
	}

	public double getDistanciaRecorrida() {
		return this.kmRecorridosUltimoTrayecto;
	}

	public double getDistanciaRecorridaTotal() {
		return this.kmRecorridosGlobal;
	}

	public double getCombustibleConsumido() {
		return this.consumoUltimoTrayecto;
	}

	public double getCombustibleConsumidoTotal() {
		return this.consumoGlobal;
	}

	public static double getDistanciaRecorridaFlota() {
		return kmRecorridosFlota;
	}

	public static double getCombustibleConsumidoFlota() {
		return consumoFlota;
	}

	public static int getNumVehiculosArrancadosFlota() {
		return vehiculosEncendidos;
	}

	// Metodo que permite repostar una cantidad de litros introducida como parametro
	public void repostar(double cantidad) throws IllegalStateException, IllegalArgumentException {
		if (isArrancado()) {
			throw new IllegalStateException(
					String.format("%s.\n", "No se puede repostar si el motor esta encendido. Operacion abortada"));
		}
		if ((this.nivelDeposito + cantidad) > this.capacidadDeposito) {
			this.nivelDeposito = this.capacidadDeposito; // Llenamos el deposito
			throw new IllegalArgumentException(String.format(
					"Depósito lleno. Se ha sobrepasado la capaciad del depósito de combustible en %.2f litros.",
					((this.getNivelCombustible() + cantidad) - capacidadDeposito)));
		}
		this.nivelDeposito = this.nivelDeposito + cantidad;
	}

	// Metodo que permite arrancar el vehiculo
	public void arrancar() throws IllegalStateException, IllegalArgumentException {
		if (isArrancado()) {
			throw new IllegalStateException(String.format("%s.\n", "El vehiculo ya se encuentra arrancado"));
		}

		if (this.nivelDeposito < CONSUMO_AL_ARRANCAR) {
			throw new IllegalStateException(
					String.format("%s.\n", "El vehiculo no tiene suficiente combustible para arrancar"));
		}
		this.nivelDeposito = nivelDeposito - CONSUMO_AL_ARRANCAR;
		vehiculosEncendidos++;
		this.estadoMotor = true;
	}

	// Metodo que permite realizar un trayecto de una distancia pasada como
	// parametro
	public void realizarTrayecto(double distancia) throws IllegalStateException, IllegalArgumentException {
		if (distancia < 0) {
			throw new IllegalArgumentException(String.format(
					"La distancia introducida (%.2f) es negativa, por lo que no se puede realizar el trayecto.\n",
					distancia));
		}

		if (!isArrancado()) {
			throw new IllegalStateException(
					String.format("%s\n", "No se puede realizar un trayecto con el motor apagado."));
		}

		if ((((this.consumoMedio) / 100.0) * distancia) > nivelDeposito) {
			// Actualizamos los parametros del vehiculo
			double kmRecorribles = ((consumoMedio / 100) * nivelDeposito);
			double consumoRealizado = ((consumoMedio / 100) * kmRecorribles);
			double nivelDepositoAntiguo=this.nivelDeposito;
			nivelDeposito=0;
			kmRecorridosUltimoTrayecto = (distancia-kmRecorribles);
			kmRecorridosGlobal = kmRecorridosGlobal + kmRecorridosUltimoTrayecto;
			kmRecorridosFlota = kmRecorridosFlota + (distancia-kmRecorribles);
			consumoUltimoTrayecto = consumoRealizado;
			consumoGlobal = consumoGlobal + consumoRealizado;
			consumoFlota = consumoFlota + consumoRealizado;
			this.estadoMotor = false; // Apagamos el motor
			throw new IllegalArgumentException(String.format(
					"La distancia introducida (%.2f) excede la autonomia del coche con un consumo medio de %.2fL/100KM y un nivel de deposito de %.2fL.\nPor eso se han recorrido %.2f km y el vehiculo se ha apagado.\nFaltan por recorrer %.2f KM.\n",
					distancia, this.consumoMedio, nivelDepositoAntiguo,  (distancia - kmRecorribles),kmRecorribles));
		}
		double consumo = ((consumoMedio / 100) * distancia);
		nivelDeposito=nivelDeposito- (distancia*(consumoMedio/100));
		kmRecorridosUltimoTrayecto = (distancia -((consumoMedio / 100) * nivelDeposito));
		kmRecorridosGlobal = kmRecorridosGlobal  +(distancia -((consumoMedio / 100) * nivelDeposito));
		kmRecorridosFlota = kmRecorridosFlota + (distancia -((consumoMedio / 100) * nivelDeposito));
		consumoUltimoTrayecto = consumo;
		consumoGlobal = consumoGlobal + consumo;
		consumoFlota = consumoFlota + consumo;
	}
	
	// Metodo que permite apagar un vehiculo
	public void apagar() throws IllegalStateException {
		if(estadoMotor==false) {
			throw new IllegalStateException(String.format("%s\n","El motor del vehiculo ya esta apagado."));
		}
		estadoMotor=false; //Añadido tras revision
		vehiculosEncendidos--;
		kmRecorridosUltimoTrayecto = 0;
		consumoUltimoTrayecto = 0;
	}
	
	// Metodo toString adaptado a la clase vehiculo
	public String toString() {
		String estado;
		if(estadoMotor) {
			estado="Encendido";
		}else {
			estado="Apagado";
		}
		String resultado = String.format("Motor: %s - Deposito: %.2fL - Distancia: %.2f - Consumo: %.2f.\n", estado,nivelDeposito,this.kmRecorridosGlobal,consumoMedio);
		return resultado;
	}
	
}
