package com.FinalProject.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.FinalProject.src.main.Game.STATE;

public class Menu {
	

	// buttons for the menu
	public Rectangle playButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
	public Rectangle helpButton = new Rectangle(Game.WIDTH / 2 + 120, 250, 100, 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH / 2 + 120, 350, 100, 50);
	
	
	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		
		// create font to be displayed on menu screen
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("My Java Space Shooter", Game.WIDTH / 5, 110); // title
		
		Font fnt1 = new Font("arial", Font.BOLD, 40);
		g.setFont(fnt1);
		
		// buttons and text on buttons
		g.drawString("Play", playButton.x + 10, playButton.y + 40);
		g2d.draw(playButton);
		
		g.drawString("Help", helpButton.x + 10, helpButton.y + 40);
		g2d.draw(helpButton);
		
		g.drawString("Quit", quitButton.x + 10, quitButton.y + 40);
		g2d.draw(quitButton);
			
	}
}
