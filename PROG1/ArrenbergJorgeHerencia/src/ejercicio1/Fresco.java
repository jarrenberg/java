package ejercicio1;

import java.time.LocalDate;

public class Fresco extends Producto {

	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	public Fresco(String nombre,LocalDate fechaCaducidad, int numeroLote,LocalDate fechaEnvasado, String paisOrigen) throws IllegalStateException,IllegalArgumentException{
		super(nombre,fechaCaducidad,numeroLote);
		setFechaEnvasado(fechaEnvasado);
		setPaisOrigen(paisOrigen);
	}
	
	public void setFechaEnvasado(LocalDate fechaEnvasado) throws  IllegalArgumentException {
		if(fechaEnvasado==null) {
			throw new IllegalArgumentException("La fecha introducida es nula.");
		}
		this.fechaEnvasado=fechaEnvasado;
	}
	
	public LocalDate getFechaEnvasado(){
		return fechaEnvasado;
	}
	
	public void setPaisOrigen(String paisOrigen) throws  IllegalArgumentException{
		if (paisOrigen == null || paisOrigen.equals("") || paisOrigen.equals(" ")) {
			throw new IllegalArgumentException(
					String.format("El pais de origen introducido (%s) no es valido.\n", paisOrigen));
		}
		this.paisOrigen=paisOrigen;
	}
	
	public String getPaisOrigen(){
		return paisOrigen;
	}
	
	@Override
	public String toString() {
		String resultado = String.format("%s\tFecha de envasado (YYYY-M-D): %s \tPais de origen: %s", super.toString(),fechaEnvasado.toString(),paisOrigen);
		return resultado;
	}

}
