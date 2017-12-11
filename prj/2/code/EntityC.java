package com.game.src.main.classes;

import java.awt.Graphics;
import java.awt.Rectangle;

// this interface is so the upgrade can collide with player 
public interface EntityC {

	public void tick();
	public void render(Graphics g);
	public Rectangle getBounds();
	
	public double getX();
	public double getY();
}
