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
		float nota1, nota2, nota3, media;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Media: " + media);
		
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