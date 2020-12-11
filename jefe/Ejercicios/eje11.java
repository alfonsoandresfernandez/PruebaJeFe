import java.util.Scanner;

public class eje11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int numero1;
		int numero2;
		int numero3;
		
		
		Scanner teclado1 = new Scanner (System.in);
		
		System.out.println("Dime un numero ");
		numero1= teclado1.nextInt();
		
		System.out.println("Dime otro numero ");
		numero2= teclado1.nextInt();
		
		System.out.println("dime otro numero para saber que operacion");
		numero3= teclado1.nextInt();
		
		switch (numero3) {
		case 1:
			System.out.println("La Suma es = "+(numero1+numero2));
			break;
		case 2:
			System.out.println("La Resta es = "+(numero1-numero2));
			break;
		case 3:
			System.out.println("La Multiplicacion es = "+(numero1*numero2));
			break;
		case 4:
			System.out.println("La Division = "+(numero1/numero2));
			
				break;
	default:
		System.out.println("error");
					
				break;
			}	
	}

}
