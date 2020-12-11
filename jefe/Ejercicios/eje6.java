import java.util.Scanner;

public class eje6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		Scanner teclado1 = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Por favor introduzca un numero:");
		
		numero = teclado1.nextInt();
		if(numero%2 ==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
			
		
		
	

	}
}