//8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
//for maior que 100, caso contrário imprimi-la com o valor zero.

package PacoteJava2;
import java.util.*;
public class Numeros8 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero");
		numero = ler.nextInt();
		
		if(numero>=100) {
			System.out.println(numero);
		}
		else {
			System.out.println("0");
		}
	}
}
