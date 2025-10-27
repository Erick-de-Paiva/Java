package java_exercicios;

import java.util.Scanner;

public class exercicio_34 {

	public static void main(String[] args) {

		/*
		 * 34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:  
		 *    a. Infantil A = 5 - 7 anos; 
		 *    b. Infantil B = 8 - 10 anos; 
		 *    c. Juvenil A = 11- 13 anos; 
		 *    d. Juvenil B = 14 - 17 anos; 
		 *    e. Sênior = 18 - 25 anos. 
		 *    Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
		 */

		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade do nadador: ");
		idade = sc.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.print("Categoria: Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			System.out.print("Categoria: Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			System.out.print("Categoria: Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.print("Categoria: Juvenil B");
		} else if (idade >= 18 && idade <= 25) {
			System.out.print("Categoria: Senior");
		} else {
			System.out.println("Idade fora da faixa etaria!");
		}
		
		sc.close();
		
	}

}