package ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenserTest implements MouseListener {

    JFrame jFrame;

    public MouseListenserTest () {
        jFrame = new JFrame (  );
        jFrame.setSize ( 300,150 );
        jFrame.setVisible ( true );
        jFrame.addMouseListener ( this );
        jFrame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }

    @Override
    public void mouseClicked (MouseEvent e) {
        jFrame.setTitle ( "点击坐标为("+ e.getX () + "," + e.getY () + ")" );
    }

    @Override
    public void mousePressed (MouseEvent e) {

    }

    @Override
    public void mouseReleased (MouseEvent e) {

    }

    @Override
    public void mouseEntered (MouseEvent e) {

    }

    @Override
    public void mouseExited (MouseEvent e) {

    }

    public static void main (String[] args) {
        new MouseListenserTest ( );
    }
}
