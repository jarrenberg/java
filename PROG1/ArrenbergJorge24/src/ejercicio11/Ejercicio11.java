package ejercicio11;


public class Ejercicio11 {

	public static void main(String[] args) {
		int num=100, sumaPares=0, sumaImpares=0;
		do {
			if(num%2==0) {
				sumaPares=sumaPares+num;
			}
			if(num%2==1) {
				sumaImpares=sumaImpares+num;
			}
			num=num+1;
		}while(num<=200);
		System.out.println("La suma de los numeros pares desde el 100 al 200 es: " +sumaPares);
		System.out.println("La suma de los numeros impares desde el 100 al 200 es: " +sumaImpares);
	}

}
