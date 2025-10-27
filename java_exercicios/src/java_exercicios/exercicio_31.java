package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_31 {

	public static void main(String[] args) {
	
		/*
		 * 31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o 
		 * resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser 
		 * impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B, resultado;
		char operador;
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextFloat();
		
		System.out.print("Digite o valor de B: ");
		B = sc.nextFloat();
		
		System.out.print("Digite um operador (+ - * /): ");
		operador = sc.next().charAt(0);
		while (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
			System.out.println("Operador invalido!");
			System.out.print("Digite um operador (+ - * /): ");
			operador = sc.next().charAt(0);	
		}
		
		if (operador == '+') {
			resultado = A + B;
			System.out.print("Resultado = " + resultado);
		} else if (operador == '-') {
			resultado = A - B;
			System.out.print("Resultado = " + resultado);
		} else if (operador == '*') {
			resultado = A * B;
			System.out.print("Resultado = " + resultado);
		} else {
			while (B == 0) {
				System.out.println("[ERRO] Divisao por zero!");
				System.out.println("Digite outro valor para B: ");
				B = sc.nextFloat();
			}
			
			resultado = A / B;
			System.out.print("Resultado = " + resultado);
			
		}
		
		sc.close();
		
	}

}