package AtividadePOO;

public class ExemploMetodos {

	void imprimeTela(){
		
		System.out.println("Uma mensagem na tela :)");
		
	}
	
	String concatenarNomes(String nome1, String nome2){
		
		String nomecompleto = nome1 + " " + nome2;
		//System.out.println(nomecompleto);
		return nomecompleto;
	}
	
	int subtrairNumeros(int num1, int num2){
		
		int resultado = num1-num2;
		return resultado;
		
	}
	
}
