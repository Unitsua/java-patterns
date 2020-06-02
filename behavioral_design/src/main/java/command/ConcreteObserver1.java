package command;

import javax.swing.*;

public class ConcreteObserver1 extends JLabel implements Observer {  // 具体的观察者
    @Override
    public void update (int n, int x, int y) {

        if (n==1){
            this.setText ( "新增点位于:("+x + "," + y + ")" );
        }
        else if (n == 2){
            this.setText ( "删除圆点位于:("+ x + "," + y + ")" );
        }
    }

    ConcreteObserver1(){
        super("新增圆点位于:(0,0)");
    }
}
