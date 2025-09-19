package ejercicio1;

import java.time.LocalDate;

public abstract class Producto {

	private static int contador;

	protected String codigo;
	protected String nombreProducto;
	protected LocalDate fechaCaducidad;
	protected int numeroLote;

	static {
		contador = 1;
	}

	protected Producto(String nombreProducto, LocalDate fechaCaducidad, int numeroLote) throws IllegalStateException,IllegalArgumentException {
		if (contador > 9999) {
			throw new IllegalStateException("Se ha excedido el numero de productos");
		}

		this.codigo = darCodigo();
		setNombreProducto(nombreProducto);
		setFechaCaducidad(fechaCaducidad);
		setNumeroLote(numeroLote);
		contador++;
	}

	private String darCodigo() {
		String codigo = String.format("%04d", contador);
		return codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setNombreProducto(String nombreProducto) throws IllegalArgumentException {
		if (nombreProducto == null || nombreProducto.equals("") || nombreProducto.equals(" ")) {
			throw new IllegalArgumentException(
					String.format("El nombre de producto introducido (%s) no es valido.\n", nombreProducto));
		}
		this.nombreProducto = nombreProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) throws IllegalArgumentException {
		if (fechaCaducidad == null) {
			throw new IllegalArgumentException(String.format("%s\n", "La fecha de caducidad introducida es nula."));
		}
		if (fechaCaducidad.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException(
					String.format("La fecha de caducidad introducida (%s) debe ser posterior a la actual (%s).\n",
							fechaCaducidad.toString(), LocalDate.now().toString()));
		}
		this.fechaCaducidad = fechaCaducidad;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setNumeroLote(int numeroLote) throws IllegalArgumentException {
		if (numeroLote < 0) {
			throw new IllegalArgumentException(
					String.format("El numero de lote (%d) no puede ser negativo\n", numeroLote));
		}
		this.numeroLote = numeroLote;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public String toString() {
		String resultado = String.format(
				"Código: %s\t Nombre: %s\tFecha de caducidad (YYYY-M-D): %s\tNumero de Lote: %d", codigo,
				nombreProducto, fechaCaducidad, numeroLote);
		return resultado;
	}

}
