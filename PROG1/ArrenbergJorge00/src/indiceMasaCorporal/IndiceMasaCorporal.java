package indiceMasaCorporal;

import java.util.Scanner;

public class IndiceMasaCorporal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float peso;
		float alturacm;
		double alturam;
		do {
			System.out.println("Introduzca su peso en KG:");
			peso = teclado.nextFloat();

			System.out.println("Introduzca su altura en M:");
			alturacm = teclado.nextFloat();

			if (peso != 0 && alturacm != 0) {
				alturam = alturacm / 100;
				double imc = (peso / (Math.pow(alturam, 2)));
				System.out.println("Su indice de masa corporal es:" + imc);

				if (imc < 16) {
					System.out.println("Critero de ingerso en hospital");
				} else if (imc < 17) {
					System.out.println("Infrapeso");
				} else if (imc < 18) {
					System.out.println("Bajo peso");
				} else if (imc < 25) {
					System.out.println("Saludable");
				} else if (imc < 30) {
					System.out.println("Sobrepeso (obesidad de grado I)");
				} else if (imc < 35) {
					System.out.println("Sobrepeso crónico (obesidad de grado II)");
				} else if (imc < 40) {
					System.out.println("Obesidad premórbida (obesidad de grado III");
				} else {
					System.out.println("Obesidad mórbida (obesidad de grado IV)");
				}
			}
		} while (peso != 0 && alturacm != 0);

	}

}
