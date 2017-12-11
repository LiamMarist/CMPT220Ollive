package com.FinalProject.src.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter { // calls the keyPressed and keyReleased methods

	Game game;
	
	public KeyInput(Game game) {
		this.game = game; // used to call keyboard import in the game class
	}
	
	public void keyPressed(KeyEvent e) {
		game.keyPressed(e); // calls back to game class
	}
	
	public void keyReleased(KeyEvent e) {
		game.keyReleased(e); // calls back to game class
	}
	
}
