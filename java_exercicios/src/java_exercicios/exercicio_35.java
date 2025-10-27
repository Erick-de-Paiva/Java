package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_35 {

	public static void main(String[] args) {
		
		/*
		 * 35.  Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
		 * luz segue a tabela abaixo:  
		 * Tipo de Cliente Valor do KW/h: 
		 *    a. (Residência) 0,60; 
		 *    b. (Comércio) 0,48;
		 *    c. (Indústria) 1,29.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char tipoCliente;
		double valorConta, kw;
		
		System.out.print("Digite o tipo de cliente (a = Residencia / b = Comercio / c = Industria): ");
		tipoCliente = sc.next().charAt(0);
		while (tipoCliente != 'a' && tipoCliente != 'b' && tipoCliente != 'c') {
			System.out.println("Tipo invalido!");
			System.out.println("Digite o tipo de cliente (a = Residencia / b = Comercio / c = Industria): ");
			tipoCliente = sc.next().charAt(0);
		}
		
		System.out.println("Digite a quantidade de Kw consumidos: ");
		kw = sc.nextDouble();
		
		if (tipoCliente == 'a') {
			valorConta = kw * 0.60;
		} else if (tipoCliente == 'b') {
			valorConta = kw * 0.48;
		} else {
			valorConta = kw * 1.29;
		}
		
		System.out.println("Valor da conta de luz: R$" + String.format("%.2f",valorConta));
		
		sc.close();
	}

}