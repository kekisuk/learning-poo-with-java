package quest�o6;

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
	A finalidade de construtores em Orienta��o a Objetos � chamar assim que uma
	nova inst�ncia do objeto for criada. O metodo � responsavel pela alo��o de
	recursos necess�rios ao funcionamento do objeto al�m da defini��o inicial das
	variaveis de atributos.

*/