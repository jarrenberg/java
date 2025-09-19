package ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Alumno> clase = new ArrayList<>();
		clase.add(new Alumno("Jorge",3));
		clase.add(new Alumno("Raquel",5));
		clase.add(new Alumno("Antonio",6));
		clase.add(new Alumno("Antonio",5));
		clase.sort((n1, n2) -> {
			double num = 0;
			num = n1.getNombre().compareTo(n2.getNombre());
			if (num == 0) {
			num = n1.getEdad().compareTo(n2.getEdad());
			}
			return (int) num;
		});
		for (Alumno alumno : clase) {
			System.out.println(alumno.toString());
		}
	}

}
