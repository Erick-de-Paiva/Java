package java_exercicios;

import java.util.Scanner;

public class exercicio_26 {

	public static void main(String[] args) {
		
		/*
		 * 26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
		 * que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero < 1 || numero > 5) {
			System.out.print("Numero invalido!");
		} else {
			if (numero == 1 ) {
				System.out.print("Um");
			} else if (numero == 2) {
				System.out.print("Dois");
			} else if (numero == 3) {
				System.out.print("Tres");
			} else if (numero == 4) {
				System.out.print("Quatro");
			} else {
				System.out.print("Cinco");
			}
			
		}

		sc.close();
		
	}

}