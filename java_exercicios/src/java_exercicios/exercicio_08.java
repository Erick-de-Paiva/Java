package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {

		/*
		 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
		 * dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
		 * disponíveis com ousuário;
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float dolar, real, cotacao;
		
		System.out.print("Valor em Dólar (US$): ");
		dolar = sc.nextFloat();
		
		System.out.print("Cotacao do Dólar: ");
		cotacao = sc.nextFloat();
		
		real = dolar * cotacao;
		
		System.out.println("Valor convertido para Real (R$): " + "R$" + String.format("%.2f",real));
		
		sc.close();
		
	}

}