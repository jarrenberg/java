package ejercicio5;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Alumno {
	private final String codigoAlumno;
	private String apellidos;
	private String nombre;
	private String direccion;
	private String telefono;
	private String codigoCiclo;
	private int cursosAprobados;
	private LocalDate fechaIngreso;

	public Alumno(String codigoAlumno, String apellidos, String nombre, String direccion, String telefono,
			String codigoCiclo, int cursosAprobados, LocalDate fechaIngreso)
			throws NullPointerException, IllegalArgumentException {
		if (codigoAlumno == null) {
			throw new NullPointerException("El codigo de alumno no puede ser nulo");
		}
		if (codigoAlumno.isEmpty()) {
			throw new IllegalArgumentException("El codigo de alumno no puede estar vacío");
		}
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		if (apellidos == null) {
			throw new NullPointerException("Los apellidos no puede ser nulo");
		}
		if (apellidos.isEmpty()) {
			throw new IllegalArgumentException("Los apellidos no puede estar vacío");
		}
		if (direccion == null) {
			throw new NullPointerException("La direccion no puede ser nula");
		}
		if (direccion.isEmpty()) {
			throw new IllegalArgumentException("La direccion no puede estar vacía");
		}
		if (telefono == null) {
			throw new NullPointerException("El telefono no puede ser nulo");
		}
		if (telefono.isEmpty()) {
			throw new IllegalArgumentException("El telefono no puede estar vacío");
		}
		if (codigoCiclo == null) {
			throw new NullPointerException("El codigo de ciclo no puede ser nulo");
		}
		if (codigoCiclo.isEmpty()) {
			throw new IllegalArgumentException("El codigo de cclo no puede estar vacío");
		}
		if (cursosAprobados < 0) {
			throw new IllegalArgumentException("No se puede tener un número negativo de cursos aprobados");
		}
		if (fechaIngreso == null) {
			throw new NullPointerException("La fecha de ingreso no puede ser nula");
		}
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoCiclo = codigoCiclo;
		this.cursosAprobados = cursosAprobados;
		this.fechaIngreso = fechaIngreso;
	}

// Añade un alumno a la clase
	public static boolean anyadirAlumno(Alumno a, LinkedList<Alumno> clase) throws NullPointerException {
		if (a == null) {
			throw new NullPointerException("El alumno introducido es nulo");
		}
		return clase.add(a);
	}

// Devuelve la informacion del alumno cuyo codigo es igual al codigo pasado como parametro
	public static String informacionAlumno(String codigoAlumno, LinkedList<Alumno> clase)
			throws NullPointerException, IllegalArgumentException {
		if (codigoAlumno == null) {
			throw new NullPointerException("El codigo de alumno no puede ser nulo");
		}
		if (codigoAlumno.isEmpty()) {
			throw new IllegalArgumentException("El codigo de alumno no puede estar vacío");
		}
		String resultado = null;
		for (Alumno a : clase) {
			if (a.codigoAlumno.equalsIgnoreCase(codigoAlumno)) {
				resultado = a.toString();
			}
		}
		if (resultado == null) {
			resultado = String.format("No existe un alumno con el codigo '%s'\n", codigoAlumno);
		}
		return resultado;
	}

// Da de baja al alumno cuyo nombre y apellidos son iguales a los argumentos pasados como parametros
	public static void darDeBaja(String nombre, String apellidos, LinkedList<Alumno> clase) {
		if (nombre == null) {
			throw new NullPointerException("El nombre no puede ser nulo");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}

		if (apellidos == null) {
			throw new NullPointerException("El apellido no puede ser nulo");
		}
		if (apellidos.isEmpty()) {
			throw new IllegalArgumentException("El apellido no puede estar vacío");
		}
		boolean eliminar = false;
		int index = 0;
		for (int i = 0; i < clase.size(); i++) {
			Alumno a = clase.get(i);
			if (a.nombre.equals(nombre) && (a.apellidos.equals(apellidos))) {
				eliminar = true;
				index = i;
			}
		}
		if (eliminar) {
			clase.remove(index);
		}else {
			System.out.println("No existe un alumno con ese nombre y apellidos");
		}
	}

// Menu que permite modificar la direccion y/o el telefono del alumno cuyo codigo es igual al parametro pasado como argumento
	public static void modificarDireccionTelefono(String codigoAlumno, Scanner teclado, LinkedList<Alumno> clase)
			throws NullPointerException, IllegalArgumentException {
		if (codigoAlumno == null) {
			throw new NullPointerException("El codigo de alumno no puede ser nulo");
		}
		if (codigoAlumno.isEmpty()) {
			throw new IllegalArgumentException("El codigo de alumno no puede estar vacío");
		}
		for (Alumno a : clase) {
			if (a.codigoAlumno.equals(codigoAlumno)) {
				int accion;
				do {
					System.out.println("1. Modificar direccion");
					System.out.println("2. Modificar telefono");
					System.out.println("3. Modificar ambos");
					System.out.println("4. No modificar ninguno");
					accion = pedirEnteroRango(teclado, 4, 1);
					String contenedor = null;
					switch (accion) {
					case 1:
						System.out.println("Introduzca la direccion:");
						try {
							contenedor = teclado.nextLine();
						} catch (IllegalStateException ex) {
							System.out.printf("Error. %s\n");
						}

						while (contenedor == null || contenedor.isEmpty()) {
							System.out.println("Introduzca la direccion:");
							try {
								contenedor = teclado.nextLine();
							} catch (IllegalStateException ex) {
								System.out.printf("Error. %s\n");
							}
						}
						a.direccion = contenedor;
						break;
					case 2:
						System.out.println("Introduzca el telefono:");
						try {
							contenedor = teclado.nextLine();
						} catch (IllegalStateException ex) {
							System.out.printf("Error. %s\n");
						}
						while (contenedor == null || contenedor.isEmpty() || (!contenedor.matches("[679][0-9]{8}"))) {
							System.out.println("Introduzca el telefono:");
							try {
								contenedor = teclado.nextLine();
							} catch (IllegalStateException ex) {
								System.out.printf("Error. %s\n");
							}
						}
						a.telefono = contenedor;
						break;
					case 3:
						System.out.println("Introduzca la direccion:");
						try {
							contenedor = teclado.nextLine();
						} catch (IllegalStateException ex) {
							System.out.printf("Error. %s\n");
						}
						while (contenedor == null || contenedor.isEmpty()) {
							System.out.println("Introduzca la direccion:");
							try {
								contenedor = teclado.nextLine();
							} catch (IllegalStateException ex) {
								System.out.printf("Error. %s\n");
							}
						}
						a.direccion = contenedor;
						System.out.println("Introduzca el telefono:");
						try {
							contenedor = teclado.nextLine();
						} catch (IllegalStateException ex) {
							System.out.printf("Error. %s\n");
						}
						while (contenedor == null || contenedor.isEmpty() || (!contenedor.matches("[679][0-9]{8}"))) {
							System.out.println("Introduzca el telefono:");
							try {
								contenedor = teclado.nextLine();
							} catch (IllegalStateException ex) {
								System.out.printf("Error. %s\n");
							}
						}
						a.telefono = contenedor;
						break;
					case 4:
						System.out.println("Saliendo ...");
					}
				} while (accion != 4);
			}
		}
	}

// Permite cambiar de curso a un alumno
	public void cambiarCurso(String codigoNuevoCurso) throws NullPointerException, IllegalArgumentException {
		if (codigoNuevoCurso == null) {
			throw new NullPointerException("El codigo del nuevo ciclo no puede ser nulo");
		}
		if (codigoNuevoCurso.isEmpty()) {
			throw new IllegalArgumentException("El codigo del nuevo ciclo no puede estar vacío");
		}
		this.codigoCiclo = codigoNuevoCurso;
		this.cursosAprobados = 0;
		this.fechaIngreso = LocalDate.now();
	}

	public String toString() {
		return String.format(
				"CODIGO ALUMNO: %s, NOMBRE: %s, APELLIDOS: %s, DIRECCION: %s, TELEFONO: %s, CODIGO CICLO: %s, CURSOS APROBADOS: %d, FECHA DE INGRESO: %s\n",
				codigoAlumno, nombre, apellidos, direccion, telefono, codigoCiclo, cursosAprobados,
				fechaIngreso.toString());
	}

// Devuelve un entero en un rango especificado
	private static int pedirEnteroRango(Scanner tecla, int max, int min) {
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

}
