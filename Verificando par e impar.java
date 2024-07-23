import java.util.Scanner;
public class Main
{

	public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
		System.out.println("Digite um número:");
		double numero=input.nextDouble();
		if(numero % 2 == 0){
		    System.out.println("O numero será par");
		}else{
		   System.out.println("O número será ímpar");
		}
		verificar (numero);
	}
	public static void verificar(double numero){
	    System.out.println("Verificando se é par ou impar......");
	    	if(numero % 2 == 0){
	    	    System.out.println("O numero é par");
	    	}else{
	    	  System.out.println("O número é ímpar"); 
	    	}
	    
	}
}
