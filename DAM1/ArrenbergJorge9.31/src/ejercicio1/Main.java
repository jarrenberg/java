package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombreDirectorio = null;
		File f1 = null;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca el nombre de la ruta. Para salir del program aintroduzca la tecal ENTER");
			nombreDirectorio = teclado.nextLine();
			try {
				f1 = new File(nombreDirectorio);
				muestraInfoRuta(f1);
			} catch (NullPointerException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}catch (FileNotFoundException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}

		} while (!nombreDirectorio.isEmpty());
		System.out.println("Saliendo del programa ...");
	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
		if (!ruta.exists()&& !ruta.toString().isEmpty() ){
			throw new FileNotFoundException ("No existe el directorio o el archivo que has introducido");
		}
		boolean archivo = false, directorio = false;
		try {
			archivo = ruta.isFile();
		} catch (SecurityException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		try {
			directorio = ruta.isDirectory();
		} catch (SecurityException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		if (archivo) {
			System.out.println("La cadena introducida es un archivo y su nombre es: [A] " + ruta.toString());
		}
		if (directorio) {
			System.out.println("La cadena introducida es un directorio y su nombre es: [*] " + ruta.toString());
		}
		if (!archivo && !directorio && !ruta.toString().isEmpty()) {
			System.out.printf("La cadena introducida no corresponde ni a un archivo ni a un directorio\n\n");
		}
	}

}
