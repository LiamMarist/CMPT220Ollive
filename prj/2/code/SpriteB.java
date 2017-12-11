package com.FinalProject.src.main;

import java.awt.image.BufferedImage;

public class SpriteB {

	private BufferedImage bullet;
//	private BufferedImage fire;
	
	public SpriteB(BufferedImage bullet) {
		this.bullet = bullet;
	//	this.fire = fire;
	}	
	
	public BufferedImage grabBullet(int col, int row, int width, int height) {
		BufferedImage img = bullet.getSubimage((col*64) - 64, (row * 64) - 64, width, height);
				return img;
	}
	
}