import java.util.Arrays;
import java.util.Scanner;
public class Practica6 {
	
	private static int mayor(int[]array) {
		int mayor=0;
	
		for(int i=0;i<array.length;i++){
			
			if(array[i]>mayor) {
				mayor=array[i];
			
			}
		}
		
		
		return mayor;
		
	}
	private static int menor(int[]array) {
		int menor=50000;

		for(int i=0;i<array.length;i++){
			
			if(array[i]<menor) {
			menor=array[i];
			}
		}
		
		return menor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado1 = new Scanner (System.in);

		int total=0;
		int menor;
		int numero=0;
		double mediana;
		
		System.out.println("Bienvenidos");
		System.out.println("Cuantos numeros quieres");
		numero=teclado1.nextInt();
		
		int[] array=new int[numero];
		
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Dime un numero");
			array[i]=teclado1.nextInt();
		
		
		}
		
		System.out.print("La forma inversa es " );
		
		for (int i = array.length-1; i>=0; i--){
	        
	          
	          System.out.print( array[i]+" " );
	        }
		
		System.out.println();
		System.out.println("El numero mayor es : "+ mayor(array));
		System.out.println("El numero menor es : "+ menor(array));
		
		for(int i=0;i<array.length;i++) {
			total = array[i]+total;
			}
			
		System.out.println("La nota media es: " + total/array.length);
		
	
		if(numero % 2 == 0){
            int sumaMedios = array[numero/2] + array[numero/2 - 1]; 
            mediana = (double)sumaMedios / 2; 
        } else {
            mediana = array[numero/2];
        }
		System.out.println();
		
		System.out.println("La mediana es:" + mediana);
		
		Arrays.sort(array);
		System.out.println( "Ordenados es:" );
		for (int i = 0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");
		}	
	
		System.out.println();
	
		int caracter=0;
		
		do {
			System.out.println("Introduzca un carácter");
			caracter=teclado1.nextInt();
		}
		
		while(numero==-1);
		
		System.out.println("El resultado es: ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
