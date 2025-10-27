package java_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_33 {

	public static void main(String[] args) {

		/*
		 * 33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
		 * calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:  
		 *    a. Professor Nível 1 R$12,00 por hora/aula; 
		 *    b. Professor Nível 2 R$17,00 por hora/aula; 
		 *    c. Professor Nível 3 R$25,00 por hora/aula.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nivel, horaAula, aulas;
		double salario;
		
		System.out.print("Digite o nivel do professor: ");
		nivel = sc.nextInt();
		
		while (nivel != 1 && nivel != 2 && nivel != 3) {
			System.out.println("Nivel invalido!");
			System.out.print("Digite o nivel do professor: ");
			nivel = sc.nextInt();
		}
		
		System.out.print("Quantidade de aulas dadas: ");
		aulas = sc.nextInt();
		
		if (nivel == 1) {
			horaAula = 12;
		} else if (nivel == 2) {
			horaAula = 17;
		} else {
			horaAula = 25;
		}
		
		salario = aulas * horaAula;
		
		System.out.print("Salario: R$" + String.format("%.2f",salario));
		
		sc.close();
		
	}

}