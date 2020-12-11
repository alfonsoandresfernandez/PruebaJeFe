import java.util.Scanner;
public class while13c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner teclado1 = new Scanner (System.in);
		
		
		int numero1;
		int pos=0,neg=0;
		int i=1;
		
		while(i<=10) {
			System.out.println("Dime 1 numero");
			numero1=teclado1.nextInt();
			i++;
			if(numero1>=0) {
				pos++;
			
			}else {
				neg++;
			
			}
				 
			
			
		}
		
		System.out.println("Positivos: "+pos);
		System.out.println("Negativos: "+neg);
		
	}

}
