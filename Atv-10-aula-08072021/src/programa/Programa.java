package programa;

import java.util.Scanner;

import concretas.Retangulo;
import concretas.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("MENU - Escolha uma das figuras:");
		System.out.println("1 - Triangulo");
		System.out.println("2 - Ret�ngulo");
		
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		
		case 1:
			Triangulo triangulo = new Triangulo();
			System.out.println("Digite o valor da altura: ");
			triangulo.setAltura(entrada.nextDouble());
			System.out.println("Digite o valor da base: ");
			triangulo.setBase(entrada.nextDouble());
			triangulo.exibeArea();
			break;
		case 2:
			Retangulo retangulo = new Retangulo();
			System.out.println("Digite a largura:");
			retangulo.setLargura(entrada.nextDouble());
			System.out.println("Digite a altura:");
			retangulo.setAltura(entrada.nextDouble());
			retangulo.exibeArea();
			break;
		default:
			System.out.println("Op��o Invalida!");
			break;
		
		
		}
		
		entrada.close();
	}

}
