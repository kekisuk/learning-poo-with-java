package AtividadePOO;

import java.util.Scanner;

public class AtividadeMetodos {
		
	/* 1.Faça um programa que contenha três métodos em uma classe chamada ExemploMetodos:

	a)imprimirTela()
	nEste método não deve retornar nenhum valor, apenas exibir alguma mensagem na tela
	b)concatenarNomes()
	Este método deve retornar uma string contendo a junção de dois nomes. Deve-se passar como parâmetros nome e sobrenome ambos do tipo string
	c)subtrairNumeros()
	Semelhante ao anterior, porém, deve-se trabalhar com dois parâmetros do tipo inteiro. O método deve conter um atributo chamado de resultado que receberá a subtração dos dois números
	2.Execute todos os métodos criados anteriormente para testá-los
	¤Para isso você deverá chama-los num método main em uma outra classe java
	Reveja o slide 15 para revisar o procedimento necessário para utilizar os métodos
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
