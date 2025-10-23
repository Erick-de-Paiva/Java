package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_16 {

	public static void main(String[] args) {

		/* 
		 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
		 * sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
		 * Recuperação (media entre 5.1 a 6.9);
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		float[]nota = new float[10];
		float media = 0;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		for (int i = 1;i <= 3; i++) {
			
			System.out.print("Nota " + i + ": ");
			nota[i] = sc.nextFloat();
			
			while (nota[i] < 0 || nota[i] > 10) {
				System.out.println("Nota invalida!");
				System.out.print("Nota " + i + ": ");
				nota[i] = sc.nextFloat();
			}	
		}
		
		for (int i = 1;i <= 3; i++) {
			media = media + nota[i];
		}
		
		media = media / 3;
		
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Media: " + String.format("%.1f",media));
		
		if (media <= 5) {
			System.out.print("Reprovado!");
		} else if (media >= 5.1 && media <= 6.9) {
			System.out.print("Recuperacao!");
		} else {
			System.out.print("Aprovado!");
		}
		
		sc.close();
		
	}

}