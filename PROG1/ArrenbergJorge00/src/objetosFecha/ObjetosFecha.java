package objetosFecha;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ObjetosFecha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String fecha;
		int dia,mes, anno;

		LocalDate ahora = LocalDate.now();
		System.out.println(ahora);	
	
		dia = pedirEntero(teclado,"Introduzca un dia");
		
		mes = pedirEntero(teclado, "Introduzca un mes");
	
		anno = pedirEntero(teclado, "Introduzca un año");
		
		LocalDate fechaUsuario = LocalDate.of(anno, mes, dia);
		System.out.println("La fecha introducida es: " +fechaUsuario);
	
		
		System.out.println("La diferencia entre los años es: " + Math.abs(fechaUsuario.until(ahora).getYears()));
		System.out.println("La diferencia entre los meses es: " + Math.abs(fechaUsuario.until(ahora).getMonths()));
		System.out.println("La diferencia entre los dias es: " + Math.abs(fechaUsuario.until(ahora).getDays()));
		
		

}
	public static int pedirEntero(Scanner tecla, String mensaje) {
		boolean correcto = false;
		int numero = 0;

		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextInt();
			} catch (InputMismatchException excepcion1) {
				correcto = false;
				System.out.println("Te has equivocado. Por favor, ingresa un número válido.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) {
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}
}