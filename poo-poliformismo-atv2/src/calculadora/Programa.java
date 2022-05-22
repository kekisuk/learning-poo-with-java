package calculadora;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soma soma = new Soma();
		System.out.println(soma.calcula(20, 10));
		
		Subtração subtracao = new Subtração();
		System.out.println(subtracao.calcula(20, 10));
		
		Multiplicacao multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.calcula(10, 2));
		
		Divisao divisao = new Divisao();
		System.out.println(divisao.calcula(20, 2));
	}

}
