import java.util.Scanner;

public class eje12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String semana;

		
		Scanner teclado1 = new Scanner (System.in);
		
		System.out.println("Que dia de la semana es ");
		
		semana= teclado1.next();
		
		semana = semana.toLowerCase();
		
		switch (semana) {
		case "lunes":
		case "martes":
		case "miercoles":
		case"miércoles":
		case "jueves":
			System.out.print("Hoy es un dia  de mierda ");
			break;
		case "viernes":
			System.out.println("Hoy es viernes de cubatas");
			break;
		case "sabado":
			System.out.println("Hoy es sabado de reseca ");
			break;
		case "domingo":
			System.out.println("Hoy es domingo de mierda ");
			break;	
	
	default:
		System.out.println("error");
					
				break;
			}	
	}

}
