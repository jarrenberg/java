package es.pildoras.pruebas.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		ComercialExperimentado juan = contexto.getBean("comercialExperimentado", ComercialExperimentado.class);
		System.out.println(juan.getInforme());
		System.out.println(juan.getTareas());
		contexto.close();

	}

}
