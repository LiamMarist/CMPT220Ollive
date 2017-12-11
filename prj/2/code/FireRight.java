package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.main.classes.EntityB;

public class FireRight extends GameObject implements EntityB {
	private Boss boss;
	BufferedImage fire;
	private Game game;
	
private Controller c;
	
	public FireRight(double x, double y, Game game) {
	super(x, y); // need to declare that these are coming from the super class
	this.boss = boss;
	this.game = game;
	
	SpriteF s = new SpriteF(game.getFire());
	fire = s.grabFire(1, 1, 32, 32);
	Game.f4 = true;
}

public void tick() {
	x += 10;
	
//	Game.f1 = true;
	if( x > game.b.getX() + 550) {
		y = game.b.getY() + 30;
		x = game.b.getX() + 30;
	}
}

public void render(Graphics g) {
	g.drawImage(fire, (int) x, (int)y, null);
	
}


public Rectangle getBounds() {
	return new Rectangle((int)x, (int)y, 32, 32);
}


public double getX() {
	return x;
}


public double getY() {
	return y;
}
}
