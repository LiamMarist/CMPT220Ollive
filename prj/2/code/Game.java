package com.FinalProject.src.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JFrame;

import com.FinalProject.src.main.Game.STATE;
import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityE;

// CTRL + SHIFT + o is a short cut to import java canvas or other things that can be imported
// implements requires a method
public class Game extends Canvas implements Runnable{ // uses both inheritance and interfaces 
	
	
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 320;
	public static final int HEIGHT = WIDTH / 12 * 9;
	public static final int SCALE = 2;
	public final String TITLE = "My Java Space Shooter";
	
	private boolean running = false;
	private Thread thread;
	
	// buffered image - loads image before it is rendered
	private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	private BufferedImage sprite = null;
	private BufferedImage background = null;
	static BufferedImage bullet = null;
	private BufferedImage enemy = null;
	private BufferedImage upgradeA = null;
	static BufferedImage missile = null;
	private BufferedImage boss = null;
	private BufferedImage fire = null;
	
	
	private boolean is_shooting = false;
	
	// Boss fire
	static boolean exist = false;
	static boolean f1 = true;
	static boolean f2 = true;
	static boolean f3 = true;
	static boolean f4 = true;

	
	
	private int up = 1; // upgrade number
	private int test1 = 1; // int for loop to create an invisible wall to destroy bullets
//	private int bossy = 1; // boss
	
	static int enemy_count = 1; // how many enemies to spawn
	static int enemy_killed = 0; // this number affects how many enemies will be spawned
	
	
	public int getEnemy_count() {
		return enemy_count;
	}

	public void setEnemy_count(int enemy_count) {
		this.enemy_count = enemy_count;
	}

	public int getEnemy_killed() {
		return enemy_killed;
	}

	public void setEnemy_killed(int enemy_killed) {
		this.enemy_killed = enemy_killed;
	}

	private Player p;
	private Controller c;
	private Menu menu;
	private Help help;
	private GameOver over;
	private Wall t;
	public Boss b;
	
	public LinkedList<EntityA> ea;
	public LinkedList<EntityB> eb;
	public LinkedList<EntityC> ec;
	public LinkedList<EntityE> ee;
	
	public static int HEALTH = 100 * 2;
	public static int score = 0;
	public static int bossHealth = 200;
	
	
	
	// for different states need a enum
	public static enum STATE{
		MENU,
		HELP,
		GAME,
		OVER
	}
	
	// check for state of the game
	public static STATE State = STATE.MENU;

	
	
	
	public void init() {
		BufferedImageLoader loader = new BufferedImageLoader();
		try {
			
			sprite = loader.loadImage("/Player1.png");
			background = loader.loadImage("/space.jpg");
			bullet = loader.loadImage("/arrow.png");
			enemy = loader.loadImage("/Enemy.png");
			upgradeA = loader.loadImage("/PowerUp1.png");
			missile = loader.loadImage("/PowerUp1.png");
			BufferedImage test = loader.loadImage("/Enemy.png");
			boss = loader.loadImage("/Boss.png");
			fire = loader.loadImage("/PowerUp2.png");
		
			
		}catch(IOException e) {
			e.printStackTrace(); // basically gives an error report
		}
		
		this.requestFocus(); // makes sure the focus of the input is going to this
		
		// has to be initialized before player
		addKeyListener(new KeyInput(this));
		
		c = new Controller(this,enemy, upgradeA);
		p = new Player(350, 400, this, c); // this refers to game class
		b = new Boss(100, -110, this, b);
		menu = new Menu();
		over = new GameOver();
		help = new Help();
		
		//has to be after controller is initialized
		ea = c.getEntityA();
		eb = c.getEntityB();
		ee = c.getEntityE();
		
		this.addMouseListener(new MouseInput());
		
		c.createEnemy(enemy_count);
		c.createUpgrade(up);
		// destroys bullet after going past y coordinate
		c.createTest(test1);
	

	}
	
	// synchronized is about multiple threads reading and writing
	//the same variables, objects and resources
	private synchronized void start() {
		if(running)
			return; // if already running then return/ get out of method
		
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	private synchronized void stop() {
		if (!running)
			return;
		
		running = false;
		
		try {
			// needs to be in a try / catch because it can fail
			thread.join(); 
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.exit(1);
	}
	
	
	/*
	 HEART OF GAME
	 NEED LOOP TO RUN
	 A solid game loop will help it run better on different computers or at least make sure no issues with the loop occur
	 
	 */
	// this method needed for runnable, when a thread is called or started
		//it takes the thread and calls this run method
	
	public void run() {
		init();
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60.0; //60 FPS
		double ns = 1000000000 / amountOfTicks; // ns = nanoseconds
		double delta = 0; // will calculate time passed
		int updates = 0;
		int frames = 0;
		long timer = System.currentTimeMillis();
		//
		//this is the game loop, can be reused in future games...
		while(running) {
		
			// Sets up current time so it is correct
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			if(delta >= 1) {
				tick();
				updates++;
				delta--;	
			}
			render();
			frames++;
			
			// all of this really limits on how fast the game can update
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + " Ticks, Fps " + frames);
				updates = 0; //needs to be set to zero other wise wont reset
				frames = 0;
			}
			
		}
		
		stop(); // stops when game loop ends
	}

