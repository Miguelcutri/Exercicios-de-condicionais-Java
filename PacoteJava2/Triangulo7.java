//7) Receber valores de base e altura de um tri�ngulo
//e verificar se s�o valores v�lidos (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo

package PacoteJava2;
import java.util.*;
public class Triangulo7 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, area;
		
		System.out.println("Qual altura do tri�ngulo?");
		a = ler.nextInt();
		
		System.out.println("Qual a base do tri�ngulo?");
		b = ler.nextInt();
		
		if (a>0 && b>0) {
			area = a * b /2;
			
			System.out.println("A �rea do tri�ngulo � "+ area);
		}
		else {
			System.out.println("Digite um valor positivo");
		}
	}

}
