package java_exercicios;

import java.util.Scanner;

public class exercicio_19 {

	public static void main(String[] args) {

		/*
		 * 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
		 * mulher. No final informe total de homens e de mulheres;
		 */

		Scanner sc = new Scanner(System.in);
		
		String[]nome = new String[56];
		int homen = 0, mulher = 0;
		char sexo;
		
		for (int i = 0; i < 56; i++) {
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Sexo (m/f): ");
			sexo = sc.next().charAt(0);
			
			while (sexo != 'm' && sexo != 'f') {
				System.out.print("Sexo (m/f): ");
				sexo = sc.next().charAt(0);
			}
			
			if (sexo == 'm') {
				System.out.println("Nome: " + nome[i]);
				System.out.println("Homem");
				homen++;
			} else {
				System.out.println("Nome: " + nome[i]);
				System.out.println("Mulher");
				mulher++;
			}
			
			System.out.println();
			sc.nextLine();
			
		}
		
		System.out.println("Total de homens: " + homen);
		System.out.println("Total de mulheres: " + mulher);
		
		sc.close();
		
	}

}