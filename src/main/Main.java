/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Rfael");

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Fireman Path");

        GamePanel gamePanel = new GamePanel();

        gamePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                
                // MENU BOTÕES
                if (x >= 672 && x <= 728 && y >= 10 && y <= 40) {
                    System.out.println("MENU");}
                if (x >= 744 && x <= 800 && y >= 10 && y <= 40) {
                    System.out.println("AJUDA");}
                
                if (x >= 671 && x <= 728 && y >= 60 && y <= 122) {
                    System.out.println("ESQUERDA");}
                if (x >= 744 && x <= 800 && y >= 60 && y <= 122) {
                    System.out.println("DIREITA");}
                
                if (x >= 672 && x <= 728 && y >= 143 && y <= 206) {
                    System.out.println("CIMA");}
                if (x >= 744 && x <= 800 && y >= 143 && y <= 206) {
                    System.out.println("BAIXO");}
                
                if (x >= 672 && x <= 728 && y >= 228 && y <= 290) {
                    System.out.println("EXTINTOR VERMELHO");}
                if (x >= 744 && x <= 800 && y >= 228 && y <= 290) {
                    System.out.println("EXTINTOR AMARELO");}
                
                if (x >= 744 && x <= 800 && y >= 310 && y <= 370) {
                    System.out.println("EXTINTOR PRETO");}
                
                if (x >= 672 && x <= 728 && y >= 393 && y <= 420) {
                    System.out.println("PLAY");}
                if (x >= 744 && x <= 800 && y >= 393 && y <= 420) {
                    System.out.println("RESET");}
                
                //MENU DE CONTROLE
                
                if (x >= 20 && x <= 70 && y >= 355 && y <= 402) {
                    System.out.println("0");}
                
                if (x >= 80 && x <= 130 && y >= 355 && y <= 402) {
                    System.out.println("1");}
                
                if (x >= 140 && x <= 190 && y >= 355 && y <= 402) {
                    System.out.println("2");}
                
                if (x >= 200 && x <= 250 && y >= 355 && y <= 402) {
                    System.out.println("3");}
                
                if (x >= 260 && x <= 310 && y >= 355 && y <= 402) {
                    System.out.println("4");}
                
                if (x >= 325 && x <= 372 && y >= 355 && y <= 402) {
                    System.out.println("5");}
                
                if (x >= 385 && x <= 435 && y >= 355 && y <= 402) {
                    System.out.println("6");}
                
                if (x >= 448 && x <= 496 && y >= 355 && y <= 402) {
                    System.out.println("7");}
                
                if (x >= 509 && x <= 558 && y >= 355 && y <= 402) {
                    System.out.println("8");}
                
                if (x >= 570 && x <= 620 && y >= 355 && y <= 402) {
                    System.out.println("9");}
                
                System.out.println("Mouse clicked at (" + x + ", " + y + ")"); 
                
                
                
            }

      
   
            
        });

        window.add(gamePanel);
        //MenuPanel menuPanel = new MenuPanel();
        //window.add(menuPanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        //menuPanel.startGameThread();
        gamePanel.startGameThread();

    }

}
