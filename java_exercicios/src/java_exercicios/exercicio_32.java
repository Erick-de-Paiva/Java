package java_exercicios;

import java.util.Scanner;

public class exercicio_32 {

	public static void main(String[] args) {
	
		/* 
		 * 32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
		 * Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
		 * Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
		 * outros dois lados.  
		 *	  a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;  
		 * 	  b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. 
		 *	  c. Triângulo equilátero é também isóscele;  
		 *	  d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
		 */

		Scanner sc = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.print("Digite o primeiro lado do triangulo: ");
		lado1 = sc.nextInt();
		
		System.out.print("Digite o segundo lado do triangulo: ");
		lado2 = sc.nextInt();
		
		System.out.print("Digite o terceiro lado do triangulo: ");
		lado3 = sc.nextInt();
		
		while (lado3 >= (lado1 + lado2) || lado2 >= (lado1 + lado3) || lado1 >= (lado2 + lado3)) {
			System.out.println("[ERRO] Estes valores nao correspondem a um triangulo! Digite novamente");
			System.out.print("Digite o primeiro lado do triangulo: ");
			lado1 = sc.nextInt();
			
			System.out.print("Digite o segundo lado do triangulo: ");
			lado2 = sc.nextInt();
			
			System.out.print("Digite o terceiro lado do triangulo: ");
			lado3 = sc.nextInt();
		}
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.print("Triangulo equilatero!");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.print("Triangulo escaleno!");
		} else {
			System.out.print("Triangulo isosceles");
		}
		
		sc.close();
		
	}

}