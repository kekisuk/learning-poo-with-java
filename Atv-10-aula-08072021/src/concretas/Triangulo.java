package concretas;

import inter.calcula.CalculaArea;

public class Triangulo implements CalculaArea{
		
	private double base;
	private double altura;
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double alt) {
		this.altura = alt;
	}

	@Override
	public double calcArea() {
		
		return (base*altura)/2;
	}

	@Override
	public void exibeArea() {
		
	System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Triangulo Base=" + getBase() + ", Altura=" + getAltura() + ", Area=" + calcArea();
	}

	
	
}
