package ejercicio1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException {
		try {
			ProcessBuilder pb = new ProcessBuilder(args);
			Process p = null;

			try {
				p = pb.start();
				int salida = 0;
				if (p != null) {
					try {
						salida = p.waitFor();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("El valor de salida es: " + salida);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (java.util.IllegalFormatException e) {
				e.printStackTrace();
			}

		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No se ha introducido ningun parametro.");
		}

	}
}