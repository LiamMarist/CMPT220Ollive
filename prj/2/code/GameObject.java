package com.FinalProject.src.main;

import java.awt.Rectangle;

public class GameObject {
	
	public double x; // x coordinate of whatever is extended to this
	public double y; // y coordinate of whatever is extended to this

	public GameObject(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// create invisible hit box around player
	public Rectangle getBounds(int width, int height) {
		return new Rectangle((int)x, (int)y, width, height);
	}
	
	
	
}
