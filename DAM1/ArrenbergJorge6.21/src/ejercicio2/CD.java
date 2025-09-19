/*
 * Crecion de una clase CD con atributos, metodos y getter y constructores
 * Jorge Arrenberg 03/02/2025
 */

package ejercicio2;

import ejercicio1.Cancion;

public class CD {
	public static final byte CANCIONES_MAXIMAS_DISCO = 20;

	private static int numeroCDsCreados;

	private Cancion[] listaCanciones;
	private int contadorCanciones;

	static {
		numeroCDsCreados = 0;
	}

	// Constructor con 2 parametros (usado para clonar)
	private CD(Cancion[] listaCanciones, int contadorCanciones) {
		this.contadorCanciones = contadorCanciones;
		this.listaCanciones = listaCanciones;
	}

	// Constructor por defecto
	public CD() {
		this.listaCanciones = new Cancion[CANCIONES_MAXIMAS_DISCO];
	}

	// Devuelve el numero total de cds creados
	public static int getNumeroCDsCreados() {
		return numeroCDsCreados;
	}

	// Devuelve el numero de canciones de un disco
	public int getNumCanciones() {
		return contadorCanciones;
	}

	// Devuelve la cancion indicaada en la posicion
	public Cancion dameCancion(int posicion) {
		// Si la posicion introducida como parametro es mayor o menor a la capacidad del
		// cd salta la excepcion
		if (posicion > listaCanciones.length || posicion < 1) {
			throw new IllegalArgumentException(String.format("La posicion introducida (%d) no es valida.\n", posicion));
		}
		// Si no existe una cancion en la posicion solicitada salta la excepcion
		if (this.listaCanciones[(posicion - 1)] == null) {
			throw new NullPointerException("No existe una cancion en la posicion indicada");
		}
		Cancion resultado = listaCanciones[(posicion - 1)];
		return resultado;
	}

	// Elimina una cancion en una posicion indicada
	public void elimina(int posicion) throws IllegalArgumentException, IllegalStateException {
		// Si la posicion introducida como parametro es mayor o menor a la capacidad del
		// cd salta la excepcion
		if (posicion > listaCanciones.length || posicion < 1) {
			throw new IllegalArgumentException(String.format("La posicion introducida (%d) no es valida.\n", posicion));
		}
		// Si no existe una cancion en la posicion solicitada salta la excepcion
		if (this.listaCanciones[(posicion - 1)] == null) {
			throw new IllegalStateException(String.format(
					"No se puede eliminar cancion en la posicion (%d) porque no hay cancion en dicha posicion.\n",
					posicion));
		}
		this.listaCanciones[(posicion - 1)] = null;
		contadorCanciones--;
	}

	// Añade al disco una cancion indicada en la posicion indicada
	public void grabarCancion(int posicion, Cancion cancion) {
		// Si la posicion introducida como parametro es mayor o menor a la capacidad del
		// cd salta la excepcion
		if (posicion > listaCanciones.length || posicion < 1) {
			throw new IllegalArgumentException(String.format("La posicion introducida (%d) no es valida.\n", posicion));
		}
		// Si la cancion introducida como parametro es nula
		if (cancion == null) {
			throw new IllegalArgumentException(String.format("La cancion introducida es nula.\n"));
		}
		this.listaCanciones[(posicion - 1)] = cancion;
	}

	// Añade una cancion en el primer hueco donde no haya cancion
	public void agrega(Cancion cancion) throws IllegalArgumentException {
		// Si la cancion introducida como parametro es nula
		if (cancion == null) {
			throw new IllegalArgumentException(String.format("La cancion introducida es nula.\n"));
		}
		int usado = 0;
		for (int i = 0; i < this.listaCanciones.length; i++) {
			if (listaCanciones[i] == null && usado == 0) {
				listaCanciones[i] = cancion;
				usado = 1;
			}
		}
		contadorCanciones++;
	}

	// Devuelve un objeto cd con los parametros del objeto que emplea el metodo
	public CD copia() {
		Cancion[] listaCopia = new Cancion[listaCanciones.length];
		for (int i = 0; i < this.listaCanciones.length; i++) {
			if (listaCanciones[i] != null) {
				listaCopia[i] = listaCanciones[i];
			}
		}
		int contadorCopia = contadorCanciones;
		CD copia = new CD(listaCopia, contadorCopia);
		numeroCDsCreados++;
		return copia;
	}

	// Metodo toStringn adaptado a esta clase
	public String toString() {
		String cad1 = String.format("%s\n", "Informacion del CD");
		String cad2 = "";
		String cad3;
		boolean vacio = true;
		for (int i = 0; i < this.listaCanciones.length; i++) {
			if (this.listaCanciones[i] != null) {
				String aux = String.format("{CANCION Nº%d\tTITULO: %s\tAUTOR: %s}\n", (i + 1),
						this.listaCanciones[i].dameTitulo(), this.listaCanciones[i].dameAutor());
				cad2 = String.format("%s%s", cad2, aux);
				vacio = false;
			}
		}
		if (vacio == false) {
			cad3 = String.format("%s%s", cad1, cad2);
		} else {
			cad3 = String.format("%s%s", cad1, "El disco esta vacio");
		}
		String resultado = String.format(
				"%s\nNumero de canciones en el disco: %d\nNumero de canciones máximas por disco: %d", cad3,
				this.contadorCanciones, this.CANCIONES_MAXIMAS_DISCO);

		return resultado;
	}
}
