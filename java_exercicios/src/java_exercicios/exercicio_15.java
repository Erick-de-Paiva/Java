package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
	
		// 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float numero;
		
		System.out.print("Escreva um numero: ");
		numero = sc.nextFloat();
		
		if (numero >= 100 && numero <= 200) {
			System.out.println("O numero esta entre 100 e 200!");
		} else {
			System.out.println("O numero nao esta entre 100 e 200!");
		}
		
	}

}