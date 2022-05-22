package atividadePOOlivro;

public class Autor {
		
	/*
	4. Identificando a necessidade de inserir
	informa��es sobre os autores dos livros, nos
	deparamos com a seguinte d�vida: onde
	podemos definir estas informa��es?
	4.1 Poder�amos definir esses dados na pr�pria classe
	Livro, entretanto, visto que trata-se de um
	elemento (o autor) fundamental para o nosso
	sistema, deve ser tratado como um objeto
	4.2 Crie a classe Autor com nome, email e cpf (todos do
	tipo String)
	4.3 Em seguida, defina um atributo autor na classe Livro
	4.4 Lembre-se que quando for utilizar o objeto do tipo Autor
	j� declarado na classe Livro, o mesmo dever� ser
	instanciado antes em um dado momento.
	*/
	
	public String nome, email, cpf;
	
	public Autor (){
		
	}
	
	/*
	6. Conseguimos exibir os dados do autor por
	meio do m�todo mostraDetalhes da classe
	Livro, por�m, esta implementa��o n�o foi a
	mais vi�vel. A classe Livro est� fazendo mais
	do que � sua responsabilidade
	
	6.1 Mostrar as informa��es de autor deveria ser um
	comportamento da classe Autor, portanto,
	defina um m�todo mostraDetalhes na classe
	Autor para exibir os dados do autor. N�o se
	esque�a de modificar o outro m�todo (da
	classe Livro) para chamar, dentro dele, o novo
	m�todo mostrarDetalhes (do autor).
	*/
	
	public void mostraDetalhes() {
		System.out.println("O nome do autor �: " + nome);
		System.out.println("O email do autor �: " + email);
		System.out.println("O CPF do autor �: " + cpf);
	
	}
	
}
