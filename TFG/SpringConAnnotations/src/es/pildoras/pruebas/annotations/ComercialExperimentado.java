package es.pildoras.pruebas.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
/*
 * @Scope("prototype") // Permite cambiar entre el modelo singleton (todos los
 * objetos son el mismo) y // prototyp(son distintos objetos con los mismos
 * valores)
 */
public class ComercialExperimentado implements Empleado, InitializingBean, DisposableBean {

	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero nuevoInforme;

	/*
	 * No funciona a partir de JAVA 9
	 * 
	 * // Ejecucion de codigo despues de la creacion del bean
	 * 
	 * @PostConstruct public void ejecutarTrasCreacion() {
	 * System.out.println("Ejecutado tras la creacion del bean"); }
	 * 
	 * // Creacion del codigo antes de la destruccion del bean
	 * 
	 * @PreDestroy public void ejectuarAntesDestruccion() {
	 * System.out.println("Ejecutado antes de la destruccion del bean"); }
	 */

	/*
	 * //Usar Autowired siempre
	 * 
	 * @Autowired public ComercialExperimentado(CreacionInformeFinanciero
	 * nuevoInforme) { this.nuevoInforme = nuevoInforme; }
	 */

	/*
	 * @Autowired public void setNuevoInforme(CreacionInformeFinanciero
	 * nuevoInforme) { this.nuevoInforme = nuevoInforme; }
	 */

	@Override
	public String getTareas() {
		return "Vender,vender y vender mas";
	}

	@Override
	public String getInforme() {
		// return "Esto es un informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

	// Creacion del codigo antes de la destruccion del bean
	// Sustituye a la etiqueta @PreDestroy (se sustituye importando la interfaz
	// DisposableBean)
	// Es un metodo void sin parametros
	@Override
	public void destroy() throws Exception {
		// System.out.println("Ejecutado antes de la destruccion del bean");
	}

	// Ejecucion de codigo despues de la creacion del bean
	// Sustituye a la etiqueta @PostConstruction (se sustituye importando la
	// interfaz InitializingBean)
	// Es un metodo void sin parametros
	@Override
	public void afterPropertiesSet() throws Exception {
		// System.out.println("Ejecutado tras la creacion del bean");

	}

}
