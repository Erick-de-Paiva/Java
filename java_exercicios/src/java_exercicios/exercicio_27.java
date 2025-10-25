package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_27 {

	public static void main(String[] args) {

		/*
		 * 27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
		 * algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
		 * calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
		 * Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char combustivel;
		double valorAntes = 1, valorDepois = 0, totalDesconto = 0, totalPago = 0;
		
		System.out.print("Valor do veiculo sem desconto: R$");
		valorAntes = sc.nextDouble();
		
		while (valorAntes != 0) {
			while (valorAntes < 0) {
				System.out.println("Valor invalido!");
				System.out.print("Valor do veiculo sem desconto: R$");
				valorAntes = sc.nextDouble();
			}
			
			System.out.print("Tipo de combustivel ('a' = alcool/'g' = gasolina/'d' = diesel): ");
			combustivel = sc.next().charAt(0);
			
			while (combustivel != 'a' && combustivel != 'g' && combustivel != 'd') {
				System.out.println("Tipo de combustivel invalido!");
				System.out.print("Tipo de combustivel ('a' = alcool/'g' = gasolina/'d' = diesel): ");
				combustivel = sc.next().charAt(0);
			}
			
			if (combustivel == 'a') {
				valorDepois = valorAntes * 0.75;
				System.out.println("Valor final: R$" + String.format("%.2f",valorDepois));
				totalDesconto = totalDesconto + (valorAntes - valorDepois);
				totalPago = totalPago + valorDepois;
			} else if (combustivel == 'g') {
				valorDepois = valorAntes * 0.79;
				System.out.println("Valor final: R$" + String.format("%.2f",valorDepois));
				totalDesconto = totalDesconto + (valorAntes - valorDepois);
				totalPago = totalPago + valorDepois;
			} else {
				valorDepois = valorAntes * 0.86;
				System.out.println("Valor final: R$" + String.format("%.2f",valorDepois));
				totalDesconto = totalDesconto + (valorAntes - valorDepois);
				totalPago = totalPago + valorDepois;
			}
			
			System.out.println();
			System.out.print("Valor do veiculo sem desconto: R$");
			valorAntes = sc.nextDouble();
			
		}
		
		System.out.println();
		System.out.println("Total de desconto: R$" + String.format("%.2f",totalDesconto));
		System.out.println("Total pago pelos clientes: R$" + String.format("%.2f",totalPago));
		
		sc.close();
		
	}

}