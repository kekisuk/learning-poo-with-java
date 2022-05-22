package sistemas;

public class Cliente extends Operacoes {
		
	private int codigo;
	private String nome;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void inserir() {
		System.out.println("Dados do CLIENTE inseridos com sucesso!");
		
	}
	@Override
	public void excluir() {
		System.out.println("Dados do CLIENTE excluidos com sucesso!");
		
	}
	@Override
	public void localizar() {
		System.out.println("Dados do CLIENTE localizados com sucesso!");
		
	}
	
		
}
