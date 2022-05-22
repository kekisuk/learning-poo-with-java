package sistema;

import java.util.Scanner;

public class Cadastro { //usando get e set
	
	private String nome;
	private String cpf;
	private String idade;
	private String endere�o;
	private String telefoneCelular;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	public void coletaDados () {//coletando os dados
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno(a): ");
		setNome(entrada.nextLine());
		
		System.out.println("Digite o CPF do aluno(a): ");
		setCpf(entrada.nextLine());
		
		System.out.println("Digite a idade do aluno(a): ");
		setIdade(entrada.nextLine());
		
		System.out.println("Digite o endere�o do aluno(a): ");
		setEndere�o(entrada.nextLine());
		
		System.out.println("Digite o telefone celular do aluno(a): ");
		setTelefoneCelular(entrada.nextLine());
		
		entrada.close();
	}
	
	
	public void exibeDadosCadastro () {//exibindo os dados
		System.out.println("Confira se os dados do cliente est�o corretos:");
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Idade: " + getIdade());
		System.out.println("Endere�o: " + getEndere�o());
		System.out.println("Telefone/Celular: " + getTelefoneCelular());
		
	}
	
	
}
