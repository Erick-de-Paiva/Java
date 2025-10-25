package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_25 {

	public static void main(String[] args) {

		/* 
		 * 25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
		 * imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
		 * maior, e uma mensagem que são diferentes;
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextFloat();
		
		if (n1 == n2) {
			System.out.println("Os numeros sao iguais!");
		} else {
			System.out.println("Os numeros sao diferentes!");
			if (n1 > n2) {
				System.out.println("O primeiro numero e maior!");
			} else {
				System.out.println("O segundo numero e maior!");
			}
			
		}
		
		sc.close();
		
	}

}