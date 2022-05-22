package Programa;

import java.util.Scanner;

import conta.Conta;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro Acesso, você precisa de cadastrar!");
	    System.out.println("Digite o nome do titular: ");
	    String nomeTitular = entrada.next();
	    
	    System.out.println("Digite o numero da conta: ");
	    int numeroConta = entrada.nextInt();
	    
	    System.out.println("Digite o saldo inicial: ");
	    double saldoIni = entrada.nextDouble();
	    
	    System.out.println("Digite o limite para saques e pagamentos PIX");
	    double limite = entrada.nextDouble();
	    
	    Conta conta = new Conta(nomeTitular, numeroConta, saldoIni, limite);
	    
	    int opcao = 0;
	    do {
	    	System.out.println("Escolha uma das opções: ");
		    System.out.println(" 1- Saque");
		    System.out.println(" 2- Deposito");
		    System.out.println(" 3- PIX");
		    System.out.println(" 4- Exibe Dados");
		    System.out.println(" 5- Sair");
		    
		    opcao = entrada.nextInt();
		    double valor;
		    
		    switch(opcao) {
		    case 1:
		    	System.out.println("Qual o valor gostaria de sacar?");
		    	valor = entrada.nextDouble();
		    	conta.sacar(valor);
		    	break;
		    case 2: 
		    	System.out.println("Qual o valor do deposito?");
                valor = entrada.nextDouble();
                conta.depositar(valor);
                break;
		    case 3: 
		    	System.out.println("Cadastro do Favorecido - PIX");
		    	System.out.println("Digite seu email como chave:");
		    	String chaveEmail = entrada.next();
		    	System.out.println("Digite seu CPF como chave:");
		    	int chaveCPF = entrada.nextInt();
		    	conta.dadosPixFavorecidos(chaveEmail, chaveCPF);
		    	
		    	System.out.println("");
		    	System.out.println("Pagina Principal!");
		    	System.out.println("Qual o valor para realizar o PIX?");
		    	valor = entrada.nextDouble();
		    	System.out.println("Chave Email:");
		    	String email = entrada.next();
		    	System.out.println("Chave CPF:");
		    	int cpf = entrada.nextInt();
		    	
		    	conta.pgPix(email, cpf, valor);
		    	break;
		    case 4:
		    	conta.exibeDados();
		    	break;
		    case 5: 
		    	System.out.println("Saindo do Sistema");
		    	
		    	default: System.out.println("Opcao invalida!");
		    }
		    
	    }while (opcao !=5);
	    
		entrada.close();

	}

}
