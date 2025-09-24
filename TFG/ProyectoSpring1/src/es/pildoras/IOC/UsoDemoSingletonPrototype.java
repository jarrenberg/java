package es.pildoras.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// Carga de XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Peticion de beans al contenedor Spring
		SecretarioEmpleado juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado marta = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado luis = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado carlos = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(juan);
		System.out.println(pedro);
		System.out.println(marta);
		System.out.println(luis);
		System.out.println(carlos);
		
		if(juan.equals(pedro)) {
			System.out.println("Son los mismos");
		}else {
			System.out.println("No son los mismos");
		}
		
		
		contexto.close();

	}

}
