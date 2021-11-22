package duanqihang.duanqihang_2012080093.T12;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    private JTextArea text;
    private JPopupMenu popmenu;
    public MyMouseListener(JTextArea text, JPopupMenu popmenu) {
        this.text = text;
        this.popmenu = popmenu;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
           if (e.getModifiers()==MouseEvent.BUTTON3_MASK)
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
}
