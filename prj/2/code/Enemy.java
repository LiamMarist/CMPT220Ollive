package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;

// for simplicity extend double x and y 
public class Enemy extends GameObject implements EntityB{
	
	Random r = new Random();
	private Game game;
	private Controller c; // here to remove enemy
	
	private BufferedImage enemy;
	private int speed = r.nextInt(3) + 2;
	private int speed2 = r.nextInt(2) + 2;
	
public Enemy(double x, double y, Game game, Controller c) {
		super(x, y); // need to declare that these are coming from the super class
		this.c = c;
		this.game = game;
		
		SpriteE s = new SpriteE(game.getEnemy()); // returns sprite, and allows for use here
		
	enemy = s.grabEnemy(1, 1, 64, 64);
	}

/* Will generally want a tick and render for objects, basic structure of game */
	public void tick() { // if the object is moving then a tick/updating method is necessary
		
		EntityB tempEntb = this; 
		
		y += speed; // enemy movement speed
		
		if(y > Game.HEIGHT * Game.SCALE) {
			y = -40;
			x = r.nextInt(580);
			speed = speed2;
		}
		
		for(int i = 0; i < game.ea.size(); i++)
		{
			EntityA tempEnt = game.ea.get(i);
			
			// destroy the enemy on collision
			if(Physics.Collision(this, tempEnt)) { // for destruction of enemy
				
				Game.score += 10;
				c.removeEntity(tempEnt); // destroys bullet on collision
				c.removeEntity(this);
				game.setEnemy_killed(game.getEnemy_killed() + 1); // adds 1 to Enemy_killed, so more enemies can spawn
			}
		}
	
		
	}
	
	public void render(Graphics g) {
		g.drawImage(enemy, (int)x, (int)y, null); // remember to cast doubles as integers
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 64, 64);
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