	// everything in the game that updates
	private void tick() {
		if(State == STATE.GAME) { // only run these methods if in the correct state of the game
		p.tick(); // updates 60 times per second
		c.tick();
		b.tick();
		
		// adds more enemies/ starts next wave once enemies were defeated
		if(enemy_killed >= enemy_count && enemy_killed < 16)
		{
			enemy_count += 1;
			enemy_killed = 0;
			c.createEnemy(enemy_count);
		}
		
		else if(enemy_killed >= enemy_count) // puts a cap on the number of enemies that can spawn
		{
			enemy_count = 15;
			enemy_killed = 0;
			c.createEnemy(enemy_count);
		}
		
		
		if(HEALTH <= 0) {
		//	System.exit(1);
			Game.State = Game.STATE.OVER; // sends to game over screen
		}	
		
		if(bossHealth <= 0) {
				Game.State = Game.STATE.OVER; // sends to game over screen
			}
		
		if(enemy_killed >= 15 && !exist && f1 == true) {
			c.addEntity(new FireUp(getX(), getY(), this));
			f1 = false;	
		}
		else if(enemy_killed >= 15 && f1 == false && exist) {
			c.addEntity(new FireUp(getX(), getY(), this));
			f1 = true;	
			
		}
		
		
		if(enemy_killed >= 15 && !exist && f2 == true) {
			c.addEntity(new Fire(getX(), getY(), this));
			f2 = false;
		} 
		else if(enemy_killed >= 15 && f2 == false && exist) {
			c.addEntity(new Fire(getX(), getY(), this));
			f2 = true;
		//	exist = false;
		}
		
		if(enemy_killed >= 15 && !exist && f3 == true) {
			c.addEntity(new FireLeft(getX(), getY(), this));
			f3 = false;
		} 
		else if(enemy_killed >= 15 && f3 == false && exist) {
			c.addEntity(new FireLeft(getX(), getY(), this));
			f3 = true;	
		//	exist = false;
		}
		
		if(enemy_killed >= 15 && !exist && f4 == true) {
			c.addEntity(new FireRight(getX(), getY(), this));
			f4 = false;
		}
		else if(enemy_killed >= 15 && f4 == false && exist) {
			c.addEntity(new FireRight(getX(), getY(), this));
			f4 = true;	
			exist = false;
		}
		
		
		if(enemy_killed >= 15 && b.y < 150 && b.x <= 100 && b.x >= -150) { //   && x == 100
			enemy_count = 300;
			b.x -= 2;
		}
		
		
		else if(b.y <= 150 && b.x < -150) {
			b.y += 2;
		}
	
		else if( b.y >= 150 && b.x < 250) {
				b.x += 2;
			}
		else if(b.x >= 250 && b.y < 350 && b.x < 260) {
			b.y += 2;
		}
		else if(b.y >= 350 && b.x < 450) {
			b.x += 2;	
		}
		else if(b.x >= 450 && b.y > 150) {
			b.y -= 2;
		}
		else if( b.y <= 150 && b.x < 650 && b.y > 50 && b.y > 0) {
			b.x += 2;
		}
		else if( b.x >= 640 && b.y > 50) {
			b.y -= 2;
		}
		else if( b.y <= 50 && b.x > 430) {
			b.x -= 2;
		}
		else if(b.x <= 430 && b.y < 60 &&b. y > -100 && b.y > -110) {
			b.y -= 2;
		}
		else if(b.y <= -100 && b.x <= 430 && b.y > -110) {
			b.x -= 2;
		}
		else if(b.x <= 250 && b.y > -40) {
			b.y += 2;
		}
		
		
		for(int i = 0; i < ea.size(); i++) 
		{
			EntityA tempEnt = ea.get(i);
			
			// if a collison happens the health bar decreases
			if(Physics.Collision(b, tempEnt)) 
			{
				c.removeEntity(tempEnt);
				Game.bossHealth -= 5;
				Game.score += 50;
			}
		}
		
		    // One hit KO by running into boss
			if(Physics.Collision(p, b)) {
				HEALTH -= 200;
				}		
		
		}
	}
	
