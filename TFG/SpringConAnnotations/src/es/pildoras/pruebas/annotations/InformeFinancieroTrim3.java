package es.pildoras.pruebas.annotations;

import org.springframework.stereotype.Component;

@Component("informeFinancieroTrim3")
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {
	@Override
	public String getInformeFinanciero() {
		return "Creacion de informe favorable del trimestre 3";
	}

}
