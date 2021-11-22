package duanqihang.duanqihang_2012080093.T8;

import javax.swing.*;
import java.awt.*;

public class MyJFrame2 extends JFrame {
    public MyJFrame2(){
        super("事件监听器接口的简单例子");
        this.setBounds(100,100,200,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.addMouseListener(new MyMouseListener2(c));
        this.setVisible(true);
    }
}
