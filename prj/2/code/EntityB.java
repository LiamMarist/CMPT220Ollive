package com.game.src.main.classes;

import java.awt.Graphics;
import java.awt.Rectangle;
// objects with EntityA collide with objects with EntityB
/* Create a interface to cut down on the use of for loops */
public interface EntityB {
	
	public void tick();
	public void render(Graphics g);
	public Rectangle getBounds();
	
	public double getX();
	public double getY();
	

}
