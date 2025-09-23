package cadenaTexto;

import java.util.Scanner;
//longitud, mayuscula, minusculas, posiciones pares en may e impares en minuscula

public class CadenaTexto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int longitud;
		char letraPar;
		char letraImpar;

		System.out.println("Introduzca una cadena de caracteres: ");
		String texto = teclado.nextLine();

		longitud = texto.length();
		System.out.println(longitud);

		String minusculas = texto.toLowerCase();
		String mayusculas = texto.toUpperCase();
		System.out.println(minusculas);
		System.out.println(mayusculas);
		


	}

}
