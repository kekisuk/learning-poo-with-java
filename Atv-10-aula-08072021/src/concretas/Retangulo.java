package concretas;

import inter.calcula.CalculaArea;

public class Retangulo implements CalculaArea{
	
	private double largura;
	private double altura;
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcArea() {
		return largura*altura;
	}

	@Override
	public void exibeArea() {
		
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Retangulo Largura=" + getLargura() + ", Altura=" + getAltura() + ", Area=" + calcArea();
	}
	
	
}
