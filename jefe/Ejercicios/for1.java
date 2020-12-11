import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado1 = new Scanner (System.in);
		
		int n1 ;
		float total =0;
	
		
		for(int i=0;i<=2;i++) {
			System.out.println("Dime un numero: ");
			n1=teclado1.nextInt();
			total+=n1;
			
			
		}
	
		System.out.println("Este el total: "+total);
		
		System.out.println("La nota media es: "+(total/3));

		
	}

}
