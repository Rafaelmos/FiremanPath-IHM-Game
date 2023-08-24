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
public class KeyHandler implements KeyListener {

    public boolean pUP, pDOWN, pRIGHT, pLEFT;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        if (code == KeyEvent.VK_8) {
            pUP = true;
        }
        if (code == KeyEvent.VK_2) {
            pDOWN = true;
        }
        if (code == KeyEvent.VK_6) {
            pRIGHT = true;
        }
        if (code == KeyEvent.VK_4) {
            pLEFT = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_8) {
            pUP = false;
        }
        if (code == KeyEvent.VK_2) {
            pDOWN = false;
        }
        if (code == KeyEvent.VK_6) {
            pRIGHT = false;
        }
        if (code == KeyEvent.VK_4) {
            pLEFT = false;
        }
    }

}
