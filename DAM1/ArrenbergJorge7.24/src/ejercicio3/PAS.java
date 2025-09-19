package ejercicio3;

import java.time.LocalDate;

public class PAS extends Personal{
	private boolean aleman;
	private boolean chino;
	private boolean ingles;
	private int areaAtencion;
	
	
	public PAS(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, double salario,
			String telefono, String email, char genero, boolean aleman,boolean chino,boolean ingles,int areaAtencion) {
		super(dni, nombre, apellidos, fechaNacimiento, salario, telefono, email, genero);
		if(areaAtencion<0||areaAtencion>10) {
			throw new IllegalArgumentException("El area de atencion esta entre 0 y 10");
		}
		this.aleman=aleman;
		this.chino=chino;
		this.ingles=ingles;
		this.areaAtencion=areaAtencion;
	}
	
	@Override
	public String toString() {
		String aleman;
		if(this.aleman) {
			aleman="Si";
		}else {
			aleman="No";
		}
		String chino;
		if(this.chino) {
			chino="Si";
		}else {
			chino="No";
		}
		String ingles;
		if(this.ingles) {
			ingles="Si";
		}else {
			ingles="No";
		}
		String resultado = String.format("%s, ALEMAN: %s, CHINO: %s, INGLES: %s, AREA DE ATENCION: %d", super.toString(),aleman,chino,ingles,areaAtencion);
		return resultado;
		
		
		
	}
	
	public int numIdiomas() {
		int numIdiomas=0;
		if(aleman) {
			numIdiomas++;
		}
		if(ingles) {
			numIdiomas++;
		}
		if(chino) {
			numIdiomas++;
		}
		return numIdiomas;
	}
	
	public void cambioIdioma(String idioma) {
		if(idioma.equals("aleman")) {
			if(aleman) {
				aleman=false;
			}else {
				aleman=true;
			}
		}if(idioma.equals("chino")) {
			if(chino) {
				chino=false;
			}else {
				chino=true;
			}
		}
		if(idioma.equals("ingles")) {
			if(ingles) {
				ingles=false;
			}else {
				ingles=true;
			}
		}
		
	}
}
