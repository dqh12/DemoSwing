package duanqihang.duanqihang_2012080093.T3;

import javax.swing.*;

public class MyBorderLayout extends JFrame {
    public MyBorderLayout(){
        super("BorderLayout边布局示例");
        this.setBounds(100,100,500,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(new JButton("button_north"),"North");
        this.getContentPane().add(new JButton("button_south"),"South");
        this.getContentPane().add(new JButton("button_west"),"West");
        this.getContentPane().add(new JButton("button_east"),"East");
        this.getContentPane().add(new JButton("button_center"),"Center");
        this.setVisible(true);
    }
}
