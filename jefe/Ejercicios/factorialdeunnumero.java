import java.util.Scanner;
public class factorialdeunnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 = new Scanner(System.in);
		
		
		
		int numero1 =1;
		int total=1;

	System.out.println("Dime 1 numero");
	numero1=teclado1.nextInt();	
	
	
	for(int i=2; i<=numero1; i++) {
	
		total=total*i;
		
		
	
		}
		
		
		
	System.out.println("El resultado es: "+(total));
	
		
	}

}
