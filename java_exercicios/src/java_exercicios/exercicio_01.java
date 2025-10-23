package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		
		// 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float numero1, numero2;
		
		System.out.print("Escreva o primeiro número: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Escreva o segundo número: ");
		numero2 = sc.nextFloat();
		
		float resultado = numero1 + numero2;
		
		System.out.print("Resultado da soma: " + resultado);
		
		sc.close();
	}

}