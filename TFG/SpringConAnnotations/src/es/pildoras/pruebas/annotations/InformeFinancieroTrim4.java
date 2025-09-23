package es.pildoras.pruebas.annotations;

import org.springframework.stereotype.Component;

@Component("informeFinancieroTrim4")
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Creacion informe cierre del año";
	}

}
