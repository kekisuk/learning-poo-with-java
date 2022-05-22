package progama;
//entidade:armazenar dados
public class Conta {
	private double saldo;
	private double limite = 300;
	
	public void sacar(double valor) {
		
		if((valor <= limite) && (valor <= saldo)) {
		saldo -= valor;//msm de saldo = saldo - valor;
		}else {
			System.out.println("Saldo insuficiente ou valor excede limite de saque");
		}
		
	}
	
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	public void exibe_saldo() {
		System.out.println("saldo atual: " + saldo);
	}
	

}
