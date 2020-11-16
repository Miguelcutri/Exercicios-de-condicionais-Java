//6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos


package PacoteJava2;
import java.util.*;
public class Nadador6{ 
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=5 && idade<=7) {
			System.out.println("Infantil A = 5 a 7 anos");
		}
		if (idade>=8 && idade<=11) {
			System.out.println("Infantil B = 8 a 11 anos");
		}
		
		if (idade>=12 && idade<=13) {
			System.out.println("Juvenil A = 12 a 13 anos");
		}
		if (idade>=14 && idade<=17) {
			System.out.println("Juvenil B = 14 a 17 anos");
		}
		if (idade>= 18) {
			System.out.println("Adultos =  Maiores de 18 anos");
		}

	}
}
