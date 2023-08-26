/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tile.Objts;
import tile.Tile;
import tile.TileManager;

/**
 *
 * @author Rafael
 */
public class GamePanel extends JPanel implements Runnable {

    public GameWindow gamewindow;
    public int fase = 1;
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
    public int playerX = 100;
    public int playerY = 100;
    int playerSpeed = 8;

    Objts win = new Objts(this, 4, 432, 224);
    Objts p = new Objts(this, 5, 128, 128);

    Objts madeira1 = new Objts(this, 0, 20, 40);
    Objts madeira2 = new Objts(this, 0, 212, 168);

    Objts madeira3 = new Objts(this, 0, 212, 102);
    Objts tv1 = new Objts(this, 1, 276, 232);
    Objts tv2 = new Objts(this, 1, 340, 40);

    Objts madeira4 = new Objts(this, 0, 20, 40);
    Objts madeira5 = new Objts(this, 0, 212, 102);
    Objts tv3 = new Objts(this, 1, 532, 230);
    Objts tv4 = new Objts(this, 1, 340, 40);
    Objts barril1 = new Objts(this, 2, 450, 120);

    public GamePanel(GameWindow gamewindow) {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        this.gamewindow = gamewindow;

    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }

        }
    }

    public void update() {
        try {
            if (fase == 1) {
                madeira1.update();
                madeira2.update();
            }
            if (fase == 2) {
                madeira3.update();
                tv1.update();
                tv2.update();
            }
            if (fase == 3) {
                madeira4.update();
                madeira5.update();
                tv3.update();
                tv4.update();
                barril1.update();
            }
            p.update();

            win.update();

        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        tileM.draw(g2);

        
        if (fase == 1) {

            madeira1.draw(g2);
            madeira2.draw(g2);
            // System.out.println("main.GamePanel.paintComponent()");

            //if (x        >= 672 && x <= 728 && y >= 10 && y <= 40) {
            if (player.x >= 0 && player.x <= 64 && player.y >= 64 && player.y <= 128) {
                if (this.red == true) {
                    madeira1.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;

                }
                //System.out.println(this.red);

            }
            if (player.x >= 192 && player.x <= 256 && player.y >= 192 && player.y <= 256) {
                if (this.red == true) {
                    madeira2.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;

                }
                //System.out.println(this.red);

            }

            if (madeira1.fire == false && madeira2.fire == false) {

                fase = 2;
                madeira1 = null;
                madeira2 = null;
            }

        }

        if (fase == 2) {

            madeira3.draw(g2);
            tv1.draw(g2);
            tv2.draw(g2);
            if (player.x >= 192 && player.x <= 256 && player.y >= 128 && player.y <= 192) {

                if (this.red == true) {
                    madeira3.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }
            if (player.x >= 256 && player.x <= 320 && player.y >= 256 && player.y <= 322) {

                if (this.black == true) {
                    tv1.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }
            if (player.x >= 320 && player.x <= 384 && player.y >= 64 && player.y <= 128) {

                if (this.black == true) {
                    tv2.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }
            this.red = false;
            this.yellow = false;
            this.black = false;

            if (madeira3.fire == false && tv1.fire == false && tv2.fire == false) {

                fase = 3;
                madeira3 = null;
                tv1 = null;
                tv2 = null;
            }

        }

        if (fase == 3) {
            madeira4.draw(g2);
            madeira5.draw(g2);
            tv3.draw(g2);
            tv4.draw(g2);
            barril1.draw(g2);
            ///          
//
            if (player.x >= 192 && player.x <= 256 && player.y >= 128 && player.y <= 192) {

                if (this.red == true) {
                    madeira5.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }

            if (player.x >= 0 && player.x <= 64 && player.y >= 60 && player.y <= 128) {

                if (this.red == true) {
                    madeira4.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }
            if (player.x >= 512 && player.x <= 576 && player.y >= 256 && player.y <= 322) {

                if (this.black == true) {
                    tv3.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }

            if (player.x >= 320 && player.x <= 384 && player.y >= 60 && player.y <= 128) {

                if (this.black == true) {
                    tv4.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }
            if (player.x >= 448 && player.x <= 512 && player.y >= 128 && player.y <= 196) {

                if (this.yellow == true) {
                    barril1.fire = false;
                    this.red = false;
                    this.yellow = false;
                    this.black = false;
                }
            }
            this.red = false;
            this.yellow = false;
            this.black = false;

       
            

        }
        
        player.draw(g2);
        p.draw(g2);
        if (fase == 3) {
if (madeira4.fire == false && madeira5.fire == false && tv3.fire == false && tv4.fire == false && barril1.fire == false) {
                g2.drawImage(win.tile.image, 108, 64, 512, 256, null);

                this.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                     
                            gamewindow.frame.setVisible(true);  
                            gamewindow.window.setVisible(false);
                            gamewindow.window.dispose();

                        
                    }
                });

            }}
        g2.dispose();

    }

}
