package practic.Example1;

import javax.swing.*;
import java.awt.*;

public class Example_6_5_JCheckBox extends JFrame {
    private static final long serialVersionUID = 1L;

    public Example_6_5_JCheckBox(){
        super("显示复选框JCheckBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,310,220);
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(new JCheckBox("苹果"));
        this.getContentPane().add(new JCheckBox("香蕉"));
        this.getContentPane().add(new JCheckBox("西瓜"));
        this.getContentPane().add(new JCheckBox("梨"));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example_6_5_JCheckBox();
    }
}
