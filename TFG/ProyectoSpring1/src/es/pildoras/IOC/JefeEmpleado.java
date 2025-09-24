package es.pildoras.IOC;

public class JefeEmpleado implements Empleado {

	// Creacion de campo tipo creacionInforme
	private CreacionInformes informeNuevo;

	// Creacion de constructor que inyecta la dependencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getAreas() {
		return "Gestiono las cuestiones relativas a mis empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Return informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}
