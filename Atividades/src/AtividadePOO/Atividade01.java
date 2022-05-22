package AtividadePOO;

import java.util.Scanner;

public class Atividade01 {
		
			//Escreva um programa em Java que leia o número de prestações de um produto, o
			//seu valor de venda e calcule o valor da prestação.
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto?");
		double valor = entrada.nextDouble();
		
		System.out.println("Quantas vezes voce deseja pagar?");
		double prestacoes = entrada.nextDouble();
		
		System.out.println("O valor de cada prestacao vai ser: " + (valor/prestacoes));
		
		entrada.close();
		
		
		
	}

}
