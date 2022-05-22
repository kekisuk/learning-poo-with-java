package pacote;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {
		
		System.out.println("-----------");
		System.out.println("INSERIR CLIENTE");
		System.out.println("-----------");
		
		Scanner aaa = new Scanner(System.in);
		
		BigDecimal cpfclientes;
		String  nome, datanasc,telefone,enderecorua,endereBairro, enderecep;
		
		System.out.println("Digite o CPF do cliente: ");
		cpfclientes = aaa.nextBigDecimal();
		aaa.nextLine();
		System.out.println("Digite o nome do cliente: ");
		nome = aaa.nextLine();
		aaa.nextLine();
		System.out.println("Digite a data de nascimento do cliente: ");
		datanasc = aaa.nextLine();
		aaa.nextLine();
		System.out.println("Digite o telefone do cliente: ");
		telefone = aaa.nextLine();
		aaa.nextLine();
		System.out.println("Digite o endereco do cliente: ");
		enderecorua = aaa.nextLine();
		aaa.nextLine();
		System.out.println("Digite o bairro do cliente: ");
		endereBairro = aaa.nextLine();
		aaa.nextLine();
		System.out.println("Digite o CEP do cliente: ");
		enderecep = aaa.nextLine();
		aaa.nextLine();
		
		System.out.println("CPF: " + cpfclientes);
		System.out.println("Nome: " + nome);
		System.out.println("Data Nascimento: " + datanasc);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereco: " + enderecorua);
		System.out.println("Bairro: " + endereBairro);
		System.out.println("CEP: " + enderecep);
		
		aaa.close();
	}

}
