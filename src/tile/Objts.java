/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tile;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import main.GamePanel;

/**
 *
 * @author Rafael
 */
public class Objts {     
    GamePanel gp;
    public int type; //0 = madeira, 1= eletronico, 2= oleo.
    public Tile tile;
    public boolean  fire = true;
    public int x,y;

    public Objts(GamePanel gp,int type, int x, int y) {
        this.gp = gp;
        this.type = type;
        this.x = x;
        this.y = y;
        this.tile = new Tile();
        try {
            getTileImage(type);
        } catch (IOException ex) {
            Logger.getLogger(Objts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void getTileImage(int type) throws IOException {
        
        if (type == 0 && fire == true) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/chair_fire.png"));
        }
        if (type == 1 && fire == true) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/tv_1_fire.png"));

        }
        if (type == 2 && fire == true) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/barrel_fire.png"));
        }
        if (type == 4) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/win.png"));
        }
        
       
 
    }
    
    
        public void update() throws IOException {
        
        if (type == 0 && fire == false) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/chair.png"));
        }
        if (type == 1 && fire == false) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/tv_1.png"));

        }
        if (type == 2 && fire == false) {
            tile.image = ImageIO.read(getClass().getResourceAsStream("res/tiles/barrel.png"));
        }
        
        

 
    }
    
    
    public void draw(Graphics2D g2) {
        
        
        
        g2.drawImage(tile.image, x, y, gp.tileSize, gp.tileSize, null);
        
        
    }


    
    
}
