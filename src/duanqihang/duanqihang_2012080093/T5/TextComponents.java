package duanqihang.duanqihang_2012080093.T5;

import javax.swing.*;
import java.awt.*;

public class TextComponents extends JFrame {
    public TextComponents(){
        super("文本显示和文本编辑示例");
        this.setBounds(100,100,310,220);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.getContentPane().add(new JLabel("user"));
        this.getContentPane().add(new JTextField(20));
        this.getContentPane().add(new JLabel("password"));
        this.getContentPane().add(new JPasswordField(20));
        this.getContentPane().add(new JLabel("description"));
        this.getContentPane().add(new JTextArea("my information:",5,20));
        this.setVisible(true);
    }
}
