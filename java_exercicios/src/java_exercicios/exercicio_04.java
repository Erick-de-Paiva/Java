package java_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_04 {

	public static void main(String[] args) {

		/* 
		 * 4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
		 * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
		 * efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
		 */
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		String nome;
		double salarioFixo, salarioFinal, totalVendas;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Salario fixo: ");
		salarioFixo = sc.nextDouble();
		
		System.out.print("Total em vendas : R$");
		totalVendas = sc.nextDouble();
		
		salarioFinal = salarioFixo + (totalVendas * 0.15);
		
		System.out.println();
		System.out.println("Nome do vendedor: " + nome);
		System.out.println("Salario fixo: " + salarioFixo);
		System.out.println("Salario final: " + salarioFinal);
		
		sc.close();
		
	}

}