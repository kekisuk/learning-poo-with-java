package veiculos;

public class Programa {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setAno(2021);
		carro.setModelo("Uno");
		carro.setMarca("Fiat");
		
		System.out.println(carro.toString());
		System.out.println(carro.emMovimento());
		
		Moto moto = new Moto();
		System.out.println(moto.emMovimento());
		
		Bicicleta bicicleta = new Bicicleta();
		System.out.println(bicicleta.emMovimento());
	}

}
