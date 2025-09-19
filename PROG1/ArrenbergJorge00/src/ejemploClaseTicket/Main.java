package ejemploClaseTicket;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		LocalDate fecha = LocalDate.now();
		Ticket ticket1 = null;
		Ticket ticket2 = null;
		Ticket ticket3 = null;
		Ticket ticket4 = null;
		try {
			ticket1 = new Ticket(fecha);
		} catch (IllegalArgumentException ex1) {
			ticket1 = new Ticket();
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());

		}
		try {
			System.out.println(ticket1.toString());
		} catch (NullPointerException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		}

		try {
			ticket2 = new Ticket(fecha);
		} catch (IllegalArgumentException ex1) {
			ticket2 = new Ticket();
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}

		try {
			System.out.println(ticket2.toString());
		} catch (NullPointerException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		}

		System.out.println(Ticket.getNumTicketsEmitidos());

		System.out.println(ticket1.isFinDeSemana());
		System.out.println(ticket1.isUsado());
		// Preguntar a rafa
		try {
			ticket1.usar();
		} catch (IllegalStateException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		}

		try {
			System.out.println(ticket1.toString());
		} catch (NullPointerException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		}
		System.out.println(ticket1.isUsado());

		ticket3 = Ticket.random();

		System.out.println("wasaa" + ticket3.toString());

		System.out.println(Ticket.getNumTicketsEmitidos());
	}
}