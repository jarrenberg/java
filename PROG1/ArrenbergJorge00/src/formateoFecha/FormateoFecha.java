package formateoFecha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormateoFecha {
	
	//Coger fecha y hora del sistema y mostrarla con el siguiente formato :  hoy es el dia tal, del mes tal, del año x, la hora x y los minutos x

	public static void main(String[] args) {
		
		//Cogemos la fecha y la hora del sistema
		LocalDateTime fechaYhora = LocalDateTime.now();
		
		//Creamos el formato con el que se motrara la fecha y la hora
		 DateTimeFormatter formato  = DateTimeFormatter.ofPattern("'Hoy es el dia 'd' del mes 'L' del año 'u'. Son las 'H' y 'm'.'");
		 
		 //Mostramos la fecha con el formato
		 System.out.println(fechaYhora.format(formato));
		 
	}

}
