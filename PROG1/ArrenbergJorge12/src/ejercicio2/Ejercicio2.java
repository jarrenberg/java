package ejercicio2;
/*
 * Practica de entrada de datos por teclado y mostrarlos
 * Jorge Arrenberg 03/01/2024
 */
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cual es el equipo de fútbol?");
		String equipo = teclado.nextLine();
		
		System.out.println("¿Cual es el año de fundación?");
		int anno = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("¿Cual es el nombre del estadio?");
		String estadio = teclado.nextLine();
		
		System.out.println("¿Cual es el nombre del capitán?");
		String capitan = teclado.nextLine();
		
		
		System.out.println("************************************************");
		System.out.println("******** Nombre del Equipo: " +equipo+ "*********");
		System.out.println("******** Fundado en: " +anno+ "***********************");
		System.out.println("******** Estadio: " +estadio+ "******************");
		System.out.println("******** Capitán: " +capitan+ "***********************");
		System.out.println("************************************************");
	}

}
