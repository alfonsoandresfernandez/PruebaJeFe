import java.util.Scanner;
public class Buclegasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 = new Scanner (System.in);
		int i=0;
		int gasolina = 0;
		int total = 0;
		double preciolitro=0;
		double totalDinero = 0;
		int clientes=0;
		
		
		while(gasolina!=-1 ) {
			System.out.println("Cuantos litros quieres maquina¿? ");
			gasolina=teclado1.nextInt();
			
			
			
			if(gasolina>0) {
				
				System.out.println("Cuanto quieres que te cobre maquina¿? ");
				preciolitro=teclado1.nextDouble();
				
				total=total+gasolina;
				totalDinero = (gasolina*preciolitro) + totalDinero;
				
				clientes++;
			
			
			}
		}
		
		
		
		System.out.println("La suma de litros "+(total));
		System.out.println("El precio es: "+(totalDinero));
		System.out.println("Clientes: "+clientes);
		System.out.println("La media es: "+(totalDinero/total));
	}

}


