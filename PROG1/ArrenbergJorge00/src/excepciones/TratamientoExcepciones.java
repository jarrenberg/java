package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamientoExcepciones {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean correcto = true;
		int numero=pedirEntero(teclado, "Dame un numero:");
		System.out.println("El numero ingresado es " +numero);
		teclado.close();
	}
	
	//Este codigo sirve cada vez que necesite recibir un entero
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