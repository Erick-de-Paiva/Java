package java_exercicios;

import java.util.Scanner;

public class exercicio_29 {

	public static void main(String[] args) {

		// 29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;

		Scanner sc = new Scanner(System.in);
		
		int mes;
		
		System.out.print("Digite o numero do mes (1 a 12): ");
		mes = sc.nextInt();
		
		while (mes < 1 || mes > 12) {
			System.out.println("Numero invalido!");
			System.out.print("Digite o numero do mes (1 a 12): ");
			mes = sc.nextInt();
		}
		
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Marco");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else {
			System.out.println("Dezembro");	
		}
		
		sc.close();

	}
	
}