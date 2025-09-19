package ejercicio2;

import java.io.IOException;

public class EjercicioProcessBuilderPing {
	public static void main(String[] args) throws IOException, InterruptedException {
		/*String resultado = String.format("%s %s", args[0], args[1]);*/
		String resultado = "ping 192.168.10.52";
		System.out.println(resultado);
		ProcessBuilder pb = new ProcessBuilder(resultado);
		Process p1 = pb.start();
		if (p1.exitValue() == 0) {
			System.out.println("El ping ha sido exitoso");
		} else {
			System.out.printf("El ping NO ha sido exitoso, %s", resultado);
		}

	}
}
