//1) João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo
//(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que
//leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável
//E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.

package PacoteJava2;

import java.util.Scanner;
public class tomate1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int p, e=0, m=4, multa;
		
		System.out.println("Digite o peso dos tomates: ");
		p= ler.nextInt();
		
		if(p>50) {
			e = p - 50;
			multa = e*m;
			System.out.println(multa);
		}
		
		

	}
}


