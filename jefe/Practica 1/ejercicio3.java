import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado1 = new Scanner(System.in);
		
		
		int numero1;
		int pos=0,neg=0;
		int i;
		
		for( i=1; i<=10; i++) {
			System.out.println("Dime 1 numero");
			numero1=teclado1.nextInt();
			
			if(i>=0) {
				pos++;
			
			}else if(i<0) {
				neg++;
				
			}	
			
		}
		System.out.println("Positivos: "+pos);
		System.out.println("Negativos: "+neg);
		
	}

}
