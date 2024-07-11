import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Digite o número de voltas:");
		int numerovoltas=scanner.nextInt();
		int[]temposvoltas=new int[numerovoltas];
		int melhortempo=Integrer.MAX_VALUE;
		int melhorvolta=-1;
	    int somatempo=0;
	    for(int i=0;i<numerovoltas;i++){
		System.out.println("Digite o tempo de sua volta:"+(i+1)+":");
		tempovoltas[i]=scanner.nextInt();
		somatempo += tempovoltas[i];
		if(tempovoltas[i] < melhortempo){
		melhortempo=temposvoltas[i];
		melhortempo=i + 1;
		}
	    }
		double tempomedio(double) somatempo/numerovoltas;
		   System.out.println("O seu melhor de volta foi:"+ melhorvolta + "com o tempo de" + melhortempo + "segundos");
		   System.out.println("O sua média de tempo foi:"+ tempomedio);
		   scanner.close();
		 
		   }
		
//Criei um array temposVoltas para armazenar os tempos de cada volta.
//Inicializei melhorTempo com Integer.MAX_VALUE e melhorVolta com -1 para encontrar o menor tempo e a volta correspondente.
//Iterei sobre as voltas, solicitando o tempo de cada uma e atualizando a soma dos tempos.
//Atualizei melhorTempo e melhorVolta sempre que um tempo menor era encontrado.
//Calculei tempoMedio como a soma dos tempos dividida pelo número de voltas.
//Adicionei a exibição da volta em que ocorreu o melhor tempo.
}