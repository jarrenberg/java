package ejercicio4;
/*
 * Practica de mostrar datos en pantalla con tipo enum
 * Jorge Arrenberg 03/01/2024
 */

public class Ejercicio4 {
	public enum tamaños {PEQUEÑO, MEDIANO, GRANDE, EXTRAGRANDE};
	public static void main(String[] args) {
		tamaños tamPeq = tamaños.PEQUEÑO;
		tamaños tamMed = tamaños.MEDIANO;
		tamaños tamGrande = tamaños.GRANDE;
		tamaños tamExtra = tamaños.EXTRAGRANDE;
		
	String pequeño =" comprende desde el 0 hasta el 15";
	String mediano =" comprende desde el 15 hasta el 30";
	String grande =" comprende desde el 30 hasta el 45";
	String extragrande =" comprende desde el 45 hasta el 60";
	
	System.out.println("El tamaño " +tamPeq+ pequeño);
	System.out.println("El tamaño " +tamMed+ mediano);
	System.out.println("El tamaño " +tamGrande+ grande);
	System.out.println("El tamaño " +tamExtra+ extragrande);
	}

}
