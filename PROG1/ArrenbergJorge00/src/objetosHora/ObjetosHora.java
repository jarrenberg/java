package objetosHora;

import java.time.Duration;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;


//Pedir horas minutos y segundos y comparar hasta la hora actual

public class ObjetosHora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		LocalTime ahora = LocalTime.now();
		
		int hora = pedirEntero(teclado, "Introduzca la hora:");
		
		int minutos = pedirEntero(teclado, "Introduzca los minutos:");
		
		int segundos = pedirEntero(teclado, "Introduzca los segundos:");
		
		LocalTime horaUsuario = LocalTime.of(hora, minutos, segundos);
		System.out.println("La hora introducida es: " +horaUsuario);
		
		Duration tiempoTranscurrido = Duration.between (ahora, horaUsuario);
		System.out.println(tiempoTranscurrido.toString());
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
