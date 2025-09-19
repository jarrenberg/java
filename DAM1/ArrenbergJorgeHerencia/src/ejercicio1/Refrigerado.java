package ejercicio1;

import java.time.LocalDate;

public class Refrigerado extends Producto {

	private String codigoSupervision;
	private double temperatura;
	private LocalDate fechaConsumoPreferente;

	public Refrigerado(String nombre, LocalDate fechaCaducidad, int numeroLote, String codigoSueprvision,
			double temperatura, LocalDate fechaConsumoPreferente) throws IllegalStateException,IllegalArgumentException {
		super(nombre, fechaCaducidad, numeroLote);
		setCodigoSupervision(codigoSueprvision);
		setTemperatura(temperatura);
		setFechaConsumoPreferente(fechaConsumoPreferente);
	}

	public void setCodigoSupervision(String codigoSupervision) throws IllegalArgumentException{
		if (codigoSupervision == null || codigoSupervision.equals("") || codigoSupervision.equals(" ")) {
			throw new IllegalArgumentException(
					String.format("El codigo de supervision introducido (%s) no es valido.\n", codigoSupervision));
		}
		this.codigoSupervision = codigoSupervision;
	}
	
	public String getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setTemperatura(double temperatura) throws IllegalArgumentException{
		if(temperatura>0) {
			throw new IllegalArgumentException(String.format("La temperatura de congelación (%.2f) debe ser negativa,", temperatura));
		}
		this.temperatura = temperatura;
	}
	
	public double getTemperatura() {
		return temperatura;
	}

	public void setFechaConsumoPreferente(LocalDate fechaConsumoPreferente)throws IllegalArgumentException {
		if(fechaConsumoPreferente==null) {
			throw new IllegalArgumentException ("La fecha de consumo preferente no es valida.");
		}
		this.fechaConsumoPreferente = fechaConsumoPreferente;
	}
	
	public LocalDate getFechaConsumoPreferente() {
		return fechaConsumoPreferente;
	}
	
	@Override
	public String toString() {
		String resultado = String.format("%s\tCodigo de supervision: %s\tTemperatura mínima: %.2f\tFecha de consumo preferente (YYYY-M-D): %s", super.toString(),codigoSupervision,temperatura,fechaConsumoPreferente.toString());
		return resultado;
	}


}
