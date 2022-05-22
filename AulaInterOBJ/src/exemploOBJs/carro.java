package exemploOBJs;

public class carro {
	
		public String cor, modelo;
		
		public int velocidadeAtual = 0, velocidadeMaxima = 180;
		
		motor Motor;// atributo da classe motor
		
		public carro () {
			Motor = new motor();
		}
		
		public void liga () {
			System.out.println("Ligando");
		}

		public void acelera () {
			System.out.println("Acelerando");
			System.out.println("Velocimetro: ");
			for(int i = 0; i < velocidadeMaxima; i ++) {
				velocidadeAtual += 1;
				System.out.print(" " + velocidadeAtual);
			}
		}
		
		public void buzina () {
			System.out.println("Buzinando");
		}


}
