/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple_program;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Simple_program {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame j1 = new JFrame();
        j1.setTitle("Anish");
        j1.setSize(900, 900);
        j1.setLocation(200, 70);
        j1.setResizable(false);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setLayout(null); // Set layout to null for absolute positioning

        // Create and add a JLabel
        JLabel l1 = new JLabel("Name");
        l1.setBounds(50, 50, 70, 30);
        j1.add(l1);

        // Create and add a JTextField
        JTextField t1 = new JTextField();
        t1.setBounds(120, 50, 150, 30);
        j1.add(t1);

        // Make the frame visible after adding components
        j1.setVisible(true);
    }
}


