package ejercicio2;

public class Cafetera {

	// Atributos
	public static final double CAPACIDAD_MAXIMA_POR_DEFECTO = 1000;
	public static final double CANTIDAD_ACTUAL_POR_DEFECTO = 0;

	private double capacidadMaxima;
	private double cantidadActual = 0;

	// Constructor con dos parametros
	public Cafetera(double cantidadActual, double capacidadMaxima) throws IllegalArgumentException {
		if (cantidadActual > capacidadMaxima) {
			// Preguntar a rafa si la creacion del objeto debe ir delante de la excepcion
			this.cantidadActual = capacidadMaxima;
			this.capacidadMaxima = capacidadMaxima;
			throw new IllegalArgumentException(String.format(
					"La cantidad actual (%.2f) no puede ser mayor a la capacidad maxima (%.2f). La cantidad excedente es: %.2f.\n",
					cantidadActual, capacidadMaxima, cantidadActual - capacidadMaxima));
		}
		this.cantidadActual = cantidadActual;
		this.capacidadMaxima = capacidadMaxima;
	}

	// Constructor con un parametros
	public Cafetera(double capacidadMaxima) {
		this(capacidadMaxima, capacidadMaxima);
	}

	// Constructor por defecto
	public Cafetera() {
		this(CANTIDAD_ACTUAL_POR_DEFECTO, CAPACIDAD_MAXIMA_POR_DEFECTO);
	}
	
	//Llena la cafetera con una cantidad positiva y que no exceda la capacidad maxima de la cafetera
	public void llenarCantidad (double cantidad) throws IllegalStateException, IllegalArgumentException {
		if((cantidadActual+cantidad)>capacidadMaxima) {
			throw new IllegalStateException (String.format("Has llenado la cafetera %.2f cc por encima de su capacidad.\n",((cantidadActual+cantidad)-capacidadMaxima)));
		}
		if(cantidad<0) {
			throw new IllegalArgumentException (String.format("Has introducido una cantidad negativa (%.2f).\n", cantidad));
		}
		this.cantidadActual=cantidadActual+cantidad;
		
	}
	
	//Sirve una taza con una cantidad positiva y que no sea menor a la cantidad actual
	public void servirTaza(int cantidad) throws IllegalStateException, IllegalArgumentException  {
		if(cantidad>cantidadActual) {
			cantidadActual=0;
			String mensaje= String.format("Has intentado servir una taza con una cantidad mayor (%d) a la cantidad actual (%.2f).\n",cantidad,cantidadActual);
			throw new IllegalStateException (mensaje);
		
		}
		if(cantidad<0) {
			throw new IllegalArgumentException (String.format("Has introducido una cantidad negativa (%.2f).\n", cantidad));
		}
		cantidadActual=cantidadActual-cantidad;
	}

	//Vacia la cafetera
	public void vaciarCafetera() {
		cantidadActual=0;
	}
	
	//Asigna un valor a la capacidad maxima
	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima=capacidadMaxima;
	}
	
	//Asigna un valor a la cantidad actual
	public void setCantidadActual (double cantidadActual) {
		this.cantidadActual=cantidadActual;
	}
	
	//Devuelve la capacidad maxima
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	//Devuelve la cantidad actual
	public double getCantidadActual() {
		return cantidadActual;
	}
	
	//Metodo toString personalizado
	public String toString() {
		String informacion = String.format("Informacion de la cafetera:\tCapacidad máxima: %.2f\tCantidad actual: %.2f\n", capacidadMaxima,cantidadActual);
		return informacion;
	}
}
