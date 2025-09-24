package es.pildoras.pruebas.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleado {

	@Autowired
	@Qualifier("informeFinancieroDptCompras")
	private CreacionInformeFinanciero informe;
	@Value("${email}")
	private String email;
	@Value("${nombre}")
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		return "Se encarga de la gestion y direccion de las opereaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		return informe.getInformeFinanciero();
	}

}
