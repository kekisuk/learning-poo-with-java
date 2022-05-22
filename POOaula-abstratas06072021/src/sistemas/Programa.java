package sistemas;

public class Programa {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.inserir();
		cliente.localizar();
		cliente.excluir();
		
		System.out.println();
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.inserir();
		fornecedor.localizar();
		fornecedor.excluir();
		
		System.out.println();
		
		Produto produto = new Produto();
		produto.inserir();
		produto.localizar();
		produto.excluir();
	}

}
