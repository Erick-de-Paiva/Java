package java_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_05 {

	public static void main(String[] args) {

		/*
		 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
		 * No final informar o nome do aluno e a sua média (aritmética);
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		float[]prova = new float[3]; 
		Float media = 0f;
		int i;

		
		System.out.print("Nome do aluno: ");
		nome = sc.nextLine();
		
		System.out.println();
		System.out.println("NOTAS");
		
		for(i = 0; i < 3; i++) {
			
			System.out.print("Prova "+ (i+1) +": ");
			prova[i] = sc.nextFloat();
			
			if(prova[i] >= 0 && prova[i] <= 10) {
				
				media = media + prova[i];
				
			} else {
				
				System.out.println("ERRO - VALOR INCORRETO");
				i--;
			}
		}
		
		media = media /3;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Media: " + String.format("%.2f",media));
		
		sc.close();
		
	}

}