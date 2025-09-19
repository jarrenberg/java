/*
 * Ejmplos de usuo de la clase cancion
 * Jorge Arrenberg 01/02/2025
 */

package ejercicio1;

public class Main {
	public static void main(String[] args) {

		// 1. Crear una canción sin título y sin autor
		System.out.println("1. Crear una canción sin título y sin autor");
		Cancion cancion1;
		try {
			cancion1 = new Cancion("", "");
			System.out.println("Cancion creada con exito");
		} catch (IllegalArgumentException ex1) {
			cancion1 = new Cancion();
			System.out.printf("Error. %s.Creando cancion por defecto.\n", ex1.getMessage());
		}
		System.out.println();
		// 2. Crear una canción con los valores por defecto.
		System.out.println("2. Crear una canción con los valores por defecto.");
		Cancion cancion2;
		try {
			cancion2 = new Cancion();
			System.out.println("Cancion creada con exito");
		} catch (IllegalArgumentException ex1) {
			cancion2 = new Cancion();
			System.out.printf("Error. %s.Creando cancion por defecto.\n", ex1.getMessage());
		}
		System.out.println("");
		// 3. Modificar el título de la canción anterior con y sin contenido.
		System.out.println("3. Modificar el título de la canción anterior con y sin contenido.");
		try {
			cancion2.ponTitulo("");
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s.Creando cancion por defecto.\n", ex1.getMessage());
		}

		try {
			cancion2.ponTitulo("Numa Numa Ye");
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}
		System.out.println("");
		// 4. Clonar la canción anterior
		System.out.println("4. Clonar la canción anterior");
		cancion2.clonar();
		System.out.println("");
		// 5. Crear una variable de referencia a la canción clonada.
		System.out.println("5. Crear una variable de referencia a la canción clonada.");
		Cancion cancion3;
		try {
			cancion3 = cancion2.clonar();
			System.out.println("Cancion clonada con exito");
		} catch (NullPointerException ex1) {
			cancion3 = new Cancion();
			System.out.printf("Error. %s.Creando cancion por defecto.\n", ex1.getMessage());
		}
		System.out.println("");
		// 6. Modificar el autor de la canción clonada usando la variable de referencia
		// creada en el apartado anterior
		System.out.println(
				"6. Modificar el autor de la canción clonada usando la variable de referencia creada en el apartado anterior");
		try {
			cancion3.ponAutor("Ben Yart");
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}
		System.out.println("");
		// 7. Mostrar La información de todas las canciones.
		System.out.println("7. Mostrar La información de todas las canciones.");
		System.out.println(cancion1.toString());
		System.out.println(cancion2.toString());
		System.out.println(cancion3.toString());

	}
}
