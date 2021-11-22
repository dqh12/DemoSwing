package duanqihang.duanqihang_2012080093.T4;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {
    public MyGridLayout(){
        super("GridLayout网格布局示例");
        this.setBounds(100,100,300,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(3,1));
        this.getContentPane().add(new JButton("button1"));
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout());
        jp.add(new JButton("button2"));
        jp.add(new JButton("button3"));
        this.getContentPane().add(jp);
        this.getContentPane().add(new JButton("button4"));
        this.setVisible(true);
    }
}
