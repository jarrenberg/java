package es.pildoras.pruebas.annotations;

import org.springframework.stereotype.Component;

@Component("informeFinancieroDptCompras")
public class InformeFinancieroDptCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe Financiero del Departamento de Comparas año 2025";
	}

}
