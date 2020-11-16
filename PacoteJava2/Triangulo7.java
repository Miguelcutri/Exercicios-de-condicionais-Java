//7) Receber valores de base e altura de um triângulo
//e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo

package PacoteJava2;
import java.util.*;
public class Triangulo7 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, area;
		
		System.out.println("Qual altura do triângulo?");
		a = ler.nextInt();
		
		System.out.println("Qual a base do triângulo?");
		b = ler.nextInt();
		
		if (a>0 && b>0) {
			area = a * b /2;
			
			System.out.println("A área do triângulo é "+ area);
		}
		else {
			System.out.println("Digite um valor positivo");
		}
	}

}
