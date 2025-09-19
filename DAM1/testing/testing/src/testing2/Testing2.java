package testing2;
import java.util.Scanner;

public class Testing2 {

	    public static void main(String[] args) {

	        Scanner teclado=new Scanner (System.in);
	        int tamanno=10, valorV, posicionP;
	        int array[]=new int[tamanno];
	        String respuesta;

	        do {
	            System.out.println("Menu guapo:*");
	            System.out.println("a. Mostrar valores");
	            System.out.println("b. Introducir valor");
	            System.out.println("c. Salir");
	            System.out.println("**");
	            respuesta=teclado.nextLine();
	            if (respuesta.equals("a")){
	            	for(int i = 0; i<tamanno;i++) {
	            		System.out.print(array[i] + " ");
	            	}
	            	System.out.println(" ");
	            	System.out.println(" ");
	            }
	            if (respuesta.equals("b")){
	            	System.out.println("Introduzca un numero para introducir en el array:");
	            	valorV=teclado.nextInt();
	            	
	            	System.out.println("Introduzca una posicion donde introducir el numero:");
	            	posicionP=teclado.nextInt();
	            	
	            	while (posicionP>tamanno) {
	            		System.out.println("Introduzca una posicon valida (del 1 al 10):");
	            		posicionP= teclado.nextInt();	            	}
	            	
	            	array[posicionP-1] = valorV;
	            	teclado.nextLine();	            }
	        }while (!respuesta.equals("c"));
	        System.out.println("Programa abortado");}
}
