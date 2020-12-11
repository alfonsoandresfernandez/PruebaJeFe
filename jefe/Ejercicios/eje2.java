import java.util.Scanner;

public class eje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Porfavor, introduce un numero del 1 al 10 ");
		
		Scanner teclado1 = new Scanner (System.in);
		
		int numero1;
		
		numero1 = teclado1.nextInt();
		
		if(numero1 <5){
				System.out.println("Has Suspendido");
		}else {
			System.out.println("Has Aprobado");
			if(numero1 ==5) {
			System.out.println("Has Sudiciente");
			}
			else if(numero1 ==6){
				System.out.println("Has sacado un Bien");
			}
			else if(numero1<=8){
				System.out.println("Has sacado un Notable");
			}else if(numero1 >=9) {
				System.out.println("Has sacado un Sobresaliente");
				
		
		}
		
			
		
		
		
	
		
	
		
	
		
	