	// everything in the game that renders
	private void render() {
		
		// buffer strategy, handles all the buffering behind the scenes
		BufferStrategy bs = this.getBufferStrategy(); // Also needs to be imported refers to Canvas through "this"
		
		if(bs == null) {
			
			createBufferStrategy(3); // three buffers, image is loaded behind screen, faster performance with more buffers
			return;
		}
		
		Graphics g = bs.getDrawGraphics(); // import graphics, draws out buffers
		//////////////////////////////////////////////////
					// CAN DRAW OUT STUFF HERE //
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this); // keeps everything where it belongs
	
	
		
		if(State == STATE.GAME) { // rendered stuff for game
			p.render(g);
			c.render(g);
			b.render(g);
			
			
			g.setColor(Color.gray); //health bar
			g.fillRect(5, 5, 200, 25);// fill bar with color in top corner of screen
			
			g.setColor(Color.green); //health bar
			g.fillRect(5, 5, HEALTH, 25);
			
			g.setColor(Color.white); //health bar
			g.drawRect(5, 5, 200, 25);
			
			// Boss health bar
			if(enemy_killed >= 15) {
				
				g.setColor(Color.gray); 
				g.fillRect(5, 50, 200, 25);
				
				g.setColor(Color.red); 
				g.fillRect(5, 50, bossHealth, 25);
				
				g.setColor(Color.white);
				g.drawRect(5, 50, 200, 25);
			}
			
			// display score
			Font fnt = new Font("arial", Font.BOLD, 20);
			g.setFont(fnt);
			g.drawString("Score: " + score, 530, 25); 
			
		} else if(State == STATE.MENU) { // rendered stuff for Menu screen
			menu.render(g);
			
		} else if(State == STATE.OVER) { // rendered stuff for GameOver screen
			over.render(g);
		} else if(State == STATE.HELP) { // render help/ info screen
			help.render(g);
		}
		/////////////////////////////////////////////////
		// have to get rid of BufferStrategy
		g.dispose();
		bs.show(); //shows out BufferStrategy
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(State == STATE.GAME) { 
		
		// VK = Virtual Keyboard
		if(key == KeyEvent.VK_RIGHT) { 
			
		//	p.setX(p.getX() + 5); // have to translate current position then add 5
			p.setVelX(5); // this allows for more fluid movement but needs to use the keyReleased
			
		}else if(key == KeyEvent.VK_LEFT) { 
			p.setVelX(-5);
			
		}else if(key == KeyEvent.VK_DOWN) { 
			p.setVelY(5);
			
		}else if(key == KeyEvent.VK_UP) { 
			p.setVelY(-5);
		
		} else if(key == KeyEvent.VK_SPACE && !is_shooting && bullet != missile) {
			is_shooting = true;
			c.addEntity(new Bullet(p.getX() + 15, p.getY(), this));
			
		}
			
			else if(key == KeyEvent.VK_SPACE && !is_shooting && bullet == missile) { // once the player obtains the upgrade then they shoot two bullets at a time
			is_shooting = true;
			c.addEntity(new Bullet(p.getX()+ 15 + 60, p.getY() + 25, this));
			c.addEntity(new Bullet(p.getX()+ 15 - 60, p.getY() + 25, this));
		
			}
		
		
		}
		
	}
	
	
	
	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT) { 
			
				p.setVelX(0);
				
			}else if(key == KeyEvent.VK_LEFT) { 
				p.setVelX(0);
				
			}else if(key == KeyEvent.VK_DOWN) { 
				p.setVelY(0);
				
			}else if(key == KeyEvent.VK_UP) { 
				p.setVelY(0);
			
			// so players can't hold down space bar to fire
			}else if(key == KeyEvent.VK_SPACE) {
				is_shooting = false;
			}
	}
	
	public static void main(String args[]) {
		Game game = new Game();
		
		// creates dimensions for room
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		
		/* Makes Window  */
		JFrame frame = new JFrame(game.TITLE);
		frame.add(game); // takes dimensions
		frame.pack(); // takes all of the components in it and sizes the frame according to the sizes of its components
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows the program to be closed, (red X button)
		frame.setResizable(false); // cannot be resized
		frame.setLocationRelativeTo(null); // will not set location
		frame.setVisible(true); // sets to visible
		
		game.start(); // has to be called in main method here
		
	}
	
	public BufferedImage getSprite() {
		return sprite;
	}
	
	public BufferedImage getBullet() {
		return bullet;
	}
	
	public BufferedImage getEnemy() {
		return enemy;
	}

	public BufferedImage getUpgradeA() {
		return upgradeA;
	}
	
	public BufferedImage getBoss() {
		return boss;
	}
	
	public BufferedImage getFire() {
		return fire;
	}
	
}
