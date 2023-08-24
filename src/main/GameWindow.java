/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Rafael
 */
public class GameWindow {

    public JFrame window = new JFrame();
    public ImageFrame frame = new ImageFrame();

    public GameWindow() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Fireman Path");
        

        GamePanel gp = new GamePanel();

        gp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                //System.out.println("Mouse clicked at (" + x + ", " + y + ")");

                // MENU BOTÕES
                if (x >= 672 && x <= 728 && y >= 10 && y <= 40) {

                    //System.out.println(Arrays.toString(gp.player.rota));
                    //System.out.println("MENU");
                    frame.setVisible(true);
                    window.setVisible(false);
                    window.dispose();
                    
                }
                if (x >= 744 && x <= 800 && y >= 10 && y <= 40) {
                    //System.out.println("AJUDA");
                     String url = "https://www.goole.com.br";
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

                if (x >= 671 && x <= 728 && y >= 60 && y <= 122) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "left";
                            //System.out.println(i);
                            break;
                        }
                    }

                    //System.out.println("ESQUERDA");
                }
                if (x >= 744 && x <= 800 && y >= 60 && y <= 122) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "right";
                            //System.out.println(i);
                            break;
                        }
                    }
                    //System.out.println("DIREITA");
                }

                if (x >= 672 && x <= 728 && y >= 143 && y <= 206) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "up";
                            //System.out.println(i);
                            break;
                        }
                    }

                    //System.out.println("CIMA");
                }
                if (x >= 744 && x <= 800 && y >= 143 && y <= 206) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "down";
                            //System.out.println(i);
                            break;
                        }
                    }

                    //System.out.println("BAIXO");
                }

                if (x >= 672 && x <= 728 && y >= 228 && y <= 290) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "e-red";
                            //System.out.println(i);
                            break;
                        }
                    }

                    //System.out.println("EXTINTOR VERMELHO");
                }
                if (x >= 744 && x <= 800 && y >= 228 && y <= 290) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "e-yellow";
                            //System.out.println(i);
                            break;
                        }

                    }

                    //System.out.println("EXTINTOR AMARELO");
                }

                if (x >= 744 && x <= 800 && y >= 310 && y <= 370) {

                    for (int i = 0; i < 10; i++) {
                        if (gp.player.rota[i] == null) {
                            gp.player.rota[i] = "e-black";
                            //System.out.println(i);
                            break;
                        }
                    }

                    //System.out.println("EXTINTOR PRETO");
                }

                if (x >= 672 && x <= 728 && y >= 393 && y <= 420) {
                    //System.out.println("PLAY");

                    // 
                    Robot robot = null;
                    try {
                        robot = new Robot();

                        for (String c : gp.player.rota) {

                            if (c == null) {
                                //System.out.println("main.Player.update() " + c);
                                break;
                            }
                            if (c.equals("up")) {
                                gp.player.direction = "up";
                                robot.keyPress(KeyEvent.VK_8);
                                if (gp.player.y <= 0) {
                                    gp.player.y = 0;
                                } else {
                                    gp.player.y -= gp.player.speed;
                                }
                                robot.keyRelease(KeyEvent.VK_8);

                            }
                            if (c.equals("down")) {
                                gp.player.direction = "down";
                                robot.keyPress(KeyEvent.VK_2);

                                if (gp.player.y >= 256) {
                                    gp.player.y = 256;
                                } else {
                                    gp.player.y += gp.player.speed;
                                }
                                robot.keyRelease(KeyEvent.VK_2);

                            }
                            if (c.equals("right")) {

                                gp.player.direction = "right";
                                robot.keyPress(KeyEvent.VK_6);
                                if (gp.player.x >= 576) {
                                    gp.player.x = 576;
                                } else {
                                    gp.player.x += gp.player.speed;
                                }
                                robot.keyRelease(KeyEvent.VK_6);

                            }
                            if (c.equals("left")) {
                                gp.player.direction = "left";
                                robot.keyPress(KeyEvent.VK_4);

                                if (gp.player.x <= 0) {
                                    gp.player.x = 0;
                                } else {
                                    gp.player.x -= gp.player.speed;
                                }
                                robot.keyRelease(KeyEvent.VK_4);

                            }
                            if (c.equals("e-red")) {
                                gp.red = true;

                            }

                            if (c.equals("e-yellow")) {
                                gp.yellow = true;

                            }
                            if (c.equals("e-black")) {
                                gp.black = true;

                            }

// System.out.println("main.Player.update() USANDO EXTINTOR " + c);
                        }
                    } catch (java.awt.AWTException ex) {
                        Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //
                    /*for (String i : gp.player.rota) {
                        for (String c : gp.player.rota) {
                            gp.player.update();
                            gp.repintar();
                            if (c == null) {
                                //System.out.println("main.Player.update() " + c);
                                break;
                            } else if (c.equals("up")) {
                                gp.player.direction = "up";
                                gp.player.pUP = true;
                                gp.player.pDOWN = false;
                                gp.player.pRIGHT = false;
                                gp.player.pLEFT = false;
                                if (gp.player.y <= 0) {
                                    gp.player.y = 0;
                                } else {
                                    gp.player.y -= gp.player.speed;
                                }
                            } else if (c.equals("down")) {
                                gp.player.direction = "down";
                                gp.player.pUP = false;
                                gp.player.pDOWN = true;
                                gp.player.pRIGHT = false;
                                gp.player.pLEFT = false;

                                if (gp.player.y >= 256) {
                                    gp.player.y = 256;
                                } else {
                                    gp.player.y += gp.player.speed;
                                }
                            } else if (c.equals("right")) {
                                gp.player.direction = "right";

                                gp.player.pUP = false;
                                gp.player.pDOWN = false;
                                gp.player.pRIGHT = true;
                                gp.player.pLEFT = false;

                                if (gp.player.x >= 576) {
                                    gp.player.x = 576;
                                } else {
                                    gp.player.x += gp.player.speed;
                                }
                            } else if (c.equals("left")) {
                                gp.player.direction = "left";
                                gp.player.pUP = false;
                                gp.player.pDOWN = false;
                                gp.player.pRIGHT = false;
                                gp.player.pLEFT = true;

                                if (gp.player.x <= 0) {
                                    gp.player.x = 0;
                                } else {
                                    gp.player.x -= gp.player.speed;
                                }
                            } else if (c.equals("e-red") || c.equals("e-yellow") || c.equals("e-black")) {
                                System.out.println("main.Player.update() USANDO EXTINTOR " + c);
                            }
                        }
                    }*/
                    gp.player.pUP = false;
                    gp.player.pDOWN = false;
                    gp.player.pRIGHT = false;
                    gp.player.pLEFT = false;
                    gp.player.rota[0] = null;
                    gp.player.rota[1] = null;
                    gp.player.rota[2] = null;
                    gp.player.rota[3] = null;
                    gp.player.rota[4] = null;
                    gp.player.rota[5] = null;
                    gp.player.rota[6] = null;
                    gp.player.rota[7] = null;
                    gp.player.rota[8] = null;
                    gp.player.rota[9] = null;

                }

                if (x >= 744 && x <= 800 && y >= 393 && y <= 420) {
                    gp.player.pUP = false;
                    gp.player.pDOWN = false;
                    gp.player.pRIGHT = false;
                    gp.player.pLEFT = false;
                    gp.player.rota[0] = null;
                    gp.player.rota[1] = null;
                    gp.player.rota[2] = null;
                    gp.player.rota[3] = null;
                    gp.player.rota[4] = null;
                    gp.player.rota[5] = null;
                    gp.player.rota[6] = null;
                    gp.player.rota[7] = null;
                    gp.player.rota[8] = null;
                    gp.player.rota[9] = null;

                }
                //MENU DE CONTROLE
                if (x >= 20 && x <= 70 && y >= 355 && y <= 402) {

                    gp.player.rota[0] = null;

                    //System.out.println("0");
                }

                if (x >= 80 && x <= 130 && y >= 355 && y <= 402) {

                    gp.player.rota[1] = null;

                    //System.out.println("1");
                }

                if (x >= 140 && x <= 190 && y >= 355 && y <= 402) {

                    gp.player.rota[2] = null;

                    //System.out.println("2");
                }

                if (x >= 200 && x <= 250 && y >= 355 && y <= 402) {

                    gp.player.rota[3] = null;

                    //System.out.println("3");
                }

                if (x >= 260 && x <= 310 && y >= 355 && y <= 402) {

                    gp.player.rota[4] = null;

                    //System.out.println("4");
                }

                if (x >= 325 && x <= 372 && y >= 355 && y <= 402) {

                    gp.player.rota[5] = null;

                    //System.out.println("5");
                }

                if (x >= 385 && x <= 435 && y >= 355 && y <= 402) {

                    gp.player.rota[6] = null;

                    //System.out.println("6");
                }

                if (x >= 448 && x <= 496 && y >= 355 && y <= 402) {

                    gp.player.rota[7] = null;

                    //System.out.println("7");
                }

                if (x >= 509 && x <= 558 && y >= 355 && y <= 402) {

                    gp.player.rota[8] = null;

                    //System.out.println("8");
                }

                if (x >= 570 && x <= 620 && y >= 355 && y <= 402) {

                    gp.player.rota[9] = null;

                    //System.out.println("9");
                }

            }

        });

        window.add(gp);
        //MenuPanel menuPanel = new MenuPanel();
        //window.add(menuPanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        //menuPanel.startGameThread();
        gp.startGameThread();
    }

}
