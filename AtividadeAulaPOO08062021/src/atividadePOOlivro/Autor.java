package atividadePOOlivro;

public class Autor {
		
	/*
	4. Identificando a necessidade de inserir
	informações sobre os autores dos livros, nos
	deparamos com a seguinte dúvida: onde
	podemos definir estas informações?
	4.1 Poderíamos definir esses dados na própria classe
	Livro, entretanto, visto que trata-se de um
	elemento (o autor) fundamental para o nosso
	sistema, deve ser tratado como um objeto
	4.2 Crie a classe Autor com nome, email e cpf (todos do
	tipo String)
	4.3 Em seguida, defina um atributo autor na classe Livro
	4.4 Lembre-se que quando for utilizar o objeto do tipo Autor
	já declarado na classe Livro, o mesmo deverá ser
	instanciado antes em um dado momento.
	*/
	
	public String nome, email, cpf;
	
	public Autor (){
		
	}
	
	/*
	6. Conseguimos exibir os dados do autor por
	meio do método mostraDetalhes da classe
	Livro, porém, esta implementação não foi a
	mais viável. A classe Livro está fazendo mais
	do que é sua responsabilidade
	
	6.1 Mostrar as informações de autor deveria ser um
	comportamento da classe Autor, portanto,
	defina um método mostraDetalhes na classe
	Autor para exibir os dados do autor. Não se
	esqueça de modificar o outro método (da
	classe Livro) para chamar, dentro dele, o novo
	método mostrarDetalhes (do autor).
	*/
	
	public void mostraDetalhes() {
		System.out.println("O nome do autor é: " + nome);
		System.out.println("O email do autor é: " + email);
		System.out.println("O CPF do autor é: " + cpf);
	
	}
	
}
