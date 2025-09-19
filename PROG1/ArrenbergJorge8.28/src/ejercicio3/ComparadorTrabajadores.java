package ejercicio3;

import java.util.Comparator;

public class ComparadorTrabajadores implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		int comparacion = o1.getSexo().compareTo(o2.getSexo());
		if (comparacion == 0) {
			comparacion = o1.getEstadoCivil().compareTo(o2.getEstadoCivil());
		}
		return comparacion;
	}

}
