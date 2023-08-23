/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tile;

import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import main.GamePanel;

/**
 *
 * @author Rafael
 */
public class TileManager {
    
    GamePanel gp;
    Tile[] tile;
    Tile[] inter;


    public TileManager(GamePanel gp) {
        this.gp = gp;
        this.tile = new Tile[10];
        this.inter = new Tile[10];
        
        getTileImage();
    }


    public void getTileImage(){
    
        try {
            tile[0] = new Tile();tile[0].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/floor.png"));
            tile[1] = new Tile();tile[1].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/chair.png"));
            inter[0] = new Tile();inter[0].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/inv.png"));
            inter[1] = new Tile();inter[1].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/inv2.png"));
            inter[2] = new Tile();inter[2].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/down.png"));

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public void draw(Graphics2D g2){
            
        g2.drawImage(tile[0].image, 0,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  192,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  256,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  320,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  384,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  448,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  512,0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  576,0, gp.tileSize, gp.tileSize, null);

        g2.drawImage(tile[0].image, 0,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  192, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  256, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  320,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  384,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  448,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  512,64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  576,64, gp.tileSize, gp.tileSize, null);
                
        g2.drawImage(tile[0].image, 0,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  192, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  256, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  320,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  384,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  448,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  512,128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  576,128, gp.tileSize, gp.tileSize, null);

        g2.drawImage(tile[0].image, 0,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  256, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  320,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  384,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  448,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  512,192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  576,192, gp.tileSize, gp.tileSize, null);
        
        
        g2.drawImage(tile[0].image, 0,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  192, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  256, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  320,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  384,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  448,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  512,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image,  576,256, gp.tileSize, gp.tileSize, null);

        //g2.drawImage(tile[1].image,  576,256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(inter[0].image,  640,0, 192, 576, null); //menu direito
        g2.drawImage(inter[1].image,  0,320, 640, 128, null); //menu esquerdo
        
        //g2.drawImage(inter[2].image,  29,364, 32, 32, null);  //0
        //g2.drawImage(inter[2].image,  87,364, 32, 32, null);  //1
        //g2.drawImage(inter[2].image,  148,364, 32, 32, null); //2
        //g2.drawImage(inter[2].image,  148,364, 32, 32, null); //3
        //g2.drawImage(inter[2].image,  212,364, 32, 32, null); //4
        //g2.drawImage(inter[2].image,  272,364, 32, 32, null); //5
        //g2.drawImage(inter[2].image,  333,364, 32, 32, null); //6
        //g2.drawImage(inter[2].image,  395,364, 32, 32, null); //7
        //g2.drawImage(inter[2].image,  456,364, 32, 32, null); //8
        //g2.drawImage(inter[2].image,  517,364, 32, 32, null); //9
        //g2.drawImage(inter[2].image,  580,364, 32, 32, null); //10


                }
}
