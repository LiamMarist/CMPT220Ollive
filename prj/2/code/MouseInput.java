package com.FinalProject.src.main;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.FinalProject.src.main.Game.STATE;

//remember to add unimplemented methods, can be done just by clicking on the error
public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent e) {
		
		// return x & y value of mouse
		int mx = e.getX(); 
		int my = e.getY();
		
	STATE State = STATE.MENU;
	
		/**
	public Rectangle playButton = new Rectangle(Game.WIDTH / 2 + 120, 150, 100, 50);
	public Rectangle helpButton = new Rectangle(Game.WIDTH / 2 + 120, 250, 100, 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH / 2 + 120, 350, 100, 50);
		 */
	
		// Menu screen//
		if(Game.State == Game.STATE.MENU) {
		//Play button
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220) {
			if(my >= 150 && my <= 200)
			{
				//Pressed Play Button
				Game.State = Game.STATE.GAME;
			}
		}
		
		//Help button
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220) {
			if(my >= 250 && my <= 300)
			{
				//Pressed Help Button
				Game.State = Game.STATE.HELP;
			}
		}
		
		//Quit button
				if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220) {
					if(my >= 350 && my <= 400)
					{
						//Pressed Quit Button
						System.exit(1);
					}
				} 
		}else if(Game.State == Game.STATE.GAME) {
			
			// play button
			if(my >= 250 && my <= 300)
			{
				//Pressed Play Button
				Game.State = Game.STATE.GAME;
			}
		}
		
		// help screen //
		else if(Game.State == Game.STATE.HELP) {
			// play button
			if(mx >= Game.WIDTH / 2 + 120 -100 && mx <= Game.WIDTH / 2 + 120) {
				if(my >= 350 && my <= 400)
				{
					//Pressed Play Button
					Game.State = Game.STATE.GAME;
				}
			}
			
			// quit button
			if(mx >= Game.WIDTH / 2 + 140 && mx <= Game.WIDTH / 2 + 240) {
				if(my >= 350 && my <= 400)
				{
					//Pressed quit Button
					System.exit(1);
				}
			}
		}
		
		//Game Over screen//
		if(Game.State == Game.STATE.OVER) {
			
			// public Rectangle quitButton = new Rectangle((Game.WIDTH / 2) + 175, 350, 100, 50);
			//public Rectangle restartButton = new Rectangle((Game.WIDTH / 2) - 0, 350, 150, 50);
			
			//Quit button
			if(mx >= Game.WIDTH / 2 + 175 && mx <= Game.WIDTH / 2 + 270) {
				if(my >= 350 && my <= 400)
				{
					//Pressed Quit Button
					System.exit(1);
				}
			} 
			
			if(Game.State == Game.STATE.OVER) {
				////////////////////////
				//   put buttons here  //
				/////////////////////////
			}
		}
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
