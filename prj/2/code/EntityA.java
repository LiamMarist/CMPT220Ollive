package com.game.src.main.classes;

import java.awt.Graphics;
import java.awt.Rectangle;

// classes that implement EntityA won't collide with each other
/* Create a interface to cut down on the use of for loops */
public interface EntityA {
	
	public void tick();
	public void render(Graphics g);
	public Rectangle getBounds();
	
	public double getX();
	public double getY();
	

}
