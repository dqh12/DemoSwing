package duanqihang.duanqihang_2012080093.T13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TextJFrame extends JFrame {
    private JFrame jf;
    private JTextArea text;
    private JComboBox jcb;
    private JCheckBox check_bold,check_italic;
    private JRadioButton radio_red,radio_green,radio_blue;
    private JPopupMenu popmenu;
    public TextJFrame(){
        jf = new JFrame("文本编辑器");
        jf.setBounds(100,100,500,200);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        JMenuBar menubar = new JMenuBar();
        jf.setJMenuBar(menubar);
        String str[] = {"文件","编辑","帮助"};
        JMenu menu[] = new JMenu[str.length];
        for(int i=0;i<str.length;i++){
            menu[i] = new JMenu(str[i]);
            menubar.add(menu[i]);
        }
        text = new JTextArea("示例文本");
        jf.getContentPane().add(text);
        JToolBar toolBar = new JToolBar();
        toolBar.setLayout(new FlowLayout());
        jf.getContentPane().add(toolBar,"North");
        jcb = new JComboBox();
        jcb.setEditable(true);
        toolBar.add(jcb);
        String[] str_size = {"20","30","40","50","60"};
        String str_file[] = {"打开","保存","退出"};
        JMenuItem menuItem[] = new JMenuItem[str_file.length];
        for(int j = 0;j<str_file.length;j++){
            menuItem[j] = new JMenuItem(str_file[j]);
            menu[0].add(menuItem[j]);
            menu[0].addSeparator();
            menuItem[j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() instanceof JMenuItem){
                        if(e.getActionCommand() =="退出"){
                            if(JOptionPane.showConfirmDialog(jf,"你确定退出吗？")==0)
                                System.exit(0);
                        }
                    }
                }
            });
        }
        check_bold = new JCheckBox("粗体");
        check_italic = new JCheckBox("斜体");
        toolBar.add(check_bold);
        toolBar.add(check_italic);
        check_bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JCheckBox){
                    if(e.getActionCommand()=="粗体"){
                        Font f = text.getFont();
                        text.setFont(new Font(f.getFontName(),Font.BOLD,f.getSize()));
                    }
                }
            }
        });
        check_italic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JCheckBox){
                    if(e.getActionCommand() == "斜体"){
                        Font f = text.getFont();
                        text.setFont(new Font(f.getFontName(),Font.ITALIC,f.getSize()));
                    }
                }
            }
        });
        radio_red = new JRadioButton("红色");
        radio_green = new JRadioButton("绿色");
        radio_blue = new JRadioButton("蓝色");
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio_red);
        bg.add(radio_green);
        bg.add(radio_blue);
        toolBar.add(radio_red);
        toolBar.add(radio_green);
        toolBar.add(radio_blue);
        radio_red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JRadioButton){
                    if(e.getActionCommand() =="红色"){
                        text.setForeground(Color.red);
                    }
                }
            }
        });
        radio_green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JRadioButton){
                    if(e.getActionCommand() =="绿色"){
                        text.setForeground(Color.green);
                    }
                }
            }
        });
        radio_blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JRadioButton){
                    if(e.getActionCommand() =="蓝色"){
                        text.setForeground(Color.blue);
                    }
                }
            }
        });
        popmenu = new JPopupMenu();
        String popstr[] = {"剪切","复制","粘贴"};
        JMenuItem popmenuitem[] = new JMenuItem[popstr.length];
        for(int i=0;i<popstr.length;i++){
            popmenuitem[i] = new JMenuItem(popstr[i]);
            popmenu.add(popmenuitem[i]);
            popmenuitem[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() instanceof JMenuItem){
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
            });
        }
        text.add(popmenu);
        text.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getModifiers()==MouseEvent.BUTTON3_MASK)
                    popmenu.show(text,e.getX(),e.getY());
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        for(int i=0;i<str_size.length;i++){
            jcb.addItem(str_size[i]);
            jcb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() instanceof JComboBox){
                        Font f = text.getFont();
                        try{
                            int i = Integer.parseInt((String) jcb.getSelectedItem());
                            text.setFont(new Font(f.getFontName(),f.getStyle(),i));
                        }catch (Exception ex){
                            JOptionPane.showMessageDialog(jf,"字号大小不合适,请重新输入");
                            jcb.setSelectedItem(String.valueOf(f.getSize()));
                        }
                        String size = (String) jcb.getSelectedItem();
                        int i=0,n=jcb.getItemCount();
                        while(i<n&&size.compareTo((String) jcb.getItemAt(i))>=0){
                            if(size.compareTo((String) jcb.getItemAt(i))==0)
                                return;
                            i++;
                        }
                        jcb.insertItemAt(size,i);
                    }
                }
            });
        }
    }
}
