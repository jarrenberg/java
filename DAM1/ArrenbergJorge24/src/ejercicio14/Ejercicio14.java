package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int restoBilletes500 = 0, restoBilletes200 = 0, restoBilletes100 = 0, restoBilletes50 = 0, restoBilletes20 = 0,
				restoBilletes10 = 0, numBilletes500 = 0, numBilletes200 = 0, numBilletes100 = 0, numBilletes50 = 0,
				numBilletes20 = 0, numBilletes10 = 0, numBilletes5 = 0, operacion;

		System.out.println("Introduzca un numero multiplo de 5:");
		int num = teclado.nextInt();

		while (num % 5 != 0 || num < 5) {
			System.out.println("El numero introducido no es multiplo de 5 o es negativo, vuelva a introducir un numero");
			num = teclado.nextInt();
		}

		if (num>=5) {
			numBilletes500 = (num / 500);
			restoBilletes500 = ((num % 500));

		if (restoBilletes500 > 1) {
			numBilletes200 = restoBilletes500 / 200;
			restoBilletes200 = restoBilletes500 % 200;

		}if (restoBilletes200 > 1) {
			numBilletes100 = restoBilletes200 / 100;
			restoBilletes100 = restoBilletes200 % 100;

		}if (restoBilletes100 > 1) {
			numBilletes50 = restoBilletes100 / 50;
			restoBilletes50 = restoBilletes100 % 50;

		}if (restoBilletes50 > 1) {
			numBilletes20 = restoBilletes50 / 20;
			restoBilletes20 = restoBilletes50 % 20;

		}if (restoBilletes20 > 1) {
			numBilletes10 = restoBilletes20 / 10;
			restoBilletes10 = restoBilletes20 % 10;
		}if (restoBilletes10 > 1) {
		}
			numBilletes5 = restoBilletes10 / 5;
		}
		
		

		System.out.println("Numero de billetes de 500: "+numBilletes500);
		System.out.println("Numero de billetes de 200: "+numBilletes200);
		System.out.println("Numero de billetes de 100: "+numBilletes100);
		System.out.println("Numero de billetes de 50: "+numBilletes50);
		System.out.println("Numero de billetes de 20: "+numBilletes20);
		System.out.println("Numero de billetes de 10: "+numBilletes10);
		System.out.println("Numero de billetes de 5: "+numBilletes5);
	}

}
