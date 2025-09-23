package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Properties cfg = new Properties();
		Scanner sc = new Scanner(System.in);
		String archivo = null;
		
		
		
		do {
			System.out.println("¿Que fichero te gustaria utilizar? Introduce SQL o FTP:");

			try {
				archivo = sc.nextLine().toUpperCase();
				if (!archivo.equalsIgnoreCase("SQL") && !archivo.equalsIgnoreCase("FTP")) {
					System.out.println("Ha introducido un valor incorrecto. Vuelva a introducirlo");
				}
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			}
		} while (!archivo.equalsIgnoreCase("SQL") && !archivo.equalsIgnoreCase("FTP"));

		
		
		
		
		Set<String> props = new HashSet<>();
		System.out.printf("Los campos del archivo %s son:\n",archivo);
		
		
		
		switch (archivo) {
		case "SQL":
			try {
				props.removeAll(props);
				cfg.load(new FileInputStream("mysqld.cnf")); //Aqui haria falta introducir la 
				props.addAll(cfg.stringPropertyNames());
				System.out.println(props.toString());
				System.out.println("Introduzca el campo del cual quiere conocer su valor:");
				String campo = sc.nextLine();
				boolean encontrado = false;
				for (String s : props) {
					if (s.equalsIgnoreCase(campo)) {
						encontrado = true;
					}
				}
				if (!encontrado) {
					System.out.println("No se ha encontrado un campo con dicho nombre");
				} else {
					System.out.printf("El valor del campo %s: es %s\n", campo, cfg.getProperty(campo));
				}

			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			}

			break;

		case "FTP":

			try {
				props.removeAll(props);
				cfg.load(new FileInputStream("ftp.conf"));
				props.addAll(cfg.stringPropertyNames());
				System.out.println(props.toString());
				System.out.println("Introduzca el campo del cual quiere conocer su valor:");
				String campo = sc.nextLine();
				boolean encontrado = false;
				for (String s : props) {
					if (s.equalsIgnoreCase(campo)) {
						encontrado = true;
					}
				}
				if (!encontrado) {
					System.out.println("No se ha encontrado un campo con dicho nombre");
				} else {
					System.out.printf("El valor del campo %s es: %s\n", campo, cfg.getProperty(campo));
				}

			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			}
			break;
		}

	}

}
