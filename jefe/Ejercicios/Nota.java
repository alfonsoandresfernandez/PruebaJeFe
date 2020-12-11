import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado1 = new Scanner (System.in);
		
		float numero1;
		
		System.out.print("Por favor introduzca una nota:");
		numero1 = teclado1.nextFloat();
		

			
			 if(numero1 < 5){
					
					System.out.print("suspenso");
					
			}else if(numero1 < 6){
				
						
					System.out.print("suficiente");
						
			}else if((numero1 < 7)){
							
					System.out.print("bien");
								
			}else if(numero1 >= 7 && numero1 < 9 ){
									
					System.out.print("notable");
																			
			}else if(numero1 >= 9 && numero1 <= 10){
											
					System.out.print("sobresaliente");
											
			}
								
				
		
	}
	
}