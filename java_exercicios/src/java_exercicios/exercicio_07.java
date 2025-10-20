package java_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_07 {

	public static void main(String[] args) {
		
		/*
		 * 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
		 * conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius; 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float c, f;
		
		System.out.print("Temperatura em Celsius: ");
		c = sc.nextFloat();
		
		f = (9 * c + 160) / 5;
		
		System.out.println("Convertida em Fahrenheit: " + f);

		sc.close();
		
	}

}