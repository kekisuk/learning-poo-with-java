package questao08;

public class Conta {
	
	public String nomeBanco;
	public int numero;
	public double saldo;
	
	public Conta(){
		
	}
	
	public void saque(double valor) {
		saldo = saldo - valor;
	}
	public void deposita (double valor) {
		saldo = saldo + valor;
	}
	public void exibeDadosConta() {
		
		System.out.println("Nome do banco: " + nomeBanco);
		System.out.println("Numero da conta banco: " + numero);
		System.out.println("Saldo: " + saldo);
	}
}
