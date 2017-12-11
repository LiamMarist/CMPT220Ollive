package com.FinalProject.src.main;

import java.awt.image.BufferedImage;

public class Sprite {

	private BufferedImage image;
	
	public Sprite(BufferedImage image) {
		this.image = image;
	}
	
	
	public BufferedImage grabImage(int col, int row, int width, int height) {
		BufferedImage img = image.getSubimage((col*64) - 64, (row * 64) - 64, width, height);
				return img;
	}
	
}
