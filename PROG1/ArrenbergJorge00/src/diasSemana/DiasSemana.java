package diasSemana;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el numero del día de la semana");
		int diaSemana = teclado.nextInt();

		if (diaSemana <= 0) {
			System.out.println("Los días de la semana van del 1 al 7");
		}
		if (diaSemana > 7) {
			System.out.println("Los días de la semana van del 1 al 7");
		}
		switch (diaSemana) {
		case 1:
			System.out.println("Hoy es lunes");
			break;
		case 2:
			System.out.println("Hoy es martes");
			break;
		case 3:
			System.out.println("Hoy es miercoles");
			break;
		case 4:
			System.out.println("Hoy es jueves");
			break;
		case 5:
			System.out.println("Hoy es viernes");
			break;
		case 6:
			System.out.println("Hoy es sabado");
			break;
		case 7:
			System.out.println("Hoy es domingo");
			break;

		}
	}
}
