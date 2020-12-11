import java.util.Scanner;
public class primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado1 = new Scanner(System.in);
	         int primo=0,numero;
	        
	         System.out.println("Dime un numero");
	         numero=teclado1.nextInt();
	         for(int i=1;i<(numero+1);i++){
	        
	        	 
	        if(numero%i==0){
	             primo++;
	            }
	         }
	         if(primo!=2){
	              System.out.println("No es Primo");
	            }else{
	                System.out.println("Si es Primo");

	            
	            }
	}

}
