package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = null,v2=null,v3=null;
		try {
			 v1 = new Vehiculo("0028LYB", "SEAT", "Ibiza", Tipo.COCHE, 50);
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		
		try {
			 v2 = new Vehiculo("9983GMB", "Toyota", "Yaris", Tipo.COCHE, 40);
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}

		
		try {
			 v3 = new Vehiculo("6250GNS", "Honda", "SH125", Tipo.MOTO, 10);
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		
		System.out.println(v1.getMatricula());
		
		v1.grabar("matriculas.txt");


	}

}
