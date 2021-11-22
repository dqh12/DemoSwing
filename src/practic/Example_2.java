package practic;

import javax.swing.*;
import java.awt.*;

public class Example_2 extends JFrame{
    public Example_2(){
        super("十个按钮");
        setBounds(100,100,400,200);
        this.getContentPane().setLayout(new GridLayout(2,1));
        JPanel jp = new JPanel(new GridLayout(1,3));
        jp.add(new JButton("JButton1"));
        JPanel jp1_1 = new JPanel(new GridLayout(2,1));
        jp1_1.add(new JButton("JButton3"));
        jp1_1.add(new JButton("JButton4"));
        jp.add(jp1_1);
        jp.add(new JButton("JButton2"));
        this.getContentPane().add(jp);
        JPanel jp2 = new JPanel(new GridLayout(1,4));
        JPanel jp2_1 = new JPanel(new GridLayout(2,1));
        JPanel jp2_2 = new JPanel(new GridLayout(2,1));
        jp2_1.add(new JButton("JButton7"));
        jp2_1.add(new JButton("JButton9"));
        jp2_2.add(new JButton("JButton8"));
        jp2_2.add(new JButton("JButton10"));
        jp2.add(new JButton("JButton5"));
        jp2.add(jp2_1);
        jp2.add(jp2_2);
        jp2.add(new JButton("JButton6"));
        this.getContentPane().add(jp2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example_2();
    }
}
