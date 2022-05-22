package questão3;


public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.nome = "Mateus";
		aluno.curso = "Engenharia de Software";
		aluno.idade = 20;
		double nota1, nota2, nota3;
		nota1 = 9.5;
		nota2 = 8.5;
		nota3 = 7.5;
		
		aluno.calculaMedia(nota1, nota2, nota3);
		
		aluno.exibeResultado();
		
	}

}
