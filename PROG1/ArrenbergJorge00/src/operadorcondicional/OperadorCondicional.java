package operadorcondicional;

import java.util.Scanner;

public class OperadorCondicional {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos años tienes?");
		int edad = teclado.nextInt();
		int edadJubilacion = 65;
		
		int resta = (edad<edadJubilacion)? edadJubilacion-edad: edad; 
		
		String jubilado = (edad>=65)? "Usted está jubilado":"Usted todavía no esta jubilado, le quedan " + resta + " años para jubilarse";
		System.out.println(jubilado);
	}

}
