package es.pildoras.pruebas.annotations;

import org.springframework.stereotype.Component;

@Component("informeFinancieroTrim1")
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Creacion de informe financiero del trimestre uno";
	}
}
