/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ImageFrame frame = new ImageFrame();
        frame.setVisible(true);
        if (frame.isVisible()) {
            frame.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    //System.out.println("Mouse clicked at (" + x + ", " + y + ")");

                    if (x >= 234 && x <= 330 && y >= 310 && y <= 346) {
                        // System.out.println(".Play()");
                        GameWindow gameWindow = new GameWindow();
                        gameWindow.frame = frame;
                        frame.setVisible(false);
                        frame.dispose();
                    }
                    if (x >= 368 && x <= 464 && y >= 310 && y <= 346) {

                        //System.out.println(".Ajuda()"); 
                        String url = "https://youtu.be/GoMAnFjZ4dM";
                        try {
                            try {
                                Desktop.getDesktop().browse(new URI(url));
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } catch (URISyntaxException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    if (x >= 496 && x <= 591 && y >= 310 && y <= 346) {
                        //System.out.println(".Sair()"); 
                        int result = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Aviso", JOptionPane.OK_CANCEL_OPTION);

                        if (result == JOptionPane.OK_OPTION) {
                            System.exit(0);
                        }

                    }
                }

            });

        }

    }

}
