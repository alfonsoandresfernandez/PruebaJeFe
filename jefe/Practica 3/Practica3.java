import java.util.Scanner;
public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado1 = new Scanner(System.in);
		
		
		String texto;
		String invertida ="";
		String programacion="";
		int contador=0;
		String vocales;
		int palabras = 0;
		int a =0;
		int e =0;
		int vocali =0;
		int o =0;
		int u =0;
		
		System.out.println("Introduzca el texto");
		texto=teclado1.nextLine();
		
		 for (int i = texto.length()-1; i>=0; i--){
	          invertida += texto.charAt(i);
	        }
		
		
		 
		 for (int i = 0; i < texto.length(); i++) {
			 
			 if (texto.charAt(i) == ' ') 
				 
				 palabras++;
	        }
		 
		 
		 for(int i=0; i<texto.length(); i++) {
		
			switch (texto.charAt(i)) {
						
						case 'a': a++; break;
						case 'e': e++; break;
						case 'i': vocali++; break;
						case 'o': o++; break;
						case 'u': u++; break;			
		 	}
		 
		 }	 
		
		 
		 
		 
		 
		 if(texto.contains("programacion")) {
				
			 System.out.println("Si aparece la palabra programcion ");
		 }else {
			 System.out.println("no aparece la palabra programcion ");
		 }
	
		
		System.out.println("No aparecen las siguientes letras del abecedario:");
		
		char x,y;
		     for(x='z'; x>='a'; x--){
		        contador=0;
		          for(int i=0;i<texto.length(); i++) {
		        	  
		        	  if(x==texto.charAt(i)) {
		        		  contador++;
		        	  }
		          }

		          if(contador==0) {
		        	  System.out.print(x);
		        	 
		          }
		        
			}
		 
		 
		 
		 
		 	System.out.println(" La letra a tiene "+a+" veces");
			System.out.println("La letra e tiene "+e+" veces");
			System.out.println("La letra i tiene "+vocali+" veces");
			System.out.println("La letra o tiene "+o+" veces");
			System.out.println("La letra u tiene "+u+" veces");
	
		 

		
			System.out.println("La palabra invertida es: " + invertida);	
		
			System.out.println("El texto con solo e: "+texto.replace('a','e').replace('i', 'e').replace('o', 'e').replace('u', 'e'));
		
			System.out.println("El texto contiene "+(palabras+1)+" palabras");
			
		
		
	      

	}
}
