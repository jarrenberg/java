package mobiliario;

import java.util.Iterator;

public abstract class Almacenaje extends Mueble implements Personalizable {
	public static final int MIN_MODULOS=1;
	public static final int MAX_MODULOS=20;
	
	private final int maxModulos;

	private double anchura;
	private double altura;
	
	protected Modulo[] modulos;
	protected int numeroModulos;
	
	public Almacenaje (double precio, String descripcion,double anchura,double altura,int maxModulos) {
		super(precio,descripcion);
		if(maxModulos>MAX_MODULOS||maxModulos<MIN_MODULOS) {
			throw new IllegalArgumentException(String.format("Error. El numero introducido (%d) no esta dentro de los parametros validos.",maxModulos));
		}
		this.anchura=anchura;
		this.altura=altura;
		this.maxModulos=maxModulos;
		this.modulos= new Modulo[maxModulos];
		this.modulos[0]=Modulo.BALDA;
		this.numeroModulos=1;
	}
	public double getAnchura() {
		return this.anchura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public int getNumModulos() {
		return this.maxModulos;
	}
	
	public int getModulosAnnadidos() {
		return this.numeroModulos;
	}
	
	public String toString() {
		String mensaje = String.format("%s Anchura: %.2f Altura: %.2f Maximo de Modulos: %d Modulos Actuales: %d", super.toString(),anchura,altura,maxModulos,numeroModulos);
		return mensaje;
	}
	
	public String obtenerModulos() {
		String mensaje ="";
		for (int i = 0; i < modulos.length; i++) {
			mensaje = String.format("%s %s",mensaje, modulos[i]);
		}
		mensaje = String.format("[%s ]",mensaje);
		return mensaje;
	}
	
	public void anyadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException{
		if(modulo==null) {
			throw new NullPointerException ("Error. El modulo a añadir no puede ser nulo");
		}
		if(numeroModulos+1>MAX_MODULOS) {
			throw new IllegalStateException (String.format("Error: no se puede añadir el modulo %s. El numero de modulos no puede superar el maximo permitido: %d", modulo,MAX_MODULOS));
		}
		for (int i = 0; i < modulos.length; i++) {
			if(modulos[i]==null) {
				modulos[i]=modulo;
			}
		}
		this.numeroModulos++;
	}
	
	public Modulo extraerModulo() throws IllegalStateException{
		if(numeroModulos==Almacenaje.MIN_MODULOS) {
			throw new IllegalStateException (String.format("Error: no se puede quitar el modulo. El numero de modulos no puede ser inferior a %d", MIN_MODULOS));
		}
		Modulo resultado = null;
		int contador = ((modulos.length)-1);
		
		for (int i = contador; i <= 0; i--) {
			if(modulos[i]!=null) {
				resultado = modulos[i];
				modulos[i]=null;
			}
		}
		this.numeroModulos--;
		return resultado;
	}

}
