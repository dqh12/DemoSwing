package practic;

import javax.swing.*;
import java.awt.*;

public class Example_3 extends JFrame {
    public Example_3(){
        super("十个按钮");
        setBounds(100,100,400,200);
        this.getContentPane().setLayout(new GridLayout(2,1));
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new BorderLayout());
        jp1.add(new JButton("JButton1"),BorderLayout.WEST);
        JPanel jp1_1 = new JPanel();
        jp1_1.setLayout(new GridLayout(2,1));
        jp1_1.add(new JButton("JButton3"));
        jp1_1.add(new JButton("JButton4"));
        jp1.add(jp1_1,BorderLayout.CENTER);
        jp1.add(new JButton("JButton2"), BorderLayout.EAST);
        jp2.setLayout(new BorderLayout());
        jp2.add(new JButton("JButton5"),BorderLayout.WEST);
        JPanel jp2_2 = new JPanel();
        jp2_2.setLayout(new GridLayout(2,2));
        jp2_2.add(new JButton("JButton7"));
        jp2_2.add(new JButton("JButton8"));
        jp2_2.add(new JButton("JButton9"));
        jp2_2.add(new JButton("JButton10"));
        jp2.add(jp2_2,BorderLayout.CENTER);
        jp2.add(new JButton("JButton6"),BorderLayout.EAST);
        this.getContentPane().add(jp1);
        this.getContentPane().add(jp2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example_3();
    }
}
