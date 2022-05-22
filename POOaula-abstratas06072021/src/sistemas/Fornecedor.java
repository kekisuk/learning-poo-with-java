package sistemas;

public class Fornecedor extends Operacoes{

	private String cnpj;
	private String razaoSocial;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public void inserir() {
		System.out.println("Dados do FORNECEDOR inseridos com sucesso!");
		
	}

	@Override
	public void excluir() {
		System.out.println("Dados do FORNECEDOR excluidos com sucesso!");
		
	}

	@Override
	public void localizar() {
		System.out.println("Dados do FORNECEDOR localizados com sucesso!");
		
	}

	
	
}
