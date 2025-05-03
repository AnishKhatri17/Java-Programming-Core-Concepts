/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appletsimple;

import javax.swing.*;
import java.awt.*;

public class AppletSimple {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Java Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("A Simple Applet", 20, 20);
            }
        });
        frame.setVisible(true);
    }
}

