import java.util.Scanner;
public class practica4 {
	
	
	private static double bitcoinEuro=7525.80;
	private static double bitcoinDolar=8284.84;
	private static double euroDolar=1.10;
	
	private static double cantidad;
	
	
	private static void bitcoinaeuro(){
		double total=0;
		
		total=cantidad*bitcoinEuro;	
		System.out.println(cantidad+"B son "+total+" Euros");
	 
			
	}
	private static void bitcoinadollar() {
		double total=0;
	
		
		total=cantidad*bitcoinDolar;
		System.out.println(cantidad+" B son "+total+" dollar");
	}
	private static void euroadollar() {
		double total=0;
		 total=euroDolar*cantidad;
			System.out.println(cantidad+" € son "+total+" dollar");
		
	}
	private static void dollaraeuro() {	
		double total=0;
		total=euroDolar*cantidad;
		System.out.println(cantidad+" $ son "+total+" Euros");
		
	}	
	private static void euroadbitcoin() {
		double total=0;
		
		total=bitcoinEuro/cantidad;
		System.out.println(cantidad+"€ son"+total+" Bitcoin");
	}
	private static void dollarabitcoin() {
		double total=0;
		
		total=bitcoinDolar/cantidad;
		System.out.println(cantidad+" $ son "+total+" Bitcoin");
	}
	
	

	
	
	
	private static void modificarMonedas() {
		Scanner teclado1 = new Scanner (System.in);
		double nuevoCambio;
		int opcion;

		
		System.out.println("Por favor, seleccione la moneda de la que desea modificar el cambio:" + " 1- Euro-Dollar "+" 2- Bitcoin-Euro "+" 3- Bitcoin-Dollar: ");
		opcion=teclado1.nextInt();
		
		System.out.println("Por favor, Introduce el nuevo cambio");
		nuevoCambio = teclado1.nextDouble();
		

		switch(opcion){
			case 1:				
				euroDolar=nuevoCambio;
			break;
			case 2:
				bitcoinEuro=nuevoCambio;
			break;
				
			case 3:
				bitcoinDolar=nuevoCambio;
			break;
		}
		
	
		
	}
	
	
	private static void conversionMonedas() {
		Scanner teclado1 = new Scanner (System.in);
		
		
		String moneda;
		String moneda2;
		
		
		System.out.println("Por favor, seleccione la moneda de la que desea convertir (€ , $ , B): ");
		moneda=teclado1.next();
		
		
		System.out.println("Introduzca la cantidad: ");
		cantidad = teclado1.nextDouble();
		
		
		System.out.println("Por favor, seleccione la moneda de la que desea convertir (€ , $ , B): ");
		moneda2=teclado1.next();
		                             
		switch(moneda){
		case "€":
			if(	moneda2.equals("B")) {
				
				euroadbitcoin();
			}
			if(moneda2.equals("$")) {
				euroadollar();
			}
			break;
			               	
		case "$":
				if(	moneda2.equals("B")) {
				
				dollarabitcoin();
			}
				if(moneda2.equals("€")) {
				dollaraeuro();
			}
			
			break;
			
		case "B":
			if(	moneda2.equals("$")) {
				
				bitcoinadollar();
				}
			if(moneda2.equals("€")) {
				bitcoinaeuro();
				}
			
		break;
		}
		
		
	}
		
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado1 = new Scanner(System.in);
		int intercambio=0;
		System.out.println("Bienvenidos!!");
		System.out.println();
		
		
		
		do {
			System.out.println("¿Qué desea realizar?");
			System.out.println("1-Modificar el cambio de monedas 2-Realizar conversion entre monedas 3-Salir");
			System.out.println("Indique que quiere seleccionar: ");
			intercambio=teclado1.nextInt();
			System.out.println();
				switch(intercambio){
					case 1:
						modificarMonedas();
						break;
					case 2:
						conversionMonedas();
						break;
					case 3:
						System.out.println("Hasta la proxima!!!");
						break;
						}
			}
		while(intercambio!=3);	
			
		

		
		
	}

}
