package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		boolean encaja, encaja2;
		Scanner teclado = new Scanner (System.in);
		Pattern telefono = Pattern.compile("[679][0-9]{8}");
		Matcher matcher, matcher2;
		Pattern numDNI = Pattern.compile("[0-9]{8}[A-Z]");
		
		System.out.println("Introduzca su DNI:");
		String dni = teclado.nextLine();
		matcher = numDNI.matcher(dni);
		encaja=matcher.matches();
		if(encaja) {
			System.out.println("El dni es correcto");
		}else {
			System.out.println("El dni no es correcto");
		}
		
		System.out.println("Introduzca su numero de telefono:");
		String numTelefono = teclado.nextLine();
		matcher2 = telefono.matcher(numTelefono);
		encaja2 = matcher2.matches();
		if(encaja2) {
			System.out.println("El telefono es correcto");
		}else {
			System.out.println("El telefono no es correcto");
		}
	}

}
