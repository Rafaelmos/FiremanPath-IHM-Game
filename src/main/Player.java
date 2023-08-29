/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
/**
 *
 * @author Rafael
 */
public class Player extends Entity {

    GamePanel gp;
    public String[] rota;
    public boolean pUP, pDOWN, pRIGHT, pLEFT;
    public int x, y;

    public Player(GamePanel gp) {
        this.gp = gp;
        setDefaultValues();
        direction = "down";
        this.rota = new String[10];
    }

    public void setDefaultValues() {
        this.x = 128;
        this.y = 128;
        speed = 64;
    }
}
