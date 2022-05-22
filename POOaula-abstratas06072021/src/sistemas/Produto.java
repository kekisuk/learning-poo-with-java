package sistemas;

public class Produto extends Operacoes{
	
	private int numero;
	private String descricao;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void inserir() {
		System.out.println("Dados do PRODUTO inseridos com sucesso!");
		
	}

	@Override
	public void excluir() {
		System.out.println("Dados do PRODUTOS excluidos com sucesso!");
		
	}

	@Override
	public void localizar() {
		System.out.println("Dados do PRODUTOS localizados com sucesso!");
		
	}

}
