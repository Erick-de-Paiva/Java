package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_23 {

	public static void main(String[] args) {

		/* 
		 * 23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, 
		 * menor que 25 ou igual a 40;
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float numero;
		
		System.out.print("Digite um numero: ");
		numero = sc.nextFloat();
		
		if (numero > 80) {
			System.out.println("Esse numero e maior que 80!");
		} else if (numero == 40) {
			System.out.println("Esse numero e 40!");
		} else if (numero < 25) {
			System.out.println("Esse numero e menor que 25!");
		} else;
		
		sc.close();
		
	}

}