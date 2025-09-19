package ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<DiaTemperatura> calendario = new ArrayList<DiaTemperatura>();
		DiaTemperatura.menu(teclado,calendario);

	}

}
