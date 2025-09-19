package expresionesRegulares2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean encaja = false;
		boolean encaja2 = false;
		boolean encaja3 = false;
		Pattern nombre = Pattern.compile("[A-Z][a-z]{8}");
		Pattern edad = Pattern.compile("[0-120]{1}");
		Pattern altura = Pattern.compile("[50-280]{1}");
		Matcher matcher;
		Matcher matcher2;
		Matcher matcher3;
		
		System.out.println("Introduce tu nombre:");
		String nombreUsuario = teclado.nextLine();
		matcher = edad.matcher(nombreUsuario);
		encaja = matcher.matches();
		if (encaja) {
			System.out.println("El nombre es correcto");
		} else {
			System.out.println("Nombre incorrecto");
		}

		System.out.println("Introduce tu edad:");
		String edadUsuario = teclado.nextLine();
		matcher2 = edad.matcher(edadUsuario);
		encaja2 = matcher2.matches();
		if (encaja2) {
			System.out.println("La edad es correcta");
		} else {
			System.out.println("Edad incorrecta");
		}

		System.out.println("Introduce tu altura:");
		String alturaUsuario = teclado.nextLine();
		matcher3 = altura.matcher(alturaUsuario);
		encaja3 = matcher3.matches();
		if (encaja3) {
			System.out.println("La altura es correcta");
		} else {
			System.out.println("Altura incorrecta");
		}

	}

}
