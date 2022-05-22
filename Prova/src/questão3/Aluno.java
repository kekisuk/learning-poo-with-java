package questão3;

public class Aluno {

		public String nome, curso;
		public int idade;
		public double media;
		
		double calculaMedia(double n1, double n2,  double n3){
				
			media = (n1+n2+n3)/3;
			
			return media;
		}
		
		public void exibeResultado(){
			System.out.println("O nome do aluno é: " + nome);
			System.out.println("O curso do aluno é: " + curso);
			System.out.println("A idade do aluno é: " + idade);
			System.out.println("A media é: " + media);		
		}
		
}
