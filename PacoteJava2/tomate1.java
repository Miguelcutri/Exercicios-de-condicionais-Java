//1) Jo�o TOMATEIRO, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo
//(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que
//leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel
//E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.

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


