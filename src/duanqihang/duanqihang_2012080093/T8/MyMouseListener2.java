package duanqihang.duanqihang_2012080093.T8;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener2 extends MouseAdapter {
    Container c;
    public MyMouseListener2(Container c){
        this.c = c;
    }
    public void mouseEntered(MouseEvent e){
        c.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        c.setBackground(Color.WHITE);
    }
}
