package es.pildoras.pruebas.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebas.annotations")
@PropertySource("classpath:datosEmpresas.propiedades")
public class EmpleadosConfig {
	// Definir el bean para informeFinancieroDptoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptCompras() { // informeFinancieroDptCompras sera el nombre del
																		// bean a inyectar
		return new InformeFinancieroDptCompras();

	}

	// Definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleado directorFinanciero() {
		return new DirectorFinanciero();

	}
}
