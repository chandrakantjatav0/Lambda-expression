package practiselambda;
//************************* Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        //window :  Object  JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        //create Button and add JFarme
        JButton button = new JButton("Click me!");

        button.addActionListener(e -> {
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null, "Hey, Button Click!");
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
