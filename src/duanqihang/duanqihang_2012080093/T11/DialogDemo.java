package duanqihang.duanqihang_2012080093.T11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {
    private JButton btn;
    private MyJDialog dialog;
    public DialogDemo(){
        super("对话框示例");
        this.setBounds(100,100,200,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn = new JButton("打开对话框");
        this.getContentPane().add(btn);

        dialog = new MyJDialog(this);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn){
                    dialog.setVisible(true);
                }
            }
        });
        this.setVisible(true);
    }
    class MyJDialog extends JDialog{
        public MyJDialog(JFrame jFrame){
            super(jFrame,"我的对话框",true);
            this.setBounds(jFrame.getX()+jFrame.getWidth()+10,jFrame.getY(),150,150);
            this.setDefaultCloseOperation(HIDE_ON_CLOSE);
            this.getContentPane().setLayout(new FlowLayout());
            this.getContentPane().add(new JButton("学习"));
            this.getContentPane().add(new JButton("休息"));
        }
    }
}

