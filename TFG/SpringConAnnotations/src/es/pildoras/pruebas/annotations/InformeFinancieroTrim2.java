package es.pildoras.pruebas.annotations;

import org.springframework.stereotype.Component;

@Component("informeFinancieroTrim2")
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Creacion de informe catastrofico del Trimestre 2";
	}

}
