package com.FinalProject.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import com.FinalProject.src.main.Game.STATE;

public class Help {
	// buttons for help menu
		public Rectangle playButton = new Rectangle(Game.WIDTH / 2 + 20, 350, 100, 50);
		public Rectangle quitButton = new Rectangle(Game.WIDTH / 2 + 140, 350, 100, 50);
		
		
		public void render(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
		
			if(Game.State == STATE.HELP) {
		// create font to be displayed on menu screen		
				Font fnt0 = new Font("arial", Font.BOLD, 50);
				g.setFont(fnt0);
				g.setColor(Color.white);
				g.drawString("Controls", 200, 80); // title
				
			//	g.drawString("Player- move with arrow keys", 250, 200);
				
				Font fnt1 = new Font("arial", Font.BOLD, 40);
				g.setFont(fnt1);
				g.drawString("Player- move with arrow keys", 5, 200);
				g.drawString("Firing- hit space to fire at enemies", 5, 300);
				
				// buttons and text on buttons
				g.drawString("Play", playButton.x + 10, playButton.y + 40);
				g2d.draw(playButton);
				
				g.drawString("Quit", quitButton.x + 10, quitButton.y + 40);
				g2d.draw(quitButton);
			}
		}
}
