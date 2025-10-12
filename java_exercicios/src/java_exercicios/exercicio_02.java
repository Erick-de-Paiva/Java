package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		/*
		 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos; 
		*/
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		
		System.out.print("Escreva o primeiro numero: ");
		numero1 = sc.nextFloat();

		System.out.print("Escreva o segundo numero: ");
		numero2 = sc.nextFloat();
		
		soma = numero1 + numero2;
		System.out.println("SOMA = " + soma);
		
		subtracao = numero1 - numero2;
		System.out.println("SUBTRACAO = " + subtracao);
		
		multiplicacao = numero1 * numero2;
		System.out.println("MULTIPLICACAO = " + multiplicacao);
		
		if (numero2 != 0) {
			divisao = numero1 / numero2;
			System.out.println("DIVISAO = " + divisao);
		} else {
			System.out.println("DIVISAO = ERRO!"); 
		}
		
		sc.close();
		
	}

}