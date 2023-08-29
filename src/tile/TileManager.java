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
    Tile end = new Tile();

    public TileManager(GamePanel gp) {
        this.gp = gp;
        this.tile = new Tile[10];
        this.inter = new Tile[10];
        getTileImage();
    }

    public void getTileImage() {

        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/floor.png"));
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/chair.png"));
            inter[0] = new Tile();
            inter[0].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/inv.png"));
            inter[1] = new Tile();
            inter[1].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/inv2.png"));
            inter[2] = new Tile();
            inter[2].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/up.png"));
            inter[3] = new Tile();
            inter[3].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/down.png"));
            inter[4] = new Tile();
            inter[4].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/left.png"));
            inter[5] = new Tile();
            inter[5].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/right.png"));
            inter[6] = new Tile();
            inter[6].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/e-red.png"));
            inter[7] = new Tile();
            inter[7].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/e-yellow.png"));
            inter[8] = new Tile();
            inter[8].image = ImageIO.read(getClass().getResourceAsStream("res/tiles/e-black.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void rotap(Graphics2D g2) {

        if (gp.player.rota[0] == null) {
            g2.clearRect(29, 364, 32, 32);
        } else if (gp.player.rota[0] == "up") {
            g2.drawImage(inter[2].image, 29, 364, 32, 32, null);  //1
        } else if (gp.player.rota[0] == "down") {
            g2.drawImage(inter[3].image, 29, 364, 32, 32, null);  //1
        } else if (gp.player.rota[0] == "left") {
            g2.drawImage(inter[4].image, 29, 364, 32, 32, null);  //1
        } else if (gp.player.rota[0] == "right") {

            g2.drawImage(inter[5].image, 29, 364, 32, 32, null);  //1

        } else if (gp.player.rota[0] == "e-black") {
            g2.drawImage(inter[8].image, 29, 364, 32, 32, null);  //1
        } else if (gp.player.rota[0] == "e-red") {
            g2.drawImage(inter[6].image, 29, 364, 32, 32, null);  //1
        } else if (gp.player.rota[0] == "e-yellow") {
            g2.drawImage(inter[7].image, 29, 364, 32, 32, null);  //1
        }

        if (gp.player.rota[1] == null) {
            g2.clearRect(87, 364, 32, 32);

        } else if (gp.player.rota[1] == "up") {
            g2.drawImage(inter[2].image, 87, 364, 32, 32, null);  //0
        } else if (gp.player.rota[1] == "down") {
            g2.drawImage(inter[3].image, 87, 364, 32, 32, null);  //0
        } else if (gp.player.rota[1] == "left") {
            g2.drawImage(inter[4].image, 87, 364, 32, 32, null);  //0
        } else if (gp.player.rota[1] == "right") {
            g2.drawImage(inter[5].image, 87, 364, 32, 32, null);  //0

        } else if (gp.player.rota[1] == "e-black") {
            g2.drawImage(inter[8].image, 87, 364, 32, 32, null);  //0
        } else if (gp.player.rota[1] == "e-red") {
            g2.drawImage(inter[6].image, 87, 364, 32, 32, null);  //0
        } else if (gp.player.rota[1] == "e-yellow") {
            g2.drawImage(inter[7].image, 87, 364, 32, 32, null);  //0
        }

        if (gp.player.rota[2] == null) {
            g2.clearRect(148, 364, 32, 32); //2
        } else if (gp.player.rota[2] == "up") {
            g2.drawImage(inter[2].image, 148, 364, 32, 32, null); //2
        } else if (gp.player.rota[2] == "down") {
            g2.drawImage(inter[3].image, 148, 364, 32, 32, null); //2
        } else if (gp.player.rota[2] == "left") {
            g2.drawImage(inter[4].image, 148, 364, 32, 32, null); //2
        } else if (gp.player.rota[2] == "right") {

            g2.drawImage(inter[5].image, 148, 364, 32, 32, null); //2

        } else if (gp.player.rota[2] == "e-black") {
            g2.drawImage(inter[8].image, 148, 364, 32, 32, null); //2
        } else if (gp.player.rota[2] == "e-red") {
            g2.drawImage(inter[6].image, 148, 364, 32, 32, null); //2
        } else if (gp.player.rota[2] == "e-yellow") {
            g2.drawImage(inter[7].image, 148, 364, 32, 32, null); //2
        }

        if (gp.player.rota[3] == null) {
            g2.clearRect(212, 364, 32, 32); //3
        } else if (gp.player.rota[3] == "up") {
            g2.drawImage(inter[2].image, 212, 364, 32, 32, null); //3
        } else if (gp.player.rota[3] == "down") {
            g2.drawImage(inter[3].image, 212, 364, 32, 32, null); //3
        } else if (gp.player.rota[3] == "left") {
            g2.drawImage(inter[4].image, 212, 364, 32, 32, null); //3
        } else if (gp.player.rota[3] == "right") {

            g2.drawImage(inter[5].image, 212, 364, 32, 32, null); //3

        } else if (gp.player.rota[3] == "e-black") {
            g2.drawImage(inter[8].image, 212, 364, 32, 32, null); //3
        } else if (gp.player.rota[3] == "e-red") {
            g2.drawImage(inter[6].image, 212, 364, 32, 32, null); //3
        } else if (gp.player.rota[3] == "e-yellow") {
            g2.drawImage(inter[7].image, 212, 364, 32, 32, null); //3
        }

        if (gp.player.rota[4] == null) {
            g2.clearRect(272, 364, 32, 32);
        } else if (gp.player.rota[4] == "up") {
            g2.drawImage(inter[2].image, 272, 364, 32, 32, null); //4
        } else if (gp.player.rota[4] == "down") {
            g2.drawImage(inter[3].image, 272, 364, 32, 32, null); //4
        } else if (gp.player.rota[4] == "left") {
            g2.drawImage(inter[4].image, 272, 364, 32, 32, null); //4
        } else if (gp.player.rota[4] == "right") {
            g2.drawImage(inter[5].image, 272, 364, 32, 32, null); //4

        } else if (gp.player.rota[4] == "e-black") {
            g2.drawImage(inter[8].image, 272, 364, 32, 32, null); //4
        } else if (gp.player.rota[4] == "e-red") {
            g2.drawImage(inter[6].image, 272, 364, 32, 32, null); //4
        } else if (gp.player.rota[4] == "e-yellow") {
            g2.drawImage(inter[7].image, 272, 364, 32, 32, null); //4
        }

        if (gp.player.rota[5] == null) {
            g2.clearRect(333, 364, 32, 32); //5
        } else if (gp.player.rota[5] == "up") {
            g2.drawImage(inter[2].image, 333, 364, 32, 32, null); //5
        } else if (gp.player.rota[5] == "down") {
            g2.drawImage(inter[3].image, 333, 364, 32, 32, null); //5
        } else if (gp.player.rota[5] == "left") {
            g2.drawImage(inter[4].image, 333, 364, 32, 32, null); //5
        } else if (gp.player.rota[5] == "right") {
            g2.drawImage(inter[5].image, 333, 364, 32, 32, null); //5
        } else if (gp.player.rota[5] == "e-black") {
            g2.drawImage(inter[8].image, 333, 364, 32, 32, null); //5
        } else if (gp.player.rota[5] == "e-red") {
            g2.drawImage(inter[6].image, 333, 364, 32, 32, null); //5
        } else if (gp.player.rota[5] == "e-yellow") {
            g2.drawImage(inter[7].image, 333, 364, 32, 32, null); //5
        }

        if (gp.player.rota[6] == null) {
            g2.clearRect(395, 364, 32, 32); //6
        } else if (gp.player.rota[6] == "up") {
            g2.drawImage(inter[2].image, 395, 364, 32, 32, null); //6
        } else if (gp.player.rota[6] == "down") {
            g2.drawImage(inter[3].image, 395, 364, 32, 32, null); //6
        } else if (gp.player.rota[6] == "left") {
            g2.drawImage(inter[4].image, 395, 364, 32, 32, null); //6
        } else if (gp.player.rota[6] == "right") {
            g2.drawImage(inter[5].image, 395, 364, 32, 32, null); //6
        } else if (gp.player.rota[6] == "e-black") {
            g2.drawImage(inter[8].image, 395, 364, 32, 32, null); //6
        } else if (gp.player.rota[6] == "e-red") {
            g2.drawImage(inter[6].image, 395, 364, 32, 32, null); //6
        } else if (gp.player.rota[6] == "e-yellow") {
            g2.drawImage(inter[7].image, 395, 364, 32, 32, null); //6
        }

        if (gp.player.rota[7] == null) {
            g2.clearRect(456, 364, 32, 32); //7
        } else if (gp.player.rota[7] == "up") {
            g2.drawImage(inter[2].image, 456, 364, 32, 32, null); //7
        } else if (gp.player.rota[7] == "down") {
            g2.drawImage(inter[3].image, 456, 364, 32, 32, null); //7
        } else if (gp.player.rota[7] == "left") {
            g2.drawImage(inter[4].image, 456, 364, 32, 32, null); //7
        } else if (gp.player.rota[7] == "right") {
            g2.drawImage(inter[5].image, 456, 364, 32, 32, null); //7
        } else if (gp.player.rota[7] == "e-black") {
            g2.drawImage(inter[8].image, 456, 364, 32, 32, null); //7
        } else if (gp.player.rota[7] == "e-red") {
            g2.drawImage(inter[6].image, 456, 364, 32, 32, null); //7
        } else if (gp.player.rota[7] == "e-yellow") {
            g2.drawImage(inter[7].image, 456, 364, 32, 32, null); //7
        }

        if (gp.player.rota[8] == null) {
            g2.clearRect(517, 364, 32, 32); //8
        } else if (gp.player.rota[8] == "up") {
            g2.drawImage(inter[2].image, 517, 364, 32, 32, null); //8
        } else if (gp.player.rota[8] == "down") {
            g2.drawImage(inter[3].image, 517, 364, 32, 32, null); //8
        } else if (gp.player.rota[8] == "left") {
            g2.drawImage(inter[4].image, 517, 364, 32, 32, null); //8
        } else if (gp.player.rota[8] == "right") {
            g2.drawImage(inter[5].image, 517, 364, 32, 32, null); //8
        } else if (gp.player.rota[8] == "e-black") {
            g2.drawImage(inter[8].image, 517, 364, 32, 32, null); //8
        } else if (gp.player.rota[8] == "e-red") {
            g2.drawImage(inter[6].image, 517, 364, 32, 32, null); //8
        } else if (gp.player.rota[8] == "e-yellow") {
            g2.drawImage(inter[7].image, 517, 364, 32, 32, null); //8
        }

        if (gp.player.rota[9] == null) {
            g2.clearRect(580, 364, 32, 32); //9
        } else if (gp.player.rota[9] == "up") {
            g2.drawImage(inter[2].image, 580, 364, 32, 32, null); //9
        } else if (gp.player.rota[9] == "down") {
            g2.drawImage(inter[3].image, 580, 364, 32, 32, null); //9
        } else if (gp.player.rota[9] == "left") {
            g2.drawImage(inter[4].image, 580, 364, 32, 32, null); //9
        } else if (gp.player.rota[9] == "right") {
            g2.drawImage(inter[5].image, 580, 364, 32, 32, null); //9
        } else if (gp.player.rota[9] == "e-black") {
            g2.drawImage(inter[8].image, 580, 364, 32, 32, null); //9
        } else if (gp.player.rota[9] == "e-red") {
            g2.drawImage(inter[6].image, 580, 364, 32, 32, null); //9
        } else if (gp.player.rota[9] == "e-yellow") {
            g2.drawImage(inter[7].image, 580, 364, 32, 32, null); //9
        }

        //g2.drawImage(end.image, 432,224, 64,128, null);
    }

    public void draw(Graphics2D g2) {

        g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 256, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 320, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 448, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 512, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 0, gp.tileSize, gp.tileSize, null);

        g2.drawImage(tile[0].image, 0, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 256, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 320, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 448, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 512, 64, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 64, gp.tileSize, gp.tileSize, null);

        g2.drawImage(tile[0].image, 0, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 256, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 320, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 448, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 512, 128, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 128, gp.tileSize, gp.tileSize, null);

        g2.drawImage(tile[0].image, 0, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 256, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 320, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 448, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 512, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 192, gp.tileSize, gp.tileSize, null);

        g2.drawImage(tile[0].image, 0, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 64, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 128, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 256, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 320, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 448, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 512, 256, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 256, gp.tileSize, gp.tileSize, null);

        g2.drawImage(inter[0].image, 640, 0, 192, 576, null); //menu direito
        g2.drawImage(inter[1].image, 0, 320, 640, 128, null); //menu esquerdo

        rotap(g2);

        //System.out.println(gp.player.rota[2]);
    }
}
