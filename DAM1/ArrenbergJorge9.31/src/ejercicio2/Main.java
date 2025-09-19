package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		File f ;
		f= new File ("diccionario.txt");
		muestraInfoRuta(f,true);

	}

	public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
		if (!info) {
			if (!ruta.exists() && !ruta.toString().isEmpty()) {
				throw new FileNotFoundException("No existe el directorio o el archivo que has introducido");
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
		} else {
			muestraInfoRuta(ruta,false);
			System.out.printf("Tamaño de bytes: %d B ",ruta.length());
		}
	}
}
