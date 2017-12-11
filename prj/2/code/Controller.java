package com.FinalProject.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Random;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;
import com.game.src.main.classes.EntityE;

public class Controller {
	
	// use interface for convince of using for loops, it would become very messy to continue without implementing an interface
	// we want a linked list for anything we want more than one/ a lot of
	private LinkedList<EntityA> ea = new LinkedList<EntityA>();
	private LinkedList<EntityB> eb = new LinkedList<EntityB>();
	private LinkedList<EntityC> ec = new LinkedList<EntityC>();
	private LinkedList<EntityD> ed = new LinkedList<EntityD>();
	private LinkedList<EntityE> ee = new LinkedList<EntityE>();
	
	//Have to import entity A & B
	EntityA enta;
	EntityB entb;
	EntityC entc;
	EntityD entd;
	EntityE ente;

	BufferedImage enemy;
	BufferedImage upgradeA;
	BufferedImage boss;

	Random r = new Random(); // helps with getting random numbers
	private Game game;
	
	public Controller(Game game, BufferedImage enemy, BufferedImage upgradeA) { // need game instance
	
		
	this.game = game; 
   	this.enemy = enemy;
   	this.upgradeA = upgradeA;
//   	this.boss = boss;
//   	this.fire = fire;
   	/* OLD ENEMY CREATION LOOP
		for(int i = 0; i < 5; i++) // number of enemies
		addEntity(new Enemy(r.nextInt(640), 10, game));
		*/
	}
	
	// generate enemies
	public void createEnemy(int enemy_count) {
		
		// I think I finally found a good loop that organizes the enemy spawning in a good way
		// organizes enemy spawning
		
			for(int i = 0; i < enemy_count; i++) {
			//
				addEntity(new Enemy(r.nextInt(580),-40, game, this));
				
		
					
				
			//
			//	addEntity(new Enemy(r.nextInt(580),-40, game, this));
		/*
			for(int j = i + 1; j < enemy_count / 6; j++) {
			
				addEntity(new Enemy(r.nextInt(600),-100, game, this));
				
					}
					*/
				}
			}		  
			
		
	
	// generate upgrades
	
	public void createUpgrade(int up) {
		
		for(int i = 0; i  < up; i++) {
			addEntity(new Upgrade(r.nextInt(640), -10, game, this));
		}
	}
		
	///////////////////////now for creating invisible wall///////////////////////////
	public void createTest(int test1) {
		for(int i = 1; i  == test1; i++) {
			addEntity(new Wall(-30, 110, game, this));
		}
	}
	/////////////////////////////////////////////////
	/*
	public void createBoss(int bossy) {
		for(int i = 1; i  == bossy; i++) {
			addEntity(new Boss(100, -110, game, this));
		}
	}
	*/
	// loop that now runs for multiple & different objects
	public void tick() {
		// A CLASS
		for(int i = 0; i < ea.size(); i++) {
			enta = ea.get(i);
			
			enta.tick();
		}
		
		// B CLASS
				for(int i = 0; i < eb.size(); i++) {
					entb = eb.get(i);
					
					entb.tick();
				}
				
		// C CLASS
				for(int i = 0; i < ec.size(); i++) {
					entc = ec.get(i);
					
					entc.tick();
				}
				
		// D CLASS
		for(int i = 0; i < ed.size(); i++) {
			entd = ed.get(i);
					
			entd.tick();
		}
		
		// E CLASS
				for(int i = 0; i < ee.size(); i++) {
					ente = ee.get(i);
							
					ente.tick();
				}
	}
	// loop that now runs for multiple & different objects 
	public void render(Graphics g) {
		// A CLASS
		for(int i = 0; i < ea.size(); i++) {
			enta = ea.get(i);
			
			enta.render(g);
		}
		
		// B CLASS
		for(int i = 0; i < eb.size(); i++) {
			entb = eb.get(i);
					
			entb.render(g);
		}
		
		// C CLASS
		for(int i = 0; i < ec.size(); i++) {
			entc = ec.get(i);
							
			entc.render(g);
		}
		
		// E CLASS
				for(int i = 0; i < ee.size(); i++) {
					ente = ee.get(i);
									
					ente.render(g);
				}
	}
   
	public void addEntity(EntityA block) {
		ea.add(block);
	}
	
	public void removeEntity(EntityA block) {
		ea.remove(block);
	}
	
	// same names can be used due to different parameters
	
	public void addEntity(EntityB block) {
		eb.add(block);
	}
	
	public void removeEntity(EntityB block) {
		eb.remove(block);
	}
	
	public void addEntity(EntityC block) {
		ec.add(block);
	}
	
	public void removeEntity(EntityC block) {
		ec.remove(block);
	}

	public void addEntity(EntityD block) {
		ed.add(block);
	}
	
	public void removeEntity(EntityD block) {
		ed.remove(block);
	}
	
	//EntityE - Boss
	public void addEntity(EntityE block) {
		ee.add(block);
	}
	
	public void removeEntity(EntityE block) {
		ee.remove(block);
	}
	
	// return lists with methods
	public LinkedList<EntityA> getEntityA(){
		return ea; 
	}
	
	public LinkedList<EntityB> getEntityB(){
		return eb;
	}
	
	
	public LinkedList<EntityE> getEntityE(){
		return ee;
	}
}
