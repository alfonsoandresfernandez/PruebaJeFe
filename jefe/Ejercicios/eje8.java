import java.util.Scanner;

public class eje8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//dos notas    mayor o igual 5//
		
		Scanner teclado1 = new Scanner (System.in);
		
		double nota1;
		double nota2;
		String practica;
		
		
		System.out.println("Dime que has sacado primer  examen");
		nota1= teclado1.nextFloat();
		
		System.out.println("Dime que has sacado en el segun  examen");
		nota2= teclado1.nextFloat();
		
		System.out.println("¿Que has sacado en las practicas");
		practica=teclado1.next();
		
		float resultado= (float) (nota1+nota2);
		
		if(practica.equalsIgnoreCase("Apto") && resultado>=10) {
			System.out.println("Apto");
		}else {
			System.out.println("No apto");
		}
		
	
		
	
		
		
		
		
	}

}
