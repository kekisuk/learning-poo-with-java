package partes;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		Conexao con = new Conexao();
		
		int choices = 6;
		
		while (choices !=5 ) {
			
			System.out.println("-----------");
			System.out.println("CAR RENT");
			System.out.println("-----------");
			System.out.println("1 - Consultar cliente");
			System.out.println("2 - Inserir cliente");
			System.out.println("3 - Atualizar cliente");
			System.out.println("4 - Remover cliente");
			System.out.println("5 - Sair");
			System.out.println("-----------");
			
			Scanner entrada = new Scanner (System.in);
			choices = entrada.nextInt();
			//entrada.close();
			
			switch(choices) {
			case 1:
				//
				break;
			case 2:
				//chamar inserir
				break;
			case 3:
				//chamar atualizar
				break;
			case 4:
				//chamar remover
				break;
			}
			
		}
		
	}

}
