package com.FinalProject.src.main;

import java.awt.image.BufferedImage;

public class SpriteE {

	private BufferedImage enemy;
	
	public SpriteE(BufferedImage enemy) {
		this.enemy = enemy;
	}
	
	public BufferedImage grabEnemy(int col, int row, int width, int height) {
		BufferedImage img = enemy.getSubimage((col*64) - 64, (row * 64) - 64, width, height);
				return img;
	}
}
