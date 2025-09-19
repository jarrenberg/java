package ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

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

	public boolean grabar(String nombreArchivo) {
		boolean resultado = false;
		File f = new File(nombreArchivo);
		try (FileWriter fw = new FileWriter(f, true)) {
			String matricula = this.matricula;
			fw.write(String.format("%s\n", matricula));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultado;

	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %.2f", matricula, marca, modelo, tipo, deposito);
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
