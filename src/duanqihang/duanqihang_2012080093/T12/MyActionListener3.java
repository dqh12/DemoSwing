package duanqihang.duanqihang_2012080093.T12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener3 implements ActionListener {
    private JTextArea text;
    public MyActionListener3(JTextArea text){
        this.text = text;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="复制"){
            text.copy();
        }
        if(e.getActionCommand()=="粘贴"){
            text.paste();
        }
        if(e.getActionCommand()=="剪切"){
            text.cut();
        }
    }
}
