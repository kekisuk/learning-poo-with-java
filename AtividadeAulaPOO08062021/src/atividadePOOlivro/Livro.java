package atividadePOOlivro;

public class Livro {
	
	/*
	2. A partir do modelo criado, repasse para c�digo java
	2.1 O m�todo mostrarDetalhes deve exibir todas as
	vari�veis declaradas na pr�pria classe Livro
	*/
	
	
	public String titulo, descricao;
	public double valor;
	
	public Autor autor;
	
	public Livro () {
		autor = new Autor();
		
	}
	
	public void mostrarDetalhes() {
		System.out.println("O titulo do livro �: " + titulo);
		System.out.println("A descri��o deste livro �: " + descricao);
		System.out.println("O valor deste livro �: " + valor);
		
		autor.mostraDetalhes();
	}

}
