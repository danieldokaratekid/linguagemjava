import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		System.out.println("Digite o tempo gasto na viagem:");
		int tempogasto=input.nextInt();
		System.out.println("Digite a velocidade percorrida:");
        double velocidademedia=input.nextDouble();
        
        double  distancia=tempogasto * velocidademedia;
        
    
        //12 KM percorre uma distancia de 1km; 
        double litrosusados = distancia/12; 
		System.out.println("O tempo gasto na viagem foi:"+ tempogasto +"horas");
		System.out.println("A quantidade de litros gasta na viagem foi:"+ litrosusados + "litros");
       	System.out.println("A distancia percorrida foi:"+ distancia +"km");
       	System.out.println("A velocidade média percorrida foi:"+ velocidademedia +"km/h");
       	input.close();


	}
}

   
