package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityE;

public class Player extends GameObject implements EntityA{
	
	private double velX = 0;
	private double velY = 0;
	
	private BufferedImage player;
	
	Game game;
	Controller controller;
	
	public Player(double x, double y, Game game, Controller controller) {
		super(x,y); // need to declare that these are coming from the super class
		this.game = game;
		this.controller = controller;
		
		Sprite s = new Sprite(game.getSprite()); // returns sprite sheet, and allows for use here
		
		player = s.grabImage(1, 1, 64, 64);
	}
	
	public void tick() { // update method
		x += velX; // when velX changes it will also change x position
		y += velY; // when velY changes it will also change y position
		
		
	/* These are for setting boundary for player */
		if(x <= 0) 
			x = 0;
		
		if(x >= 640 - 50)
			x = 640 - 50;
		
		if(y <= 0)
			y = 0;
		
		if(y >= 480 - 64)
			y = 480 - 64;
		
		for(int i = 0; i < game.eb.size(); i++) 
		{
			EntityB tempEnt = game.eb.get(i);
			
			// if a collison happens the health bar decreases
			if(Physics.Collision(this, tempEnt)) 
			{
				controller.removeEntity(tempEnt);
				Game.HEALTH -= 50;
				game.setEnemy_killed(game.getEnemy_killed() + 1);
				if(Game.enemy_killed >= 15) {
				Game.exist = true;
				}
		
			}
		}
		
		for(int i = 0; i < game.ee.size(); i++) { 
		
			EntityE tempEntE = game.ee.get(i);
		
			if(Physics.Collision(this, tempEntE)) {
				Game.HEALTH -= 100;
				}
			}
		}
		
	
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public void render(Graphics g) { // draws out image
		
		g.drawImage(player, (int)x, (int)y, null); // draw image only supports integers, have to pass doubles to integers
		
	}
	// Getters and Setters allow to change the private x and y variables, for player movement
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	// Setters for velocity
	public void setVelX(double velX) {
		this.velX = velX;
	}
	
	public void setVelY(double velY) {
		this.velY = velY;
	}
	
	

}
