package atividadePOOlivro;

import java.util.Scanner;

public class CadastroDeLivros {
	
	/*
	3. Crie uma nova classe e chame-a de
	CadastroDeLivros
	3.1 Crie dois livros, para isto, instancie dois objetos
	Livro e efetue o armazenamento de dados as
	suas respectivas variáveis
	3.2 Na sequência de cada livro criado, execute o
	método responsável por mostrar os dados do
	livro na tela do console
	*/
	
	public static void main(String []args){
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		/*
		 * livro1.titulo = "Java como Programar";
		 * livro1.descricao = "Programacao com liguagem Java";
		 * livro1.valor = 200;
		 * 
		 * livro2.titulo = "Python";
		 * livro2.descricao = "Programacao com liguagem Python";
		 * livro2.valor = 100;
		 * 
		 * livro1.mostrarDetalhes();
		 * livro2.mostrarDetalhes();
		 */
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		//primeiro livro
		System.out.println("Digite o titulo deste livro:");
		livro1.titulo = entrada.next();
		
		System.out.println("Digite a descrição do livro:");
		livro1.descricao = entrada.next();
		
		System.out.println("Digite o valor do livro:");
		livro1.valor = entrada.nextDouble();
		
		livro1.mostrarDetalhes();
		System.out.println();
		
		//segundo livro
		System.out.println("Digite o titulo deste livro:");
		livro2.titulo = entrada.next();
		
		System.out.println("Digite a descrição do livro:");
		livro2.descricao = entrada.next();
		
		System.out.println("Digite o valor do livro:");
		livro2.valor = entrada.nextDouble();
		
		
		
		
		livro2.mostrarDetalhes();
		System.out.println();
		
		/*
		5. Acrescente mais um livro instanciando um
		novo objeto na classe CadastroDeLivros,
		mas desta vez você irá armazenar dados
		sobre o autor
		5.1 Veja a possibilidade de acrescentar dados
		do autor para serem exibidos pelo método
		mostrarDetalhes da classe Livro
		5.2 Para tal, você deverá ter criado um método na
		própria classe do autor, que retorna uma String
		(dados do autor).
		*/
		
		Livro livro3 = new Livro();
		
		//terceiro livro
		System.out.println("Digite o titulo deste livro:");
		livro3.titulo = entrada.next();
		
		System.out.println("Digite a descrição do livro:");
		livro3.descricao = entrada.next();
		
		System.out.println("Digite o valor do livro:");
		livro3.valor = entrada.nextDouble();
		
		System.out.println("Digite o autor do livro:");
		livro3.autor.nome = entrada.next();
		
		System.out.println("Digite o email do autor:");
		livro3.autor.email = entrada.next();
		
		System.out.println("Digite o CPF do autor:");
		livro3.autor.cpf = entrada.next();
		
		livro3.mostrarDetalhes();
		
		entrada.close();
		
	}
	
}
