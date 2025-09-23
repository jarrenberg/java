package ejercicio9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cliente {
	public static final int MAX_TELEFONOS_PERSONA = 5;

	private String nombre;
	private String email;
	private ArrayList<String> telefonos;
	private HashMap<String, Integer> compras;

	public Cliente(String nombre, String email, ArrayList<String> telefonos)
			throws NullPointerException, IllegalArgumentException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty() || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}

		if (email == null) {
			throw new NullPointerException("El email no puede ser nulo");
		}
		if (email.isEmpty() || email.isBlank()) {
			throw new IllegalArgumentException("El email no puede estar vacio");
		}

		if (telefonos == null) {
			throw new NullPointerException("El telefono / los telefonos no puede ser nulo");
		}

		this.nombre = nombre;
		this.email = email;
		this.telefonos = telefonos;
		this.compras = new HashMap();
	}

	// Añade un telefono al cliente si no esta ya introducido
	public void addTelefono(String telefono) throws NullPointerException {
		if (telefonos == null) {
			throw new NullPointerException("El telefono no puede ser nulo");
		}
		int contador = 0;
		for (int i = 0; i < this.telefonos.size(); i++) {
			if (telefono.compareTo(telefonos.get(i)) != 0) {
				contador++;
			}
		}
		if (contador == telefonos.size()) {
			telefonos.add(telefono);
		} else {
			System.out.println("No se ha introducido el telefono introducido porque ya esta.");
		}

	}

	// Devuelve el telefono en la posicion que indica el parametro
	public String getTelefono(int index) throws ArrayIndexOutOfBoundsException{
		if (index > telefonos.size()||index<0) {
			throw new ArrayIndexOutOfBoundsException ("La posicion introducida no entra dentro de los limites");
		}
		String telefono;
		telefono = telefonos.get(index - 1);

		return telefono;
	}

	// Devuelve una lista con los numeros de telefono que contienen la cadena pasada
	// como parametro
	public ArrayList<String> buscarTelefono(String cad) {
		ArrayList<String> resultados = new ArrayList();
		for (int i = 0; i < this.telefonos.size(); i++) {
			if (telefonos.get(i).contains(cad)) {
				resultados.add(telefonos.get(i));
			}
		}
		return resultados;
	}

	// Añade un objeto a la compra o actualiza la cantidad si ya esta introducido
	public void addCompra(Integer cantidad, String producto) throws IllegalArgumentException {
		if (producto == null || producto.isEmpty()) {
			throw new IllegalArgumentException("El producto no puede ser nulo o vacío");
		}
		if (cantidad == null || cantidad <= 0) {
			throw new IllegalArgumentException("La cantidad debe ser válido y mayor que cero");
		}
		if (compras.containsValue(producto)) {
			int cantidadActual = compras.get(producto);
			compras.put(producto, cantidadActual + cantidad);
		} else {
			compras.put(producto, cantidad);
		}
	}

	// Elimina un producto
	public void eliminarProducto(String producto) throws IllegalArgumentException {
		if (producto == null || producto.isEmpty()) {
			throw new IllegalArgumentException("El producto no puede ser nulo o vacío");
		}
		if (compras.containsKey(producto)) {
			compras.remove(producto);
		} else {
			System.out.println("El producto no existe en la lista de compras.");
		}
	}

	// Devuelve un alista con los productos de cada cliente ordenados por el nomber
	// del producto
	public ArrayList<String> verProductos() {
		ArrayList<String> nombresProductos = new ArrayList<>();
		for (String producto : compras.keySet()) {
			nombresProductos.add(producto);
		}
		Collections.sort(nombresProductos);
		return nombresProductos;
	}

}
