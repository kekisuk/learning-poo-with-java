package Garrafa;

public class Garrafa {
	
	int capacidade;
	String tipoMaterial;
	
	public Garrafa () {
		
	}
	
	public Garrafa(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	
	public Garrafa (int capacidade) {
		this.capacidade = capacidade; 
	}
	
	public Garrafa (String tipoMaterial, int capacidade) {
		this.tipoMaterial = tipoMaterial;
		this.capacidade = capacidade;
	}
	
	public void mostrarconteudo() {
		System.out.println("Tipo do material: " +tipoMaterial);
		System.out.println("Capacidade da garrafa: "+capacidade);
	}
}
