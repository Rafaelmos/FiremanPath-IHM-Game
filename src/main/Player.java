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
public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;
    public String[] rota;
    public boolean pUP, pDOWN, pRIGHT, pLEFT;

    public Player(GamePanel gp, KeyHandler KeyH) {
        this.gp = gp;
        this.keyH = KeyH;
        setDefaultValues();
        getPlayerImage();
        direction = "down";
        this.rota = new String[10];
    }

    public void setDefaultValues() {
        x = 128;
        y = 128;
        speed = 6;
    }

    public void getPlayerImage() {

        try {
            up1 = ImageIO.read(getClass().getResourceAsStream("./res/player/up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("res/player/up_2.png"));
            up3 = ImageIO.read(getClass().getResourceAsStream("res/player/up_3.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("res/player/down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("res/player/down_2.png"));
            down3 = ImageIO.read(getClass().getResourceAsStream("res/player/down_3.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("res/player/right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("res/player/right_2.png"));
            right3 = ImageIO.read(getClass().getResourceAsStream("res/player/right_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("res/player/left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("res/player/left_2.png"));
            left3 = ImageIO.read(getClass().getResourceAsStream("res/player/left_3.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void update() {
     
        /*
        if (gp.keyH.pUP == true) {
            direction = "up";
            if (y <= 0) {
                y = 0;
            } else {
                y -= speed;
            }
        }
        if (gp.keyH.pDOWN == true) {
            direction = "down";
            if (y >= 256) {
                y = 256;
            } else {
                y += speed;
            }
        }
        if (gp.keyH.pRIGHT == true) {
            direction = "right";
            if (x >= 576) {
                x = 576;
            } else {

                x += speed;
            }
        }
        if (gp.keyH.pLEFT == true) {
            direction = "left";

            if (x <= 0) {
                x = 0;
            } else {
                x -= speed;
            }
        }

        if (gp.keyH.pUP || gp.keyH.pDOWN || gp.keyH.pRIGHT || gp.keyH.pLEFT) {
            spriteCounter++;
            if (spriteCounter > 5) {
                switch (spriteNumber) {
                    case 1:
                        spriteNumber = 2;
                        break;
                    case 2:
                        spriteNumber = 3;
                        break;
                    case 3:
                        spriteNumber = 1;
                        break;
                    default:
                        break;
                }
                spriteCounter = 0;
            }
        } else {
            spriteNumber = 1;
        }
         */
    }

    public void draw(Graphics2D g2) {
        //g2.setColor(Color.WHITE);
        //g2.fillRect(x, y, gp.tileSize , gp.tileSize);

        BufferedImage image = null;

        switch (direction) {
            case "up":
                if (spriteNumber == 1) {
                    image = up1;
                }
                if (spriteNumber == 2) {
                    image = up2;
                }
                if (spriteNumber == 3) {
                    image = up3;
                }
                break;
            case "down":
                if (spriteNumber == 1) {
                    image = down1;
                }
                if (spriteNumber == 2) {
                    image = down2;
                }
                if (spriteNumber == 3) {
                    image = down3;
                }
                break;
            case "right":

                if (spriteNumber == 1) {
                    image = right1;
                }
                if (spriteNumber == 2) {
                    image = right2;
                }
                if (spriteNumber == 3) {
                    image = right3;
                }

                break;
            case "left":

                if (spriteNumber == 1) {
                    image = left1;
                }
                if (spriteNumber == 2) {
                    image = left2;
                }
                if (spriteNumber == 3) {
                    image = left3;
                }
                break;
            default:
                throw new AssertionError();
        }

        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);

    }


}
