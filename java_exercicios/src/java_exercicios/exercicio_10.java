package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		
		/*
		 * 10. Uma loja está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um 
		 * algoritmo que receba um valor de uma compra e mostre o valor das prestações;
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float compra, prestacao;
		int parcela;
		
		System.out.print("Valor da compra: R$");
		compra = sc.nextFloat();
		
		System.out.print("Em quantas vezes deseja parcelar (máx 5)? ");
		parcela = sc.nextInt();
		
		while (parcela < 0 || parcela > 5) {
			System.out.println("Valor não aceito!");
			System.out.print("Em quantas vezes deseja parcelar (máx 5)? ");
			parcela = sc.nextInt();
		} 
		
		if (parcela >= 1 && parcela <= 5) {
			prestacao = compra / parcela;
			System.out.println("Valor final: " + "R$" + String.format("%.2f",prestacao));
			} else {
				System.out.print("Valor final: " + "R$" + String.format("%.2f",compra));
			}
		
		sc.close();
		
	}
	
}	