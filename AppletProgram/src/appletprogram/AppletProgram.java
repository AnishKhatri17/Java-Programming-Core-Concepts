/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appletprogram;

import javax.swing.*;
import java.awt.*;

public class AppletProgram {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet-like Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Applet is running!", 20, 20);
                System.out.println("Painting the applet...");
            }
        });
        frame.setVisible(true);

        System.out.println("Applet is Initialized.");
        System.out.println("Applet is being Executed.");
    }
}
