/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rafael
 */
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageFrame extends JFrame {

    private BufferedImage image;

    public ImageFrame() {
        setTitle("Tela com Imagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(832, 448);
        setLocationRelativeTo(null);
        try {
            image = ImageIO.read(getClass().getResource("res/menu/gamestart.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Desenha a imagem na janela
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }

}
