package java_exercicios;

import java.util.Scanner;

public class exercicio_21 {

	public static void main(String[] args) {
	
		/*
		 * 21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
		 * ou não para cumprir o serviço militar obrigatório. Informe os totais;
		 */

		Scanner sc =  new Scanner(System.in);
		
		int N, i, idade, naoApta = 0, apta = 0;
		String nome;
		char sexo, saude;
		
		System.out.print("Quantas pessoas serao? ");
		N = sc.nextInt();
		System.out.println();
		
		for (i = 0; i < N; i++) {
			System.out.println((i+1) +"º pessoa:");
			
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Sexo (m/f): ");
			sexo = sc.next().charAt(0);
			while (sexo != 'm' && sexo != 'f') {
				System.out.println("Opcao invalida!");
				System.out.print("Sexo (m/f): ");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			System.out.print("Saude ('s' para saudavel / 'n' para nao saudavel): ");
			saude = sc.next().charAt(0);
			while (saude != 's' && saude != 'n') {
				System.out.println("Opcao invalida!");
				System.out.print("Saude ('s' para saudavel / 'n' para nao saudavel): ");
				saude = sc.next().charAt(0);
			}
			
			if (sexo != 'm' || idade < 18 || saude != 's') {
				System.out.println("Voce nao esta apto a cumprir o servico militar obrigatorio!");
				naoApta++;
			} else {
				System.out.println("Voce esta apto a cumprir o servico militar obrigatorio!");
				apta++;
			}
			
			System.out.println();
			
		}
		
		System.out.println("Total de pessoas aptas: " + apta);
		System.out.println("Total de pessoas nao aptas: " + naoApta);
		
		sc.close();
		
	}

}