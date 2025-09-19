/*
 * Creacion de la clase ciudadano, sus atributos, metodos y constructores
 * Jorge Arrenberg 17/02/2025
 */
package ejercicio1;

public class Ciudadano extends Humano {
	protected String documento;

	public Ciudadano(String nombre, String apellido, String documento)
			throws NullPointerException, IllegalArgumentException {
		super(nombre, apellido);
		setDocumento(documento);
	}

	public void setDocumento(String documento) {
		if (documento == null) {
			throw new NullPointerException("El documento no puede ser nulo.");
		}
		if (documento.equals("") || documento.equals(" ")) {
			throw new IllegalArgumentException("El documento no puede estar vacio");
		}
		this.documento = documento;
	}

	public String getDocumento() {
		return this.documento;
	}

	@Override
	public String getNombreCompleto() {
		String resultado = String.format("%s con documento %s", super.getNombreCompleto(), documento);
		return resultado;
	}
}
