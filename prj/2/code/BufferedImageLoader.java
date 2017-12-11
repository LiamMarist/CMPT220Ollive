package com.FinalProject.src.main;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

// class created to load in buffered images
public class BufferedImageLoader {

	private BufferedImage image;
	
	// path where sprite sheet is help
	public BufferedImage loadImage(String path) throws IOException{
		
		
		image = ImageIO.read(getClass().getResource(path));
		return image;
		
	}
		
	
	
}
