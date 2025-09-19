package ejemploClaseScanner;

import java.io.File;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {

		try {
			// Intentamos abrir el fichero
			File f = new File("enteros.txt");
			Scanner lector = new Scanner(f);

			// Si llega aquí es que ha abierto el fichero :)
			while(lector.hasNext()) {
				int valor = lector.nextInt();
				System.out.println("El valor leído es: " + valor);
			}
			// ¡Hay que cerrar el fichero!
			lector.close();
		} catch (Exception e) {
			// En caso de excepción mostramos el error
			System.out.println("Error: " + e.getMessage());
		}
	}

}
