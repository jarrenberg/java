package ejercicio1;

import java.time.LocalDate;

public class Congelado extends Producto {

	private double temperaturaCongelacion;
	private int mesesEnCongelador;

	public Congelado(String nombre, LocalDate fechaCaducidad, int numeroLote, double temperaturaCongelacion,
			int mesesEnCongelador) throws IllegalStateException, IllegalArgumentException {
		super(nombre, fechaCaducidad, numeroLote);
		setTemperaturaCongelacion(temperaturaCongelacion);
		setMesesEnCongelador(mesesEnCongelador);
	}

	public void setTemperaturaCongelacion(double temperaturaCongelacion) throws IllegalArgumentException{
		if(temperaturaCongelacion>0) {
			throw new IllegalArgumentException("La temperatura de congelacion debe ser negativa.");
		}
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	public double getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setMesesEnCongelador(int mesesEnCongelador) throws IllegalArgumentException{
		if(mesesEnCongelador<0) {
			throw new IllegalArgumentException("Los meses en el congelador deben ser mayores o igual a 0.");
		}
		this.mesesEnCongelador = mesesEnCongelador;
	}

	public int getMesesEnCongelador() {
		return mesesEnCongelador;
	}

	@Override
	public String toString() {
		String resultado = String.format("%s\tTemperatura de Congelacion: %.2f\tMeses en el congelador: %d",
				super.toString(), temperaturaCongelacion, mesesEnCongelador);
		return resultado;
	}

}
