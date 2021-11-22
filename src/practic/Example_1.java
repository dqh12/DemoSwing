package practic;

import javax.swing.*;
import java.awt.*;

public class Example_1 extends JFrame {
    private static final long serialVersionUID = 1L;
    public Example_1(){
        super("框架展示");
        setBounds(100,100,300,200);
        this.getContentPane().setBackground(new Color(100,100,50));
        this.getContentPane().add(new JButton("BUTTON_NORTH"),BorderLayout.NORTH);
        this.getContentPane().add(new JButton("BUTTON_SOUTH"),BorderLayout.SOUTH);
        this.getContentPane().add(new JButton("BUTTON_CENTER"),BorderLayout.CENTER);
        this.getContentPane().add(new JButton("BUTTON_EAST"),BorderLayout.EAST);
        this.getContentPane().add(new JButton("BUTTON_WEST"),BorderLayout.WEST);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example_1();
    }
}
