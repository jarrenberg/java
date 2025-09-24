/*
 * Creacion de la clase empleado con sus atributos y metodos
 * Jorge Arrenberg 21/01/2025
 */
package ejercicio3;

public class Empleado {

	// Atributos
	public static final String NIF_DEFAULT = "12345678A";
	public static final String NOMBRE_DEFAULT = "Juan";
	public static final String APELLIDOS_DEFAULT = "Martos Sosa";
	public static final double SUELDO_BASE_DEFAULT = 1400;
	public static final double PAGO_HORA_EXTRA_DEFAULT = 10;
	public static final int HORAS_EXTRAS_REALIZADAS_DEFAULT = 0;
	public static final double TIPO_IRPF_DEFAULT = 10;
	public static final boolean ES_CASADO_DEFAULT = false;
	public static final byte NUM_HIJOS_DEFAULT = 0;

	private static int cantidadEmpleados;

	private String nif;
	private String apellidos;
	private String nombre;
	private double sueldoBase;
	private double pagoHoraExtra;
	private int horasExtrasRealizadas;
	private double tipoIRPF;
	private boolean esCasado;
	private byte numHijos;

	static {
		cantidadEmpleados = 0;
	}

	// Constructor con todos los parametros
	public Empleado(String nif, String apellidos, String nombre, double sueldoBase, double pagoHoraExtra,
			int horasExtrasRealizadas, double tipoIRPF, boolean esCasado, byte numHijos)
			throws IllegalArgumentException {
		if (nif == null || nif == "" || nif == " ") {
			throw new IllegalArgumentException(String.format("El NIF introducido (%s) no puede ser nulo", nif));
		}
		if (apellidos == null || apellidos == "" || apellidos == " ") {
			throw new IllegalArgumentException(
					String.format("Los apellidso introducidos (%s) no pueden ser nulos", apellidos));
		}
		if (nombre == null || nombre == "" || nombre == " ") {
			throw new IllegalArgumentException(String.format("El nombre introducido (%s) no puede ser nulo", nombre));
		}
		if (sueldoBase < 0) {
			throw new IllegalArgumentException(
					String.format("El sueldo base (%.2f) no puede ser negativo.\n", sueldoBase));
		}
		if (pagoHoraExtra < 0) {
			throw new IllegalArgumentException(
					String.format("El pago por horas extra (%.2f) no puede ser negativo.\n", pagoHoraExtra));
		}

		if (horasExtrasRealizadas < 0) {
			throw new IllegalArgumentException(String.format(
					"El numero de horas extras realizadas (%d) no puede ser negativo.\n", horasExtrasRealizadas));
		}

		if (tipoIRPF < 0 || tipoIRPF > 100) {
			throw new IllegalArgumentException(String
					.format("El tipo del IRPF (%.2f) debe estar comprendido entre 0 y 100.\n", horasExtrasRealizadas));
		}
		if (numHijos < 0) {
			throw new IllegalArgumentException(
					String.format("El numero de hijos (%d) no puede ser negativo.\n", numHijos));
		}
		this.nif = nif;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.pagoHoraExtra = pagoHoraExtra;
		this.horasExtrasRealizadas = horasExtrasRealizadas;
		this.tipoIRPF = tipoIRPF;
		this.esCasado = esCasado;
		this.numHijos = numHijos;
		cantidadEmpleados = cantidadEmpleados + 1;
	}

	// Constructor con tres parametros
	public Empleado(String nif, String apellidos, String nombre) throws IllegalArgumentException {
		this(nif, apellidos, nombre, SUELDO_BASE_DEFAULT, PAGO_HORA_EXTRA_DEFAULT, HORAS_EXTRAS_REALIZADAS_DEFAULT,
				TIPO_IRPF_DEFAULT, ES_CASADO_DEFAULT, NUM_HIJOS_DEFAULT);
	}

	// Asigna un valor al nif del empleado
	public void setNIF(String nif) throws IllegalArgumentException{
		if (nif == null || nif == "" || nif == " ") {
			throw new IllegalArgumentException(String.format("El NIF introducido (%s) no puede ser nulo", nif));
		}
		this.nif = nif;
	}

	// Asigna unos apellidos al empleado
	public void setApellidos(String apellidos) throws IllegalArgumentException {
		if (apellidos == null || apellidos == "" || apellidos == " ") {
			throw new IllegalArgumentException(
					String.format("Los apellidso introducidos (%s) no pueden ser nulos", apellidos));
		}
		this.apellidos = apellidos;
	}

	// Asigna un nombre al empleado
	public void setNombre(String nombre) throws IllegalArgumentException{
		if (nombre == null || nombre == "" || nombre == " ") {
			throw new IllegalArgumentException(String.format("El nombre introducido (%s) no puede ser nulo", nombre));
		}
		this.nombre = nombre;
	}

	// Asigna un sueldo base al empleado
	public void setSueldoBase(double sueldoBase)throws IllegalArgumentException {
		if (sueldoBase < 0) {
			throw new IllegalArgumentException(
					String.format("El sueldo base (%.2f) no puede ser negativo.\n", sueldoBase));
		}
		this.sueldoBase = sueldoBase;
	}

