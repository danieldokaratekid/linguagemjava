import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		String[]nome=new String[3];
		for(int i=0;i<3;i++){
		System.out.println("Digite o nome do aluno"+(i+1)+":");
		nome[i]=input.nextLine();
		}
        int[]nota=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Digite a nota do aluno"+(i+1)+":");
            nota[i]=input.nextInt();
        }
            int soma=0;
            int alunosete=0;
            for(int i=0;i<3;i++){
                soma+=nota[i];
                if(nota[i]>=7){
                alunosete++;
            }
		}
	        double media=(double)soma/3;
	        boolean algumMaiorQueCinco=false;
	        for(int i=0;i<3;i++){
	            if(nota[i]>5){
	                algumMaiorQueCinco=true;
	                break;
	            }
	        }
	        if(!algumMaiorQueCinco){
	            System.out.println("Não há aluno com média maior que 5");
	        }else{
	           System.out.println("Há alunos com média maior que 5"); 
	        }
		
		 System.out.println("A media das notas é:"+ media);
		 System.out.println("A Quantidade de alunos com média com nota 7 ou acima é:"+alunosete);
		
	}
}
