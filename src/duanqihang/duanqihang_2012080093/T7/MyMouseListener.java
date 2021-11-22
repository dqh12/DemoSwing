package duanqihang.duanqihang_2012080093.T7;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    Container c;
    public MyMouseListener(Container c){
        this.c = c;
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
           c.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
           c.setBackground(Color.WHITE);
    }
}
