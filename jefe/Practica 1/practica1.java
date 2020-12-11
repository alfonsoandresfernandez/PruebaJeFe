 import java.util.Scanner;
import java.text.DecimalFormat;

public class practica1 {




			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				DecimalFormat formateador = new DecimalFormat("0000.00");
				
				Scanner teclado1 = new Scanner(System.in);
				
				String nombre = null;
				double altura=0;
				int n1=0;
				double peso=0;
				double imc=0;
				int paciente=0;
				double alturamax=0;
				double pesomin=0;
				double imcmax=0;
				double imcmin=0;
				int imcobeso=0;
				int imcsobrepeso=0;
				int imcnormal=0;
				int imcbajopeso=0;
				String nombre1 = null;
				String nombre2 = null ;
				String nombre3 = null ;
				String nombre4 = null ;
				String nombre5 = null ;

					
				
					while(paciente<=0) {
						System.out.println("Introduzca cuantos pacientes tiene su consulta:");
					
						Scanner teclado2= new Scanner(System.in);
					
						boolean comprobacion = teclado2.hasNextInt();	
					
						if (comprobacion) {
							paciente=teclado2.nextInt();
						}
					}
					
				for(int i=1;i<=paciente;) {
						
						
						System.out.println("Introduzca el nombre del paciente "+i++);
						nombre=teclado1.next();
						
						System.out.println("Introduzca la altura de "+nombre);
						altura=teclado1.nextDouble();
						
						System.out.println("Introduzca la peso de "+nombre);
						peso=teclado1.nextDouble();
						
						System.out.println(nombre +"Tiene un IMC de: "+peso/(altura*altura));
						
						if(altura>alturamax) {
							alturamax=altura;
							nombre2=nombre;
						}
						if(peso>pesomin) {
							pesomin=peso;
							nombre3=nombre;
						}
						if(imcmin>imc) {
							imcmin=imc;
							nombre4=nombre;
						}
						if(imcmax>imc) {
							imcmax=imc;
							nombre5=nombre;
						}
						if(imc<18.5) {
							imcbajopeso++;
							}
							else if(imc<=18.5 || imc<25 ) {
							imcnormal++;
							}
							else if(imc<=25 || imc<40) {
							imcsobrepeso++;
							}
							else if(imc>40) {
							imcobeso++;
							}
			
						
						
						
						
						
					
					
					
					
					
				}
				System.out.println("La media de la altura es "+altura/paciente);
				System.out.println("La media del peso es " +peso/paciente);
				System.out.println(nombre+" es el mas alto con "+ alturamax+" metros");
				System.out.println(nombre+" es el mas delgado con "+ pesomin+" kilos");
				System.out.println(nombre+"tiene el IMC mas alto "+ imcmax);
				System.out.println(nombre+"tiene el IMC mas bajo "+ imcmin);
				
				
				
				System.out.println("Hay " +imcbajopeso  + " paciente con bajo peso");
				System.out.println("Hay " +imcnormal + " paciente con peso normal");
				System.out.println("Hay " +imcsobrepeso + " paciente con sobrepeso");
				System.out.println("Hay " +imcobeso + " paciente con obesidad");
			
	}

}
