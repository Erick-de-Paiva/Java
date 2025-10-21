package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		
		/*
		 * 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e 
		 * dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
		 * do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
		 * 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do 
		 * mesmo;
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double custoFabrica, percentualImposto, percentualDistribuidor, totalComImposto, valorFinal;
		
		percentualImposto = 1.45;
		percentualDistribuidor = 1.28;
		
		System.out.print("Custo de fábrica: R$");
		custoFabrica = sc.nextDouble();
		
		totalComImposto = custoFabrica * percentualImposto;
		valorFinal = totalComImposto * percentualDistribuidor;
		
		System.out.print("Valor final: " + "R$" + String.format("%.2f",valorFinal));
		
		sc.close();		
	}

}