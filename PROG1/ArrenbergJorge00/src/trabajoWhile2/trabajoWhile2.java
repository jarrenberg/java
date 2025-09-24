package trabajoWhile2;

import java.util.Scanner;

public class trabajoWhile2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int num = teclado.nextInt();
		int cont = 0;
		
		while (cont<4) {
			System.out.println("Introduzca otro número");
			num = teclado.nextInt();
			cont++;
		}System.out.println("Aqui estan sus 5 numeros: ");
		System.out.println(num);
		
	}

}
