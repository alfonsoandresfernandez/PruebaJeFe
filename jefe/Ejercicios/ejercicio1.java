import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		
		
		int numero1,numero2;
		
		
		System.out.println("Porfavor, introduce el primero numero ");
		
		numero1 = teclado1.nextInt();
		
			System.out.println("Porfavor, introduce el segundo numero ");
			
			numero2 = teclado2.nextInt();
			
			float resultado = 0;
			
					 
			
			
			System.out.println("El resultado de la suma es "+(numero1+numero2));
			System.out.println("El resultado de la multiplicacion es "+(numero1*numero2));
			System.out.println("El resultado de la division es "+((float)numero1/numero2));
			System.out.println("El resultado de la resta es "+(numero1-numero2));
			System.out.println("El resultado del resto  es "+((float)numero1%numero2));
			

	}

}
