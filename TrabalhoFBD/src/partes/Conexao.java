package partes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	Conexao (){
		url = "jdbc:postgresql://localhost:5432/postgres";
		usuario = "postgres";
		senha = "17052001";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conexão com Banco de Dados estabelecida!");
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
