import java.util.Scanner;
public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 = new Scanner(System.in);
	
		int n1=0;	
		String partida = "si";	
		double aleatorio1=(Math.random()*100);
		String partida1="si";
		String partida2="no";
		int	Aleatorio=1;
	
		while(partida1.equalsIgnoreCase("si") &&partida.equalsIgnoreCase("si")){
			Aleatorio = (int) (Math.random()*100);
			
			
			
			while(n1!=Aleatorio && partida1.equalsIgnoreCase("si")){
				
				
				
				System.out.println(""+Aleatorio);	
				
				
				 
				System.out.println("Dame un numero:");
				n1=teclado1.nextInt();
		
					 if(Aleatorio>n1) {
						 System.out.println("Lo sentimos, ese numero no es correcto es mayor");
					 }else if(Aleatorio<n1) {
						 System.out.println("Lo sentimos, ese numero no es correcto es menor");
					 }else {
						 System.out.println("Has Ganado maquina ");
					 }
				
					 
					 
					 if(n1!=Aleatorio) {
						 System.out.println("¿Quieres volver a intentar?");
						 partida1=teclado1.next();
					
					 }
						
					 
				
				
				
			}
			if(partida1.equalsIgnoreCase("si")) {
				System.out.println("Quieres volver a jugar?");
				partida = teclado1.next();
			}
		}
		
		System.out.println("Hasta la proxima.");
		
		
		

		
		}

		
	}


