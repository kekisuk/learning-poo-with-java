package AtividadePOO;

import java.util.Scanner;


public class Atividade03 {
			/*
			 	Desenvolva um programa para radares de velocidade. Seu programa deverá
				receber as velocidades dos veículos na via e decidir se merecem uma multa ou não.
				Você deve se basear nas seguintes regras:
				a. Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior
				que a velocidade permitida na via, o veículo deve ser multado.
				b. Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a
				velocidade permitida na via, o veículo deve ser multado.
				c. Para fazer uma simulação, o programa deve receber as informações de
				velocidade máxima permitida, o tipo de veículo e a sua velocidade do
				através do teclado do computador, ou seja, manualmente. 
			 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int velocidade, velocidade_maxima, tipo_veiculo;
		
		System.out.println("Digite a velocidade do veiculo: ");
		velocidade = entrada.nextInt();
		
		System.out.println("Digite a velocidade maxima da via: ");
		velocidade_maxima = entrada.nextInt();
		
		System.out.println("Qual o tipo de veiculo: ");
		System.out.println("1- Passeio");
		System.out.println("2- Carga");
		tipo_veiculo = entrada.nextInt();
		
		if(tipo_veiculo == 1 && velocidade > velocidade_maxima*1.1) {
			System.out.println("Este veiculo de passeio foi multado!");
		}else if (tipo_veiculo == 2 && velocidade > velocidade_maxima *1.05) {
			System.out.println("Este veiculo de carga foi multado!");
		}else {
			System.out.println("Nenhum veiculo foi multado!");
		}
		
		
		entrada.close();
	
	
	}
	

}
