package com.FinalProject.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class GameOver {

	private Game game;
	public Rectangle bossButton = new Rectangle((Game.WIDTH / 2) - 0, 350, 150, 50);
	public Rectangle quitButton = new Rectangle((Game.WIDTH / 2) + 175, 350, 100, 50);
	
	public void render(Graphics g) {
		this.game = game;
		Graphics2D g2d = (Graphics2D) g;
		
		// create font to be displayed on menu screen
		if(Game.HEALTH <= 0 && Game.bossHealth > 0) {
		Font fnt0 = new Font("arial", Font.BOLD, 70);
		g.setFont(fnt0);
		g.setColor(Color.white);
		
		g.drawString("GAME OVER", Game.WIDTH / 3, 130); // game over
		}
		
	
		if(Game.bossHealth <= 0 && Game.HEALTH > 0) {
		Font fntA = new Font("arial", Font.BOLD, 60);
		g.setFont(fntA);
		g.setColor(Color.white);
		
		g.drawString("CONGRATULATIONS", 30, 130); // Congratulations
		// buttons
		}
		Font fnt1 = new Font("arial", Font.BOLD, 40);
		g.setFont(fnt1);
		
	//	g.drawString("Restart", restartButton.x + 5, restartButton.y + 40);
	//	g2d.draw(restartButton);
		
		g.drawString("Quit", quitButton.x + 10, quitButton.y + 40);
		g2d.draw(quitButton);
		
		Font fnt2 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt2);
		
		g.drawString("Score: " + game.score, 200, 250);
	}
	
}
