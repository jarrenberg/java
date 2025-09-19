package ejemploFor;

import java.util.Scanner;

public class EjemploFor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double suma = 0;
		
		for (int i=0; i<10;i++) {
			System.out.println("introduzca un numero:");
			double num = teclado.nextDouble();
			suma = suma+num;
			
			
		}System.out.println(suma);
	}

}
