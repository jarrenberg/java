package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
			ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
			Process p = pb.start();
			// Leer la salida del proceso usando getInputStream()
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String line;
			System.out.println("Salida del proceso:");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			int resultado = p.waitFor();
			System.out.println("El codigo de salida es: "+resultado);
			

	}
}
