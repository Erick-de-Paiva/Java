package java_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exercicio_03 {

	public static void main(String[] args) {
	
		/*
		 * 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total 
		 * percorrida pelo automóvel e o total de combustível gasto;
		 */
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		float distancia, combustivel, consumoMedio;
		
		System.out.print("Qual a distancia total percorrida pelo automovel(km)? ");
		distancia = sc.nextFloat();
		
		System.out.print("Qual o total de combustivel gasto(litros)? ");
		combustivel = sc.nextFloat();
		
		consumoMedio = distancia / combustivel;
		
		System.out.println("Consumo medio: " + String.format("%.2f",consumoMedio) + "km/l");
		
		sc.close();
		
	}

}