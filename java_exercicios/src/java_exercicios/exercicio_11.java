package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		
		/*
		 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
		 * preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float custo, acrescimo, valorFinal;
		
		System.out.print("Valor de custo: R$");
		custo = sc.nextFloat();
		
		System.out.print("Percentual de acrescimo (%): ");
		acrescimo = sc.nextFloat();
		
		valorFinal = custo + (custo * (acrescimo / 100));
		
		System.out.print("Valor final: " + "R$" + String.format("%.2f",valorFinal));
		
		sc.close();
		
	}

}