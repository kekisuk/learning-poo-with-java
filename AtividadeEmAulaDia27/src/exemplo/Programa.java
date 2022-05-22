package exemplo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o preço do produto:");
		Double preco = entrada.nextDouble();
		
		System.out.println("Digite a quantidade:");
		int quantidade = entrada.nextInt();

		Produto produto = new Produto(nome, preco, quantidade);
		System.out.println(produto.nome);
		System.out.println(produto.preco);
		System.out.println(produto.quantidade);
		
		System.out.println("Total do pedido: " +(produto.preco * produto.quantidade));
		entrada.close();
	}

}
