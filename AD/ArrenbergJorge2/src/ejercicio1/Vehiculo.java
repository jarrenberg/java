package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private Tipo tipo;
	private double deposito;

	public Vehiculo(String matricula, String marca, String modelo, Tipo tipo, double deposito)
			throws IllegalArgumentException {
		if (!comprobarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula no cumple los requisitos.");
		}
		if (tipo != Tipo.COCHE && tipo != Tipo.FURGON && tipo != Tipo.MOTO) {
			throw new IllegalArgumentException("El tipo no cumple los requisitos.");
		}
		if (deposito < 0 || deposito > 200) {
			throw new IllegalArgumentException("El tamaño de deposito no es valido");
		}
		this.matricula = matricula;
		this.marca = marca;
		this.deposito = deposito;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public double getDeposito() {
		return deposito;
	}

	private boolean comprobarMatricula(String matricula) {
		boolean resultado;
		if (!matricula.matches("^\\d{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$")) {
			resultado = false;
		} else {
			resultado = true;
		}
		return resultado;
	}

	public boolean grabar(File f) {
		boolean resultado = false;
		try (FileWriter fw = new FileWriter(f, true)) {
			fw.write(String.format("%s\n", this.toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultado;

	}
	
	// Metodo que devuelve una lista con los objetos vehiculos introducidos en el documento indicado por parametro
		public static ArrayList<Vehiculo> listar(File f) {
			ArrayList<Vehiculo> resultado = new ArrayList<>(); // Creamos la lista que vamos a utilizar
			try (Scanner sc = new Scanner(f)) {
				while (sc.hasNext()) { // Mientras siga habiendo lineas para escanear, dividimos la linea en los
										// apartados divididos por comas y creamos un objeto vehiculo con dicha
										// informacion que añadimos a la lista
					String[] t = sc.nextLine().split(",");
					try {
						resultado.add(new Vehiculo(t[0], t[1], t[2], Tipo.valueOf(t[3]), Integer.valueOf(t[4])));
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			}
			// Devolvemos la lista con los objetos introducidos
			return resultado;
		}

		// Metodo que devuelve true si se ha encontrado la matricula introducida como
		// parametro en el archivo introducido como parametro y false en caso de que no
		// sea asi
		public static boolean buscar(String matricula, File f) {
			boolean resultado = false;
			try (Scanner sc = new Scanner(f)) {
				while (sc.hasNext()) {// Mientras siga habiendo lineas para escanear,cogemos las primeras 7 letras de
										// cada linea (que sabemos que es la matricula) y comprobamos si es la misma que
										// la matricula introducida como parametro
					String t = sc.nextLine().substring(0, 7);
					if (t.equals(matricula)) {
						resultado = true;
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			}
			// Devolvemos el resultado de si ha habido coincidencia o no
			return resultado;
		}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%.2f", matricula, marca, modelo, tipo, deposito);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

}
