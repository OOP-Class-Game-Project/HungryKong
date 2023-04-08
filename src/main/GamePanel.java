package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	
	final int originalTileSize = 16;
	final int scale = 3 ;
	
	final int tileSize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	//FPS
	int FPS = 60;
	
	keyHandler keyH = new KeyHandler(); 
	Thread gameThread;
	
	//Set player's default position
	int playerX = 100;
	int playerY = 100;
	int playerSpeed = 4;
	
	//This is GamePanel
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}
public void startgameThread() {
	gameThread = new Thread(this);
	gameThread.start();
}
	@Override

	
		public void run(){
			double drawInterval = 1000000000/FPS;
			double delta = 0;
			long lastTime = System.nanoTime();
			long currentTime;
			long timer = 0;
			int drawCount =0;
			
			while(gameThread != null){
				
				currentTime = System.nanoTime();
				
				delta += (currentTime - lastTime) / drawInterval;
				timer += (currentTime - lastTime);
				lastTime = currentTime;
				if(delta >=1){
				update();
				repaint();
				delta--;
				DrawCount++;
				}
				if(timer >= 1000000000){
					System.out.println("FPS : "+drawCount);
					drawCount =0;
					timer =0;
				}
			}
		}
			
		public void update (){
			if(keyH.upPressed == true){
			playerY-= playerSpeed;
			}
			else if(keyH.downPressed == true){
				pleyerY += playerSpeed;
			}
			else if((keyH.leftPressed == true){
				pleyerX -= playerSpeed;
			}
			else if((keyH.rightPressed == true){
				pleyerX += playerSpeed;
			}
		}
		public void paintComponent(Graphic g){
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D)g;
			
			g2.setcolor(Color.white);
			
			g2.fillRect(playerX,playerY,tileSize,tileSize);
			
			g2.dispose();
		}

}
