package conta;

public class Conta {

	public String titular;
	public int nConta;
	public double saldo;
	public double limite;
	
	public Conta(String titular, int nConta, double saldo, double limite) {
	 this.titular = titular;
	 this.nConta = nConta;
	 this.saldo = saldo;
	 this.limite = limite;
	}
	
	
	public String emailFavorecido;
	public int cpfFavorecido;
	//simulação - Sistema do Usuario favorecido pelo Pix
	public void dadosPixFavorecidos (String emailFavorecido, int cpfFavorecido) {
		this.emailFavorecido = emailFavorecido;
		this.cpfFavorecido = cpfFavorecido;
	}
	
	public void pgPix(String email, int cpf, double valorPix) {
		if(emailFavorecido.equals(email) || cpfFavorecido == cpf) {
			if (limite >= valorPix) {
				saldo -= valorPix;
				System.out.println(retornaSaldo());
			}
				else System.out.println("O valor ultrapassa limite de pagamento Pix.");
		}else System.out.println("Chave invalida!");
	}
	
	public void sacar(double valor) {
		if(limite >= valor){
		saldo = saldo - valor;
		//saldo-=valor; é o mesmo de cima
		}
		else { System.out.println("O valor ultrapassa limite de saque.");
		}
	}
	
	public String sacar2(double valor) {
		if(limite >= valor){
		//saldo = saldo - valor;
		saldo-=valor; 
		}
		else return "O valor ultrapassa limite de saque.";
		 return retornaSaldo();
		
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		//saldo+=valor;
		System.out.println(retornaSaldo());
		
	}
	
	public String depositar2(double valor) {
		saldo = saldo + valor;
		//saldo+=valor;
		return retornaSaldo();
	}
	
	public String retornaSaldo(){
		return "Novo saldo: " + saldo;
	}
	
	public void exibeDados(){
		System.out.println("Nome do Titular: " + titular);
		System.out.println("Numero da conta: " + nConta);
		System.out.println("Limite para saques: " + limite);
		System.out.println("Saldo atual: " + saldo);
	}
	
}
