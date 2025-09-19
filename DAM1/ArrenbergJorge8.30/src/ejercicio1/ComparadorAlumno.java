package ejercicio1;

import java.util.Comparator;

public class ComparadorAlumno implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o, Alumno o1) {
		int comparacion = o.getGrupo().compareTo(o1.getGrupo());
		if (comparacion == 0) {
			comparacion = o.getNombre().compareTo(o1.getNombre());
		}
		return comparacion;
	}

}
