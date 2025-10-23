package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {

	public static void main(String[] args) {
	
		/* 
		 * 20. Uma concessionária de veículos está vendendo os seus veículos com desconto. Faça um algoritmo
		 * que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
		 * desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
		 * sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
		 * Informar total de carros com ano até 2000 e total geral;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorAntes, valorDepois, valorDesconto;
		int ano;
		char continuar = 's';
		
		while (continuar == 's') {
			System.out.print("Valor do veiculo sem desconto: R$");
			valorAntes = sc.nextDouble();
			
			System.out.print("Ano do veiculo: ");
			ano = sc.nextInt();
			
			if (ano < 2000) {
				valorDepois = valorAntes * 0.88;
				valorDesconto = valorAntes - valorDepois;
				System.out.println("Valor do desconto: R$" + String.format("%.2f",valorDesconto));
				System.out.println("Valor final: R$" + String.format("%.2f",valorDepois));
			} else {
				valorDepois = valorAntes * 0.93;
				valorDesconto = valorAntes - valorDepois;
				System.out.println("Valor do desconto: R$" + String.format("%.2f",valorDesconto));
				System.out.println("Valor final: R$" + String.format("%.2f",valorDepois));
			}
			
			System.out.print("Deseja continuar(s/n)?");
			continuar = sc.next().charAt(0);
			while (continuar != 's' && continuar != 'n') {
				System.out.println("Opcao invalida!");
				System.out.print("Deseja continuar(s/n)?");
				continuar = sc.next().charAt(0);
			}
				
		}
			
		sc.close();
		
	}

}