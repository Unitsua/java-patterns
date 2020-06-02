package command;

import javax.swing.*;

public class ConcreteObserver2 extends JLabel implements Observer {
    @Override
    public void update (int n, int x, int y) {

        this.setText ( "鼠标位于:("+ x + "," + y + ")" );

    }

    ConcreteObserver2 (){
        super("鼠标位于:(0,980)");
    }

}
