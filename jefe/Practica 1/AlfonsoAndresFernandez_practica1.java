import java.text.DecimalFormat;
import java.util.Scanner;
public class cacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat formateador = new DecimalFormat("#0.00");
		
		Scanner teclado1 = new Scanner(System.in);
		
		String nombre = null;
		double altura=0;
		int n1=0;
		int peso=0;
		double imc=peso/(altura*altura);
		int paciente=0;
		double alturamax=0;
		double pesomin=200;
		double imcmax=1.1;
		double imcmin=60;
		int totalpeso = 0;
		double totalaltura = 0.0;
		int imcobeso=0;
		int imcsobrepeso=0;
		int imcnormal=0;
		int imcbajopeso=0;
		String nombre1 = null;
		String nombre2 = null;
		String nombre3 = "" ;
		String nombre4 = "" ;
		String nombre5 = "" ;

			
		
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
				peso=teclado1.nextInt();
				
				imc=peso/(altura*altura);
				System.out.println(nombre +"Tiene un IMC de: "+formateador.format (imc));
				
				totalpeso=(totalpeso+peso/paciente);
				totalaltura=totalaltura+altura/paciente;	
				
				
				if(altura>alturamax) {
					alturamax=altura;
					nombre2=nombre;
				}
				if(peso<pesomin) {
					pesomin=peso;
					nombre3=nombre;
				}
				if(imcmin>imc) {
					imcmin=imc;
					nombre4=nombre;
				}
				if(imcmax<imc) {
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
	
			
			
			
		
		System.out.println("La media del peso es "+ totalpeso);
		System.out.println("La media de la alturas " + formateador.format(totalaltura));
		System.out.println(nombre2+" es el mas alto con "+ alturamax+" metros");
		
		System.out.println(nombre3+" es el mas delgado con "+ pesomin+" kilos");
		
		System.out.println(nombre5+" tiene el IMC mas alto "+ formateador.format(imcmax));
		System.out.println(nombre4+" tiene el IMC mas bajo "+ formateador.format(imcmin));
		
		
		
		System.out.println("Hay " +imcbajopeso  + " paciente con bajo peso");
		System.out.println("Hay " +imcnormal + " paciente con peso normal");
		System.out.println("Hay " +imcsobrepeso + " paciente con sobrepeso");
		System.out.println("Hay " +imcobeso + " paciente con obesidad");
	

	}

}
