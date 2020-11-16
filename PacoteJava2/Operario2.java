//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas
//trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
//caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do
//processamento imprimir o salário total e o salário excedente.


package PacoteJava2;
import java.util.*;
public class Operario2 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int c, n, salario, e=0, salarioE ,total;
		System.out.println("Qual o código do operário?: ");
		c = ler.nextInt();
		
		System.out.println("Qual as horas trabalhadas? : ");
		n = ler.nextInt();
	
		salario = n * 10;
		if (n>50) {
			e = n - 50;
			salarioE = e * 20;
			total = salario + salarioE;
			System.out.printf("O salário é R$ " + salario + "O salário excedente é R$", salarioE + "O salário total é R$ "+ total );
		}
		
		
	}

}
