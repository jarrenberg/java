package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 1;
		int contadorNeg = 0;
		String afirmaNeg;
		do {
			System.out.println("Introduzca un numero:");
			int num = teclado.nextInt();
			if (num<0){
				contadorNeg=contadorNeg+1;
			}
			contador++;
			while (num == 0) {
				System.out.println("Introduzca un numero no nulo:");
				num = teclado.nextInt();
				if (num<0){
					contadorNeg=contadorNeg+1;
				}
			}
		} while (contador < 101);
		if(contadorNeg>0) {
			afirmaNeg="Si.";
		}else {
			afirmaNeg="No.";
		}
		System.out.println("¿Se han introducido numeros negativo?: " +afirmaNeg);
	}
}
