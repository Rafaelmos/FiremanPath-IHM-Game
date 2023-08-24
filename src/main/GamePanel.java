/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import tile.Objts;
import tile.TileManager;

/**
 *
 * @author Rafael
 */
public class GamePanel extends JPanel implements Runnable{
    final int originalTitleSize = 32;
    final int scale = 2;
    public final int tileSize = originalTitleSize * scale;
    final int maxScreenCol = 13;
    final int maxScreenRow = 7;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;
    boolean red, yellow, black;
  
    int FPS = 60;
    
    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    public Player player = new Player(this, keyH);
    public int fase = 1;
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 8;
    
    
    Objts madeira1 = new Objts(this, 0, 20, 40);
    
    
    
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    @Override
    public void run() {
        
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        while(gameThread != null){
            
            currentTime = System.nanoTime();
            
            delta += (currentTime-lastTime)/drawInterval;
            
            lastTime = currentTime;
            
            if(delta >= 1){
                update();
                repaint();
                delta--;
            }
            
            
            
            
    }
   }
    public void update(){
        player.update();
        try {
            madeira1.update(0);
        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    
    
    
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        tileM.draw(g2);
        player.draw(g2);
        
    
        
        if (fase == 1) {
            
            madeira1.draw(g2);
           // System.out.println("main.GamePanel.paintComponent()");
            
         //if (x        >= 672 && x <= 728 && y >= 10 && y <= 40) {
           if (player.x >= 0 && player.x <= 64 && player.y >= 64 && player.y <= 128){
                if (this.red==true) {
                    madeira1.fire = false;

               }
                       
                //System.out.println(this.red);
                this.red = false;
                this.yellow = false;
                this.black = false;
           
           }
                

            
        }
        
        if (fase == 2) {
            
            
        }
        
         if (fase == 3) {
            
            
        }
        
        g2.dispose();
    
    }

  
    
}
