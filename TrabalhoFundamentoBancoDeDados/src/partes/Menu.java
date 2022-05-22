package partes;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Scanner;

public class Menu{

	public static void main(String[] args) {
		
		conexao con = new conexao();
		
		int choices = 6;
		String CPF;
		
		while (choices !=5 ) {
			
			System.out.println("-----------");
			System.out.println("CAR RENT");
			System.out.println("-----------");
			System.out.println("1 - Consultar cliente");//ok
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
				System.out.println("-----------");
				System.out.println("CONSULTAR CLIENTE");
				System.out.println("-----------");
				System.out.println("Digite o CPF que deseja procurar:");
				CPF = entrada.next();
				
				String sql = "SELECT * FROM cliente WHERE clientecpf = " + CPF;
				ResultSet rs = con.executaBusca(sql);
				
				try {
					while(rs.next()) {
						
						BigDecimal cpfcliente = rs.getBigDecimal("clientecpf");
						String nome = rs.getString("nome");
						String dataNasc = rs.getString("datanasc");
						String telefone = rs.getString("telefone");
						String rua = rs.getString("enderecorua");
						String bairro = rs.getString("enderecobairro");
						int cep = rs.getInt("enderecocep");
						
						System.out.println("CPF = " + cpfcliente);
						System.out.println("Nome = " + nome);
						System.out.println("Data de Nacimento = " + dataNasc);
						System.out.println("Telefone = " + telefone);
						System.out.println("Endereco = " + rua);
						System.out.println("Bairro = " + bairro);
						System.out.println("CEP = " + cep);
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			case 2:
				System.out.println("-----------");
				System.out.println("INSERIR CLIENTE");
				System.out.println("-----------");
				
				BigDecimal cpfclientes;
				String nome, datanasc,telefone,enderecorua,endereBairro, enderecep;
				
				System.out.println("Digite o CPF do cliente: ");
				cpfclientes = entrada.nextBigDecimal();
				entrada.nextLine();
				System.out.println("Digite o nome do cliente: ");
				nome = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite a data de nascimento do cliente: ");
				datanasc = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o telefone do cliente: ");
				telefone = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o endereco do cliente: ");
				enderecorua = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o bairro do cliente: ");
				endereBairro = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o CEP do cliente: ");
				enderecep = entrada.nextLine();
				entrada.nextLine();
				
				
				sql = "INSERT INTO Cliente VALUES("+ cpfclientes +",'"+ nome +"','"+ datanasc + "','"+ telefone +"','"+enderecorua+"','"+endereBairro+"','"+enderecep+"')";
				
				int res = con.executaSQL(sql);
				if (res > 0) {
					System.out.println("Novo cliente cadastrado!");
				}else {
					System.out.println("Erro! Usuario não pode ser cadastrado!");
				}
				
				break;
			case 3:
				
				System.out.println("-----------");
				System.out.println("ATUALIZAR CLIENTE");
				System.out.println("-----------");
				
				System.out.println("Digite o CPF do cliente para ser atualizado: ");
				cpfclientes = entrada.nextBigDecimal();
				entrada.nextLine();
				System.out.println("Digite o nome do cliente: ");
				nome = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite a data de nascimento do cliente: ");
				datanasc = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o telefone do cliente: ");
				telefone = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o endereco do cliente: ");
				enderecorua = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o bairro do cliente: ");
				endereBairro = entrada.nextLine();
				entrada.nextLine();
				System.out.println("Digite o CEP do cliente: ");
				enderecep = entrada.nextLine();
				entrada.nextLine();
				
				
				sql = "UPDATE cliente SET nome = '"+ nome +"', datanasc = '"+ datanasc +"', telefone = '"+telefone+"', enderecorua = '"+ enderecorua +"', enderecobairro = '"+endereBairro+"', enderecocep = '"+enderecep+"'  WHERE clientecpf = "+cpfclientes+"";
				
				int rest = con.executaSQL(sql);
				if (rest > 0) {
					System.out.println("Cliente atualizado!");
				}else {
					System.out.println("Erro! Usuario não pode ser atualizado!");
				}
				
				
				
				
				break;
			case 4:
				System.out.println("-----------");
				System.out.println("REMOVER CLIENTE");
				System.out.println("-----------");
				
				System.out.println("Digite o CPF do cliente para ser removido: ");
				cpfclientes = entrada.nextBigDecimal();
				entrada.nextLine();
				
				sql = "DELETE FROM cliente WHERE clientecpf = "+cpfclientes+"";
				
				int resD = con.executaSQL(sql);
				if (resD > 0) {
					System.out.println("Cliente apagado!");
				}else {
					System.out.println("Erro! Usuario não pode ser apagado!");
				}
				
				break;
			}
			
		}
		con.fechaConexao();
	}

}