	// Asigna el pago por hora extra de un empleado
	public void setPagoHoraExtra(double pagoHoraExtra)throws IllegalArgumentException {
		if (pagoHoraExtra < 0) {
			throw new IllegalArgumentException(
					String.format("El pago por horas extra (%.2f) no puede ser negativo.\n", pagoHoraExtra));
		}

		this.pagoHoraExtra = pagoHoraExtra;
	}

	// Asigna el numero de horas extras trabajadas por un empleado
	public void setHorasExtrasRealizadas(int horasExtrasRealizadas) throws IllegalArgumentException {
		if (horasExtrasRealizadas < 0) {
			throw new IllegalArgumentException(String.format(
					"El numero de horas extras realizadas (%d) no puede ser negativo.\n", horasExtrasRealizadas));
		}
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}

	// Asigna un tipo de IRPF al empleado
	public void setTipoIRPF(double tipoIRPF) throws IllegalArgumentException{
		if (tipoIRPF < 0 || tipoIRPF > 100) {
			throw new IllegalArgumentException(String
					.format("El tipo del IRPF (%.2f) debe estar comprendido entre 0 y 100.\n", horasExtrasRealizadas));
		}
		this.tipoIRPF = tipoIRPF;
	}

	// Asigna el estado civil del empleado
	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	// Asigna el numero de hijos de un empleado
	public void setNumHijos(byte numHijos) throws IllegalArgumentException{
		if (numHijos < 0) {
			throw new IllegalArgumentException(
					String.format("El numero de hijos (%d) no puede ser negativo.\n", numHijos));
		}
		this.numHijos = numHijos;
	}
	
	//Devuelve el NIF del empleado
	public String getNIF() {
		Empleado copia = Empleado.copia(this);
		String nif = copia.nif;
		return nif;
	}
	
	//Devuelve los apellidso del empleado
	public String getApellidos() {
		Empleado copia = Empleado.copia(this);
		String apellidos=copia.apellidos;
		return apellidos;
	}
	
	//Devuelve el nombre del empleado
	public String getNombre() {
		Empleado copia = Empleado.copia(this);
		String nombre = copia.nombre;
		return nombre;
	}
	
	//Devuelve el sueldo base del empleado
	public double getSueldoBase() {
		return this.sueldoBase;
	}
	
	//Devuelve el pago por hora extra
	public double getPagoHoraExtra() {
		return this.pagoHoraExtra;
	}
	
	//Devuelve el numero de horas extra realixadas
	public double getHorasExtrasRealizadas() {
		return this.horasExtrasRealizadas;
	}
	
	//Devuelve el tipo del irpf del empleado
	public double getTipoIRPF() {
		return this.tipoIRPF;
	}
	
	//Devuelve si el empleado esta casado o no
	public boolean getEsCasado() {
		return this.esCasado;
	}
	
	//Devuelve el numero de hijos del empelado
	public byte getNumHijos() {
		return this.numHijos;
	}

	// Calcula el complemento salarial por las horas extras
	public double complemento(double pagoHoraExtra, int horasExtrasRealizadas) {
		double complemento = (pagoHoraExtra * horasExtrasRealizadas);
		return complemento;
	}

	// Devuelve el sueldo bruto del empleado
	public double sueldoBruto(double sueldoBase, double tipoIRPF) {
		double sueldoBruto = sueldoBase - (sueldoBase * (tipoIRPF / 100.0));
		return sueldoBruto;
	}

	// Devuelve el calculo de las retenciones de IRPF
	public double retencionIRPF(double tipoIRPF) {
		double retencionIRPF = tipoIRPF;
		int contador = numHijos;
		if (esCasado == true) {
			retencionIRPF = retencionIRPF - 2;
		}
		if (numHijos > 0) {
			do {
				retencionIRPF = retencionIRPF - 1;
				contador--;
			} while (contador > 0);
		}
		return retencionIRPF;
	}

	// Devuelve la inofmracion basica del empleado
	public void verEmpleado() {
		System.out.printf("Empleado: NIF: %s || Nombre: %s || Apellidos: %s \n", nif, nombre, apellidos);
	}
	
	//Devuelve el sueldo + horas extras
	public double sueldoFinal (double sueldoBruto, int horasExtra,double pagoHoraExtra) {
		double sueldoFinal= sueldoBruto+(horasExtra*pagoHoraExtra);
		return sueldoFinal;
	}

	// Devuelve toda la informacion de un empleado
	public void verTodoEmpleado() {
		String casado;
		if (esCasado == true) {
			casado = "Si";
		} else {
			casado = "No";
		}
		System.out.printf(
				"Empleado: NIF: %s || Nombre: %s || Apellidos: %s || Sueldo Base: %.2f || Sueldo Final:%.2f || Pago por Hora Extra: %.2f || Horas Extras: %d, || Tipo IRPF: %.2f || Casado: %s || Numero de Hijos: %d\n",
				nif, nombre, apellidos, sueldoBase,sueldoFinal(sueldoBruto(sueldoBase,retencionIRPF(tipoIRPF)),horasExtrasRealizadas,pagoHoraExtra), pagoHoraExtra, horasExtrasRealizadas, tipoIRPF, casado, numHijos);
	}

	public static Empleado copia(Empleado original) {
		Empleado copia = new Empleado(original.nif, original.apellidos, original.nombre, original.sueldoBase, original.pagoHoraExtra, original.horasExtrasRealizadas,
				original.tipoIRPF, original.esCasado, original.numHijos);
		return copia;
	}
	
	public static int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

}
