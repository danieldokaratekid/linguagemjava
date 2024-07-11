/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    Random random=new Random();
	    int gerador=random.nextInt(1+100);
	    int tentativa=0;
		System.out.println("Tente adivinhar um número entre 1 á 100");
		do{
		    System.out.println("Informe um número");
		    int num=input.nextInt();
		    tentativa ++;
		    if(num<gerador){
		    System.out.println("Informe um número maior:");    
		    }else if(num>gerador){
		        System.out.println("Informe um número menor:");
		    }else{
		        System.out.println(String.format("Você conseguiu em %d tentativas",tentativa));
		        break;
		    }
		    
		     }while(true);
		   
	   		input.close();

		}
      }
