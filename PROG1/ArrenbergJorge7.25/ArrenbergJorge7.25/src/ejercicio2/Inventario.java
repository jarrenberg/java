package ejercicio2;

public class Inventario {
	public static final int MAX_MASCOTAS = 100;

	protected static int cont = 0;

	protected Mascotas[] inventario;

	public Inventario() {
		this.inventario = new Mascotas[MAX_MASCOTAS];
	}

	public void mostrarInventarioSimple() {
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null) {
				String mensaje = String.format("Animal %d : [Tipo: %s Nombre: %s]\n", (i + 1),
						inventario[i].getClass().getSimpleName(), inventario[i].getNombre());
				System.out.println(mensaje);
			}
		}
	}

	public void mostrarInventarioCompleto() {
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null) {
				String mensaje = String.format("%s", inventario[i].toString());
				System.out.println(mensaje);
			}
		}
	}

	public void mostrarInfoNombre(String nombre) {

		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null) {
				if (nombre.equalsIgnoreCase(inventario[i].getNombre())) {
					System.out.println(inventario[i].toString());
				}
			}
		}
	}

	public void anyadir(Mascotas m) {
		if(cont==inventario.length) {
			throw new IllegalStateException("El sistema ha llegado al maximo de mascotas permitidos");
		}
		inventario[cont] = m;
		cont++;
	}

	public void eliminar() {
		if (cont == 0) {
			throw new IllegalStateException("El sistema ha llegado al minimo de mascotas permitidos");
		}
		inventario[(cont - 1)] = null;
		cont--;
	}

	public void vaciar() {
		for (int i = 0; i < inventario.length; i++) {
			inventario[i] = null;
		}
	}

}
