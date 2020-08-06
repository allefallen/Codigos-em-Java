package adivinhanumero;

import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int chute = 0;
		int erro = 0;
		int ran;
		int tentativa = 3;
		
		ran = gerador.nextInt(10);
		
		while(tentativa != erro) {
			
			System.out.println("chute um n�mero: ");
			chute = scan.nextInt();
			
			
			if(chute < ran) {
				
				System.out.println("Dica: O N�mero eh maior");
				tentativa -= 1;
				System.out.println("Vc tem mais "+tentativa+" tentativas");
				
				
			}else if(chute > ran) {
				
				System.out.println("Dica: O N�mero eh menor");
				tentativa -= 1;
				System.out.println("Vc tem mais "+tentativa+" tentativas");
				
				
			}else{
				
				System.out.println("VC ACERTOU");
				System.out.println("N�mero aleatorio: "+ran);
				
			}
			
			
		}
		
		
		System.out.println("PERDEU");
		System.out.println("N�mero aleatorio era: "+ran);
		
		
			
		
			
		
		
		
		

	}

}
