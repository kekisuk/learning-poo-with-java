package gameplayer;



			/*
			 * Desenvolva um programa em java, que representa um jogo,
			 * onde, o mesmo possui 3 fases representadas por classes em java,
			 * essas classes possuem um método que renderiza a fase na tela 
			 * (renderStage()). Ainda nesse método é necessário que seja exibida
			 * a pontuação, que consiste em um atributo da classe Player, que
			 * contempla também um atributo name. Na classe GamePlayer você define
			 * um método main onde será simulado o jogo em execução. Para tal,
			 * defina um Player e após isso, crie as fases 1, 2 ,3 e, a cada
			 * passagem atribua uma pontuação (pontuação) ao atributo pertencente
			 * ao Player, daí no final, será necessário apresentar a pontuação final.
			 *	
			 *	Obs.: É óbvio que esse atributo está compartilhado.
			 */
import player.Player;
import stages.Stage1;
import stages.Stage2;
import stages.Stage3;

public class GamePlayer {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.name = "Mateus";
		
		Stage1 st1 = new Stage1();
		st1.setScore(0);
		st1.setScore(10);
		st1.renderStage();
		
		System.out.println();
		System.out.println("Passou de fase");
		
		
		Stage2 st2 = new Stage2();
		st2.setScore(30);
		st2.renderStage();
		
		System.out.println();
		System.out.println("Passou de fase");
		
		
		Stage3 st3 = new Stage3();
		st3.setScore(20);
		st3.renderStage();
		
		System.out.println();
		System.out.println("Fim do Jogo");
		System.out.println("Final Score: "+ Player.score);
	}

}
