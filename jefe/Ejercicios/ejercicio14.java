import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado1 = new Scanner(System.in);
			
			
	int numero1 = 0;
	int numero2 = 0;
	int total=1;
	
		System.out.println("Dime 1 numero");
		numero1=teclado1.nextInt();	
		System.out.println("Dime 1 numero");
		numero2=teclado1.nextInt();	
		
		for(int i=1; i<=numero2; i++) {
		
			total= numero1*total;
			
			
		
			}
		
		
		
		
	
		
		System.out.println("El resultado es: "+(total));
		
		
		
		
		
	}

}
