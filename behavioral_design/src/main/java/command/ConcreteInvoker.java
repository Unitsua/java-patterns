package command;

import javax.swing.*;
import java.awt.event.*;

public class ConcreteInvoker extends JPanel {

    private Command command;
    private Invoker invoker;

    public ConcreteInvoker (Command command,Invoker invoker) {  //具体的调用命令者
        this.command = command;
        this.invoker = invoker;
        this.addMouseListener ( new Mouse() );
        this.addMouseMotionListener ( new MouseMotion() );

    }

    class Mouse implements MouseListener {
        @Override
        public void mouseClicked (MouseEvent e) {
            excuteCommand ( e );
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
    }

    class MouseMotion implements MouseMotionListener {
        @Override
        public void mouseDragged (MouseEvent e) {

        }

        @Override
        public void mouseMoved (MouseEvent e) {
            int n = 0;
            invoker.notifyObservers ( n,e.getX (),e.getY () );
        }
    }

    public void excuteCommand(MouseEvent mouseEvent){

        int x = mouseEvent.getX ();
        int y = mouseEvent.getY ();
        Circle circle = new Circle (x,y);

        if (mouseEvent.getButton () == MouseEvent.BUTTON1){
            this.command.excute ( this,circle );
            int n = 1;
            invoker.notifyObservers ( n,mouseEvent.getX (),mouseEvent.getY () );
        }else if (mouseEvent.getButton () == MouseEvent.BUTTON3){
            this.command.undo ( this );
        }
    }
}


