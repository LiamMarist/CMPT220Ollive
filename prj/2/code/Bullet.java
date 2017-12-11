package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityC;

public class Bullet extends GameObject implements EntityA {
	
	private Game game;
	BufferedImage bullet;
	BufferedImage missile;
	private Controller c;
	
	public Bullet(double x, double y, Game game) {
		super(x, y); // need to declare that these are coming from the super class
		this.game = game;
		
		SpriteB s = new SpriteB(game.getBullet());
		
		bullet = s.grabBullet(1, 1, 32, 32);
	}
	
	

	public void tick() {
			y -= 10;

			
		//	if(y <= -100) {
		//		c.removeEntity(this);
		//	}
			
	}
			/*
			// if bullet is beyond bounds of reality of game, Destroy
			 
			if(y < y -500) {
				//Destroy Bullet
				c.removeEntity(this);
			}
			*/
		
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public void render(Graphics g) {
		g.drawImage(bullet, (int) x, (int) y, null);
	}
	
	public double getY() { // helps with destroying bullets
		return y;
	}

	public double getX() { //needed to implement Entity
		return x;
	}

}
