//3) Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.


package PacoteJava2;
import java.util.*;
public class quadrado3 {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, n4, q1,q2,q3,q4;
		
		System.out.println("Digite n1: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite n2: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite n3: ");
		n3 = ler.nextInt();
		
		System.out.println("Digite n4: ");
		n4 = ler.nextInt();
		
		q1 = n1*n1;
		q2 = n2*n2;
		q3 = n3*n3;
		q4 = n4*n4;
		
		if (q3>1000) {
			System.out.println("Quadrado de n3 é: " + q3);
		}
		else {
			System.out.println("n1 = "+ q1 + " n2 = "+ q2+ " n3 = "+q3+" n4 2= "+ q4);
		}
	}
}
