package java_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_06 {

	public static void main(String[] args) {
		
		/*6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a 
		 *possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores 
		 *trocados;
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float valorA, valorB, troca;
		
		System.out.print("Valor A: ");
		valorA = sc.nextFloat();
		
		System.out.print("Valor B: ");
		valorB = sc.nextFloat();
		
		troca = valorA;
		valorA = valorB;
		valorB = troca;
		
		System.out.println("Valor trocado:");
		
		System.out.println("Valor A = " + valorA);
		System.out.println("Valor B = " + valorB);
		
	}

}