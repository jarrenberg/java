/*
 * Clase main en donde se ponen a prueba los metodos y constructores de las clases coche y deportivo
 * Jorge Arrenberg 17/02/2025
 */
package ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		// Crearemos objetos de tipo Coche, le daremos valores válidos y no válidos. Por
		// último haremos uso del método toString.
		System.out.printf("Creando coche por defecto...\n");
		Coche coche1 = new Coche();
		System.out.println(coche1.toString());
		
		System.out.printf("\nCreando coche con valores erroneos...\n");
		Coche coche2;
		try {
			coche2 = new Coche("8764 DbD", "Juan",LocalDate.now(),2014,110);
		}catch (NullPointerException ex1) {
			System.out.printf("Error.%s\n",ex1.getMessage());
			System.out.println("Creando coche por defecto ...");
			coche2 = new Coche();
		}catch(IllegalArgumentException ex2) {
			System.out.printf("Error.%s\n",ex2.getMessage());
			System.out.println("Creando coche por defecto ...");
			coche2 = new Coche();
		}
		System.out.println(coche2.toString());
		
		System.out.println("\nCreando coche con valores validos...");
		Coche coche3;
		try {
			coche3 = new Coche("1234 DXD", "Lucas",LocalDate.now(),1589,85);
		}catch (NullPointerException ex1) {
			System.out.printf("Error.%s\n",ex1.getMessage());
			System.out.println("Creando coche por defecto ...");
			coche3 = new Coche();
		}catch(IllegalArgumentException ex2) {
			System.out.printf("Error.%s\n",ex2.getMessage());
			System.out.println("Creando coche por defecto ...");
			coche3 = new Coche();
		}
		System.out.println(coche3.toString());

		// Se creará un método obtenerDeportivo, el cual devolverá objetos de tipo
		// Deportivo solicitando al usuario la información necesaria.
		// Se mostrará información de los objetos creados de este tipo.
		System.out.printf("\nIntroduzca la traccion del deportivo:");
		String traccion = teclado.nextLine();
		Deportivo deportivo1;
		try {
			deportivo1 = new Deportivo(Coche.MATRICULA_DEFAULT,Coche.NOMBRE_PROPIETARIO_DEFAULT
					,Coche.FECHA_MATRICULACION_DEFAULT,Coche.CILINDRADA_DEFAULT,Coche.POTENCIA_DEFAULT,traccion);
		}catch(IllegalArgumentException ex1) {
			System.out.printf("Error.%s ",ex1.getMessage());
			System.out.println("Asignando traccion total ...");
			deportivo1 = new Deportivo(Coche.MATRICULA_DEFAULT,Coche.NOMBRE_PROPIETARIO_DEFAULT
					,Coche.FECHA_MATRICULACION_DEFAULT,Coche.CILINDRADA_DEFAULT,Coche.POTENCIA_DEFAULT,"total");
		}
		System.out.println(deportivo1.toString());
	}

}
