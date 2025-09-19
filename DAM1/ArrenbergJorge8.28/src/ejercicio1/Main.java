package ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		System.out.println("Generando atletas ...");
		HashSet<Atleta> deportistas = generarAtletas(10);
		try {
			deportistas.add(new Atleta("Jorge", 20, 2));
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		System.out.println();

		// Mostrar el promedio de edades y tallas
		System.out.println("Mostrando el promedio de edades y tallas");
		System.out.printf("La media de edad es %.2f y la media de talla es %.2f\n", mediaEdad(deportistas),
				mediaAltura(deportistas));
		System.out.println();

		// Mostrar el numero de atletas mayores y menores de edad
		System.out.println("Mostrando el numero de atletas mayores y menores de edad");
		System.out.println(numAtletasEdadLegal(deportistas));

		// Nombres de los atletas mas altos que la media
		System.out.println("Nombres de los atletas mas altos que la media");
		System.out.println(nombreAtletasMasAltosQueLaMedia(deportistas).toString());
	}

	public static HashSet<Atleta> generarAtletas(int cantidad) {
		HashSet<Atleta> resultado = new HashSet<Atleta>();
		for (int i = 0; i < cantidad; i++) {
			try {
				resultado.add(new Atleta(String.format("Nombre %d", (i + 1)), (cantidad + i), (1.88)));
			} catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			} catch (NullPointerException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}
		}
		return resultado;
	}

	// Devuelve la media de edad de todos los atletas
	public static double mediaEdad(HashSet<Atleta> deportistas) {
		double media;
		int totalAtletas = deportistas.size(), totalEdades = 0;
		for (Atleta a : deportistas) {
			totalEdades = a.getEdad() + totalEdades;
		}
		media = totalEdades / totalAtletas;
		return media;
	}

	// Devuelve la media de altura de todos los atletas
	public static double mediaAltura(HashSet<Atleta> deportistas) {
		double media, totalAlturas = 0;
		int totalAtletas = deportistas.size();
		for (Atleta a : deportistas) {
			totalAlturas = a.getAltura() + totalAlturas;
		}
		media = totalAlturas / totalAtletas;
		return media;
	}

	// Devuelve una cadenad de texto que indica el numero de atletas mayores y
	// menores de edad
	public static String numAtletasEdadLegal(HashSet<Atleta> deportistas) {
		int contadorMenores = 0, contadorMayores = 0;
		for (Atleta a : deportistas) {
			if (a.getEdad() < 18) {
				contadorMenores++;
			} else {
				contadorMayores++;
			}
		}
		return String.format("Hay %d atletas menores de edad y %d atletas mayores de edad.\n", contadorMenores,
				contadorMayores);
	}

	// Devuelve una lista con los nombres delos atletas mas altos que la media
	public static ArrayList nombreAtletasMasAltosQueLaMedia(HashSet<Atleta> deportistas) {
		ArrayList<String> nombres = new ArrayList();
		double alturaMedia = mediaAltura(deportistas);
		for (Atleta a : deportistas) {
			if (a.getAltura() > alturaMedia) {
				nombres.add(a.getNombre());
			}
		}
		return nombres;
	}
}
