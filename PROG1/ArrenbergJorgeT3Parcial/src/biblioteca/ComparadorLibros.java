package biblioteca;

import java.util.Comparator;

public class ComparadorLibros implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		int comparacion = o2.getId().compareTo(o1.getId());
		return comparacion;
	}

}
