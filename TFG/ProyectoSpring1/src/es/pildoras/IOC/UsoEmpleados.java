package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // Creacion de objetos de tipo empleado Empleado empleado1 = new
		 * JefeEmpleado(); Empleado empleado2 = new SecretarioEmpleado(); Empleado
		 * empleado3 = new DirectorEmpleado(new Informe());
		 * 
		 * // Uso de los objetos creados System.out.println(empleado1.getAreas());
		 * System.out.println(empleado2.getAreas());
		 * System.out.println(empleado3.getAreas());
		 */

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Empleado juan = contexto.getBean("miEmpleado", Empleado.class);
		 * System.out.println(juan.getAreas()); System.out.println(juan.getInforme());
		 */

		/*
		 * Empleado maria = contexto.getBean("miSecretarioEmpleado", Empleado.class);
		 * System.out.println(maria.getAreas()); System.out.println(maria.getInforme());
		 */

		// En vez de usar la interfaz empleado, usamos la clase SecretarioEmpleado q
		// implementa dicha interfaz para poder acceder a los metodos tanto de
		// SecretarioEmpleado como de Empleado
		SecretarioEmpleado luis = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println("Email Luis: " + luis.getEmail());
		System.out.println("Empresa Luis: " + luis.getNombreEmpresa());
		DirectorEmpleado pablo = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println("Email Pablo: " + pablo.getEmail());
		System.out.println("Empresa Pablo: " +pablo.getNombreEmpresa());

		contexto.close();
	}

}
