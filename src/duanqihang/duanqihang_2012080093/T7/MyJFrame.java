package duanqihang.duanqihang_2012080093.T7;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public MyJFrame(){
        super("事件监听器接口的简单例子");
        this.setBounds(100,100,200,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.addMouseListener(new MyMouseListener(c));
        this.setVisible(true);
    }
}
