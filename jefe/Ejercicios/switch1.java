import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado1 = new Scanner (System.in);
		
		
		int nota = 0;
		System.out.println("Introduce una nota ");
		nota= teclado1.nextInt();
	
	switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
						System.out.println("Has suspendido");
					break;
			case 5:
						System.out.println("Has aprobado");
					break;
			case 6:
						System.out.println("Has sacado un bien");
					break;
			case 7:
			case 8:
						System.out.println("Has sacado un notable");
					break;
			case 9:
			case 10:
						System.out.println("Has sacado un sobresaliente");
					break;
		default:
						System.out.println("Error");
					break;
				}	
		
	}

}
