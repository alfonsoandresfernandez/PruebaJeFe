import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado1 = new Scanner(System.in);
		
		int n1=0;
		int n2=0;
		int total=1;
		int i=1;
		
		System.out.println("Dime 1 numero");
		
		n1=teclado1.nextInt();	
		
		System.out.println("Dime otro numero");
		
		n2=teclado1.nextInt();	
	
		do {
			total= n1*total;
			i++;
			
		}while( i<=n2  );
		
		
		
		System.out.println("El total es: "+total);
		
		
		
		

	}

}
