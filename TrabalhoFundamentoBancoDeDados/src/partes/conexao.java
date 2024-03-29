package partes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexao {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	conexao (){
		url = "jdbc:postgresql://localhost:5432/postgres";
		usuario = "postgres";
		senha = "17052001";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conex�o com Banco de Dados estabelecida!");
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public int executaSQL(String sql) {
		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public ResultSet executaBusca(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			return rs;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void fechaConexao() {	
		try {
			con.close();
			System.out.println("Conex�o com Banco de Dados finalizada!");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

 }