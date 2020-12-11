import java.util.Scanner;

public class eje9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado1 = new Scanner (System.in);
		
		String comida;
		String bebida;
		double zumo=0;
		double palmera=0;
		double donut=0;
		double cafe=0;
		double total=0;
		
		
		System.out.println("Que quieres de comer ");
		comida= teclado1.next();	
		
		System.out.println("Dime que quieres de beber ");
		bebida= teclado1.next();
		
		
		if(comida.equalsIgnoreCase("donut")) {
			total+=1.20;
		}else if(comida.equalsIgnoreCase("palmera")) {
			total+=1.60;
		}
		if(bebida.equalsIgnoreCase("agua")){
			total+=1;
		}else if (bebida.equalsIgnoreCase("cafe")) {
			total+=1.20;
		}else if (bebida.equalsIgnoreCase("zumo")) {
			total+=2.20;
		}
		if(comida.equalsIgnoreCase("donut") && bebida.equalsIgnoreCase("cafe") ) {
			total=2.20;
		}else if (comida.equalsIgnoreCase("palmera") && bebida.equalsIgnoreCase("zumo")) {
			total=3.60;
		}
		
		System.out.println("El total es :"+(total));	

	}
}
