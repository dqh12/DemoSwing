package duanqihang.duanqihang_2012080093.T10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemComponents extends JFrame {
    JComboBox cb_channel;
    JList list_shows;
    JLabel label;
    Object[] channel = {"中央一台", "中央二台"};
    Object[][] shows = {{"新闻联播", "焦点访谈"}, {"交换空间", "经济与法", "经济半小时"}};

    public ItemComponents() {
        super("按钮组件示例");
        this.setBounds(100,200,250,180);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout());
        cb_channel = new JComboBox(channel);
        this.getContentPane().add(cb_channel);
        list_shows = new JList(shows[0]);
        this.getContentPane().add(list_shows);
        label = new JLabel("");
        this.getContentPane().add(label);
        cb_channel.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int i = cb_channel.getSelectedIndex();
                list_shows.setListData(shows[i]);
            }
        });
        list_shows.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str = cb_channel.getSelectedItem().toString();
                if (!list_shows.isSelectionEmpty())
                    str += " " + list_shows.getSelectedValue();
                label.setText("您选择的是: " + str);
            }
        });
        this.setVisible(true);
    }

}
