package java_exercicios;

import java.util.Scanner;

public class exercicio_30 {

	public static void main(String[] args) {

		// 30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, troca;

		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		
		if (n1 > n2) {
			troca = n1;
            n1 = n2;
            n2 = troca;
        }
		
        if (n1 > n3) {
        	troca = n1;
            n1 = n3;
            n3 = troca;
        }
        
        if (n2 > n3) {
        	troca = n2;
            n2 = n3;
            n3 = troca;
        }

        System.out.println("Numeros em ordem crescente: " + n1 + ", " + n2 + ", " + n3);

		sc.close();
		
	}

}