package questão6;

public class Animal {
	
	public String especie;
	public double peso;
	
	public Animal(String especie, double peso) {
		this.especie = especie;
		this.peso = peso;
	}
	
	
	public void exibeMensagem(){
		System.out.println("Objeto do tipo Animal foi instanciado!");
	}
	
}

/*
	A finalidade de construtores em Orientação a Objetos é chamar assim que uma
	nova instância do objeto for criada. O metodo é responsavel pela aloção de
	recursos necessários ao funcionamento do objeto além da definição inicial das
	variaveis de atributos.

*/