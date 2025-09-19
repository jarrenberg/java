package ejercicio6;

import java.util.ArrayList;

public class Ingrediente {

	private static int generarCodigo;

	private final int codigo;
	private final int stockMinimo;
	private String nombre;
	private int cantidad;

	static {
		generarCodigo = 1;
	}

	public Ingrediente(String nombre, int cantidad, int stockMinimo)
			throws NullPointerException, IllegalArgumentException,IllegalStateException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantidad no puede ser negativa");
		}
		this.codigo = generarCodigo;
		this.stockMinimo = stockMinimo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		generarCodigo++;
	}

// Actualiza la cantidad introducida como parametro del ingrediente cuyo codigo es pasado como parametro
	public static void actualizarMenu(int codigo, int cantidadRequerida, ArrayList<Ingrediente> menu) throws IllegalArgumentException {
		if (cantidadRequerida < 0) {
			throw new IllegalArgumentException("La cantidad requerida no puede ser negativa");
		}
		if (codigo < 1) {
			throw new IllegalArgumentException("Los codigos deben ser superiores a 0");
		}
		for (Ingrediente i : menu) {
			if (i.codigo == codigo) {
				if ((i.cantidad - cantidadRequerida) <= i.stockMinimo && (i.cantidad - cantidadRequerida) >= 0) {
					System.out.printf("AVISO: Se esta por debajo del stock minimo, hay que reponer %s\n", i.nombre);
					i.cantidad = i.cantidad - cantidadRequerida;
				}
				if ((i.cantidad - cantidadRequerida) <= 0) {
					System.out.println("No se puede actualizar, la cantidad requerida supera el stock");
				}
				if ((i.cantidad - cantidadRequerida) > i.stockMinimo) {
					i.cantidad = i.cantidad - cantidadRequerida;
				}
			}
		}
	}
// Devuelve una lista con los codigos de lo ingredientes cuya cantidad es menor o igual al stock minimo
	public static ArrayList<Integer> codigosStockMinimo(ArrayList<Ingrediente> menu) {
		ArrayList<Integer> codigos = new ArrayList<Integer>();
		for (Ingrediente i : menu) {
			if (i.cantidad <= i.stockMinimo) {
				codigos.add(i.codigo);
			}
		}
		return codigos;
	}
// Devuelve la información del objeto
	public String toString() {
		return String.format("CODIGO: %d, NOMBRE: %s, CANTIDAD: %d, STOCK MINIMO: %d\n", codigo, nombre, cantidad,
				stockMinimo);
	}

}
