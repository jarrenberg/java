/*
 * Clase que pone a prueba los metodos y constructores de la clase Libro y sus clases hijas LibroFisico y LibroDigital
 * Tambien se emplean Colecciones para almacenar los objetos creados
 * Jorge Arrenberg 01/04/2025
 */
package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class PrincipalBiblioteca {

	public static void main(String[] args) {

		// 1. Crea un libro digital con 3.5 Mb de tamaño y formato PDF
		System.out.println("==== 1 =====");
		LibroDigital d1;
		try {
			d1 = new LibroDigital("pdf", 3.5);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			d1 = new LibroDigital(LibroDigital.FORMATO_DEFAULT, LibroDigital.TAMANYO_DEFAULT);
		}

		System.out.println(d1.toString());
		System.out.println();

		// 2. Modifica la fecha de publicación a 20/12/2030.
		System.out.println("==== 2 =====");
		try {
			d1.setFechaPublicacion(LocalDate.of(2030, 12, 20));
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.println(d1.toString());
		System.out.println();
		// 3. Crea un libro físico con 350 páginas y tapa dura. Los demás valores por
		// defecto.
		System.out.println("==== 3 =====");
		LibroFisico f1;
		try {
			f1 = new LibroFisico("Dura", 350);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
			f1 = new LibroFisico(LibroFisico.TAPA_DEFAULT, LibroFisico.NUMERO_PAGINAS_DEFAULT);
		}
		System.out.println(f1.toString());
		System.out.println();
		// 4. Crea 20 libros físicos con número aleatorio de páginas entre -150 y 150
		// páginas y agrégalos a una colección que controle los duplicados a través del
		// identificador.
		System.out.println("==== 4 =====");
		HashSet<Libro> contenedor = new HashSet<>();
		int contador = 0;
		LibroFisico fisico1 = null;
		while (contador < 20) {
			try {
				fisico1 = null;
				System.out.println("Creando libro ...");
				fisico1 = new LibroFisico(LibroFisico.TAPA_DEFAULT, numAleatorio(150, -150));
				System.out.println("Libro creado con exito ...");
				System.out.println();
			} catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
				System.out.println();
			}
			if (fisico1 != null) {
				if (contenedor.add(fisico1)) {
					contador++;
				}
			}
		}
		System.out.println();
		System.out.println(contenedor);

		// 5. Crea 10 libros digitales con valores por defecto y agrégalos a la
		// colección anterior.
		System.out.println("==== 5 =====");
		LibroDigital digital1;
		for (int i = 0; i < 10; i++) {
			try {
				digital1 = new LibroDigital();
			} catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
				digital1 = new LibroDigital();
			}
			contenedor.add(digital1);
		}
		System.out.printf("Elementos de la coleccion: %d\n", contenedor.size());
		System.out.println(contenedor.toString());

		// 6. Calcula el precio de cada uno de los libros de la colección.
		System.out.println("==== 6 =====");
		for (Libro libro : contenedor) {
			System.out.printf("Precio: %.2f€ %s", libro.getPrecio(), libro.toString());
		}
		System.out.println();
		// 7. Indica la cantidad de libros que están en la colección y el importe total
		// de todos los libros.
		System.out.println("==== 7 =====");
		double precioTotal = 0;
		for (Libro libro : contenedor) {
			precioTotal = precioTotal + libro.getPrecio();
		}

		System.out.printf("El total de elementos en la coleccion es %d y su precio total es %.2f€\n\n",
				contenedor.size(), precioTotal);

		// 8. Ordena los libros por identificador descendiente
		System.out.println("==== 8 =====");
		ArrayList<Libro> listaLibros = new ArrayList<>(contenedor);
		Collections.sort(listaLibros, new ComparadorLibros());
		System.out.println(listaLibros.toString());

		// 9. Elimina los tres primeros libros con precio por debajo de 5€.
		System.out.println("==== 9 =====");
		int contadorEliminados = 0;
		for (Iterator iterator = contenedor.iterator(); iterator.hasNext();) {
			Libro libro = (Libro) iterator.next();
			if (libro.getPrecio() < 5 && contadorEliminados < 3) {
				System.out.printf("Libro a eliminar: %.2f %s\n", libro.getPrecio(), libro.toString());
				iterator.remove();
				contadorEliminados++;
			}
		}
		System.out.printf("Elementos de la coleccion: %d\n", contenedor.size());
		System.out.println();
		// 10. Crea un libro digital con los siguientes valores usando un
		// pseudoconstructor.
		System.out.println("==== 10 =====");

		LibroDigital pseudo = LibroDigital.crearLibro("El quijote", "Miguel de Cervantes", LocalDate.of(1605, 1, 1),
				"Novela", true, 8.5, "epub");
		System.out.println(pseudo.toString());

		// 11.Calcula el número de años transcurridos desde la fecha de publicación del
		// libro "El quijote".
		System.out.println("==== 11 =====");
		System.out.printf("Han transcurrido %d años desde la publicacion del libro 'El quijote'\n",
				pseudo.anyosDesdePublicacion());
	}

	public static int numAleatorio(int max, int min) {
		int num = (int) ((Math.random() * (max) + (Math.random() * (min))));
		return num;
	}
}
