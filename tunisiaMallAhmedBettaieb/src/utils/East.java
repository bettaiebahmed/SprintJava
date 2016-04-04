/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author mohamed
 */
public class East extends JPanel {
       int x = 0;
        int y = 100;
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("tahoma", Font.BOLD+Font.PLAIN, 40);
        g2.setFont(font);
        g2.setColor(Color.red);
        g2.drawString("tttt", x, y);
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        x += 10;
        if (x > this.getWidth()) {
            x = 0;
        }
        repaint();
    }

}
