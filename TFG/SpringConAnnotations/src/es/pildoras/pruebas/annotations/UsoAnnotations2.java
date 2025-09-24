package es.pildoras.pruebas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		/*
		 * Usar este codigo si usamos XML en vez de clase de configuracion
		 * ClassPathXmlApplicationContext contexto = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 */

		// Usando clase de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		/*
		 * ComercialExperimentado juan = contexto.getBean("comercialExperimentado",
		 * ComercialExperimentado.class); ComercialExperimentado marta =
		 * contexto.getBean("comercialExperimentado", ComercialExperimentado.class);
		 * 
		 * if (juan.equals(marta)) {
		 * System.out.println("Apuntan al mismo lugar de la memoria"); } else {
		 * System.out.println("No apuntan al mismo lugar de la memoria"); }
		 */

		DirectorFinanciero juan = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println(juan.getEmail());
		System.out.println(juan.getNombreEmpresa());
		
		contexto.close();
	}
}
