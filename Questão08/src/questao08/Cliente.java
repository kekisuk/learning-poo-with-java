package questao08;

public class Cliente {
		
	public String nome, cidade;
	public int idade;
	Conta conta = new Conta();
	
	public void exibeDadosCliente(){
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cidade: " + cidade);
	}
}
