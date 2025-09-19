package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca su primera apellido:");
		String apellido1 = teclado.nextLine();
		
		System.out.println("Introduzca su dia de nacimiento:");
		int dia = teclado.nextInt();
		
		System.out.println("Introduzca su mes de nacimiento:");
		int mes = teclado.nextInt();
			
		
		System.out.println("Introduzca su año de nacimiento (en formato AAAA):");
		int anno = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduzca su genero (M/F):");
		String genero = teclado.nextLine();

		int num= anno%100 ;
		
		int numletras = nombre.length();
		char ultimaletranombre = nombre.charAt(numletras - 1);
		
		int numletrasapellido= apellido1.length();
		char letraapellido1 = apellido1.charAt(numletrasapellido-1);
		char letraapellido2 = apellido1.charAt(numletrasapellido-2);
		char letraapellido3 = apellido1.charAt(numletrasapellido-3);
		
		System.out.println("Su identificador de usuario es:");
		System.out.println("----------------------------------");
		System.out.println(num+genero+ultimaletranombre+letraapellido3+letraapellido2+letraapellido1);
	}

}
