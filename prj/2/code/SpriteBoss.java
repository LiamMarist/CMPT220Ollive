package com.FinalProject.src.main;

import java.awt.image.BufferedImage;

public class SpriteBoss {
	
private BufferedImage boss;
	
	public SpriteBoss(BufferedImage boss) {
		this.boss = boss;
	}
	
	
	public BufferedImage grabBoss(int col, int row, int width, int height) {
		BufferedImage img = boss.getSubimage((col*100) - 100, (row * 100) - 100, width, height);
				return img;
	}

}
