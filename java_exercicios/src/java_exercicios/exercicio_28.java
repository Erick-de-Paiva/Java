package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_28 {

	public static void main(String[] args) {

		/*
		 * 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
		 * com os seguintes critérios:  
		 *	  a. 50% para aqueles que ganham menos do que três salários mínimos; 
		 *	  b. 20% para aqueles que ganham entre três até dez salários mínimos;  
		 *	  c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;  
		 *	  d. 10% para os demais funcionários.
		 * Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
		 * reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa 
		 * vai aumentar sua folha de pagamento;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo, reajuste, aumento = 0;
		String[]nome = new String[584];
		double[]salarioAntes = new double[584];
		double[]salarioDepois = new double[584];
		
		System.out.print("Valor do salario minimo: R$");
		salarioMinimo = sc.nextDouble();
		System.out.println();
		
		for (int i = 0; i < 584; i++) {
			sc.nextLine();
			System.out.print("Digite seu nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Digite seu salario: R$");
			salarioAntes[i] = sc.nextDouble();
			
			if (salarioAntes[i] < (salarioMinimo * 3)) {
				salarioDepois[i] = salarioAntes[i] * 1.50;
				reajuste = salarioDepois[i] - salarioAntes[i];
				aumento = aumento + reajuste;
			} else if (salarioAntes[i] <= (salarioMinimo * 10)) {
				salarioDepois[i] = salarioAntes[i] * 1.20;
				reajuste = salarioDepois[i] - salarioAntes[i];
				aumento = aumento + reajuste;
			} else if (salarioAntes[i] <= (salarioMinimo * 20)) {
				salarioDepois[i] = salarioAntes[i] * 1.15;
				reajuste = salarioDepois[i] - salarioAntes[i];
				aumento = aumento + reajuste;
			} else {
				salarioDepois[i] = salarioAntes[i] * 1.10;
				reajuste = salarioDepois[i] - salarioAntes[i];
				aumento = aumento + reajuste;
			}
			
		System.out.println("Salario reajustado!");
		System.out.println("Nome: " + nome[i]);
		System.out.println("O reajuste foi de: R$" + String.format("%.2f",reajuste));
		System.out.println("Seu novo salario: R$" + String.format("%.2f",salarioDepois[i]));
		System.out.println();
		
		}
		
		System.out.println("O aumento total na folha de pagamento sera de: R$" + String.format("%.2f",aumento));
		sc.close();
		
	}

}