package ejercicio1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Fresco fresco1;
		try {
			 fresco1 = new Fresco("LATA",LocalDate.of(2025, 12, 10),12,LocalDate.of(2025, 7, 1)," ");
		}catch(IllegalArgumentException ex1) {
			 fresco1 = new Fresco("LATA",LocalDate.of(2025, 12, 10),12,LocalDate.of(2025, 7, 1),"Malta");
			 System.out.printf("Error.%s\n",ex1.getMessage());
		}
		
		System.out.println(fresco1.toString());
		System.out.println(fresco1.getPaisOrigen());
	}

}
