package com.FinalProject.src.main;

import java.awt.image.BufferedImage;

public class SpriteF {
	
	private BufferedImage fire;
	
	public SpriteF(BufferedImage fire) {
			this.fire = fire;
	}	
	
	public BufferedImage grabFire(int col, int row, int width, int height) {
		BufferedImage fire1 = fire.getSubimage((col*64) - 64, (row * 64) - 64, width, height);
				return fire1;
	}

}
