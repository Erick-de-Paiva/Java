package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_22 {

	public static void main(String[] args) {

		/* 
		 * 22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
		 * se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
		 * de venda de cada produto, a média de preço de custo e do preço de venda;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float[]valorCusto = new float[40]; 
		float[]valorVenda = new float[40];
		float mediaCusto = 0, mediaVenda = 0;
		int i;
		
		for (i = 0; i < 40; i++) {
			System.out.print("Valor de custo: R$");
			valorCusto[i] = sc.nextFloat();
			mediaCusto = mediaCusto + valorCusto[i];
			
			System.out.print("Valor de venda: R$");
			valorVenda[i] = sc.nextFloat();
			mediaVenda = mediaVenda + valorVenda[i];
			
			if (valorCusto[i] < valorVenda[i]) {
				System.out.println("Resultado: Lucro!");
			} else if (valorCusto[i] > valorVenda[i]) {
				System.out.println("Resultado: Prejuizo!");
			} else {
				System.out.println("Resultado: Empate!");
			}
		
			System.out.println();
			
		}
		
		for (i = 0; i < 40; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.println("Valor de custo: R$" + String.format("%.2f",valorCusto[i]));
			System.out.println("Valor de venda: R$" + String.format("%.2f",valorVenda[i]));
			System.out.println();
		}	
		
		mediaCusto = mediaCusto / 40;
		mediaVenda = mediaVenda / 40;
		
		System.out.println("Media de preco de custo: R$" + String.format("%.2f",mediaCusto));
		System.out.println("Media de preco de venda: R$" + String.format("%.2f",mediaVenda));
		
		sc.close();
		
	}

}