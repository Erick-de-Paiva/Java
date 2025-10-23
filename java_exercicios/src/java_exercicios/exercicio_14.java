package java_exercicios;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {

		// 14. Escreva um algoritmo que leia dois valores inteiros distintos e informe qual é o maior;
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("Escreva o primeiro numero inteiro: ");
		n1 = sc.nextInt();
		
		System.out.print("Escreva o segundo numero inteiro: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("O primeiro numero é maior!");
		} else {
			System.out.println("O segundo numero é maior!");
		}
		
		sc.close();
		
	}

}