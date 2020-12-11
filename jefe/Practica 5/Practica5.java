import java.util.Scanner;
public class Practica5 {
	
	private static char letraDni(int resto) {
		
		char array[]={
				'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		
		return array[resto];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado1 = new Scanner (System.in);
		
		int dni=0;
		int restodni=0;
		char letra;
		String texto = "si";
		int DIVISOR=23;
	
		System.out.println("¡¡¡¡¡¡ Bienvenido maquina !!!!!!");
		
		while(texto.equalsIgnoreCase("si")) {
			
			
			do {
				System.out.println("Por favor, Introduzca su DNI: ");
				dni=teclado1.nextInt();
			}	
			while(dni>100000000);		
			
			int resto=dni%DIVISOR;
			String cadena ;
			do {
				System.out.println("Introduzca su letra del DNI: ");
				cadena = teclado1.next();
				
			}
			while(cadena.length() >1);
			
			letra=cadena.charAt(0);
			
			if(Character.toUpperCase(letra)==letraDni(resto)) {
				System.out.println("Ese DNI es correcto¡¡¡¡¡¡");
				
			}else {
				
				System.out.println("Ese DNI no es correcto");
				
				System.out.println("La letra correcta seria " + letraDni(resto));
			}

			System.out.println("¿Desea introducir otro DNI?");
			texto=teclado1.next();

		}
			if(texto.equalsIgnoreCase("no")){
				System.out.println("Hasta la proxima maquina.");
			}
		

	}

}
