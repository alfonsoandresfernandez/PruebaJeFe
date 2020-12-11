import java.util.Scanner;
public class puente1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado1 = new Scanner(System.in);
		
		int numero1=0;
		int numero2=1;
		int i=1;
		
		
		
		
		while(i<=2) {
			System.out.println("Dime 1 numero");
			numero1=teclado1.nextInt();
			System.out.println("dime otro numero");
			numero2=teclado1.nextInt();
			
			i++;
			if(numero1<=0 || numero2<=0) {
				numero1++;
				numero2++;
			}else {
			
			}
			
		}
		
	
	
	
	}
		
		

	}


