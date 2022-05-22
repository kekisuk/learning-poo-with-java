package progama;

import java.util.Scanner;

public class Progama {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0;
		do {
		System.out.println("digite 1 para saque");
		System.out.println("digite 2 para deposito");
		System.out.println("digite 3 para exibir saldo");
		System.out.println("digite 4 para sair");
		
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
			conta.exibe_saldo();
			System.out.println("");
			System.out.println("Digite o valor a ser sacado:");
			conta.sacar(entrada.nextDouble());
			System.out.println("atualização de saldo:");
			conta.exibe_saldo();
		}else if(opcao == 2) {
			conta.exibe_saldo();
			System.out.println("Digite o valor a ser depositado");
			conta.depositar(entrada.nextDouble());
			System.out.println("atualização de saldo:");
			conta.exibe_saldo();
		}else if(opcao == 3) {
			conta.exibe_saldo();
			
		}
		
		}while(opcao != 4);
		
		entrada.close();
	}

}
