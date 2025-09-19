package ejemploClaseVehiculo;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1;
		try {
			v1 = new Vehiculo(10, 150);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}
		
		Vehiculo v2;
		try {
			v2 = new Vehiculo(25, 60);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}
		
		System.out.println("Creando v3 por defecto...");
		Vehiculo v3 = null;
		try {
			v3 = new Vehiculo();
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}
		
		System.out.println(v3.toString());
		
		System.out.println("Repostar 20 litros de combustible en el vehículo v3");
		try {
			v3.repostar(5);
			System.out.println("Repostaje exitoso");
		}catch(IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}catch(IllegalStateException ex2) {
			System.out.printf("Error. %s\n", ex2.getMessage());
		}
		System.out.println(v3.toString());


		System.out.println("Arrancando el vehículo v3");
		try {
			v3.arrancar();
			System.out.println("Arranque exitoso");
		}catch(IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}catch(IllegalStateException ex2) {
			System.out.printf("Error. %s\n", ex2.getMessage());
		}
		System.out.println(v3.toString());
		
		System.out.println("Apagando vehiculo vv");
		try {
			v3.apagar();
			System.out.println("Apagado exitoso");
		}catch(IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}catch(IllegalStateException ex2) {
			System.out.printf("Error. %s\n", ex2.getMessage());
		}
		System.out.println(v3.toString());
		
		System.out.println("Recorriendo 100km en el vehículo v3");
		try {
			v3.realizarTrayecto(100);
			System.out.println("Trayecto exitoso");
		}catch(IllegalArgumentException ex1) {
			System.out.printf("Error. %s\n", ex1.getMessage());
		}catch(IllegalStateException ex2) {
			System.out.printf("Error. %s\n", ex2.getMessage());
		}
		System.out.println(v3.toString());
		
	}

}
