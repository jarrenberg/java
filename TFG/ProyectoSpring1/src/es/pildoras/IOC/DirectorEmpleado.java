package es.pildoras.IOC;

public class DirectorEmpleado implements Empleado {

	// Creacion de campo tipo creacionInforme
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;

	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	// Metodo init: permite ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init irian las tareas a ejecutar antes de que el bean este listo");
	}

	// Metodo destroy: permite ejecutar tareas despues de que el bean haya sido
	// utilizado
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy irian las tareas a ejecutar despues de utilizar el beans");
	}

	@Override
	public String getAreas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
