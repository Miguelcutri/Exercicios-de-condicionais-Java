//5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos
//de ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
//varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
//suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
//intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
//notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o medido
//e emita a notifica��o adequada aos diferentes grupos de empresas.


package PacoteJava2;
import java.util.Scanner;
public class Secretaria5 {
	public static void main(String[] args) {
		float indice;         
		Scanner ler = new Scanner(System.in);         
		System.out.println("Qual o �ndice de polui��o?: ");         
		indice = Float.parseFloat(ler.nextLine());    
		System.out.println(indice); 
		if (indice >= 0.5 ) {             
			System.out.println("Todas as industrias devem suspenderem suas atividades.");         
			} 
		else if (indice >= 0.05 && indice<= 0.25) {             
			System.out.println("�ndice aceit�vel");         
			}         
		else if (indice >= 0.3 ) {             
			System.out.println("Industria 1 - Suspensa de atividades.");         
			}                  
		else if (indice >= 0.4 ) {             
				System.out.println("Industria 1 e 2 - Suspensa de atividades.");         
				}         
      
		   
		}  
	}