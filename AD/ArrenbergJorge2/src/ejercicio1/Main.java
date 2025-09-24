package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creamos un ojbeto scanner para la entrada de datoss
		File f1 = new File("matriculas.txt");
		f1.delete(); // Borramos el documento por si hemos ejecutado el programa y no se guarden
						// resultados anteriores
		// Creamos el documento donde se introduciran o de donde se buscaran las
		// matriculas
		File f = new File("matriculas.txt");

		// Creamos 3 vehiculos de prueba para este ejercicio
		System.out.println("Creando 3 vehiculos de prueba para este ejercicio ...");
		Vehiculo v1 = null, v2 = null, v3 = null;
		try {
			v1 = new Vehiculo("0028LYB", "SEAT", "Ibiza", Tipo.COCHE, 50);
			System.out.println("Vehiculo creado con exito");
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}

		try {
			v2 = new Vehiculo("9983GMB", "Toyota", "Yaris", Tipo.COCHE, 40);
			System.out.println("Vehiculo creado con exito");
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}

		try {
			v3 = new Vehiculo("6250GNS", "Honda", "SH125", Tipo.MOTO, 10);
			System.out.println("Vehiculo creado con exito");
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		System.out.printf("\nGrabando la informacion de los vehiculos en un documento ...\n");
		// Utilizamos el metodo grabar para introducir la informacion de los vehiculos
		// en el documentos
		v1.grabar(f);
		v2.grabar(f);
		v3.grabar(f);

		// Le pedimos al usuario que introduzca una matricula para comprobar que esta en
		// el archivo
		System.out.printf("\nIntroduzca una matricula: ");
		String matriculaUser = guardarMatriculaUser(sc);
		boolean encontrado = Vehiculo.buscar(matriculaUser, f);

		if (encontrado) {
			System.out.println("El coche esta en la lista");
		} else {
			System.out.println("El coche no esta en la lista");
		}

		// Le pedimos al usuario que introduzca otra matricula para comprobar que esta
		// en el archivo
		System.out.printf("\nIntroduzca otra matricula: ");
		matriculaUser = guardarMatriculaUser(sc);
		encontrado = Vehiculo.buscar(matriculaUser, f);

		if (encontrado) {
			System.out.println("El coche esta en la lista");
		} else {
			System.out.println("El coche no esta en la lista");
		}

		// Creamos una lsita y guardamos los vehiculos del archivo en la lista
		System.out.printf("\nGuardando los vehiculos del archivo a una lista:\n");
		ArrayList<Vehiculo> lista = Vehiculo.listar(f);
		// Mostramos los archivos de la lista
		for (Vehiculo vehiculo : lista) {
			System.out.println(vehiculo.toString());
		}
		sc.close();// Cerramos el objeto de la clase Scanner
	}

	public static String guardarMatriculaUser(Scanner sc) {
		String resultado = null;
		try {
			resultado = sc.nextLine();
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		return resultado;
	}

}
