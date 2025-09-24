package calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un operando");
		double operando1 = teclado.nextDouble();
		
		System.out.println("Introduzca otro operando");
		double operando2 = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Introduzca un operador:");
		String contenedorOperador = teclado.nextLine();
		
		char operador = contenedorOperador.charAt(0);
		
		System.out.println(calculadora(operando1,operando2, operador));
	
		
	}
	
	//Método para calcular el resultado
	
	public static double calculadora (double operando1, double operando2, char operador) {
		double resultado = 0;
		if(operador=='+') {
			resultado = operando1+operando2;
		}
		if(operador=='-') {
			resultado = operando1-operando2;
		}
		if(operador=='*') {
			resultado = operando1*operando2;
		}
		if(operador=='/') {
			if (operando2==0) {
				System.out.println("No se peude dividir entre 0");
			}else {
			resultado = operando1/operando2;
			}
		}
		if(operador=='%') {
			resultado = operando1%operando2;
		}
		return resultado;
		
	}

}
