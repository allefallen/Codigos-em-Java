package lista01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int anoNasc;
		int anoAtual;
		int idade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento: ");
		anoNasc = scan.nextInt();
		
		System.out.println("Em que ano vc est�: ");
		anoAtual = scan.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade eh: "+idade+ " Anos");
		
		

	}

}
