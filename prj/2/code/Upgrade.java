package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityC;

public class Upgrade implements EntityC {


	Random r = new Random();
	private Game game;
	private Controller c; // here to remove enemy
	
	private BufferedImage upgradeA;
	
	public double x; 
	public double y;
	
	public Upgrade(double x, double y, Game game, Controller c) {
	//	super(x, y); // need to declare that these are coming from the super class
		this.x = x;
		this.y = y - 20;
		this.c = c;
		this.game = game;
		
		SpriteU s = new SpriteU(game.getUpgradeA()); // returns sprite, and allows for use here
		upgradeA = s.grabUpgrade(1, 1, 32, 32);
	}
	
	public void tick() { // if the object is moving then a tick/updating method is necessary
		
		if(y > Game.HEIGHT * Game.SCALE) {
			y = -10;   
			x = r.nextInt(640);
		}
	
		
		if(Game.score >= 550) {
			
			y += 2.5; // movement speed
		
		for(int i = 0; i < game.ea.size(); i++)
		{
			EntityA tempEnt = game.ea.get(i);
			
			// destroy the enemy on collision
			if(Physics.Collision3(this, tempEnt)) { // for upgrade changes
				
				Game.bullet = Game.missile;
			//	Game.bulletReturn = true;
				//y -= 20;
				c.removeEntity(tempEnt); // destroys upgrade on collision
				c.removeEntity(this);
			//	game.setEnemy_killed(game.getEnemy_killed() + 1); // adds 1 to Enemy_killed, so more enemies can spawn
			}
		}
	
		}
	}
		
	
	
	public void render(Graphics g) {
		g.drawImage(upgradeA, (int)x, (int)y, null); // remember to cast doubles as integers
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}
	
}
