package java_exercicios;

import java.util.Scanner;

public class exercicio_18 {

	public static void main(String[] args) {

		/*
		 * 18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
		 * “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
		 */

		Scanner sc = new Scanner(System.in);
		
		int[]idade = new int[75];
		
		for (int i = 0; i < 75; i++) {
			System.out.print("Idade da " + (i+1) + "º pessoa: ");
			idade[i] = sc.nextInt();
			
			while (idade[i] < 0) {
				System.out.println("Idade invalida!");
				System.out.print("Idade da " + (i+1) + "º pessoa: ");
				idade[i] = sc.nextInt();
			}
			
			if (idade[i] >= 18) {
				System.out.println("Maior de idade!");
			} else {
				System.out.println("Menor de idade!");
			}
			
		}
		
		sc.close();
		
	}

}