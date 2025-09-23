/*
 * Creacion de la clase Humano, sus atributos, metodos y constructores
 * Jorge Arrenberg 17/02/2025
 */
package ejercicio1;

public class Humano {
	public static final String NOMBRE_DEFAULT = "Juan";
	public static final String APELLIDO_DEFAULT = "García";
	protected String nombre;
	protected String apellido;

	public Humano(String nombre, String apellido) throws NullPointerException, IllegalArgumentException {
		setNombre(nombre);
		setApellido(apellido);
	}

	public Humano() {
		this(NOMBRE_DEFAULT, APELLIDO_DEFAULT);
	}

	public void setNombre(String nombre) throws NullPointerException, IllegalArgumentException {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo.");
		}
		if (nombre.equals("") || nombre.equals(" ")) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}
		this.nombre = nombre;
	}

	public void setApellido(String apellido) throws NullPointerException, IllegalArgumentException {
		if (apellido == null) {
			throw new NullPointerException("El apellido no puede ser nulo.");
		}
		if (apellido.equals("") || apellido.equals(" ")) {
			throw new IllegalArgumentException("El apellido no puede estar vacio");
		}
		this.apellido = apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombreCompleto() {
		String resultado = String.format("%s %s", nombre, apellido);
		return resultado;
	}

}
