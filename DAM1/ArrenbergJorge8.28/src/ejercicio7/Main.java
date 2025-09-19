package ejercicio7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		HashMap<String, Integer> mes = new HashMap<String, Integer>();
		Venta.menu(teclado, mes);
	}
}
