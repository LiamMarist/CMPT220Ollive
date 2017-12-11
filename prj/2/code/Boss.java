package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityE;

public class Boss extends GameObject implements EntityE{
	
	private Game game;
	private Controller c; // here to remove enemy
	
	
	
	private BufferedImage boss;
//	private BufferedImage fire;
	
	public Boss(double x, double y, Game game, Boss b) {
		super(x, y); // need to declare that these are coming from the super class
	//	this.c = b;
		this.game = game;
		
		SpriteBoss s = new SpriteBoss(game.getBoss());
		
		boss = s.grabBoss(1, 1, 100, 100);
	}

	public void tick() {
		// Tick method in Game class // 
	}

	
	public void render(Graphics g) {
		g.drawImage(boss, (int)x, (int)y, null); // remember to cast doubles as integers
	}


	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 70, 70);
	}

	// setters
	public void setY(double y) {
		this.y = y;
	}
	public void setX(double x) {
		this.x = x;
	}
	

    //getters
	public double getY() {
		return y;
	}
	
	public double getX() {
		return x;
	}
	

	
	
}
