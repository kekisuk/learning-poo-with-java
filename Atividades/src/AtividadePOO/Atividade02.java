package AtividadePOO;

import java.util.Scanner;

public class Atividade02 {
	
	// Escreva um programa em Java que leia dois números reais e informe:
	//a. o quociente, a soma, o produto e a diferença entre estes números.
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Digite um numero: ");
		double variavel1 = entrada.nextDouble();
		
		System.out.println("Digite outro numero: ");
		double variavel2 = entrada.nextDouble();
		
		System.out.println("Quociente: " + variavel1/variavel2);
		System.out.println("Soma: " + (variavel1+variavel2));
		System.out.println("Produto: " + variavel1*variavel2);
		System.out.println("Diferenca: " + (variavel1-variavel2));
		
		entrada.close();
	
		
	}

}
