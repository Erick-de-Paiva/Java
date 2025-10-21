package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
		
		/* 
		 * 9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
		 * mês. Considere fixo o juro da poupança em 0,07% a.m;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorInicial ,taxa ,valorFinal;
		
		taxa = 0.0007;
		
		System.out.print("Valor depositado: R$");
		valorInicial = sc.nextDouble();
		
		valorFinal = valorInicial + (valorInicial * taxa);
		
		System.out.print("Valor com rendimento: " + "R$" + String.format("%.2f",valorFinal));
		
		sc.close();
		
	}

}