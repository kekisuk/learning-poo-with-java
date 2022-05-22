package exemploOBJs;

public class Controlador {

		public void executa() {
			carro Carro = new carro();
			Carro.cor = "Preto";
			Carro.modelo = "Sedan";
			
			Carro.Motor.potencia = 200;
			Carro.Motor.tipo = "2.0";
			
			System.out.println("-------Dados do Carro -----");
			System.out.println("Cor do Carro: " + Carro.cor);
			System.out.println("Modelo do Carro: " + Carro.modelo);
			System.out.println("Tipo do motor do carro: " + Carro.Motor.tipo);
			System.out.println("Potencia do motor do carro: " + Carro.Motor.potencia);
			
			System.out.println();
			System.out.println("Carro funcionando");
			Carro.buzina();
			Carro.acelera();
		}
}
