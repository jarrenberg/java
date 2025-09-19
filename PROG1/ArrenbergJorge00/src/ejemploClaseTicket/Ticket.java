package ejemploClaseTicket;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
	public static final int NUM_MAXIMO_TICKETS_POR_AÑO = 99999999;

	private static int numeroTicketsEmitidos;

	private final String id;
	private final LocalDate fecha;
	private LocalTime usado;

	static {
		numeroTicketsEmitidos = 99999998;
	}

	// Constructor sin parametros
	public Ticket() {
		this(LocalDate.now());
	}

	// Constructor con un parametro
	public Ticket(LocalDate fecha) throws IllegalArgumentException, IllegalStateException {
		numeroTicketsEmitidos++;
		if (fecha == null) { // Visto en retroalimentacion
			throw new IllegalArgumentException("La fecha no puede ser nula");
		}
		if (fecha.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException(
					String.format("La fecha introducida (%s) es anterior a la actual.", fecha.toString()));
		}
		if (fecha.getYear() > LocalDate.now().getYear()) {
			throw new IllegalArgumentException(
					String.format("La fecha debe ser durante el año actual (%d)", LocalDate.now().getYear()));
		}
		if (numeroTicketsEmitidos > NUM_MAXIMO_TICKETS_POR_AÑO) {
			numeroTicketsEmitidos--;
			throw new IllegalStateException(String
					.format("Se ha llegado al maximo de tickets expendibles en un año (%d).\n", NUM_MAXIMO_TICKETS_POR_AÑO));
		}
		this.usado = null; // visto en retroalimentacion
		this.fecha = fecha;
		this.id = idForma();

	}

	//Devuelve el numero de tickets emitidos
	public static int getNumTicketsEmitidos() {
		return numeroTicketsEmitidos;
	}
	
	
	private String idForma() {
		String id = String.format("%04d-%08d", fecha.getYear(), (numeroTicketsEmitidos));// LO de %08d visto en
																						// retroalimentacion
		return id;
	}

	private DateTimeFormatter fechaForma() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d'/'L'/'u");
		return formato;
	}

	private DateTimeFormatter horaForma() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH':'mm");
		return formato;
	}

	// Devuelve el id del ticket
	public String getId() {
		String id = this.id;
		return id;
	}

	// Devuelve la fecha en la que se puede utilizar el ticket
	public String getFecha() {
		String fecha = this.fecha.format(fechaForma());
		return fecha;
	}

	// Devuelve si el ticket ha sido utilizado o no
	public boolean isUsado() {
		boolean isUsado;
		if (usado == null) {
			isUsado = false;
		} else {
			isUsado = true;
		}
		return isUsado;
	}

	// Devuelve si el ticket es para ser utilizado en fin de semana
	public boolean isFinDeSemana() {
		boolean isFinDeSemana;
		if (fecha.getDayOfWeek().getValue() == 6 || fecha.getDayOfWeek().getValue() == 7) {
			isFinDeSemana = true;
		} else {
			isFinDeSemana = false;
		}
		return isFinDeSemana;
	}

	// Metodo para usar el ticket
	public void usar() throws IllegalStateException { // NO funciona
		if (!this.fecha.isEqual(LocalDate.now())) {
			throw new IllegalStateException("Este ticket no corresponde a este dia");
		}
		if (usado != null) {
			throw new IllegalStateException("El ticket ya ha sido utilizado");
		}
		usado = LocalTime.now();
	}

	// Metodo para mostrar la informacion del ticket
	public String toString() {
		String estado;
		if (usado == null) {
			estado = "No.";
		} else {
			estado = usado.format(horaForma());
		}
		String mensaje = String.format("{ ID: %s, Fecha: %s, Usado: %s }\n", this.id, fecha.format(fechaForma()),
				estado);
		return mensaje;
	}

	// Devuelve un ticket para ser usado en una fecha aleatoria de este mes vigente
	public static Ticket randomEsteMes() {
		Ticket ticket1;
		int numDia;
		LocalDate fechaRandom = null;
		boolean fechaValida;
		do {
			try {
				fechaValida = true;
				numDia = (int) ((Math.random() * 31)+1);
				fechaRandom = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), numDia);
				if (numDia < LocalDate.now().getDayOfMonth()) {
					fechaValida = false;
				}
			} catch (DateTimeException ex1) {
				fechaValida = false;
			}
		} while (fechaValida == false);
		ticket1 = new Ticket(fechaRandom);
		return ticket1;
	}

	// Devuelve un ticket para ser usado en una fecha aleatoria de este año vigente
	public static Ticket random() {
		Ticket ticket1 = null;
		int numDia;
		int numMes;
		LocalDate fechaRandom = null;
		boolean fechaValida;
		do {
			try {
				fechaValida = true;
				numMes = (int) ((Math.random() * 12)+1);
				numDia = (int) ((Math.random() * 31)+1);
				fechaRandom = LocalDate.of(LocalDate.now().getYear(), numMes, numDia);
				if (numMes < LocalDate.now().getMonthValue()) {
					fechaValida = false;
				}if (numDia< LocalDate.now().getDayOfMonth()&&numMes < LocalDate.now().getDayOfMonth()) {
					fechaValida = false;
				}
			} catch (DateTimeException ex1) {
				fechaValida = false;
			}
		} while (fechaValida == false);
		try {
		ticket1 = new Ticket(fechaRandom);
		}catch(IllegalStateException ex1) {
			System.out.printf("Error. %s",ex1.getMessage());
		}
		return ticket1;

	}
}
