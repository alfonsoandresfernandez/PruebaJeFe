import java.util.Scanner;

public class eje7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado1 = new Scanner (System.in);
		
	
		/*ancho y alto
		cm2 1centimo
		escudo bordado o no?¿
		bordado  5 euros
		Más gastos de envios 3 euros*/
		
		String texto;
		double ancho;
		double alto;
		String bordado;
		double envio=3.25;
		
		
		
		
		System.out.println("Por favor introduzca el alto:");
		alto= teclado1.nextFloat();
		System.out.print("Por favor introduzca el ancho:");	
		ancho= teclado1.nextFloat();
		System.out.print("Quiere el escudo borado?");
		bordado= teclado1.next();
		double bandera=  ancho*alto*0.01;
		
		double escudo = 0;
	
		
		if(bordado.equalsIgnoreCase("Si")) {
			escudo = 5;
			
		}
		
		
			System.out.println("Los gastos de envio son: "+envio);
			System.out.println("El Escudo vale "+escudo);
			System.out.println("Esto es el precio de bandera: "+(bandera+envio+escudo));
			//.........................//
			System.out.println("Esto es el total con IVA: "+(bandera+envio+escudo)*1.21);
		

	}
}
