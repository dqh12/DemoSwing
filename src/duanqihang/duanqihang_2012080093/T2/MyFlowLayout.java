package duanqihang.duanqihang_2012080093.T2;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout extends JFrame {
    public MyFlowLayout(){
        super("流布局示例");
        this.setBounds(100,100,300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(new JButton("button1"));
        this.getContentPane().add(new JButton("button2"));
        this.getContentPane().add(new JButton("button3"));
        this.setVisible(true);
    }

}
