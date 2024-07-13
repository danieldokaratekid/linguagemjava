import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		String [] nome = new String[4];
		for(int i = 0; i < 4; i++){
		System.out.println("Digite o nome do candidato"+ (i+1)+":");
        nome[i]=input.nextLine();
		}
		for(int i = 0;i < 4; i++){
		System.out.println("Digite o código do voto(1 á 6) :");
        int voto=input.nextInt();
        input.nextLine();
        if(voto == 5){
            System.out.println("O voto de" + nome[i] + " é nulo");
        }else if(voto == 6){
            System.out.println("O voto de"+ nome[i]+"é branco");
        }else{
            System.out.println("O codigo de voto não é valido!!!!");
        }
        System.out.println("O total votos foi:"+ voto +"totais");
        System.out.println();
		
       	input.close();
		}

	}
}

   


        
       
       

           