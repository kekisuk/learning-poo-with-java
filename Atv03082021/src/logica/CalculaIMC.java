package logica;

public class CalculaIMC {

	private double altura, peso, IMC;
	
	public double calcula(String altura, String peso) {
		 this.altura = Double.parseDouble(altura);
		 this.peso = Double.parseDouble(peso);
		 
		 IMC = this.peso/(this.altura * this.altura);
		 
		 return IMC;
	}
	
	public String resultado(double IMC) {
		
		if(IMC <= 18.5) {
			return "Abaixo do peso normal!";
		}
			else if(IMC > 18.5 && IMC <= 25) {
				return "Peso normal!";
			}
			else if(IMC > 25 && IMC <= 30) {
				return "Acima do peso normal!";
			}
			else if(IMC > 30) {
				return "Infelizmente voc� est� obeso!";
			}
		return null;
	}
	
	
}
