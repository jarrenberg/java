package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// Cargar XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// Obtencion del bean
		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(juan.getInforme());
		contexto.close();
	}

}
