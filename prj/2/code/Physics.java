package com.FinalProject.src.main;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;
import com.game.src.main.classes.EntityE;

public class Physics {

	
	public static boolean Collision(EntityA enta, EntityB entb) {
		
		// checks to see if the A class has run into the B class
			if(enta.getBounds().intersects(entb.getBounds())) {
				return true; // if returns true then a collision has occured
		}
		
		return false;
	}
	
	
	public static boolean Collision(EntityB entb, EntityA enta) {
		// checks to see if the B class has run into the A class
			
			if(entb.getBounds().intersects(enta.getBounds())) {
				return true; // if returns true then a collision has occured
			
		}
		
		return false;
	}
	
	public static boolean Collision(EntityD entd, EntityA enta) {
		// checks to see if the A class has run into the D class
			
			if(entd.getBounds().intersects(enta.getBounds())) {
				return true; // if returns true then a collision has occured
			
		}
		
		return false;
	}
	
	public static boolean Collision3(EntityC entc, EntityA enta) {
		// checks to see if the A class has run into the C class
			
			if(entc.getBounds().intersects(enta.getBounds())) {
				return true; // if returns true then a collision has occured
			
		}
		
		return false;
	}
	

public static boolean Collision(EntityE ente, EntityA enta) {
	
	// checks to see if a bullet/missile has hit into the boss
		if(ente.getBounds().intersects(enta.getBounds())) {
			return true; 
	}
	
	return false;
}

public static boolean Collision(EntityA enta, EntityE ente) {
	
	// checks to see if a bullet/missile has hit into the boss
		if(enta.getBounds().intersects(ente.getBounds())) {
			return true; 
	}
	
	return false;
}


	
}
