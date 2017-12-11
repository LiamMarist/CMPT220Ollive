package com.FinalProject.src.main;

import java.awt.image.BufferedImage;

public class SpriteU {

private BufferedImage upgradeA;
	
	public SpriteU(BufferedImage upgradeA) {
		this.upgradeA = upgradeA;
	}
	
	public BufferedImage grabUpgrade(int col, int row, int width, int height) {
		BufferedImage img = upgradeA.getSubimage((col*32) - 32, (row * 32) - 32, width, height);
				return img;
	}
}
