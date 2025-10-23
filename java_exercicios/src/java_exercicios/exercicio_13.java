package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
	
		// 13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10; 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float numero;
		
		System.out.println("Escreva um número: ");
		numero = sc.nextFloat();
		
		if (numero > 10) {
			System.out.print("Esse número é maior que 10!");
		}
		
		sc.close();
		
	}

}