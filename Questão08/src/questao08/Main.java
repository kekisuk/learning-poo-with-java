package questao08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("==========CADASTRO==========");
		System.out.println("Digite seu nome:");
		cliente.nome = entrada.next();
		
		System.out.println("Digite sua cidade:");
		cliente.cidade = entrada.next();
		
		System.out.println("Digite sua idade:");
		cliente.idade = entrada.nextInt();
		 
		System.out.println("==========DADOS_BANCARIOS==========");
		
		System.out.println("Digite o numero da conta:");
		cliente.conta.numero = entrada.nextInt();
		
		System.out.println("Digite o nome do banco:");
		cliente.conta.nomeBanco = entrada.next();
		
		System.out.println("Digite o saldo da conta:");
		cliente.conta.saldo = entrada.nextDouble();
		
		int op;
		
		do {
		System.out.println("==========MENU==========");
		System.out.println("1 - DEPOSITO");
		System.out.println("2 - SAQUE");
		System.out.println("3 - EXIBIR DADOS CONTA");
		System.out.println("4 - EXIBIR DADOS CLIENTE");
		System.out.println("5 - SAIR");
		
		op = entrada.nextInt();
		
		if (op == 1){
			System.out.println("Qual valor você deseja depositar:");
			cliente.conta.deposita(entrada.nextDouble());
		}
		if (op == 2) {
			System.out.println("Qual o valor você deseja sacar:");
			cliente.conta.saque(entrada.nextDouble());
		}
		if (op == 3) {
			cliente.conta.exibeDadosConta();
		}
		if (op == 4){
			cliente.exibeDadosCliente();
			
		}
		
		}while(op != 5);
		
		entrada.close();

	}

}
