import java.util.Scanner;
public class puente2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado1 = new Scanner (System.in);
		
		
		int i=0;		
		int n1=1;
		int total=0;
		int mayores=0;
		int menores=0;
		while(i<=10) {
			System.out.println("Dime tu sueldo");
			n1=teclado1.nextInt();
			
			total=n1+total;
			i++;
			
		if(n1>1000) {
			
			mayores++;
			
		}else {
			menores++;
			}
		}
		
		System.out.println("La media de los sueldos es:  "+total/10);
		System.out.println("estos son mayorres que mil "+mayores);
		

	}

}
