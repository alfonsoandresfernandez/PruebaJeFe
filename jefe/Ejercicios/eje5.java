import java.util.Scanner;

public class eje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				
				Scanner teclado1 = new Scanner (System.in);
				
				int horas;
				
				System.out.print("Por favor introduzca las horas que has trabajado:");
				horas = teclado1.nextInt();
				
				if(horas<=40) {
					System.out.println("Has ganado: "+ (12*horas ));
					
				}
				else  {
			
					int extras = horas -40;
						System.out.println("Has ganado: "+(horas*16+40*12));
					
					
				}
				
				
				
				
				
													
					
										
						
			
			
		
		

	}

}
