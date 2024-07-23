import java.util.Scanner;
public class Operacoes
{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("vai começar a contagem");
System.out.println(contador(1,5));
}
public static String contador(int i,int f){
String s="";
for(int c=i;c<=f;c++)
{
s+=c+"";
}
return s.trim();
}
}