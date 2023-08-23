/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Rafael
 */
public class Menu {
        public MenuPanel gp;
        public BufferedImage menu1;


    public Menu(MenuPanel gp) {
        this.gp = gp;
        getMenuImage();

    }

        public void getMenuImage() {

        try {
            menu1 = ImageIO.read(getClass().getResourceAsStream("./res/menu/gamestart.png"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
         public void draw(Graphics2D g2) {
            BufferedImage image = menu1;

            g2.drawImage(image, 0, 0, gp.tileSize, gp.tileSize, null);
         }
        
             public void update() {
      
    }
}
