package lista01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] imc = new double[6];
		double peso;
		double altura;
		int acima = 0;
		int abaixo = 0;
		int ideal = 0;
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(+i+"� pessoa informe seu peso: ");
			peso= scan.nextDouble();
			
			System.out.println(+i+"� pessoa informe sua altura: ");
			altura = scan.nextDouble();
			
			imc[i] = peso / (altura * altura);
			
			System.out.println("======================================");
			
			}
		
		for(int j = 1; j <= 5; j++) {
			
			if(imc[j] < 18.5) {
				
				acima += 1;
				
				
			}else if(imc[j] > 18.5 && imc[j] < 25) {
				
				
				ideal += 1;
				
				
			}else if(imc[j] >= 25) {
				
				abaixo += 1;
				
				
			}
			
		
		}
		
		System.out.println(+acima+" pessoa(s) est�o acima do peso");
		System.out.println(+ideal+" pessoa(s) est�o com o peso ideal");
		System.out.println(+abaixo+" pessoa(s) est�o abaixo do peso");
		
	
		}

	
	

	}


