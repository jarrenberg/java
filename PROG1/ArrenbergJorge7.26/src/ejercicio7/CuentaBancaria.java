/*
 * Clase cuenta bancaria con parametros y metodos
 * Jorge Arreberg 4/02/2024
 */
package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaBancaria {
	public static final String IBAN_DEFAULT = "ES1234567891234567891234";
	public static final String TITULAR_DEFAULT = "Carlos Sanchez";
	public static final double SALDO_DEFAULT = 0.0;
	public static final byte MAXIMO_MOVIMIENTOS = 100;
	public static final double MAXIMO_DESCUBIERTO = -50.0;
	public static final double CANTIDAD_AVISO_HACIENDA = 3000.0;

	private final String iban;
	private final String titular;

	public String movimientos;
	public byte numMovimientos;
	private double saldo;

	// Constructor con 2 parametros
	public CuentaBancaria(String iban, String titular) throws CuentaException {
		if (ibanValido(iban) == false) {
			throw new CuentaException("El formato del IBAN introducido es incorrecto.");
		}
		if (iban == null || iban == " " || iban == "") {
			throw new CuentaException("El IBAN no puede estar vacio.");
		}

		if (titular == null || titular == " " || titular == "") {
			throw new CuentaException("El titular no puede estar vacio.");
		}
		this.iban = iban;
		this.titular = titular;
		this.saldo = SALDO_DEFAULT;
		this.numMovimientos = 0;
		this.movimientos = "";

	}

	// Constructor por defecto
	public CuentaBancaria() throws CuentaException {
		this(IBAN_DEFAULT, TITULAR_DEFAULT);
	}

	// Metodo que devuele si el iban introducido es valido o no
	private boolean ibanValido(String iban) {
		boolean ibanValido = false;
		Matcher matcher;
		Pattern format = Pattern.compile("ES[0-9]{22}");
		matcher = format.matcher(iban);
		ibanValido = matcher.matches();
		return ibanValido;
	}

	// Metodo que devuelve el iban de una cuenta bancaria
	public String getIBAN() {
		return this.iban;
	}

	// Metodo que devuelve el titular de una cuenta bancaria
	public String getTitular() {
		return this.titular;
	}

	// Metodo que devuelve el saldp de una cuenta bancaria
	public double getSaldo() {
		return this.saldo;
	}

	// Metodo que devuelve los movimientos de una cuenta bancaria
	public String getMovimientos() {
		String resultado;
		if (this.movimientos == "") {
			resultado = "No ha habido movimientos";
		} else {
			resultado = this.movimientos;
		}
		return resultado;
	}

	// Metodo que ingresa una cantidad de dinero introducida como parametro
	public void ingreso(double cantidad) throws CuentaException, AvisarHaciendaException {
		if (cantidad <= 0) {
			throw new CuentaException("La cantidad a ingresar debe ser mayor que 0€\n");
		}
		if (numMovimientos > 99) {
			throw new CuentaException(
					String.format("Se ha superado el numero maximo de movimientos (%d)\n", MAXIMO_MOVIMIENTOS));
		}
		avisoHacienda(cantidad);
		saldo = saldo + cantidad;
		this.movimientos = String.format("%s\nIngreso: %.2f€\t\tSaldo Final: %.2f€\n", this.movimientos, cantidad,
				saldo);
		numMovimientos++;

	}

	// Metodo que retira una cantidad de dinero introducida como parametro
	public void retirada(double cantidad) throws CuentaException, AvisarHaciendaException {
		if (cantidad <= 0) {
			throw new CuentaException("La cantidad a retirar debe ser mayor que 0€");
		}
		if ((saldo - cantidad) < MAXIMO_DESCUBIERTO) {
			throw new CuentaException(String.format("Operacion denegada. Se excede el maximo de descubierto (%.2f€)\n",
					MAXIMO_DESCUBIERTO));
		}
		if (numMovimientos > 99) {
			throw new CuentaException(
					String.format("Se ha superado el numero maximo de movimientos (%d)", MAXIMO_MOVIMIENTOS));
		}
		avisoHacienda(cantidad);
		
		saldo = saldo - cantidad;
		movimientos = String.format("%s\nRetirada: %.2f€\t\tSaldo Final: %.2f€\n", this.movimientos, cantidad,
				saldo);
		numMovimientos++;
	}

	// Metodo que muestra por pantala cuando el saldo es negativo
	public void avisoNegativo() {
		System.out.println("AVISO: SALDO NEGATIVO");
	}

	// Metodo que muestra por pantala cuando hay que avisar a hacienda si la
	// cantidad introducida como parametro es mayor a 3000
	public void avisoHacienda(double cantidad) throws AvisarHaciendaException{
		if (cantidad > CANTIDAD_AVISO_HACIENDA) {
			throw new AvisarHaciendaException("AVISO: MOVIMIENTO MAYOR A 3000€. NOTIFICAR A HACIENDA.");
		}
	}

	// Metodo qeu muestra la informacion de la cuenta por pantlla

	public String toString() {
		String resultado = String.format("Datos de la cuenta\n{IBAN: %s\tTITULAR: %s\tSALDO: %.2f}\n", iban, titular,
				saldo);
		return resultado;
	}

	// Metodo que muestra el menu, permite interactuar con el y muestra los
	// resultados de las acciones
	public void menu(Scanner tecla) throws CuentaException, AvisarHaciendaException {
		int accion = 0;
		do {
			System.out.printf("\nINTRODUZCA EL NUMERO DE LA ACCION QUE DESEA REALIZAR:\n");
			System.out.println("1. Datos Cuenta Bancaria");
			System.out.println("2. Mostrar IBAN");
			System.out.println("3. Mostrar titular");
			System.out.println("4. Mostrar saldo");
			System.out.println("5. Ingresar una cantidad");
			System.out.println("6. Retirar una cantidad");
			System.out.println("7. Mostrar los movimientos");
			System.out.println("8. Salir");
			accion = pedirEnteroRango(tecla, 8, 1);
			switch (accion) {
			case 1:
				System.out.println("Mostrando los datos de la cuenta bancaria ...");
				System.out.println(this.toString());
				break;

			case 2:
				System.out.println("Mostrando el IBAN de la cuenta bancaria ...");
				System.out.printf("IBAN: %s\n", this.getIBAN());
				break;

			case 3:
				System.out.println("Mostrando el titular de la cuenta bancaria ...");
				System.out.printf("Titular: %s.\n", this.getTitular());
				break;

			case 4:
				System.out.println("Mostrando el saldo de la cuenta bancaria ...");
				System.out.printf("Saldo: %.2f€\n", this.getSaldo());
				break;

			case 5:
				System.out.println("Indique la cantidad a ingresar ...");
				double cantidad = pedirDouble(tecla);
				System.out.println("Ingresando la cantidad deseada ...");
				try {
					this.ingreso(cantidad);
				} catch (AvisarHaciendaException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
				} catch (CuentaException ex2) {
					System.out.printf("Error. %s", ex2.getMessage());
				}
				break;

			case 6:
				System.out.println("Indique la cantidad a retirar ...");
				cantidad = pedirDouble(tecla);
				System.out.println("Retirando la cantidad deseada ...");
				try {
					this.retirada(cantidad);
				} catch (CuentaException ex1) {
					System.out.printf("Error. %s", ex1.getMessage());
				} catch (AvisarHaciendaException ex2) {
					System.out.printf("Error. %s", ex2.getMessage());
				}
				break;

			case 7:
				System.out.println("Mostrando los movimientos de la cuenta bancaria ...");
				System.out.println(this.getMovimientos());
				break;

			case 8:
				System.out.println("Saliendo del menu ...");
				break;
			}
		} while (accion != 8);
	}

	// Metodo que devuelve un entero en un rango
	private int pedirEnteroRango(Scanner tecla, int max, int min) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				numero = tecla.nextInt();
				while (numero < min || numero > max) {
					System.out.printf("Introduzca un numero dentro del rango especificado (%d - %d)\n", min, max);
					numero = tecla.nextInt();
				}
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.printf(
						"Te has equivocado. Por favor, ingresa un número dentro del rango especificado (%d - %d)\n",
						min, max);
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

	// Metodo que devuelve un double
	private double pedirDouble(Scanner tecla) {
		boolean correcto = false;
		double numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				numero = tecla.nextDouble();
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.printf("Te has equivocado. Por favor, ingresa un número.\n");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

}
