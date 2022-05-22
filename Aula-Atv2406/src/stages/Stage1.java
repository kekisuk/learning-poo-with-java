package stages;

import player.Player;

public class Stage1 {

	private int score;
	
	public void renderStage() {
		
		Player.score += this.score;
		
		System.out.println("Fase 1 - Player  " + Player.name);
		System.out.println("Score: " + Player.score);
		
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
