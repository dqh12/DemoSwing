package duanqihang.duanqihang_2012080093.T12;

import javax.swing.*;

public class PopupMenuDemo extends JFrame {
    private JTextArea text;
    private JPopupMenu popmenu;
    public PopupMenuDemo(){
        super("菜单示例");
        this.setBounds(100,100,200,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.text = new JTextArea("我是中国人");
        this.getContentPane().add(this.text);
        this.popmenu = new JPopupMenu();
        String popstr[] = {"剪切","复制","粘贴"};
        JMenuItem popmenuitthis[] = new JMenuItem[popstr.length];
        MyActionListener3 mal = new MyActionListener3(text);
        for(int i=0;i<popstr.length;i++){
            popmenuitthis[i] = new JMenuItem(popstr[i]);
            this.popmenu.add(popmenuitthis[i]);
            popmenuitthis[i].addActionListener(mal);
        }
        this.text.add(this.popmenu);
        MyMouseListener mml = new MyMouseListener(text,popmenu);
        this.text.addMouseListener(mml);
        this.setVisible(true);

    }
}
