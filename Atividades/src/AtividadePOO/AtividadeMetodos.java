package AtividadePOO;

import java.util.Scanner;

public class AtividadeMetodos {
		
	/* 1.Fa�a um programa que contenha tr�s m�todos em uma classe chamada ExemploMetodos:

	a)imprimirTela()
	nEste m�todo n�o deve retornar nenhum valor, apenas exibir alguma mensagem na tela
	b)concatenarNomes()
	Este m�todo deve retornar uma string contendo a jun��o de dois nomes. Deve-se passar como par�metros nome e sobrenome ambos do tipo string
	c)subtrairNumeros()
	Semelhante ao anterior, por�m, deve-se trabalhar com dois par�metros do tipo inteiro. O m�todo deve conter um atributo chamado de resultado que receber� a subtra��o dos dois n�meros
	2.Execute todos os m�todos criados anteriormente para test�-los
	�Para isso voc� dever� chama-los num m�todo main em uma outra classe java
	Reveja o slide 15 para revisar o procedimento necess�rio para utilizar os m�todos
	*/
	
	
	public static void main(String[] args) {
		
		ExemploMetodos mensagem = new ExemploMetodos();
		mensagem.imprimeTela();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro nome:");
		String primeiroNome = entrada.next();
		
		System.out.println("Digite o seu segundo nome:");
		String sobrenome = entrada.next();
		
		System.out.println(mensagem.concatenarNomes(primeiroNome, sobrenome));
		
		System.out.println("Agora, digite um numero:");
		int numero1 = entrada.nextInt();
		
		System.out.println("Agora, digite o segundo numero:");
		int numero2 = entrada.nextInt();
		
		System.out.println(mensagem.subtrairNumeros(numero1, numero2));
		
		entrada.close();
		
	}

}
