//4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem
//indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.


package PacoteJava2;
import java.util.*;
public class Impares4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um n�mero: ");
		n = ler.nextInt();
		
		if (n%2==0 && n>0) {
			System.out.println("Esse n�mero � par e � positivo!");
		}
		
		if (n%2==0 && n<0) {
			System.out.println("Esse n�mero � par e � negativo!");
		}
		
		if (n%2!=0 && n>0) {
			System.out.println("Esse n�mero � �mpar e � positivo!");
		}
		
		if (n%2!=0 && n<0) {
			System.out.println("Esse n�mero � �mpar e � negativo!");
		}
				
	}
}
