package cadenadecaracteres;
//programa para pedir nombre. calcular nº de caracteres del nombre, letra por la que empieza, letra por la que acaba//
import java.util.Scanner;

public class CadenadeCaracteres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.nextLine();
		
		int numletras = nombre.length();
		char primletra = nombre.charAt(0);
		char ultimaletra = nombre.charAt(numletras - 1);
		
		int letramitad = (numletras/2);
		char letramedia=nombre.charAt(letramitad);
		
		
		System.out.println("Usted se llama " + nombre +" y su nombre tiene " +numletras+ " letras y la primera letra es " +primletra+ " y la ultima es " +ultimaletra);
		System.out.println("La letra de en medio del nombre es " +letramedia);
	}

}
