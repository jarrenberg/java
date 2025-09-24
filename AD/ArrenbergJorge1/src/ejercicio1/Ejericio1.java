package ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejericio1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/dam2/Documents/proyectosEclipse/AD/ArrenbergJorge1/src/nombres.txt");

		String nombre = null;
		ArrayList<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un nombre:");
			nombre = sc.nextLine();
			if (!nombre.equals("fin")) {
				lista.add(nombre);
			}

		} while (!nombre.equals("fin"));
		sc.close();

		try (FileWriter fw = new FileWriter(f)) {
			for (String n : lista) {
				fw.write(String.format("%s\n", n));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
