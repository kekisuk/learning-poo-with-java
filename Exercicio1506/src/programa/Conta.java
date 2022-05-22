package programa;

public class Conta {

	private double saldo;
	private double limite = 300;
	
	public void sacar(double valor) {
		if((valor <= limite) && (valor <= saldo)){
		saldo -= valor;
		}else {
			System.out.println("Erro em sacar! Valor maior que o limite.");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void exibeSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}
	
}
