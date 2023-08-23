/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Rafael
 */
public class KeyHandler implements KeyListener{

    public boolean pUP, pDOWN, pRIGHT, pLEFT;
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W){
            pUP = true;
        }
        if(code == KeyEvent.VK_S){
            pDOWN = true;
        }
        if(code == KeyEvent.VK_D){
            pRIGHT = true;
        }
        if(code == KeyEvent.VK_A){
            pLEFT = true;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int code = e.getKeyCode();
        
         if(code == KeyEvent.VK_W){
            pUP = false;
        }
        if(code == KeyEvent.VK_S){
            pDOWN = false;
        }
        if(code == KeyEvent.VK_D){
            pRIGHT = false;
        }
        if(code == KeyEvent.VK_A){
            pLEFT = false;
        }
    }
    
}
