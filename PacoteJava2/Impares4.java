//4) Faça um sistema que leia um número inteiro e mostre uma mensagem
//indicando se este número é par ou ímpar, e se é positivo ou negativo.


package PacoteJava2;
import java.util.*;
public class Impares4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número: ");
		n = ler.nextInt();
		
		if (n%2==0 && n>0) {
			System.out.println("Esse número é par e é positivo!");
		}
		
		if (n%2==0 && n<0) {
			System.out.println("Esse número é par e é negativo!");
		}
		
		if (n%2!=0 && n>0) {
			System.out.println("Esse número é ímpar e é positivo!");
		}
		
		if (n%2!=0 && n<0) {
			System.out.println("Esse número é ímpar e é negativo!");
		}
				
	}
}
