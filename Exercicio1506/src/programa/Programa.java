package programa;

import java.util.Scanner;

public class Programa {

	
	public static void main (String[] args) {
		
		Conta conta = new Conta();
		
		Scanner entrada = new Scanner(System.in);
				
		int opcao;
		do {
			
		System.out.println("");	
		System.out.println("Digite 1 para sacar.");
		System.out.println("Digite 2 para depositar.");
		System.out.println("Digite 3 para visualizar o saldo.");
		System.out.println("Digite 4 para Sair.");
		System.out.println("");
		
		opcao = entrada.nextInt();
		
		if (opcao == 1) {
			conta.exibeSaldo();
			System.out.println("");
			System.out.println("Digite o valor a ser sacado:");
			conta.sacar(entrada.nextDouble());
			System.out.println("Seu novo saldo:");
			conta.exibeSaldo();
		}else if(opcao == 2){
			conta.exibeSaldo();
			System.out.println("");
			System.out.println("Digite o valor a ser depositado:");
			conta.depositar(entrada.nextDouble());
			System.out.println("Seu novo saldo:");
			conta.exibeSaldo();
		}else if(opcao == 3){
			conta.exibeSaldo();
		}
		
		}while(opcao !=4);
		
		entrada.close();
	}
}
