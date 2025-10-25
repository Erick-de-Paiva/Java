package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_24 {

	public static void main(String[] args) {
	
		// 24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		float numero;
		
		System.out.print("Quantos numero deseja digitar? ");
		N = sc.nextInt();
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextFloat();
			
			if (numero > 0) {
				System.out.println("Positivo!");
			} else if (numero < 0) {
				System.out.println("Negativo!");
			} else {
				System.out.println("Zero!");
			}	
			
			System.out.println();
			
		}
		
		sc.close();
		
	}

}