package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_17 {

	public static void main(String[] args) {
		
		/* 
		 * 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
		 * (inclusive);
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float[]n = new float[80];
		int contador = 0;
		
		for (int i = 0; i < 80; i++) {
			System.out.print("Escreva o numero " + (i+1) + ":");
			n[i] = sc.nextFloat();
			
			if (n[i] >= 10 && n[i] <= 150) {
				contador = contador +1;
			}
			
		}
		
		System.out.println();
		System.out.println("Quantidade de numeros no intervalo entre 10 e 150: " + contador);
		
		sc.close();
		
	}

}