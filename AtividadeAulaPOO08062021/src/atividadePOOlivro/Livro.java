package atividadePOOlivro;

public class Livro {
	
	/*
	2. A partir do modelo criado, repasse para código java
	2.1 O método mostrarDetalhes deve exibir todas as
	variáveis declaradas na própria classe Livro
	*/
	
	
	public String titulo, descricao;
	public double valor;
	
	public Autor autor;
	
	public Livro () {
		autor = new Autor();
		
	}
	
	public void mostrarDetalhes() {
		System.out.println("O titulo do livro é: " + titulo);
		System.out.println("A descrição deste livro é: " + descricao);
		System.out.println("O valor deste livro é: " + valor);
		
		autor.mostraDetalhes();
	}

}
